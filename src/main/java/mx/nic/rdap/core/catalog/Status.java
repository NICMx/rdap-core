package mx.nic.rdap.core.catalog;

/**
 * The state of a registered object
 *
 */
public enum Status {

	VALIDATED("validated","Signifies that the data of the object instance has been found to be accurate. This type of status is usually found on entity object instances to note the validity of identifying contact information."),
	RENEW_PROHIBITED("renew prohibited","Renewal or reregistration of the object instance is forbidden."),
	UPDATE_PROHIBITED("update prohibited","Updates to the object instance are forbidde"),
	TRANSFER_PROHIBITED("transfer prohibited","Transfers of the registration from one registrar to another are forbidden."),
	DELETE_PROHIBITED("delete prohibited","Deletion of the registration of the object instance is forbidden."),
	PROXY("proxy","The registration of the object instance has been performed by a third party."),
	PRIVATE("private","The information of the object instance is not designated for public consumption"),
	REMOVED("removed","Some of the information of the object instance has not been made available and has been removed."),
	OBSCURED("obscured","Some of the information of the object instance has been altered for the purposes of not readily revealing the actual information of the object instance."),
	ASSOCIATED("associated","The object instance is associated with other object instances in the registry."),
	ACTIVE("active","The object instance is in use. For domain names, it signifies that the domain name is published in DNS. For network and autnum registrations, it signifies that they are allocated or assigned for use in operational networks. This maps to the \"OK\" status of the Extensible Provisioning Protocol (EPP)"),
	INACTIVE("inactive","The object instance is not in use."),
	LOCKED("locked","Changes to the object instance cannot be made, including the association of other object instances."),
	PENDING_CREATE("pending create","A request has been received for the creation of the object instance, but this action is not yet complete."),
	PENDING_RENEW("pending renew","A request has been received for the renewal of the object instance, but this action is not yet complete."),
	PENDING_TRANSFER("pending transfer","A request has been received for the transfer of the object instance, but this action is not yet complete."),
	PENDING_UPDATE("pending update","A request has been received for the update or modification of the object instance, but this action is not yet complete."),
	PENDING_DELETE("pending delete","A request has been received for the deletion or removal of the object instance, but this action is not yet complete. For domains, this might mean that the name is no longer published in DNS but has not yet been purged from the registry database.");

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
	 */
	Status(String value, String description) {
		this.value=value;
		this.description=description;
	}

	/**
	 * Get the status from an id
	 */
	public static Status getById(int id){
		Status[] statuses = Status.values();
		return (0 < id && id <= statuses.length) ? statuses[id - 1] : null;
	}
	
	/**
	 * Get the status from a name
	 */
	public static Status getByName(String name){
		for (Status status : Status.values()) {
			if (status.value.equals(name)) {
				return status;
			}
		}
		return null;
	}
	
	/**
	 * Get the status from a name
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

	/**
	 * @return the id
	 */
	public int getId() {
		Status[] statuses = Status.values();
		for (int i = 0; i < statuses.length; i++) {
			if (statuses[i] == this) {
				return i + 1;
			}
		}

		throw new RuntimeException("Programming error: Status '" + this + "' is not in the Status list.");
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
