package mx.nix.rdap.core.catalog;

public enum Roles {
	REGISTRANT(1,"registrant", "The entity object instance is the registrant of the registration. In some registries, this is known as a maintainer."),
	TECHNICAL(2,"technical", "The entity object instance is a technical contact for the registration."),
	ADMINISTRATIVE(3,"administrative", "The entity object instance is an administrative contact for the registration."),
	ABUSE(4,"abuse", "The entity object instance handles network abuse issues on behalf of the registrant of the registration."),
	BILLING(5,"billing", "The entity object instance handles payment and billing issues on behalf of the registrant of the registration."),
	REGISTRAR(6,"registrar", "The entity object instance represents the authority responsible for the registration in the registry."),
	RESELLER(7,"reseller", "The entity object instance represents a third party through which the registration was conducted (i.e., not the registry or registrar)."),
	SPONSOR(8,"sponsor", "The entity object instance represents a domain policy sponsor, such as an ICANN-approved sponsor."),
	PROXY(9,"proxy", "The entity object instance represents a proxy for another entity object, such as a registrant."),
	NOTIFICATIONS(10,"notifications", "An entity object instance designated to receive notifications about association object instances."),
	NOC(11,"noc", "The entity object instance handles communications related to a network operations center (NOC)."),
	UNKNOWN(0,null,null);
	/**
	 * An unique identifier
	 */
	private int id;
	
	/**
	 * The value of the rol
	 */
	private String value;
	
	/**
	 *The description of the rol 
	 */
	private String description;
	
	/**
	 * Constructor
	 * @param id
	 * @param description
	 */
	Roles(int id,String value,String description){
		this.id=id;
		this.value=value;
		this.description=description;
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
	
	/**
	 * Get the status from an id
	 * @param id
	 * @return the status
	 */
	public static Roles getById(int id){
		switch(id){
		case 1:
			return Roles.REGISTRANT;
		case 2:
			return Roles.TECHNICAL;
		case 3:
			return Roles.ADMINISTRATIVE;
		case 4:
			return Roles.ABUSE;
		case 5:
			return Roles.BILLING;
		case 6:
			return Roles.REGISTRAR;
		case 7:
			return Roles.RESELLER;
		case 8:
			return Roles.SPONSOR;
		case 9:
			return Roles.PROXY;
		case 10:
			return Roles.NOTIFICATIONS;
		case 11: 
			return Roles.NOC;
		default:
			return UNKNOWN;
		}
	}
}
