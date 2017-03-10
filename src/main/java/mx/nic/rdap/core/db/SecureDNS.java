package mx.nic.rdap.core.db;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents secure DNS information about domain names.
 *
 */
public class SecureDNS {
	/**
	 * An unique identifier for the secureDNS object
	 */
	private Long id;

	/**
	 * A Long value containing the identifier of a SecureDNS's domain
	 */
	private Long domainId;

	/**
	 * true if the zone has been signed, false otherwise.
	 */
	private Boolean zoneSigned;

	/**
	 * boolean true if there are DS records in the parent, false otherwise
	 */
	private Boolean delegationSigned;

	/**
	 * An integer representing the signature lifetime in seconds
	 */
	private Integer maxSigLife;

	/**
	 * An object containing information about the DS record
	 */
	private List<DsData> dsData;

	private List<KeyData> keyData;

	public SecureDNS() {
		dsData = new ArrayList<>();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SecureDNS [id=" + id + ", domainId=" + domainId + ", zoneSigned=" + zoneSigned + ", delegationSigned="
				+ delegationSigned + ", maxSigLife=" + maxSigLife + ", dsData=" + dsData + ", keyData=" + keyData + "]";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((delegationSigned == null) ? 0 : delegationSigned.hashCode());
		result = prime * result + ((domainId == null) ? 0 : domainId.hashCode());
		result = prime * result + ((dsData == null) ? 0 : dsData.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((keyData == null) ? 0 : keyData.hashCode());
		result = prime * result + ((maxSigLife == null) ? 0 : maxSigLife.hashCode());
		result = prime * result + ((zoneSigned == null) ? 0 : zoneSigned.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof SecureDNS))
			return false;
		SecureDNS other = (SecureDNS) obj;
		if (delegationSigned == null) {
			if (other.delegationSigned != null)
				return false;
		} else if (!delegationSigned.equals(other.delegationSigned))
			return false;
		if (domainId == null) {
			if (other.domainId != null)
				return false;
		} else if (!domainId.equals(other.domainId))
			return false;
		if (dsData == null) {
			if (other.dsData != null)
				return false;
		} else if (!dsData.equals(other.dsData))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (keyData == null) {
			if (other.keyData != null)
				return false;
		} else if (!keyData.equals(other.keyData))
			return false;
		if (maxSigLife == null) {
			if (other.maxSigLife != null)
				return false;
		} else if (!maxSigLife.equals(other.maxSigLife))
			return false;
		if (zoneSigned == null) {
			if (other.zoneSigned != null)
				return false;
		} else if (!zoneSigned.equals(other.zoneSigned))
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
	 * @return the domainId
	 */
	public Long getDomainId() {
		return domainId;
	}

	/**
	 * @param domainId
	 *            the domainId to set
	 */
	public void setDomainId(Long domainId) {
		this.domainId = domainId;
	}

	/**
	 * @return the zoneSigned
	 */
	public Boolean getZoneSigned() {
		return zoneSigned;
	}

	/**
	 * @param zoneSigned
	 *            the zoneSigned to set
	 */
	public void setZoneSigned(Boolean zoneSigned) {
		this.zoneSigned = zoneSigned;
	}

	/**
	 * @return the delegationSigned
	 */
	public Boolean getDelegationSigned() {
		return delegationSigned;
	}

	/**
	 * @param delegationSigned
	 *            the delegationSigned to set
	 */
	public void setDelegationSigned(Boolean delegationSigned) {
		this.delegationSigned = delegationSigned;
	}

	/**
	 * @return the maxSigLife
	 */
	public Integer getMaxSigLife() {
		return maxSigLife;
	}

	/**
	 * @param maxSigLife
	 *            the maxSigLife to set
	 */
	public void setMaxSigLife(Integer maxSigLife) {
		this.maxSigLife = maxSigLife;
	}

	/**
	 * @return the dsData
	 */
	public List<DsData> getDsData() {
		return dsData;
	}

	/**
	 * @param dsData
	 *            the dsData to set
	 */
	public void setDsData(List<DsData> dsData) {
		this.dsData = dsData;
	}

	/**
	 * @return the keyData
	 */
	public List<KeyData> getKeyData() {
		return keyData;
	}

	/**
	 * @param keyData
	 *            the keyData to set
	 */
	public void setKeyData(List<KeyData> keyData) {
		this.keyData = keyData;
	}

}
