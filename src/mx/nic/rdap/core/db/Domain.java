package mx.nic.rdap.core.db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * POJO representing the Domain object
 * @author evaldes
 *
 */
public class Domain implements DatabaseObject {
	/**
	 * An unique identifier of the domain
	 */
	private Long id;
	
	/**
	 * A string representing a registry unique id of the domain
	 */
	private String handle;
	
	/**
	 * A string containing the ASCII name of the domains
	 */
	private String ldhName;
	
	/**
	 * A string containing the host name or IP address oh the WHOIS server where the domain object instance may be  found
	 */
	private String port43;
	
	
	/**
	 * Constructor
	 * @param id
	 * @param handle
	 * @param punycodeName
	 * @param port43
	 * @param zoneId
	 */
	Domain(Long id, String handle, String punycodeName, String port43){
		this.id = id;
		this.handle = handle;
		this.ldhName = punycodeName;
		this.port43 = port43; 
	}

	/**
	 * Loads the information coming from the database in an instance of Domain
	 * 
	 * @param rs
	 * 			ResultSet where all information is obtained
	 * @throws SQLException 
	 */
	@Override
	public void loadFromDatabase(ResultSet resultSet) throws SQLException{ 
		// TODO Auto-generated method stub
		if (resultSet.wasNull())
		{
			this.id = 0L;
			this.handle = null;
			this.ldhName = null;
			this.port43 = null; 
			return;
		}
		this.id = resultSet.getLong("dom_id");
		this.handle = resultSet.getString("dom_handle");
		this.ldhName = resultSet.getString("dom_ldh_name");
		this.port43 = resultSet.getString("dom_port43"); 
	}

	/**
	 * Puts the information contained in Domain object inside a SQLQuery
	 * 
	 * @param query
	 * 			Where all the information is saved
	 * @throws SQLException 
	 */
	@Override
	public void storeToDatabase(PreparedStatement preparedStatement){ 
		// TODO Auto-generated method stub
		try{
			preparedStatement.setLong(1, this.id);
			preparedStatement.setString(2, this.handle);
			preparedStatement.setString(3, this.ldhName);
			preparedStatement.setString(4, this.port43); 
		}
		catch(SQLException e){
			
		}
		
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the handle
	 */
	public String getHandle() {
		return handle;
	}

	/**
	 * @param handle the handle to set
	 */
	public void setHandle(String handle) {
		this.handle = handle;
	}

	/**
	 * @return the ldhName
	 */
	public String getLdhName() {
		return ldhName;
	}

	/**
	 * @param ldhName the ldhName to set
	 */
	public void setLdhName(String punycodeName) {
		this.ldhName = punycodeName;
	}
	
	public String getUnicodeName() {
		// TODO Something
		return "";
	}

	/**
	 * @return the port43
	 */
	public String getPort43() {
		return port43;
	}

	/**
	 * @param port43 the port43 to set
	 */
	public void setPort43(String port43) {
		this.port43 = port43;
	}

}
