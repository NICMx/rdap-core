package mx.nic.rdap.core.db;

import java.util.ArrayList;
import java.util.List;

/**
 * Representation of the {@link SecureDNS} information that is not stored in the
 * registration database.
 * 
 */
public class DsData {
	/**
	 * An unique identifier for the DS data.
	 */
	private Long id;

	/**
	 * A long value containing a DsData´s Secure DNS identifier
	 */
	private Long secureDNSId;

	/**
	 * An integer specified by the key tag field of a DNS DS record.
	 */
	private Integer keytag;

	/**
	 * An integer as specified by the algorithm field of a DNS DS record.
	 */
	private Integer algorithm;

	/**
	 * A string specified by the digest field of a DNS DS record.
	 */
	private String digest;

	/**
	 * An integer as specified by the digest type field of a DNS DS record.
	 */
	private Integer digestType;

	/**
	 * An array of Event objects {@link Event}
	 */
	private List<Event> events;

	/**
	 * An array of Link objects {@link Link}
	 */
	private List<Link> links;

	public DsData() {
		events = new ArrayList<>();
		links = new ArrayList<>();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DsData [id=" + id + ", secureDNSId=" + secureDNSId + ", keytag=" + keytag + ", algorithm=" + algorithm
				+ ", digest=" + digest + ", digestType=" + digestType + ", events=" + events + ", links=" + links + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((algorithm == null) ? 0 : algorithm.hashCode());
		result = prime * result + ((digest == null) ? 0 : digest.hashCode());
		result = prime * result + ((digestType == null) ? 0 : digestType.hashCode());
		result = prime * result + ((events == null) ? 0 : events.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((keytag == null) ? 0 : keytag.hashCode());
		result = prime * result + ((links == null) ? 0 : links.hashCode());
		result = prime * result + ((secureDNSId == null) ? 0 : secureDNSId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof DsData))
			return false;
		DsData other = (DsData) obj;
		if (algorithm == null) {
			if (other.algorithm != null)
				return false;
		} else if (!algorithm.equals(other.algorithm))
			return false;
		if (digest == null) {
			if (other.digest != null)
				return false;
		} else if (!digest.equals(other.digest))
			return false;
		if (digestType == null) {
			if (other.digestType != null)
				return false;
		} else if (!digestType.equals(other.digestType))
			return false;
		if (events == null) {
			if (other.events != null)
				return false;
		} else if (events.size() != other.events.size() || !events.containsAll(other.events))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (keytag == null) {
			if (other.keytag != null)
				return false;
		} else if (!keytag.equals(other.keytag))
			return false;
		if (links == null) {
			if (other.links != null)
				return false;
		} else if (links.size() != other.links.size() || !links.containsAll(other.links))
			return false;
		if (secureDNSId == null) {
			if (other.secureDNSId != null)
				return false;
		} else if (!secureDNSId.equals(other.secureDNSId))
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
	 * @return the secueDNSId
	 */
	public Long getSecureDNSId() {
		return secureDNSId;
	}

	/**
	 * @param secueDNSId
	 *            the secueDNSId to set
	 */
	public void setSecureDNSId(Long secureDNSId) {
		this.secureDNSId = secureDNSId;
	}

	/**
	 * @return the keytag
	 */
	public Integer getKeytag() {
		return keytag;
	}

	/**
	 * @param keytag
	 *            the keytag to set
	 */
	public void setKeytag(Integer keytag) {
		this.keytag = keytag;
	}

	/**
	 * @return the algorithm
	 */
	public Integer getAlgorithm() {
		return algorithm;
	}

	/**
	 * @param algorithm
	 *            the algorithm to set
	 */
	public void setAlgorithm(Integer algorithm) {
		this.algorithm = algorithm;
	}

	/**
	 * @return the digest
	 */
	public String getDigest() {
		return digest;
	}

	/**
	 * @param digest
	 *            the digest to set
	 */
	public void setDigest(String digest) {
		this.digest = digest;
	}

	/**
	 * @return the digestType
	 */
	public Integer getDigestType() {
		return digestType;
	}

	/**
	 * @param digestType
	 *            the digestType to set
	 */
	public void setDigestType(Integer digestType) {
		this.digestType = digestType;
	}

	/**
	 * @return the events
	 */
	public List<Event> getEvents() {
		return events;
	}

	/**
	 * @param events
	 *            the events to set
	 */
	public void setEvents(List<Event> events) {
		this.events = events;
	}

	/**
	 * @return the links
	 */
	public List<Link> getLinks() {
		return links;
	}

	/**
	 * @param links
	 *            the links to set
	 */
	public void setLinks(List<Link> links) {
		this.links = links;
	}

}
