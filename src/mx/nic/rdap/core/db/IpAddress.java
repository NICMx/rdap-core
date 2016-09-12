package mx.nic.rdap.core.db;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Object representig an IpAddress, different to {@link IpNetwork}
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

	@Override
	public void loadFromDatabase(ResultSet resultSet) throws SQLException {
		// validate if resulset is null
		if (resultSet.wasNull()) {
			this.id = 0L;
			this.type = 0;
			this.address = null;
			return;
		}

		this.id = resultSet.getLong("iad_id");
		this.type = resultSet.getInt("iad_type");
		try {
			this.address = InetAddress.getByName(resultSet.getString("iad_value"));
		} catch (UnknownHostException e) {
			// TODO manage the exception
		}

	}

	@Override
	public void storeToDatabase(PreparedStatement preparedStatement) throws SQLException{
		// TODO Auto-generated method stub

	}

}
