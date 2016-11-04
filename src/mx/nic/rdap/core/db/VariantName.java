
package mx.nic.rdap.core.db;

/**
 * Contains the LDH names of a variant
 *
 */
public class VariantName {

	/**
	 * A string containing the ASCII name of the variant
	 */
	private String ldhName;

	/**
	 * @return the ldhName
	 */
	public String getLdhName() {
		return ldhName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ldhName == null) ? 0 : ldhName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof VariantName))
			return false;
		VariantName other = (VariantName) obj;
		if (ldhName == null) {
			if (other.ldhName != null)
				return false;
		} else if (!ldhName.equals(other.ldhName))
			return false;
		return true;
	}

	/**
	 * @param ldhName
	 *            the ldhName to set
	 */
	public void setLdhName(String ldhName) {
		this.ldhName = ldhName;
	}

	public String getUnicode() {
		// TODO magic stuff here;
		return ldhName;
	}

	public String getPunycode() {
		return ldhName;
	}
}
