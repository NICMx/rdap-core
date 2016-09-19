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
