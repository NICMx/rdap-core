package mx.nic.rdap.core.db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import mx.nic.rdap.core.db.struct.NameserverIpAddressesStruct;

/**
 * POJO representing the Nameserver object
 * @author dalpuche
 *
 */
public class Nameserver implements DatabaseObject{
	/**
	 * An unique identifier of the nameserver
	 */
	private Long id;
	
	/**
	 * A string representing a registry unique identifier of the nameserver
	 */
	private String handle;
	
	/**
	 * A string containing the unicode name of the nameserver
	 */
	private String punycodeName;
	
	/**
	 * An object containing two arrays (v4 and v6) of ipAddresses
	 */
	private NameserverIpAddressesStruct ipAddresses;
	
	/**
	 *A string containing the  host name or IP address of the WHOIS server where the nameserver object instance may be found.
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

	/**
	 * Return the ldh name from the punycode name
	 * @return the ldh name of the domain
	 */
	public String getLdhName(){
		return punycodeName;//ldh name is the punycode
	}
	
	/**
	 * Return the unicode name from the punycode name
	 * @return the unicode name of the domain
	 */
	public String getUnicodeName(){
		//TODO:Magic stuff here
		return "";//ldh name is the punycode
	}
	
	
	/**
	 * @return the ipAddresses
	 */
	public NameserverIpAddressesStruct getIpAddresses() {
		return ipAddresses;
	}

	/**
	 * @param ipAddresses the ipAddresses to set
	 */
	public void setIpAddresses(NameserverIpAddressesStruct ipAddresses) {
		this.ipAddresses = ipAddresses;
	}

	/* (non-Javadoc)
	 * @see mx.nic.rdap.core.db.DatabaseObject#loadFromDatabase(java.sql.ResultSet)
	 */
	@Override
	public void loadFromDatabase(ResultSet resultSet) throws SQLException {
		// TODO Auto-generated method stub
	}

	/* (non-Javadoc)
	 * @see mx.nic.rdap.core.db.DatabaseObject#storeToDatabase(java.sql.PreparedStatement)
	 */
	@Override
	public void storeToDatabase(PreparedStatement preparedStatement) {
		// TODO Auto-generated method stub
	}



	
	
	
}
