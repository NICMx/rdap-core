package mx.nic.rdap.core.db;

/**
 * POJO for the RemarkDescription object
 * 
 * @author dalpuche
 *
 */
public class RemarkDescription  {


	/**
	 * The description
	 */
	private String description;

	/**
	 * The order of the description on the remark array
	 */
	private int order;


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
