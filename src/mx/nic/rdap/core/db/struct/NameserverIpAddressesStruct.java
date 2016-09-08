package mx.nic.rdap.core.db.struct;

import java.util.List;

import mx.nic.rdap.core.db.IpAddress;

/**
 * Struct containing arrays of ipAddress 
 * @author dalpuche
 *
 */
public class NameserverIpAddressesStruct {

	private List<IpAddress> ipv4Adresses;
	
	private List<IpAddress> ipv6Adresses;

	/**
	 * @return the ipv4Adresses
	 */
	public List<IpAddress> getIpv4Adresses() {
		return ipv4Adresses;
	}

	/**
	 * @param ipv4Adresses the ipv4Adresses to set
	 */
	public void setIpv4Adresses(List<IpAddress> ipv4Adresses) {
		this.ipv4Adresses = ipv4Adresses;
	}

	/**
	 * @return the ipv6Adresses
	 */
	public List<IpAddress> getIpv6Adresses() {
		return ipv6Adresses;
	}

	/**
	 * @param ipv6Adresses the ipv6Adresses to set
	 */
	public void setIpv6Adresses(List<IpAddress> ipv6Adresses) {
		this.ipv6Adresses = ipv6Adresses;
	}
	
	

}
