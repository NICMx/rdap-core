/**
 * 
 */
package mx.nic.rdap.core.db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**POJO representing the Variant object
 * @author evaldes
 *
 */
public class Variant implements DatabaseObject {

	/**
	 * An unique identifier for the variant
	 */
	private Integer id;
	
	/**
	 * A string containing the name of the IDN table of codepoints 
	 */
	private String idnTable;
	
	/**
	 * @param id
	 * @param idnTable
	 */
	public Variant(Integer id, String idnTable) {
		super();
		this.id = id;
		this.idnTable = idnTable;
	}

	/* (non-Javadoc)
	 * @see mx.nic.rdap.core.db.DatabaseObject#loadFromDatabase(java.sql.ResultSet)
	 */
	@Override
	public void loadFromDatabase(ResultSet resultSet) throws SQLException {
		// TODO Auto-generated method stub
		if(resultSet.wasNull())
		{
			id = 0;
			idnTable = null;
			return;
		}

		this.id = resultSet.getInt("var_id");
		this.idnTable = resultSet.getString("var_id_table");
	}

	/* (non-Javadoc)
	 * @see mx.nic.rdap.core.db.DatabaseObject#storeToDatabase(java.sql.PreparedStatement)
	 */
	@Override
	public void storeToDatabase(PreparedStatement preparedStatement){
		// TODO Auto-generated method stub
		try{
			preparedStatement.setInt(1, this.id);
			preparedStatement.setString(2, this.idnTable);
		}
		catch(SQLException e){
			
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
	 * @return the idnTable
	 */
	public String getIdnTable() {
		return idnTable;
	}

	/**
	 * @param idnTable the idnTable to set
	 */
	public void setIdnTable(String idnTable) {
		this.idnTable = idnTable;
	}

}
