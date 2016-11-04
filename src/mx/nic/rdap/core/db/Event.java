package mx.nic.rdap.core.db;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import mx.nix.rdap.core.catalog.EventAction;

/**
 * Represents events that have occurred on an instance of an object class
 *
 */
public class Event {

	/**
	 * An unique identifier
	 */
	private Long id;

	/**
	 * he reason for the event {@link EventAction}
	 */
	private EventAction eventAction;

	/**
	 * an optional identifier denoting the actor responsible for the event
	 */
	private String eventActor;

	/**
	 * the time and date the event occurred.
	 */
	private Date eventDate;

	/**
	 * An array of links {@link Link}
	 */
	private List<Link> links;

	/**
	 * Contructor default
	 */
	public Event() {
		links = new ArrayList<Link>();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((eventAction == null) ? 0 : eventAction.hashCode());
		result = prime * result + ((eventActor == null) ? 0 : eventActor.hashCode());
		result = prime * result + ((eventDate == null) ? 0 : eventDate.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((links == null) ? 0 : links.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Event))
			return false;
		Event other = (Event) obj;
		if (eventAction != other.eventAction)
			return false;
		if (eventActor == null) {
			if (other.eventActor != null)
				return false;
		} else if (!eventActor.equals(other.eventActor))
			return false;
		if (eventDate == null) {
			if (other.eventDate != null)
				return false;
		} else if (!eventDate.equals(other.eventDate))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (links == null) {
			if (other.links != null)
				return false;
		} else if (links.size() != other.links.size() || !links.containsAll(other.links))// !links.equals(other.links))
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
	 * @return the eventAction
	 */
	public EventAction getEventAction() {
		return eventAction;
	}

	/**
	 * @param eventAction
	 *            the eventAction to set
	 */
	public void setEventAction(EventAction eventAction) {
		this.eventAction = eventAction;
	}

	/**
	 * @return the eventActor
	 */
	public String getEventActor() {
		return eventActor;
	}

	/**
	 * @param eventActor
	 *            the eventActor to set
	 */
	public void setEventActor(String eventActor) {
		this.eventActor = eventActor;
	}

	/**
	 * @return the eventDate
	 */
	public Date getEventDate() {
		return eventDate;
	}

	/**
	 * @param eventDate
	 *            the eventDate to set
	 */
	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
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
