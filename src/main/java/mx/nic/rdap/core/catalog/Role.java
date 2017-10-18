package mx.nic.rdap.core.catalog;

/**
 * Role of an entity.
 * 
 */
public enum Role {
	REGISTRANT("registrant", "The entity object instance is the registrant of the registration. In some registries, this is known as a maintainer."),
	TECHNICAL("technical", "The entity object instance is a technical contact for the registration."),
	ADMINISTRATIVE("administrative", "The entity object instance is an administrative contact for the registration."),
	ABUSE("abuse", "The entity object instance handles network abuse issues on behalf of the registrant of the registration."),
	BILLING("billing", "The entity object instance handles payment and billing issues on behalf of the registrant of the registration."),
	REGISTRAR("registrar", "The entity object instance represents the authority responsible for the registration in the registry."),
	RESELLER("reseller", "The entity object instance represents a third party through which the registration was conducted (i.e., not the registry or registrar)."),
	SPONSOR("sponsor", "The entity object instance represents a domain policy sponsor, such as an ICANN-approved sponsor."),
	PROXY("proxy", "The entity object instance represents a proxy for another entity object, such as a registrant."),
	NOTIFICATIONS("notifications", "An entity object instance designated to receive notifications about association object instances."),
	NOC("noc", "The entity object instance handles communications related to a network operations center (NOC).");

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
	Role(String value, String description) {
		this.value = value;
		this.description = description;
	}

	/**
	 * Get the status from an id
	 */
	public static Role getById(int id) {
		Role[] roles = Role.values();
		return (0 < id && id <= roles.length) ? roles[id - 1] : null;
	}
	
	/**
	 * Get the status from a name
	 */
	public static Role getByName(String name){
		for (Role role : Role.values()) {
			if (role.value.equalsIgnoreCase(name)) {
				return role;
			}
		}
		return null;
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		Role[] roles = Role.values();
		for (int i = 0; i < roles.length; i++) {
			if (roles[i] == this) {
				return i + 1;
			}
		}

		throw new RuntimeException("Programming error: Role '" + this + "' is not in the Role list.");
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
