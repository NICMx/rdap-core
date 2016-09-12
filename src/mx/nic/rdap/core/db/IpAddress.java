package mx.nic.rdap.core.db;

import java.net.InetAddress;

/**
 * POJO for the IpAddress object, different to {@link IpNetwork}
 * 
 * @author dalpuche
 *
 */
public class IpAddress  {
	/**
	 * An unique identifier
	 */
	private long id;

	/**
	 * The type of the IpAddress(IPV4=4, IPV6=6)
	 */
	private int type;

	/**
	 * The value of the address
	 */
	private InetAddress address;

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
