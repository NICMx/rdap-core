package mx.nic.rdap.core.db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * POJO representating the Nameserver object
 * @author dalpuche
 *
 */
public class Nameserver implements DatabaseObject{
	/**
	 * An unique identifier of the nameserver
	 */
	private Long id;
	
	/**
	 * a string representing a registry unique identifier of the nameserver
	 */
	private String handle;
	
	/**
	 * a string containing the unicode name of the nameserver
	 */
	private String punycodeName;
	
	/**
	 *a string containing the  host name or IP address of the WHOIS server where the nameserver object instance may be found.
	 */
	private String port43;

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
	 * @return the punycodeName
	 */
	public String getPunycodeName() {
		return punycodeName;
	}

	/**
	 * @param punycodeName the punycodeName to set
	 */
	public void setPunycodeName(String punycodeName) {
		this.punycodeName = punycodeName;
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

	@Override
	public void loadFromDatabase(ResultSet resultSet) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void storeToDatabase(PreparedStatement preparedStatement) {
		// TODO Auto-generated method stub
		
	}
	
	
}
