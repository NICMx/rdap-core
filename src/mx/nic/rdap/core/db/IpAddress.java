package mx.nic.rdap.core.db;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import mx.nix.rdap.core.catalog.IpAddressType;
import mx.nix.rdap.core.catalog.Util;

/**
 * POJO representig an IpAddress, different to {@link IpNetwork}
 * 
 * @author dalpuche
 *
 */
public class IpAddress implements DatabaseObject {
	/**
	 * An unique identifier
	 */
	private long id;

	/**
	 * The type of the IpAddress {@link IpAddressType}
	 */
	private IpAddressType type;

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
	public IpAddressType getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(IpAddressType type) {
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

	@Override
	public void loadFromDatabase(ResultSet resultSet) throws SQLException {
		//validate if resulset is null
		if(resultSet.wasNull()){
			this.id=0L;
			this.type=null;
			this.address=null;
			return;
		}
		
		this.id=resultSet.getLong("iad_id");
		this.type=Util.getIpAddressType(resultSet.getInt("iad_type"));
		String value=resultSet.getString("iad_value");
		if(this.type==IpAddressType.IPV4) {
			try {
				this.address=Inet4Address.getByName(value);
			} catch (UnknownHostException e) {
				// TODO manage the exception
			}
		} 
		else if(this.type==IpAddressType.IPV6) {
			try {
				this.address=Inet6Address.getByName(value);
			} catch (UnknownHostException e) {
				// TODO manage the exception
			}
		} 
		else {
			this.address=null;
		}
	}

	@Override
	public void storeToDatabase(PreparedStatement preparedStatement) {
		// TODO Auto-generated method stub

	}

}
