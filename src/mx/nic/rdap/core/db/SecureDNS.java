package mx.nic.rdap.core.db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * POJO representing the SecureDNS object
 * @author evaldes
 *
 */
public class SecureDNS implements DatabaseObject {
	/**
	 * An unique identifier for the secureDNS object
	 */
	private Long id;
	
	/**
	 * A boolean that is true when zone is signed
	 */
	private Boolean zoneSigned;
	
	/**
	 * A boolean that is true when delegation is signed
	 */
	private Boolean delegationSigned;
	
	/**
	 * An integer representing the signature lifetime in seconds
	 */
	private Integer maxSigLife; 
	
	/**
	 * @param id
	 * @param zoneSigned
	 * @param delegationSigned
	 * @param maxSigLife
	 */
	public SecureDNS(Long id, Boolean zoneSigned, Boolean delegationSigned, Integer maxSigLife) {
		super();
		this.id = id;
		this.zoneSigned = zoneSigned;
		this.delegationSigned = delegationSigned;
		this.maxSigLife = maxSigLife; 
	}

	@Override
	public void loadFromDatabase(ResultSet resultSet) throws SQLException {
		// TODO Auto-generated method stub
		if(resultSet.wasNull())
		{
			this.id = 0L;
			this.zoneSigned = false;
			this.delegationSigned = false;
			this.maxSigLife = 0;
			return;
		}
		this.id = resultSet.getLong("sdns_id");
		this.zoneSigned = resultSet.getBoolean("sdns_zone_signed");
		this.delegationSigned = resultSet.getBoolean("sdns_delegation_signed");
		this.maxSigLife = resultSet.getInt("sdns_max_sig_life");
	}

	@Override
	public void storeToDatabase(PreparedStatement preparedStatement) {
		// TODO Auto-generated method stub
		try{
			preparedStatement.setLong(1, this.id);
			preparedStatement.setBoolean(2, this.zoneSigned);
			preparedStatement.setBoolean(3, this.delegationSigned);
			preparedStatement.setInt(4, this.maxSigLife);
		}
		catch(SQLException e){
			//TODO handle exception
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
	 * @return the zoneSigned
	 */
	public Boolean getZoneSigned() {
		return zoneSigned;
	}

	/**
	 * @param zoneSigned the zoneSigned to set
	 */
	public void setZoneSigned(Boolean zoneSigned) {
		this.zoneSigned = zoneSigned;
	}

	/**
	 * @return the delegationSigned
	 */
	public Boolean getDelegationSigned() {
		return delegationSigned;
	}

	/**
	 * @param delegationSigned the delegationSigned to set
	 */
	public void setDelegationSigned(Boolean delegationSigned) {
		this.delegationSigned = delegationSigned;
	}

	/**
	 * @return the maxSigLife
	 */
	public Integer getMaxSigLife() {
		return maxSigLife;
	}

	/**
	 * @param maxSigLife the maxSigLife to set
	 */
	public void setMaxSigLife(Integer maxSigLife) {
		this.maxSigLife = maxSigLife;
	}

}
