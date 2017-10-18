package mx.nic.rdap.core.catalog;

/**
 * An Event action that have occurred on an instance of a registered object
 *
 */
public enum EventAction {
	
	REGISTRATION("registration","The object instance was initially registered."),
	REREGISTRATION("reregistration","The object instance was registered subsequently to initial registration."),
	LAST_CHANGED("last changed","An action noting when the information in the object instance was last changed."),
	EXPIRATION("expiration","The object instance has been removed or will be removed at a predetermined date and time from the registry."),
	DELETION("deletion","The object instance was removed from the registry at a point in time that was not predetermined."),
	REINSTANTIAION("reinstantiation","The object instance was reregistered after having been removed from the registry."),
	TRANSFER("transfer","The object instance was transferred from one registrant to another."),
	LOCKED("locked","The object instance was locked"),
	UNLOCKED("unlocked","The object instance was unlocked"),
	LAST_UPDATE_OF_RDAP_DATABASE("last update of RDAP database","An action noting when the information in the object instance in the RDAP database was last synchronized from the authoritative database (e.g. registry database)."),
	REGISTRAR_EXPIRATION("registrar expiration","An action noting the expiration date of the object in the registrar system."),
	ENUM_VALIDATION_EXPIRATION("enum validation expiration","Association of phone number represented by this ENUM domain to registrant has expired or will expire at a pre-determined date and time.");	
	
	/**
	 * The value of the event action
	 */
	private String value;
	
	/**
	 *The description of the event action 
	 */
	private String description;
	
	/**
	 * Constructor
	 */
	EventAction(String value, String description) {
		this.value=value;
		this.description=description;
	}

	/**
	 * Get the EventAction from an id
	 */
	public static EventAction getById(int id) {
		EventAction[] actions = EventAction.values();
		return (0 < id && id <= actions.length) ? actions[id - 1] : null;
	}
	
	/**
	 * Get the EventAction from a name
	 */
	public static EventAction getByName(String name){
		for (EventAction ea : EventAction.values()) {
			if (ea.value.equalsIgnoreCase(name)) {
				return ea;
			}
		}
		return null;
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		EventAction[] actions = EventAction.values();
		for (int i = 0; i < actions.length; i++) {
			if (actions[i] == this) {
				return i + 1;
			}
		}

		throw new RuntimeException("Programming error: EventAction '" + this + "' is not in the EventAction list.");
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
