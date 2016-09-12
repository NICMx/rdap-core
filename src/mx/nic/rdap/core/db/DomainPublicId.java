package mx.nic.rdap.core.db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DomainPublicId implements DatabaseObject {
	
	/**
	 * A public identifier of the type denoted by "type"
	 */
	private String publicId;
	
	/**
	 * A string denoting the type of public identifier
	 */
	private String type;

	/**
	 * @param publicId
	 * @param type
	 */
	public DomainPublicId(String publicId, String type) {
		super();
		this.publicId = publicId;
		this.type = type;
	}

	@Override
	public void loadFromDatabase(ResultSet resultSet) throws SQLException {
		// TODO Auto-generated method stub
		if(resultSet.wasNull())
		{
			this.publicId = null;
			this.type = null;
			return;
		}
		this.publicId = resultSet.getString("dpid_identifier");
		this.type = resultSet.getString("dpid_type");
	}

	@Override
	public void storeToDatabase(PreparedStatement preparedStatement) {
		// TODO Auto-generated method stub
		try{
			preparedStatement.setString(1, this.publicId);
			preparedStatement.setString(2, this.type);
		}
		catch(SQLException e){
			
		}
	}

	/**
	 * @return the publicId
	 */
	public String getPublicId() {
		return publicId;
	}

	/**
	 * @param publicId the publicId to set
	 */
	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

}
