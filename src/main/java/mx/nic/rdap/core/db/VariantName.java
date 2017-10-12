
package mx.nic.rdap.core.db;

/**
 * Contains one of the variant names of a {@link Variant}
 *
 */
public class VariantName {

	/**
	 * A string containing the ASCII name of the variant
	 */
	private String ldhName;

	/**
	 * A String containing the Unicode name of the variant
	 */
	private String unicodeName;

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "VariantName [ldhName=" + ldhName + ", unicodeName=" + unicodeName + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ldhName == null) ? 0 : ldhName.hashCode());
		result = prime * result + ((unicodeName == null) ? 0 : unicodeName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VariantName other = (VariantName) obj;
		if (ldhName == null) {
			if (other.ldhName != null)
				return false;
		} else if (!ldhName.equals(other.ldhName))
			return false;
		if (unicodeName == null) {
			if (other.unicodeName != null)
				return false;
		} else if (!unicodeName.equals(other.unicodeName))
			return false;
		return true;
	}

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

	public String getUnicodeName() {
		return unicodeName;
	}

	public void setUnicodeName(String unicodeName) {
		this.unicodeName = unicodeName;
	}
}
