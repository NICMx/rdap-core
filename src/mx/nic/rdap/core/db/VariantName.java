/**
 * 
 */
package mx.nic.rdap.core.db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 
 * @author evaldes
 *
 */
public class VariantName implements DatabaseObject {
	
	/**
	 * A string containing the ASCII name of the nameserver
	 */
	private String ldhName;

	/**
	 * @param id
	 * @param ldhName
	 */
	public VariantName(Integer id, String ldhName) {
		super();
		this.ldhName = ldhName;
	}

	/* (non-Javadoc)
	 * @see mx.nic.rdap.core.db.DatabaseObject#loadFromDatabase(java.sql.ResultSet)
	 */
	@Override
	public void loadFromDatabase(ResultSet resultSet) throws SQLException {
		// TODO Auto-generated method stub
		if(resultSet.wasNull())
		{
			this.ldhName = null;
			return;
		}
		this.ldhName = resultSet.getString("vna_ldh_name");
	}

	/* (non-Javadoc)
	 * @see mx.nic.rdap.core.db.DatabaseObject#storeToDatabase(java.sql.PreparedStatement)
	 */
	@Override
	public void storeToDatabase(PreparedStatement preparedStatement) {
		// TODO Auto-generated method stub
		try{
			preparedStatement.setString(2,this.ldhName);
		}
		catch(SQLException e){
			//TODO handle exception
		}

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
	public void setLdhName(String ldhName) {
		this.ldhName = ldhName;
	}
	
	/**
	 * Return the unicodeName from the ldhName
	 * @return
	 */
	public String getUnicodeName() {
		// TODO Something
		return "";
	}

	

}
