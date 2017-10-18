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
	PENDING_DELETE("pending delete","A request has been received for the deletion or removal of the object instance, but this action is not yet complete. For domains, this might mean that the name is no longer published in DNS but has not yet been purged from the registry database."),
	ADD_PERIOD("add period","This grace period is provided after the initial registration of the object.  If the object is deleted by the client during this period, the server provides a credit to the client for the cost of the registration.  This maps to the Domain  Registry Grace Period Mapping for the Extensible Provisioning Protocol (EPP) [RFC3915] 'addPeriod' status."),
	AUTO_RENEW_PERIOD("auto renew period","This grace period is provided after an object registration period expires and is extended (renewed)  automatically by the server.  If the object is deleted by the client during this period, the server provides a credit to the client for the cost of the auto renewal.  This maps to the Domain  Registry Grace Period Mapping for the Extensible Provisioning Protocol (EPP) [RFC3915] 'autoRenewPeriod' status."),
	CLIENT_DELETE_PROHIBITED("client delete prohibited","The client requested that requests to delete the object MUST be rejected.  This maps to the Extensible Provisioning Protocol (EPP) Domain Name Mapping [RFC5731], Extensible  Provisioning Protocol (EPP) Host Mapping [RFC5732], and Extensible Provisioning Protocol (EPP) Contact Mapping [RFC5733] 'clientDeleteProhibited' status."),
	CLIENT_HOLD("client hold"," The client requested that the DNS delegation  information MUST NOT be published for the object.  This maps to  the Extensible Provisioning Protocol (EPP) Domain Name Mapping  [RFC5731] 'clientHold' status."),
	CLIENT_RENEW_PROHIBITED("client renew prohibited","The client requested that requests to renew the object MUST be rejected.  This maps to the Extensible Provisioning Protocol (EPP) Domain Name Mapping [RFC5731] 'clientRenewProhibited' status."),
	CLIENT_TRANSFER_PROHIBITED("client transfer prohibited","The client requested that requests to transfer the object MUST be rejected.  This maps to the Extensible Provisioning Protocol (EPP) Domain Name Mapping [RFC5731] and Extensible Provisioning Protocol (EPP) Contact Mapping [RFC5733] 'clientTransferProhibited' status."),
	CLIENT_UPDATE_PROHIBITED("client update prohibited","The client requested that requests to update the object (other than to remove this status) MUST be rejected.  This maps to the Extensible Provisioning Protocol (EPP) Domain Name Mapping [RFC5731], Extensible Provisioning Protocol (EPP) Host Mapping [RFC5732], and Extensible Provisioning Protocol (EPP) Contact Mapping [RFC5733] 'clientUpdateProhibited' status."),
	PENDING_RESTORE("pending restore","An object is in the process of being restored after being in the redemption period state.  This maps to the Domain Registry Grace Period Mapping for the Extensible Provisioning Protocol (EPP) [RFC3915] 'pendingRestore' status."),
	REDEMPTION_PERIOD("redemption period","A delete has been received, but the object has not yet been purged because an opportunity exists to restore the object and abort the deletion process.  This maps to the Domain Registry Grace Period Mapping for the Extensible Provisioning Protocol (EPP) [RFC3915] 'redemptionPeriod' status."),
	RENEW_PERIOD("renew period","This grace period is provided after an object registration period is explicitly extended (renewed) by the client.  If the object is deleted by the client during this period, the server provides a credit to the client for the cost of the renewal.  This maps to the Domain Registry Grace Period Mapping for the Extensible Provisioning Protocol (EPP) [RFC3915] 'renewPeriod' status."),
	SERVER_DELETE_PROHIBITED("server delete prohibited","The server set the status so that requests to delete the object MUST be rejected.  This maps to the Extensible Provisioning Protocol (EPP) Domain Name Mapping [RFC5731], Extensible Provisioning Protocol (EPP) Host Mapping [RFC5732], and Extensible Provisioning Protocol (EPP) Contact Mapping [RFC5733] 'serverDeleteProhibited' status."),
	SERVER_RENEW_PROHIBITED("server renew prohibited","The server set the status so that requests to renew the object MUST be rejected.  This maps to the Extensible Provisioning Protocol (EPP) Domain Name Mapping [RFC5731] 'serverRenewProhibited' status."),
	SERVER_TRANSFER_PROHIBITED("server transfer prohibited","The server set the status so that requests to transfer the object MUST be rejected.  This maps to the Extensible Provisioning Protocol (EPP) Domain Name Mapping [RFC5731] and Extensible Provisioning Protocol (EPP) Contact Mapping [RFC5733] 'serverTransferProhibited' status."),
	SERVER_UPDATE_PROHIBITED("server update prohibited","The server set the status so that requests to update the object (other than to remove this status) MUST be rejected. This maps to the Extensible Provisioning Protocol (EPP) Domain Name Mapping [RFC5731], Extensible Provisioning Protocol (EPP) Host Mapping [RFC5732], and Extensible Provisioning Protocol (EPP) Contact Mapping [RFC5733] 'serverUpdateProhibited' status."),
	SERVER_HOLD("server hold","The server set the status so that DNS delegation information MUST NOT be published for the object.  This maps to the Extensible Provisioning Protocol (EPP) Domain Name Mapping [RFC5731] 'serverHold' status."),
	TRANSFER_PERIOD("transfer period","This grace period is provided after the successful transfer of object registration sponsorship from one client to another client.  If the object is deleted by the client during this period, the server provides a credit to the client for the cost of the transfer.  This maps to the Domain Registry Grace Period Mapping for the Extensible Provisioning Protocol (EPP) [RFC3915] 'transferPeriod' status.");

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
			if (status.value.equalsIgnoreCase(name)) {
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
		case "addPeriod":
			return Status.ADD_PERIOD;
		case "autoRenewPeriod":
			return Status.AUTO_RENEW_PERIOD;
		case "clientDeleteProhibited":
			return Status.CLIENT_DELETE_PROHIBITED;
		case "clientHold":
			return Status.CLIENT_HOLD;
		case "clientRenewProhibited":
			return Status.CLIENT_RENEW_PROHIBITED;
		case "clientTransferProhibited":
			return Status.CLIENT_TRANSFER_PROHIBITED;
		case "clientUpdateProhibited":
			return Status.CLIENT_UPDATE_PROHIBITED;
		case "inactive":
			return Status.INACTIVE;
		case "linked":
			return Status.ASSOCIATED;
		case "ok":
			return Status.ACTIVE;
		case "pendingCreate":
			return Status.PENDING_CREATE;
		case "pendingDelete":
			return Status.PENDING_DELETE;
		case "pendingRenew":
			return Status.PENDING_RENEW;
		case "pendingRestore":
			return Status.PENDING_RESTORE;
		case "pendingTransfer":
			return Status.PENDING_TRANSFER;
		case "pendingUpdate":
			return Status.PENDING_UPDATE;
		case "redemptionPeriod":
			return Status.REDEMPTION_PERIOD;
		case "renewPeriod":
			return Status.RENEW_PERIOD;
		case "serverDeleteProhibited":
			return Status.SERVER_DELETE_PROHIBITED;
		case "serverRenewProhibited":
			return Status.SERVER_RENEW_PROHIBITED;
		case "serverTransferProhibited":
			return Status.SERVER_TRANSFER_PROHIBITED;
		case "serverUpdateProhibited":
			return Status.SERVER_UPDATE_PROHIBITED;
		case "serverHold":
			return Status.SERVER_HOLD;
		case "transferPeriod":
			return Status.TRANSFER_PERIOD;
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
