package mx.nic.rdap.core.db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Zone implements DatabaseObject {
	
	/**
	 *  An unique identifier for the zone
	 */
	private Integer id;
	
	/**
	 * String containing the name of the zone
	 */
	private String zoneName;

	/**
	 * @param id
	 * @param zoneName
	 */
	public Zone(Integer id, String zoneName) {
		super();
		this.id = id;
		this.zoneName = zoneName;
	}

	@Override
	public void loadFromDatabase(ResultSet resultSet) throws SQLException {
		// TODO Auto-generated method stub
		if(resultSet.wasNull())
		{
			this.id = 0;
			this.zoneName = null;
			return;
		}
		this.id = resultSet.getInt("zone_id");
		this.zoneName = resultSet.getString("zone_name");
	}

	@Override
	public void storeToDatabase(PreparedStatement preparedStatement) {
		// TODO Auto-generated method stub
		try{
			preparedStatement.setInt(1, this.id);
			preparedStatement.setString(2, this.zoneName);
		}
		catch(SQLException e){
			//TODO Handle exception
		}

	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the zoneName
	 */
	public String getZoneName() {
		return zoneName;
	}

	/**
	 * @param zoneName the zoneName to set
	 */
	public void setZoneName(String zoneName) {
		this.zoneName = zoneName;
	}

}
