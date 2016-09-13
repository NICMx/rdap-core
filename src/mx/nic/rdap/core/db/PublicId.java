package mx.nic.rdap.core.db;

/**
 * POJO representing the DomainPublicId object
 * @author evaldes
 *
 */

public class PublicId{
	
	/**
	 * An unique identifier of the public Id
	 */
	private Long id;
	/**
	 * A public identifier of the type denoted by "type"
	 */
	private String publicId;
	
	/**
	 * A string denoting the type of public identifier
	 */
	private String type;

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
