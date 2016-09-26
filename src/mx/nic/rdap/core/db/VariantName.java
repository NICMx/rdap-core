
package mx.nic.rdap.core.db;

/**
 * POJO for the VariantName Object, it contains the LDH names of a variant
 * 
 * @author evaldes
 *
 */
public class VariantName {

	/**
	 * A string containing the ASCII name of the variant
	 */
	private String ldhName;

	/**
	 * A Long value containing a variant´s unique identifier
	 */
	private Long variantId;

	/**
	 * @return the ldhName
	 */
	public String getLdhName() {
		return ldhName;
	}

	/**
	 * @param ldhName
	 *            the ldhName to set
	 */
	public void setLdhName(String ldhName) {
		this.ldhName = ldhName;
	}

	/**
	 * @return the variantId
	 */
	public Long getVariantId() {
		return variantId;
	}

	/**
	 * @param variantId
	 *            the variantId to set
	 */
	public void setVariantId(Long variantId) {
		this.variantId = variantId;
	}
}
