package mx.nic.rdap.core.db;

import mx.nic.rdap.core.catalog.IpVersion;
import mx.nic.rdap.core.ip.AddressBlock;

/**
 * The IP network object class models IP network registrations found in RIRs
 */
public class IpNetwork extends RdapObject {

	/**
	 * unique identifier of the IP network
	 */
	private Long id;

	/**
	 * Bunch of addresses that make up the network.
	 */
	private AddressBlock addressBlock;

	/**
	 * an identifier assigned to the network registration by the registration
	 * holder
	 */
	private String name;

	/**
	 * a string containing an RIR-specific classification of the network
	 */
	private String type;

	/**
	 * a string containing the two-character country code of the network
	 */
	private String country;

	/**
	 * a string containing an RIR-unique identifier of the parent network of
	 * this network registration
	 */
	private String parentHandle;

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "IpNetwork [" + super.toString() + ", id=" + id + ", addressBlock=" + addressBlock + ", name=" + name
				+ ", type=" + type + ", country=" + country + ", parentHandle=" + parentHandle + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((addressBlock == null) ? 0 : addressBlock.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((parentHandle == null) ? 0 : parentHandle.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof IpNetwork))
			return false;
		IpNetwork other = (IpNetwork) obj;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (addressBlock == null) {
			if (other.addressBlock != null)
				return false;
		} else if (!addressBlock.equals(other.addressBlock))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (parentHandle == null) {
			if (other.parentHandle != null)
				return false;
		} else if (!parentHandle.equals(other.parentHandle))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public IpVersion getIpVersion() {
		return addressBlock.getIpVersion();
	}

	public AddressBlock getAddressBlock() {
		return addressBlock;
	}

	public void setAddressBlock(AddressBlock addressBlock) {
		this.addressBlock = addressBlock;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getParentHandle() {
		return parentHandle;
	}

	public void setParentHandle(String parentHandle) {
		this.parentHandle = parentHandle;
	}

}
