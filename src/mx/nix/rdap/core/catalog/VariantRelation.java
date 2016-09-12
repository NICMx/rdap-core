
package mx.nix.rdap.core.catalog;

/**
 * Catalog of the types of variant relations
 * @author evaldes
 *
 */
public enum VariantRelation {
	
	REGISTERED(1, "registered", "The variant names are registered in the registry."),
	UNREGISTERED(2, "unregistered", "The variant names are not found in the registry."),
	REGISTRATION_RESTRICTED(3, "registration restricted", "Registration of the variant names is restricted to certain parties or within certain rules."),
	OPEN_REGISTRATION(4, "open registration", "Registration of the variant names is available to generally qualified registrants."),
	CONJOINED(5, "conjoined", "Registration of the variant names occurs automatically with the registration of the containing domain registration."),
	UNKNOWN(0, null, null);
	
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
	 * @param id
	 * @param value
	 * @param description
	 */
	private VariantRelation(int id, String value, String description) {
		this.id = id;
		this.value = value;
		this.description = description;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
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
	 * @param value the value to set
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
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	
	
	

}
