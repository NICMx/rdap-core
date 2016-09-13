package mx.nic.rdap.core.db;

public class Zone{
	
	/**
	 *  An unique identifier for the zone
	 */
	private Integer id;
	
	/**
	 * String containing the name of the zone
	 */
	private String zoneName;

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
