package mx.nic.rdap.core.db;

import java.util.List;

import mx.nix.rdap.core.catalog.Status;

/**
 * POJO representing the Domain object
 * @author evaldes
 *
 */
public class Domain{
	/**
	 * An unique identifier of the domain
	 */
	private Long id;
	
	/**
	 * A string representing a registry unique id of the domain
	 */
	private String handle;
	
	/**
	 * A string containing the ASCII name of the domains
	 */
	private String ldhName;
	
	/**
	 * A string containing the host name or IP address oh the WHOIS server where the domain object instance may be  found
	 */
	private String port43;
	
	/**
	 * An array of entity objects {@link Entity}
	 */
	private List<Entity> entities; 
	
	/**
	 * An array of Nameserver objects {@link Nameserver}
	 */
	private List<Nameserver> nameServers;
	
	/**
	 * An array of Variant objects {@link Variant}
	 */
	private List<Variant> variants;
	
	/**
	 * An array of Remark objects {@link Remark}
	 */
	private List<Remark> remarks;
	
	/**
	 * An array of Event objects {@link Event}
	 */
	private List<Event> events;
	
	/**
	 * An array of Link objects {@link Link}
	 */
	private List<Link> links;
	
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
	private Zone zone;
	
	/**
	 * An array of the Status objects {@link Status}
	 */
	private List<Status> status;
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
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
	 * @param handle the handle to set
	 */
	public void setHandle(String handle) {
		this.handle = handle;
	}

	/**
	 * @return the ldhName
	 */
	public String getLdhName() {
		return ldhName;
	}

	/**
	 * @param ldhName the ldhName to set
	 */
	public void setLdhName(String punycodeName) {
		this.ldhName = punycodeName;
	}
	
	public String getUnicodeName() {
		// TODO Something
		return "";
	}

	/**
	 * @return the port43
	 */
	public String getPort43() {
		return port43;
	}

	/**
	 * @param port43 the port43 to set
	 */
	public void setPort43(String port43) {
		this.port43 = port43;
	}

	/**
	 * @return the entities
	 */
	public List<Entity> getEntities() {
		return entities;
	}

	/**
	 * @param entities the entities to set
	 */
	public void setEntities(List<Entity> entities) {
		this.entities = entities;
	}

	/**
	 * @return the nameServers
	 */
	public List<Nameserver> getNameServers() {
		return nameServers;
	}

	/**
	 * @param nameServers the nameServers to set
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
	 * @param variants the variants to set
	 */
	public void setVariants(List<Variant> variants) {
		this.variants = variants;
	}

	/**
	 * @return the remarks
	 */
	public List<Remark> getRemarks() {
		return remarks;
	}

	/**
	 * @param remarks the remarks to set
	 */
	public void setRemarks(List<Remark> remarks) {
		this.remarks = remarks;
	}

	/**
	 * @return the events
	 */
	public List<Event> getEvents() {
		return events;
	}

	/**
	 * @param events the events to set
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
	 * @param links the links to set
	 */
	public void setLinks(List<Link> links) {
		this.links = links;
	}

	/**
	 * @return the secureDNS
	 */
	public SecureDNS getSecureDNS() {
		return secureDNS;
	}

	/**
	 * @param secureDNS the secureDNS to set
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
	 * @param publicIds the publicIds to set
	 */
	public void setPublicIds(List<PublicId> publicIds) {
		this.publicIds = publicIds;
	}

	/**
	 * @return the zone
	 */
	public Zone getZone() {
		return zone;
	}

	/**
	 * @param zone the zone to set
	 */
	public void setZone(Zone zone) {
		this.zone = zone;
	}

	/**
	 * @return the status
	 */
	public List<Status> getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(List<Status> status) {
		this.status = status;
	}

}
