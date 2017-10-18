package mx.nic.rdap.core.db;

import java.util.ArrayList;
import java.util.List;

import mx.nic.rdap.core.catalog.Status;

/**
 * Base object containing common rdap objects attributes
 *
 */
public class RdapObject {

	/**
	 * A string representing a unique identifier of the object
	 */
	private String handle;

	/**
	 * An array of {@link Remark} objects
	 */
	private List<Remark> remarks;

	/**
	 * An array of {@link Link} objects
	 */
	private List<Link> links;
	/**
	 * An array of {@link Event} objects
	 */
	private List<Event> events;

	/**
	 * An array of {@link Status} objects
	 */
	private List<Status> status;

	/**
	 * A string containing the host name or IP address of the WHOIS server where
	 * the object may be found.
	 */
	private String port43;

	/**
	 * A string containing the object language
	 */
	private String lang;

	/**
	 * An array of {@link Entity} objects
	 */
	private List<Entity> entities;

	/**
	 * Default constructor 
	 */
	public RdapObject() {
		status = new ArrayList<Status>();
		remarks = new ArrayList<Remark>();
		links = new ArrayList<Link>();
		events = new ArrayList<Event>();
		entities = new ArrayList<Entity>();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "handle=" + handle + ", remarks=" + remarks + ", links=" + links + ", events=" + events + ", status="
				+ status + ", port43=" + port43 + ", lang=" + lang + ", entities=" + entities;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((events == null) ? 0 : events.hashCode());
		result = prime * result + ((handle == null) ? 0 : handle.hashCode());
		result = prime * result + ((links == null) ? 0 : links.hashCode());
		result = prime * result + ((port43 == null) ? 0 : port43.hashCode());
		result = prime * result + ((remarks == null) ? 0 : remarks.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((lang == null) ? 0 : lang.hashCode());
		result = prime * result + ((entities == null) ? 0 : entities.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof RdapObject))
			return false;
		RdapObject other = (RdapObject) obj;
		if (events == null) {
			if (other.events != null)
				return false;
		} else if (events.size() != other.events.size() || !events.containsAll(other.events))
			return false;
		if (handle == null) {
			if (other.handle != null)
				return false;
		} else if (!handle.equals(other.handle))
			return false;
		if (links == null) {
			if (other.links != null)
				return false;
		} else if (links.size() != other.links.size() || !links.containsAll(other.links))
			return false;
		if (port43 == null) {
			if (other.port43 != null)
				return false;
		} else if (!port43.equals(other.port43))
			return false;
		if (remarks == null) {
			if (other.remarks != null)
				return false;
		} else if (remarks.size() != other.remarks.size() || !remarks.containsAll(other.remarks))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (status.size() != other.status.size() || !status.containsAll(other.status))
			return false;
		if (lang == null) {
			if (other.lang != null)
				return false;
		} else if (!lang.equals(other.lang))
			return false;
		if (entities == null) {
			if (other.entities != null)
				return false;
		} else if (entities.size() != other.entities.size() || !entities.containsAll(other.entities))
			return false;
		return true;
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
	 * @return the lang
	 */
	public String getLang() {
		return lang;
	}

	/**
	 * @param lang
	 *            the lang to set
	 */
	public void setLang(String lang) {
		this.lang = lang;
	}

	/**
	 * @return the entities
	 */
	public List<Entity> getEntities() {
		return entities;
	}

	/**
	 * @param entities
	 *             the entities to set
	 */
	public void setEntities(List<Entity> entities) {
		this.entities = entities;
	}

}
