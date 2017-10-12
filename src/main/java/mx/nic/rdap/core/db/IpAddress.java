package mx.nic.rdap.core.db;

import java.net.InetAddress;

/**
 * IpAddress object for a {@link Nameserver}, different to {@link IpNetwork}
 * 
 *
 */
public class IpAddress {
	/**
	 * An unique identifier
	 */
	private Long id;

	/**
	 * The Nameserver's id
	 */
	private Long nameserverId;

	/**
	 * The type of the IpAddress(IPV4=4, IPV6=6)
	 */
	private Integer type;

	/**
	 * The value of the address
	 */
	private InetAddress address;

	/**
	 * Constructor default
	 */
	public IpAddress() {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "IpAddress [id=" + id + ", nameserverId=" + nameserverId + ", type=" + type + ", address=" + address
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nameserverId == null) ? 0 : nameserverId.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IpAddress other = (IpAddress) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nameserverId == null) {
			if (other.nameserverId != null)
				return false;
		} else if (!nameserverId.equals(other.nameserverId))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	/**
	 * @return the nameserverId
	 */
	public long getNameserverId() {
		return nameserverId;
	}

	/**
	 * @param nameserverId
	 *            the nameserverId to set
	 */
	public void setNameserverId(long nameserverId) {
		this.nameserverId = nameserverId;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the type
	 */
	public int getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(int type) {
		this.type = type;
	}

	/**
	 * @return the address
	 */
	public InetAddress getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(InetAddress address) {
		this.address = address;
	}

}
