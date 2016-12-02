package mx.nic.rdap.core.catalog;

/**
 * An Event action that have occurred on an instance of a registered object
 *
 */
public enum EventAction {
	
	REGISTRATION(1,"registration","The object instance was initially registered."),
	REREGISTRATION(2,"reregistration","The object instance was registered subsequently to initial registration."),
	LAST_CHANGED(3,"last changed","An action noting when the information in the object instance was last changed."),
	EXPIRATION(4,"expiration","The object instance has been removed or will be removed at a predetermined date and time from the registry."),
	DELETION(5,"deletion","The object instance was removed from the registry at a point in time that was not predetermined."),
	REINSTANTIAION(6,"reinstantiation","The object instance was reregistered after having been removed from the registry."),
	TRANSFER(7,"transfer","The object instance was transferred from one registrant to another."),
	LOCKED(8,"locked","The object instance was locked"),
	UNLOCKED(9,"unlocked","The object instance was unlocked");
	
	/**
	 * An unique identifier
	 */
	private int id;
	
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
	EventAction(int id,String value,String description){
		this.id=id;
		this.value=value;
		this.description=description;
	}

	/**
	 * Get the EventAction from an id
	 */
	public static EventAction getById(int id){
		switch(id){
		case 1:
			return EventAction.REGISTRATION;
		case 2:
			return EventAction.REREGISTRATION;
		case 3:
			return EventAction.LAST_CHANGED;
		case 4:
			return EventAction.EXPIRATION;
		case 5:
			return EventAction.DELETION;
		case 6:
			return EventAction.REINSTANTIAION;
		case 7:
			return EventAction.TRANSFER;
		case 8:
			return EventAction.LOCKED;
		case 9:
			return EventAction.UNLOCKED;
		default:
			return null;
		}
	}
	
	/**
	 * Get the EventAction from a name
	 */
	public static EventAction getByName(String name){
		switch(name){
		case "registration":
			return EventAction.REGISTRATION;
		case "reregistration":
			return EventAction.REREGISTRATION;
		case "last changed":
			return EventAction.LAST_CHANGED;
		case "expiration":
			return EventAction.EXPIRATION;
		case "deletion":
			return EventAction.DELETION;
		case "reinstantiation":
			return EventAction.REINSTANTIAION;
		case "transfer":
			return EventAction.TRANSFER;
		case "locked":
			return EventAction.LOCKED;
		case "unlocked":
			return EventAction.UNLOCKED;
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
