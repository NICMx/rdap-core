package mx.nic.rdap.core.catalog;

/**
 * The state of a registered object
 * 
 */
public enum Status {

	VALIDATED(1,"validated","Signifies that the data of the object instance has been found to be accurate. This type of status is usually found on entity object instances to note the validity of identifying contact information."),
	RENEW_PROHIBITED(2,"renew prohibited","Renewal or reregistration of the object instance is forbidden."),
	UPDATE_PROHIBITED(3,"update prohibited","Updates to the object instance are forbidde"),
	TRANSFER_PROHIBITED(4,"transfer prohibited","Transfers of the registration from one registrar to another are forbidden."),
	DELETE_PROHIBITED(5,"delete prohibited","Deletion of the registration of the object instance is forbidden."),
	PROXY(6,"proxy","The registration of the object instance has been performed by a third party."),
	PRIVATE(7,"private","The information of the object instance is not designated for public consumption"),
	REMOVED(8,"removed","Some of the information of the object instance has not been made available and has been removed."),
	OBSCURED(9,"obscured","Some of the information of the object instance has been altered for the purposes of not readily revealing the actual information of the object instance."),
	ASSOCIATED(10,"associated","The object instance is associated with other object instances in the registry."),
	ACTIVE(11,"active","The object instance is in use. For domain names, it signifies that the domain name is published in DNS. For network and autnum registrations, it signifies that they are allocated or assigned for use in operational networks. This maps to the \"OK\" status of the Extensible Provisioning Protocol (EPP)"),
	INACTIVE(12,"inactive","The object instance is not in use."),
	LOCKED(13,"locked","Changes to the object instance cannot be made, including the association of other object instances."),
	PENDING_CREATE(14,"pending create","A request has been received for the creation of the object instance, but this action is not yet complete."),
	PENDING_RENEW(15,"pending renew","A request has been received for the renewal of the object instance, but this action is not yet complete."),
	PENDING_TRANSFER(16,"pending transfer","A request has been received for the transfer of the object instance, but this action is not yet complete."),
	PENDING_UPDATE(17,"pending update","A request has been received for the update or modification of the object instance, but this action is not yet complete."),
	PENDING_DELETE(18,"pending delete","A request has been received for the deletion or removal of the object instance, but this action is not yet complete. For domains, this might mean that the name is no longer published in DNS but has not yet been purged from the registry database.");
	/**
	 * An unique identifier
	 */
	private int id;
	
	/**
	 * The value of the status
	 */
	private String value;
	
	/**
	 *The description of the status 
	 */
	private String description;
	
	/**
	 * Constructor
	 * @param id
	 * @param description
	 */
	Status(int id,String value,String description){
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
	public static Status getById(int id){
		switch(id){
		case 1:
			return Status.VALIDATED;
		case 2:
			return Status.RENEW_PROHIBITED;
		case 3:
			return Status.UPDATE_PROHIBITED;
		case 4:
			return Status.TRANSFER_PROHIBITED;
		case 5:
			return Status.DELETE_PROHIBITED;
		case 6:
			return Status.PROXY;
		case 7:
			return Status.PRIVATE;
		case 8:
			return Status.REMOVED;
		case 9:
			return Status.OBSCURED;
		case 10:
			return Status.ASSOCIATED;
		case 11:
			return Status.ACTIVE;
		case 12:
			return Status.INACTIVE;
		case 13:
			return Status.LOCKED;
		case 14:
			return Status.PENDING_CREATE;
		case 15:
			return Status.PENDING_RENEW;
		case 16:
			return Status.PENDING_TRANSFER;
		case 17:
			return Status.PENDING_UPDATE;
		case 18:
			return Status.PENDING_DELETE;
		default:
			return null;
		}
	}
	
	/**
	 * Get the status from a name
	 * @param name
	 * @return the status
	 */
	public static Status getByName(String name){
		switch(name){
		case "validated":
			return Status.VALIDATED;
		case "renew prohibited":
			return Status.RENEW_PROHIBITED;
		case "update prohibited":
			return Status.UPDATE_PROHIBITED;
		case "transfer prohibited":
			return Status.TRANSFER_PROHIBITED;
		case "delete prohibited":
			return Status.DELETE_PROHIBITED;
		case "proxy":
			return Status.PROXY;
		case "private":
			return Status.PRIVATE;
		case "removed":
			return Status.REMOVED;
		case "obscured":
			return Status.OBSCURED;
		case "associated":
			return Status.ASSOCIATED;
		case "active":
			return Status.ACTIVE;
		case "inactive":
			return Status.INACTIVE;
		case "locked":
			return Status.LOCKED;
		case "pending create":
			return Status.PENDING_CREATE;
		case "pending renew":
			return Status.PENDING_RENEW;
		case "pending transfer":
			return Status.PENDING_TRANSFER;
		case "pending update":
			return Status.PENDING_UPDATE;
		case "pending delete":
			return Status.PENDING_DELETE;
		default:
			return null;
		}
	}
	
	/**
	 * Get the status from a name
	 * @param name
	 * @return the status
	 */
	public static Status getByEPPName(String eppName){
		switch(eppName){
		case "linked":
			return Status.ASSOCIATED;
		case "ok":
			return Status.ACTIVE;
		case "inactive":
			return Status.INACTIVE;
		case "pendingCreate":
			return Status.PENDING_CREATE;
		case "pendingRenew":
			return Status.PENDING_RENEW;
		case "pendingTransfer":
			return Status.PENDING_TRANSFER;
		case "pendingUpdate":
			return Status.PENDING_UPDATE;
		default:
			return null;
		}
	}
}
