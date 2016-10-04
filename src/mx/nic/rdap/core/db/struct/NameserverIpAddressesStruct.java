package mx.nic.rdap.core.db.struct;

import java.util.ArrayList;
import java.util.List;

import mx.nic.rdap.core.db.IpAddress;

/**
 * Struct containing arrays of ipAddress
 * 
 * @author dalpuche
 *
 */
public class NameserverIpAddressesStruct {

	/**
	 * Arrays of ipAddress {@link IpAddress}
	 */
	private List<IpAddress> ipv4Adresses;

	private List<IpAddress> ipv6Adresses;

	/**
	 * Constructor
	 */
	public NameserverIpAddressesStruct() {
		ipv4Adresses = new ArrayList<IpAddress>();
		ipv6Adresses = new ArrayList<IpAddress>();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ipv4Adresses == null) ? 0 : ipv4Adresses.hashCode());
		result = prime * result + ((ipv6Adresses == null) ? 0 : ipv6Adresses.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof NameserverIpAddressesStruct))
			return false;
		NameserverIpAddressesStruct other = (NameserverIpAddressesStruct) obj;
		if (ipv4Adresses == null) {
			if (other.ipv4Adresses != null)
				return false;
		} else if (ipv4Adresses.size() != other.ipv4Adresses.size() || !ipv4Adresses.containsAll(other.ipv4Adresses))
			return false;
		if (ipv6Adresses == null) {
			if (other.ipv6Adresses != null)
				return false;
		} else if (ipv6Adresses.size() != other.ipv6Adresses.size() || !ipv6Adresses.containsAll(other.ipv6Adresses))
			return false;
		return true;
	}

	/**
	 * @return the ipv4Adresses
	 */
	public List<IpAddress> getIpv4Adresses() {
		return ipv4Adresses;
	}

	/**
	 * @param ipv4Adresses
	 *            the ipv4Adresses to set
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
	 * @param ipv6Adresses
	 *            the ipv6Adresses to set
	 */
	public void setIpv6Adresses(List<IpAddress> ipv6Adresses) {
		this.ipv6Adresses = ipv6Adresses;
	}

}
