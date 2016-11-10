package mx.nic.rdap.core.db;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a DNS name and point of delegation.
 *
 */
public class Domain extends RdapObject {
	/**
	 * An unique identifier of the domain
	 */
	private Long id;

	/**
	 * A string containing the ldh name of the domains. Textual representations
	 * of DNS names where the labels of the domain are all "letters, digits,
	 * hyphen"
	 */
	private String ldhName;

	/**
	 * An array of Nameserver objects {@link Nameserver}
	 */
	private List<Nameserver> nameServers;

	/**
	 * An array of Variant objects {@link Variant}
	 */
	private List<Variant> variants;

	/**
	 * An object containing information about signatures {@link SecureDNS}
	 */
	private SecureDNS secureDNS;

	/**
	 * An array of DomainPublicId objects {@link PublicId}
	 */
	private List<PublicId> publicIds;

	/**
	 * An object containing a string with the zone and the id {@link Zone}
	 */
	private Integer zoneId;

	public Domain() {
		super();
		nameServers = new ArrayList<>();
		variants = new ArrayList<>();
		publicIds = new ArrayList<>();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((ldhName == null) ? 0 : ldhName.hashCode());
		result = prime * result + ((nameServers == null) ? 0 : nameServers.hashCode());
		result = prime * result + ((publicIds == null) ? 0 : publicIds.hashCode());
		result = prime * result + ((secureDNS == null) ? 0 : secureDNS.hashCode());
		result = prime * result + ((variants == null) ? 0 : variants.hashCode());
		result = prime * result + ((zoneId == null) ? 0 : zoneId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Domain))
			return false;
		Domain other = (Domain) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (ldhName == null) {
			if (other.ldhName != null)
				return false;
		} else if (!ldhName.equals(other.ldhName))
			return false;
		if (nameServers == null) {
			if (other.nameServers != null)
				return false;
		} else if (nameServers.size() != other.nameServers.size() || !nameServers.containsAll(other.nameServers))
			return false;
		if (publicIds == null) {
			if (other.publicIds != null)
				return false;
		} else if (publicIds.size() != other.publicIds.size() || !publicIds.containsAll(other.publicIds))
			return false;
		if (secureDNS == null) {
			if (other.secureDNS != null)
				return false;
		} else if (!secureDNS.equals(other.secureDNS))
			return false;
		if (variants == null) {
			if (other.variants != null)
				return false;
		} else if (variants.size() != other.variants.size() || !variants.containsAll(other.variants))
			return false;
		if (zoneId == null) {
			if (other.zoneId != null)
				return false;
		} else if (!zoneId.equals(other.zoneId))
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
	 * @return the ldhName
	 */
	public String getLdhName() {
		return ldhName;
	}

	/**
	 * @param ldhName
	 *            the ldhName to set
	 */
	public void setLdhName(String punycodeName) {
		this.ldhName = punycodeName;
	}

	/**
	 * @return the nameServers
	 */
	public List<Nameserver> getNameServers() {
		return nameServers;
	}

	/**
	 * @param nameServers
	 *            the nameServers to set
	 */
	public void setNameServers(List<Nameserver> nameServers) {
		this.nameServers = nameServers;
	}

	/**
	 * @return the variants
	 */
	public List<Variant> getVariants() {
		return variants;
	}

	/**
	 * @param variants
	 *            the variants to set
	 */
	public void setVariants(List<Variant> variants) {
		this.variants = variants;
	}

	/**
	 * @return the secureDNS
	 */
	public SecureDNS getSecureDNS() {
		return secureDNS;
	}

	/**
	 * @param secureDNS
	 *            the secureDNS to set
	 */
	public void setSecureDNS(SecureDNS secureDNS) {
		this.secureDNS = secureDNS;
	}

	/**
	 * @return the publicIds
	 */
	public List<PublicId> getPublicIds() {
		return publicIds;
	}

	/**
	 * @param publicIds
	 *            the publicIds to set
	 */
	public void setPublicIds(List<PublicId> publicIds) {
		this.publicIds = publicIds;
	}

	/**
	 * @return the zone
	 */
	public Integer getZoneId() {
		return zoneId;
	}

	/**
	 * @param zone
	 *            the zone to set
	 */
	public void setZoneId(Integer zoneId) {
		this.zoneId = zoneId;
	}

}
