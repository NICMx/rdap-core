package mx.nix.rdap.core.catalog;

/**
 * An Event action that have ocurred on an instance of a registered object
 * @author dalpuche
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
	UNLOCKED(9,"unlocked","The object instance was unlocked"),
	UNKNOWN(0,null,null);
	
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
	 * @param id
	 * @param description
	 */
	EventAction(int id,String value,String description){
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
	
	
	
}
