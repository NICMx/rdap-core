
package mx.nic.rdap.core.catalog;

/**
 * Catalog of the types of variant relations. It denotes a relationship between
 * a domain and a domain variant
 *
 */
public enum VariantRelation {

	REGISTERED("registered", "The variant names are registered in the registry."), 
	UNREGISTERED("unregistered","The variant names are not found in the registry."), 
	REGISTRATION_RESTRICTED("registration restricted","Registration of the variant names is restricted to certain parties or within certain rules."), 
	OPEN_REGISTRATION("open registration","Registration of the variant names is available to generally qualified registrants."), 
	CONJOINED("conjoined","Registration of the variant names occurs automatically with the registration of the containing domain registration.");

	/**
	 * The value of the variant relation
	 */
	private String value;

	/**
	 * Description of the variant relation
	 */
	private String description;

	/**
	 * Constructor
	 * 
	 */
	VariantRelation(String value, String description) {
		this.value = value;
		this.description = description;
	}

	/**
	 * Get Relation from Variant Id
	 * 
	 */
	public static VariantRelation getById(int id) {
		VariantRelation[] relations = VariantRelation.values();
		return (0 < id && id <= relations.length) ? relations[id - 1] : null;
	}

	/**
	 * Get relation from a String of a variant
	 * 
	 */
	public static VariantRelation getByName(String name) {
		for (VariantRelation vr : VariantRelation.values()) {
			if (vr.value.equalsIgnoreCase(name)) {
				return vr;
			}
		}
		return null;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		VariantRelation[] relations = VariantRelation.values();
		for (int i = 0; i < relations.length; i++) {
			if (relations[i] == this) {
				return i + 1;
			}
		}

		throw new RuntimeException("Programming error: VariantRelation '" + this //
				+ "' is not in the VariantRelation list.");
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

}
