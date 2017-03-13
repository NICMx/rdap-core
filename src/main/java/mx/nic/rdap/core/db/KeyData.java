package mx.nic.rdap.core.db;

import java.util.ArrayList;
import java.util.List;

public class KeyData {

	/**
	 * An unique identifier for the Key data.
	 */
	private Long id;

	/**
	 * A long value containing a KeyData's Secure DNS identifier
	 */
	private Long secureDNSId;

	/**
	 * An integer representing the flags field value in the DNSKEY record
	 */
	private int flags;

	/**
	 * An integer representation of the protocol field value of the DNSKEY
	 * record
	 */
	private int protocol;

	/** A string representation of the public key in the DNSKEY record */
	private String publicKey;

	/** An integer as specified by the algorithm field of a DNSKEY record */
	private int algorithm;

	/**
	 * An array of Event objects {@link Event}
	 */
	private List<Event> events;

	/**
	 * An array of Link objects {@link Link}
	 */
	private List<Link> links;

	public KeyData() {
		events = new ArrayList<>();
		links = new ArrayList<>();
	}

	@Override
	public String toString() {
		return "KeyData [id=" + id + ", secureDNSId=" + secureDNSId + ", flags=" + flags + ", protocol=" + protocol
				+ ", publicKey=" + publicKey + ", algorithm=" + algorithm + ", events=" + events + ", links=" + links
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + algorithm;
		result = prime * result + ((events == null) ? 0 : events.hashCode());
		result = prime * result + flags;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((links == null) ? 0 : links.hashCode());
		result = prime * result + protocol;
		result = prime * result + ((publicKey == null) ? 0 : publicKey.hashCode());
		result = prime * result + ((secureDNSId == null) ? 0 : secureDNSId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof KeyData)) {
			return false;
		}
		KeyData other = (KeyData) obj;
		if (algorithm != other.algorithm) {
			return false;
		}
		if (events == null) {
			if (other.events != null) {
				return false;
			}
		} else if (!events.equals(other.events)) {
			return false;
		}
		if (flags != other.flags) {
			return false;
		}
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (links == null) {
			if (other.links != null) {
				return false;
			}
		} else if (!links.equals(other.links)) {
			return false;
		}
		if (protocol != other.protocol) {
			return false;
		}
		if (publicKey == null) {
			if (other.publicKey != null) {
				return false;
			}
		} else if (!publicKey.equals(other.publicKey)) {
			return false;
		}
		if (secureDNSId == null) {
			if (other.secureDNSId != null) {
				return false;
			}
		} else if (!secureDNSId.equals(other.secureDNSId)) {
			return false;
		}
		return true;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getSecureDNSId() {
		return secureDNSId;
	}

	public void setSecureDNSId(Long secureDNSId) {
		this.secureDNSId = secureDNSId;
	}

	/**
	 * @return the flags
	 */
	public int getFlags() {
		return flags;
	}

	/**
	 * @param flags
	 *            the flags to set
	 */
	public void setFlags(int flags) {
		this.flags = flags;
	}

	/**
	 * @return the protocol
	 */
	public int getProtocol() {
		return protocol;
	}

	/**
	 * @param protocol
	 *            the protocol to set
	 */
	public void setProtocol(int protocol) {
		this.protocol = protocol;
	}

	/**
	 * @return the publicKey
	 */
	public String getPublicKey() {
		return publicKey;
	}

	/**
	 * @param publicKey
	 *            the publicKey to set
	 */
	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
	}

	/**
	 * @return the algorithm
	 */
	public int getAlgorithm() {
		return algorithm;
	}

	/**
	 * @param algorithm
	 *            the algorithm to set
	 */
	public void setAlgorithm(int algorithm) {
		this.algorithm = algorithm;
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
