package mx.nic.rdap.core.db;

import java.net.InetAddress;

import mx.nic.rdap.core.catalog.IpVersion;

public class IpNetwork extends RdapObject {

	private Long id;
	private IpVersion ipVersion;
	private InetAddress startAddress;
	private InetAddress endAddress;
	private String name;
	private String type;
	private String country;
	private String parentHandle;
	private Integer cidr;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((cidr == null) ? 0 : cidr.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((endAddress == null) ? 0 : endAddress.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((ipVersion == null) ? 0 : ipVersion.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((parentHandle == null) ? 0 : parentHandle.hashCode());
		result = prime * result + ((startAddress == null) ? 0 : startAddress.hashCode());
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
		if (cidr == null) {
			if (other.cidr != null)
				return false;
		} else if (!cidr.equals(other.cidr))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (endAddress == null) {
			if (other.endAddress != null)
				return false;
		} else if (!endAddress.equals(other.endAddress))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (ipVersion == null) {
			if (other.ipVersion != null)
				return false;
		} else if (!ipVersion.equals(other.ipVersion))
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
		if (startAddress == null) {
			if (other.startAddress != null)
				return false;
		} else if (!startAddress.equals(other.startAddress))
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
		return ipVersion;
	}

	public void setIpVersion(IpVersion ipVersion) {
		this.ipVersion = ipVersion;
	}

	public InetAddress getStartAddress() {
		return startAddress;
	}

	public void setStartAddress(InetAddress startAddress) {
		this.startAddress = startAddress;
	}

	public InetAddress getEndAddress() {
		return endAddress;
	}

	public void setEndAddress(InetAddress endAddress) {
		this.endAddress = endAddress;
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

	public Integer getCidr() {
		return cidr;
	}

	public void setCidr(Integer cidr) {
		this.cidr = cidr;
	}

}
