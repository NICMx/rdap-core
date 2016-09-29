package mx.nic.rdap.core.db;

/**
 * POJO representing the PublicId Object. This data structure maps a public
 * identifier to an object class.
 * 
 * @author evaldes
 *
 */

public class PublicId {

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((publicId == null) ? 0 : publicId.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof PublicId))
			return false;
		PublicId other = (PublicId) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (publicId == null) {
			if (other.publicId != null)
				return false;
		} else if (!publicId.equals(other.publicId))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
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
	 * @param publicId
	 *            the publicId to set
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
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

}
