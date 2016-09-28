package mx.nic.rdap.core.db;

/**
 * POJO for the RemarkDescription object
 * 
 * @author dalpuche
 *
 */
public class RemarkDescription {

	/**
	 * The id of the Remark
	 */
	private Long remarkId;

	/**
	 * The description
	 */
	private String description;

	/**
	 * The order of the description on the remark array
	 */
	private int order;

	/**
	 * @return the remarkId
	 */
	public Long getRemarkId() {
		return remarkId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + order;
		result = prime * result + ((remarkId == null) ? 0 : remarkId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof RemarkDescription))
			return false;
		RemarkDescription other = (RemarkDescription) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (order != other.order)
			return false;
		if (remarkId == null) {
			if (other.remarkId != null)
				return false;
		} else if (!remarkId.equals(other.remarkId))
			return false;
		return true;
	}

	/**
	 * @param remarkId
	 *            the remarkId to set
	 */
	public void setRemarkId(Long remarkId) {
		this.remarkId = remarkId;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the order
	 */
	public int getOrder() {
		return order;
	}

	/**
	 * @param order
	 *            the order to set
	 */
	public void setOrder(int order) {
		this.order = order;
	}

}
