/**
 * 
 */
package mx.nic.rdap.core.db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * POJO representing the DsData object.
 * @author evaldes
 *
 */
public class DsData implements DatabaseObject {
/**
 * An unique identifier for the DS data.
 */
	private Integer id;
	
	/**
	 *  An integer specified by the key tag field of a DNS DS record.
	 */
	private Integer keytag;
	
	/**
	 * An integer as specified by the algorithm field of a DNS DS record.
	 */
	private Integer algorithm;
	
	/**
	 * A string specified by the digest field of a DNS DS record.
	 */
	private String digest;
	
	/**
	 * An integer as specified by the digest type field of a DNS DS record.
	 */
	private String digestType;	
	
	/**
	 * @param id
	 * @param keytag
	 * @param algorithm
	 * @param digest
	 * @param digestType
	 */
	public DsData(Integer id, Integer keytag, Integer algorithm, String digest, String digestType) {
		super();
		this.id = id;
		this.keytag = keytag;
		this.algorithm = algorithm;
		this.digest = digest;
		this.digestType = digestType;
	}

	/* (non-Javadoc)
	 * @see mx.nic.rdap.core.db.DatabaseObject#loadFromDatabase(java.sql.ResultSet)
	 */
	@Override
	public void loadFromDatabase(ResultSet resultSet) throws SQLException {
		// TODO Auto-generated method stub
		if(resultSet.wasNull())
		{
			this.id = 0;
			this.keytag = null;
			this.algorithm = 0;
			this.digest = null;
			this.digestType = null;
			return;
		}
		this.id = resultSet.getInt("dsd_id");
		this.keytag = resultSet.getInt("dsd_keytag");
		this.algorithm = resultSet.getInt("dsd_algorithm");
		this.digest = resultSet.getString("dsd_digest");
		this.digestType = resultSet.getString("dsd_digest_type");
	}

	/* (non-Javadoc)
	 * @see mx.nic.rdap.core.db.DatabaseObject#storeToDatabase(java.sql.PreparedStatement)
	 */
	@Override
	public void storeToDatabase(PreparedStatement preparedStatement) {
		// TODO Auto-generated method stub
		try{
			preparedStatement.setInt(1, this.id);
			preparedStatement.setInt(2, this.keytag);
			preparedStatement.setInt(3, this.algorithm);
			preparedStatement.setString(4, this.digest);
			preparedStatement.setString(5, this.digestType);
		}
		catch(SQLException e){
			//TODO handle exception
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
	 * @return the keytag
	 */
	public Integer getKeytag() {
		return keytag;
	}

	/**
	 * @param keytag the keytag to set
	 */
	public void setKeytag(Integer keytag) {
		this.keytag = keytag;
	}

	/**
	 * @return the algorithm
	 */
	public Integer getAlgorithm() {
		return algorithm;
	}

	/**
	 * @param algorithm the algorithm to set
	 */
	public void setAlgorithm(Integer algorithm) {
		this.algorithm = algorithm;
	}

	/**
	 * @return the digest
	 */
	public String getDigest() {
		return digest;
	}

	/**
	 * @param digest the digest to set
	 */
	public void setDigest(String digest) {
		this.digest = digest;
	}

	/**
	 * @return the digestType
	 */
	public String getDigestType() {
		return digestType;
	}

	/**
	 * @param digestType the digestType to set
	 */
	public void setDigestType(String digestType) {
		this.digestType = digestType;
	}

}
