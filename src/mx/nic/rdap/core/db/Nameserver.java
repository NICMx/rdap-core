package mx.nic.rdap.core.db;

import java.util.List;

import mx.nic.rdap.core.db.struct.NameserverIpAddressesStruct;
import mx.nix.rdap.core.catalog.Status;

/**
 * POJO for the Nameserver object.The nameserver object class represents
 * information regarding DNS nameservers used in both forward and reverse DNS
 * 
 * @author dalpuche
 *
 */
public class Nameserver {
	/**
	 * An unique identifier of the nameserver
	 */
	private Long id;

	/**
	 * A string representing a registry unique identifier of the nameserver
	 */
	private String handle;

	/**
	 * A string containing the unicode name of the nameserver
	 */
	private String punycodeName;

	/**
	 * An object containing two arrays (v4 and v6) of ipAddresses
	 * {@link NameserverIpAddressesStruct}
	 */
	private NameserverIpAddressesStruct ipAddresses;

	/**
	 * An array of entity objects {@link Entity}
	 */
	private List<Entity> entities;

	/**
	 * An array of Status objects {@link Status}
	 */
	private List<Status> status;

	/**
	 * An array of remark objects {@link Remark}
	 */
	private List<Remark> remarks;

	/**
	 * An array of link objects {@link Link}
	 */
	private List<Link> links;

	/**
	 * A string containing the host name or IP address of the WHOIS server where
	 * the nameserver object instance may be found.
	 */
	private String port43;

	/**
	 * An array of Event objects {@link Event}
	 */
	private List<Event> events;

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
	 * @return the handle
	 */
	public String getHandle() {
		return handle;
	}

	/**
	 * @param handle
	 *            the handle to set
	 */
	public void setHandle(String handle) {
		this.handle = handle;
	}

	/**
	 * @return the punycodeName
	 */
	public String getPunycodeName() {
		return punycodeName;
	}

	/**
	 * @param punycodeName
	 *            the punycodeName to set
	 */
	public void setPunycodeName(String punycodeName) {
		this.punycodeName = punycodeName;
	}

	/**
	 * Return the ldh name from the punycode name
	 * 
	 * @return the ldh name of the domain
	 */
	public String getLdhName() {
		return this.getPunycodeName();// ldh name is the punycode
	}

	/**
	 * Return the unicode name from the punycode name
	 * 
	 * @return the unicode name of the domain
	 */
	public String getUnicodeName() {
		// TODO:Magic stuff here
		return "";// ldh name is the punycode
	}

	/**
	 * @return the port43
	 */
	public String getPort43() {
		return port43;
	}

	/**
	 * @param port43
	 *            the port43 to set
	 */
	public void setPort43(String port43) {
		this.port43 = port43;
	}

	/**
	 * @return the ipAddresses
	 */
	public NameserverIpAddressesStruct getIpAddresses() {
		return ipAddresses;
	}

	/**
	 * @param ipAddresses
	 *            the ipAddresses to set
	 */
	public void setIpAddresses(NameserverIpAddressesStruct ipAddresses) {
		this.ipAddresses = ipAddresses;
	}

	/**
	 * @return the entities
	 */
	public List<Entity> getEntities() {
		return entities;
	}

	/**
	 * @param entities
	 *            the entities to set
	 */
	public void setEntities(List<Entity> entities) {
		this.entities = entities;
	}

	/**
	 * @return the status
	 */
	public List<Status> getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(List<Status> status) {
		this.status = status;
	}

	/**
	 * @return the remarks
	 */
	public List<Remark> getRemarks() {
		return remarks;
	}

	/**
	 * @param remarks
	 *            the remarks to set
	 */
	public void setRemarks(List<Remark> remarks) {
		this.remarks = remarks;
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

}
