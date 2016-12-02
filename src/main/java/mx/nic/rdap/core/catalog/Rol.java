package mx.nic.rdap.core.catalog;

/**
 * Rol of an entity.
 * 
 */
public enum Rol {
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
	 * The value of the rol
	 */
	private String value;
	
	/**
	 *The description of the rol 
	 */
	private String description;
	
	/**
	 * Constructor
	 */
	Rol(int id,String value,String description){
		this.id=id;
		this.value=value;
		this.description=description;
	}

	/**
	 * Get the status from an id
	 */
	public static Rol getById(int id){
		switch(id){
		case 1:
			return Rol.REGISTRANT;
		case 2:
			return Rol.TECHNICAL;
		case 3:
			return Rol.ADMINISTRATIVE;
		case 4:
			return Rol.ABUSE;
		case 5:
			return Rol.BILLING;
		case 6:
			return Rol.REGISTRAR;
		case 7:
			return Rol.RESELLER;
		case 8:
			return Rol.SPONSOR;
		case 9:
			return Rol.PROXY;
		case 10:
			return Rol.NOTIFICATIONS;
		case 11: 
			return Rol.NOC;
		default:
			return null;
		}
	}
	
	/**
	 * Get the status from a name
	 */
	public static Rol getByName(String name){
		switch(name){
		case "registrant":
			return Rol.REGISTRANT;
		case "technical":
			return Rol.TECHNICAL;
		case "administrative":
			return Rol.ADMINISTRATIVE;
		case "abuse":
			return Rol.ABUSE;
		case "billing":
			return Rol.BILLING;
		case "registrar":
			return Rol.REGISTRAR;
		case "reseller":
			return Rol.RESELLER;
		case "sponsor":
			return Rol.SPONSOR;
		case "proxy":
			return Rol.PROXY;
		case "notifications":
			return Rol.NOTIFICATIONS;
		case "noc": 
			return Rol.NOC;
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
