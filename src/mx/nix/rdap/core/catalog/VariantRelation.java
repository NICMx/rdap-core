
package mx.nix.rdap.core.catalog;

/**
 * Catalog of the types of variant relations. It denotes a relationship between
 * a domain and a domain variant
 *
 */
public enum VariantRelation {

	REGISTERED(1, "registered", "The variant names are registered in the registry."), 
	UNREGISTERED(2, "unregistered","The variant names are not found in the registry."), 
	REGISTRATION_RESTRICTED(3, "registration restricted","Registration of the variant names is restricted to certain parties or within certain rules."), 
	OPEN_REGISTRATION(4, "open registration","Registration of the variant names is available to generally qualified registrants."), 
	CONJOINED(5, "conjoined","Registration of the variant names occurs automatically with the registration of the containing domain registration.");

	/**
	 * An unique identifier for the variant relation
	 */
	private int id;

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
	 * @param id
	 * @param value
	 * @param description
	 */
	VariantRelation(int id, String value, String description) {
		this.id = id;
		this.value = value;
		this.description = description;
	}

	/**
	 * Get Relation from Variant Id
	 * 
	 * @param id
	 * @return
	 */
	public static VariantRelation getById(int id) {
		switch (id) {
		case 1:
			return VariantRelation.REGISTERED;
		case 2:
			return VariantRelation.UNREGISTERED;
		case 3:
			return VariantRelation.REGISTRATION_RESTRICTED;
		case 4:
			return VariantRelation.OPEN_REGISTRATION;
		case 5:
			return VariantRelation.CONJOINED;
		default:
			return null;
		}
	}

	/**
	 * Get relation from a String of a variant
	 * 
	 * @param name
	 * @return
	 */
	public static VariantRelation getByName(String name) {
		switch (name) {
		case "registered":
			return VariantRelation.REGISTERED;
		case "unregistered":
			return VariantRelation.UNREGISTERED;
		case "registration restricted":
			return VariantRelation.REGISTRATION_RESTRICTED;
		case "open registration":
			return VariantRelation.OPEN_REGISTRATION;
		case "conjoined":
			return VariantRelation.CONJOINED;
		default:
			return null;
		}
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

}
