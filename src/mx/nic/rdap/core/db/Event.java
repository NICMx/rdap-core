package mx.nic.rdap.core.db;

import java.util.ArrayList;
import java.util.List;

import mx.nix.rdap.core.catalog.EventAction;

/**
 * POJO for the Event object.This data structure represents events that have
 * occurred on an instance of an object class
 * 
 * @author dalpuche
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
	 * a string containing the time and date the event occurred.
	 */
	private String eventDate;

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
	public String getEventDate() {
		return eventDate;
	}

	/**
	 * @param eventDate
	 *            the eventDate to set
	 */
	public void setEventDate(String eventDate) {
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
