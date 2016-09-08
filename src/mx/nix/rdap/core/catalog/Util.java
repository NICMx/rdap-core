package mx.nix.rdap.core.catalog;

/**
 * Object containig utilities for the catalogs 
 * @author dalpuche
 *
 */
public class Util {
	
	/**
	 * Get the IpAddressType from an id
	 * @param id
	 * @return the IpAddressType
	 */
	public static IpAddressType getIpAddressType(int id){
		switch(id){
		case 3:
			return IpAddressType.IPV4;
		case 6:
			return IpAddressType.IPV6;
		default:
			return IpAddressType.UNKNOWN;
		}
	}

	/**
	 * Get the status from an id
	 * @param id
	 * @return the status
	 */
	public static Status getStatus(int id){
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
				return Status.UNKNOWN;
		}
	}
}
