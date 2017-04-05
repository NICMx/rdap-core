package mx.nic.rdap.core.db;

import mx.nic.rdap.core.db.struct.NameserverIpAddressesStruct;

/**
 * Represents information regarding DNS nameservers used in both forward and
 * reverse DNS
 *
 */
/**
 * @author L03018987
 *
 */
public class Nameserver extends RdapObject {
	/**
	 * An unique identifier of the nameserver
	 */
	private Long id;

	/**
	 * A string containing the ldh name of the nameserver
	 */
	private String ldhName;

	/**
	 * An object containing two arrays (v4 and v6) of ipAddresses
	 * {@link NameserverIpAddressesStruct}
	 */
	private NameserverIpAddressesStruct ipAddresses;

	/**
	 * A string containing the unicode name of the nameserver
	 */
	private String unicodeName;

	/**
	 * Constructor
	 */
	public Nameserver() {
		super();
		ipAddresses = new NameserverIpAddressesStruct();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Nameserver [" + super.toString() + "id=" + id + ", ldhName=" + ldhName + ", ipAddresses=" + ipAddresses
				+ ", unicodeName=" + unicodeName + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((ipAddresses == null) ? 0 : ipAddresses.hashCode());
		result = prime * result + ((ldhName == null) ? 0 : ldhName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Nameserver))
			return false;
		Nameserver other = (Nameserver) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (ipAddresses == null) {
			if (other.ipAddresses != null)
				return false;
		} else if (!ipAddresses.equals(other.ipAddresses))
			return false;
		if (ldhName == null) {
			if (other.ldhName != null)
				return false;
		} else if (!ldhName.equals(other.ldhName))
			return false;
		return true;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Return the ldh name
	 * 
	 */
	public String getLdhName() {
		return ldhName;
	}

	/**
	 * @param ldhName
	 *            The LdhName to set
	 */
	public void setLdhName(String ldhName) {
		this.ldhName = ldhName;
	}

	/**
	 * @return the ipAddresses
	 */
	public NameserverIpAddressesStruct getIpAddresses() {
		return ipAddresses;
	}

	/**
	 * @param ipAddresses
	 *            the ipAddresses to set
	 */
	public void setIpAddresses(NameserverIpAddressesStruct ipAddresses) {
		this.ipAddresses = ipAddresses;
	}

	/**
	 * @return the unicodeName
	 * 
	 */
	public String getUnicodeName() {
		return this.unicodeName;
	}

	/**
	 * @param unicodeName
	 *            the unicodeName to set
	 */
	public void setUnicodeName(String unicodeName) {
		this.unicodeName = unicodeName;
	}

}
