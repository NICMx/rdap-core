package mx.nic.rdap.core.db;

import java.util.List;

/**
 * POJO representing the DsData object. The DsData is one of the representations
 * of the SecureDNS information that is not stored in the registration database.
 * 
 * @author evaldes
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
