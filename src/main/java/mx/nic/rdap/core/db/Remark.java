package mx.nic.rdap.core.db;

import java.util.ArrayList;
import java.util.List;

import mx.nic.rdap.core.catalog.RemarkType;

/**
 * Contains information about the object class that contains it
 *
 */
public class Remark {

	/**
	 * An unique identifier
	 */
	private Long id;

	/**
	 * The title of the remark
	 */
	private String title;

	/**
	 * The type of the remark
	 */
	private String type;

	/**
	 * The languague of the remark
	 */
	private String language;

	/**
	 * An array of description {@link RemarkDescription}
	 */
	private List<RemarkDescription> descriptions;

	/**
	 * An array of links {@link Link}
	 */
	private List<Link> links;

	/**
	 * Constructor default
	 */
	public Remark() {
		descriptions = new ArrayList<RemarkDescription>();
		links = new ArrayList<Link>();
	}

	/*
	 * Remark constructor using default values
	 */
	public Remark(RemarkType remark) {
		RemarkDescription description = new RemarkDescription();
		description.setDescription(remark.getDescription());
		description.setOrder(1);
		this.type = remark.getType();
		this.descriptions.add(description);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descriptions == null) ? 0 : descriptions.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((language == null) ? 0 : language.hashCode());
		result = prime * result + ((links == null) ? 0 : links.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Remark))
			return false;
		Remark other = (Remark) obj;
		if (descriptions == null) {
			if (other.descriptions != null)
				return false;
		} else if (descriptions.size() != other.descriptions.size() || !descriptions.containsAll(other.descriptions))// !descriptions.equals(other.descriptions))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (language == null) {
			if (other.language != null)
				return false;
		} else if (!language.equals(other.language))
			return false;
		if (links == null) {
			if (other.links != null)
				return false;
		} else if (links.size() != other.links.size() || !links.containsAll(other.links))// !links.equals(other.links))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
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
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * @param language
	 *            the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	/**
	 * @return the descriptions
	 */
	public List<RemarkDescription> getDescriptions() {
		return descriptions;
	}

	/**
	 * @param descriptions
	 *            the descriptions to set
	 */
	public void setDescriptions(List<RemarkDescription> descriptions) {
		this.descriptions = descriptions;
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
