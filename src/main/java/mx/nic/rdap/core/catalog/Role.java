package mx.nic.rdap.core.catalog;

/**
 * Role of an entity.
 * 
 */
public enum Role {
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
	NOC(11,"noc", "The entity object instance handles communications related to a network operations center (NOC).");
	/**
	 * An unique identifier
	 */
	private int id;
	
	/**
	 * The value of the role
	 */
	private String value;
	
	/**
	 *The description of the role
	 */
	private String description;
	
	/**
	 * Constructor
	 */
	Role(int id,String value,String description){
		this.id=id;
		this.value=value;
		this.description=description;
	}

	/**
	 * Get the status from an id
	 */
	public static Role getById(int id){
		switch(id){
		case 1:
			return Role.REGISTRANT;
		case 2:
			return Role.TECHNICAL;
		case 3:
			return Role.ADMINISTRATIVE;
		case 4:
			return Role.ABUSE;
		case 5:
			return Role.BILLING;
		case 6:
			return Role.REGISTRAR;
		case 7:
			return Role.RESELLER;
		case 8:
			return Role.SPONSOR;
		case 9:
			return Role.PROXY;
		case 10:
			return Role.NOTIFICATIONS;
		case 11: 
			return Role.NOC;
		default:
			return null;
		}
	}
	
	/**
	 * Get the status from a name
	 */
	public static Role getByName(String name){
		switch(name){
		case "registrant":
			return Role.REGISTRANT;
		case "technical":
			return Role.TECHNICAL;
		case "administrative":
			return Role.ADMINISTRATIVE;
		case "abuse":
			return Role.ABUSE;
		case "billing":
			return Role.BILLING;
		case "registrar":
			return Role.REGISTRAR;
		case "reseller":
			return Role.RESELLER;
		case "sponsor":
			return Role.SPONSOR;
		case "proxy":
			return Role.PROXY;
		case "notifications":
			return Role.NOTIFICATIONS;
		case "noc": 
			return Role.NOC;
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
