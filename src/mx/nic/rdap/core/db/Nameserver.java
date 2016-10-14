package mx.nic.rdap.core.db;

import java.net.IDN;

import mx.nic.rdap.core.db.struct.NameserverIpAddressesStruct;

/**
 * POJO for the Nameserver object.The nameserver object class represents
 * information regarding DNS nameservers used in both forward and reverse DNS
 * 
 * @author dalpuche
 *
 */
public class Nameserver extends RdapObject {
	/**
	 * An unique identifier of the nameserver
	 */
	private Long id;

	/**
	 * A string containing the unicode name of the nameserver
	 */
	private String punycodeName;

	/**
	 * An object containing two arrays (v4 and v6) of ipAddresses
	 * {@link NameserverIpAddressesStruct}
	 */
	private NameserverIpAddressesStruct ipAddresses;

	/**
	 * Constructor
	 */
	public Nameserver() {
		super();
		ipAddresses = new NameserverIpAddressesStruct();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((ipAddresses == null) ? 0 : ipAddresses.hashCode());
		result = prime * result + ((punycodeName == null) ? 0 : punycodeName.hashCode());
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
		if (punycodeName == null) {
			if (other.punycodeName != null)
				return false;
		} else if (!punycodeName.equals(other.punycodeName))
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
	 * @return the punycodeName
	 */
	public String getPunycodeName() {
		return punycodeName;
	}

	/**
	 * @param punycodeName
	 *            the punycodeName to set
	 */
	public void setPunycodeName(String punycodeName) {
		this.punycodeName = IDN.toASCII(punycodeName);
	}

	/**
	 * Return the ldh name from the punycode name
	 * 
	 * @return the ldh name of the domain
	 */
	public String getLdhName() {
		return this.getPunycodeName();// ldh name is the punycode
	}

	/**
	 * Return the unicode name from the punycode name
	 * 
	 * @return the unicode name of the domain
	 */
	public String getUnicodeName() {
		return IDN.toUnicode(this.getLdhName());
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

}
