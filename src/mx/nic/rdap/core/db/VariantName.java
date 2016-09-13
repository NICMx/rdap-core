
package mx.nic.rdap.core.db;


/**
 * 
 * @author evaldes
 *
 */
public class VariantName{
	
	/**
	 * A string containing the ASCII name of the nameserver
	 */
	private String ldhName;

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
