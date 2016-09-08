package mx.nix.rdap.core.catalog;

/**
 * The type of an ipAddress
 * @author dalpuche
 *
 */
public enum IpAddressType {
	
	IPV4(4),IPV6(6),UNKNOWN(0);
	
	/**
	 * The version of the ip
	 */
	private int version;
	
	/**
	 * Constructor
	 * @param version
	 * 				
	 */
	IpAddressType(int version){
		this.version=version;
	}

	
	/**
	 * @return the version
	 */
	public int getVersion() {
		return version;
	}

	/**
	 * @param version the version to set
	 */
	public void setVersion(int version) {
		this.version = version;
	}

	
}
