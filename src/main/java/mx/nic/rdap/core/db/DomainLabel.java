package mx.nic.rdap.core.db;

import java.text.Normalizer;
import java.text.Normalizer.Form;

import com.ibm.icu.text.IDNA;
import com.ibm.icu.text.IDNA.Info;

/**
 * Class to wrap and validate a requested domain label, this way the developer
 * can get a valid domain label to work and do not worry to validate <br>
 * <br>
 * 
 * Also you can use the {@link #getULabel()} or {@link #getALabel()} function to
 * get the best label format to work, or if preferred, use the
 * {@link #getLabel()} function to get the original request of the user.
 */
public class DomainLabel {

	// The instance is thread-safe, that is, it can be used concurrently.
	private static IDNA IDNA_STD3_INSTANCE = IDNA.getUTS46Instance(IDNA.USE_STD3_RULES);

	private static IDNA IDNA_DEFAULT_INSTANCE = IDNA.getUTS46Instance(IDNA.DEFAULT);

	/**
	 * The domain label requested by the user.
	 */
	private String label;

	/**
	 * <code>true</code> if <code>label</code> is in LDH or A-Label form,
	 * otherwise <code>false</code>.
	 */
	private boolean isALabel;

	private boolean isStd3Instance;

	/**
	 * @param label           A domain label in LDH form or U-Label
	 * @param useStd3Instance if this instance would use STD3_RULES for Domain
	 *                        names.
	 * @throws DomainLabelException if the input string doesn't conform to RFC 5890
	 *                              specification
	 */
	public DomainLabel(String label, boolean useStd3Instance) throws DomainLabelException {
		this.label = getValidLabel(label);
		this.isStd3Instance = useStd3Instance;
	}

	/**
	 * This instance use STD3 Rules for domain name parsing.
	 * 
	 * @param label A domain label in LDH o U-Label form.
	 * 
	 * @throws DomainLabelException if the input string doesn't conform to RFC 5890
	 *                              specification
	 */
	public DomainLabel(String label) throws DomainLabelException {
		this.label = getValidLabel(label);
		this.isStd3Instance = true;
	}

	/**
	 * Checks if the <code>label</code> is valid, and if it is valid, Normalize
	 * the String and return it.
	 * 
	 * @param domainLabel
	 *            A domain label in LDH form or U-Label
	 * @return the <code>domainLabel</code> normalized and validated.
	 * @throws DomainLabelException
	 *             if the input string doesn't conform to RFC 5890 specification
	 */
	private String getValidLabel(String domainLabel) throws DomainLabelException {
		// first normalize the String.
		String normalize = Normalizer.normalize(domainLabel, Form.NFC);

		String toASCII;
		try {
			toASCII = nameToASCII(normalize);
			nameToUnicode(normalize);
		} catch (IllegalArgumentException e) {
			throw new DomainLabelException(e.getMessage());
		}

		if (normalize.equals(toASCII)) {
			isALabel = true;
		} else {
			isALabel = false;
		}

		return normalize;
	}

	/**
	 * @return The original domain label requested.
	 */
	public String getLabel() {
		return label;
	}

	public void setLabel(String label) throws DomainLabelException {
		this.label = getValidLabel(label);
	}

	/**
	 * @return The domain label in A-Label format.
	 */
	public String getALabel() {
		if (isALabel) {
			return label;
		}
		return nameToASCII(label, isStd3Instance);
	}

	/**
	 * @return The domain label in U-Label format.
	 */
	public String getULabel() {
		if (isALabel) {
			return nameToUnicode(label, isStd3Instance);
		}
		return label;
	}

	/**
	 * Translates a string from Unicode to ASCII Compatible Encoding (ACE).
	 *
	 * @param label
	 *            the string to be processed
	 * @return the translated {@code String}
	 *
	 * @throws IllegalArgumentException
	 *             if the input string doesn't conform to RFC 5890 specification
	 */
	public static String nameToASCII(String label) {
		return transform(label, false, IDNA_STD3_INSTANCE);
	}

	public static String nameToASCII(String label, boolean useStd3Rules) {
		IDNA idna = useStd3Rules ? IDNA_STD3_INSTANCE : IDNA_DEFAULT_INSTANCE;
		return transform(label, false, idna);
	}

	/**
	 * Translates a string from ASCII Compatible Encoding (ACE) to Unicode.
	 *
	 * @param input
	 *            the string to be processed
	 *
	 * @return the translated {@code String}
	 * 
	 * @throws IllegalArgumentException
	 *             if the input string doesn't conform to RFC 5890 specification
	 */
	public static String nameToUnicode(String label) {
		return transform(label, true, IDNA_STD3_INSTANCE);
	}

	public static String nameToUnicode(String label, boolean useStd3Rules) {
		IDNA idna = useStd3Rules ? IDNA_STD3_INSTANCE : IDNA_DEFAULT_INSTANCE;
		return transform(label, true, idna);
	}

	private static String transform(String label, boolean toUnicode, IDNA idna) {
		Info info = new Info();
		StringBuilder dest = new StringBuilder();

		if (toUnicode) {
			idna.nameToUnicode(label, dest, info);
		} else {
			idna.nameToASCII(label, dest, info);
		}

		if (info.hasErrors()) {
			throw new IllegalArgumentException("Invalid domain label: '" + label + "'");
		}
		return dest.toString();
	}

	public boolean isALabel() {
		return isALabel;
	}

	public boolean isStd3Instance() {
		return isStd3Instance;
	}
}
