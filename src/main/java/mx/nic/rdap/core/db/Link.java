package mx.nic.rdap.core.db;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a data structure that signify link an object to other resources on
 * the Internet.
 *
 */
public class Link {

	/**
	 * An unique identifier
	 */
	private Long id;

	// Attributes of a Link [RFC5988]
	private String value;

	private String rel;

	private String href;

	private List<String> hreflang;

	private String title;

	private String media;

	private String type;

	public Link() {
		hreflang = new ArrayList<>();
	}

	/**
	 * Construct a "self" Link
	 * 
	 */
	public Link(String header, String contextPath, String objectClassName, String query) {
		this.setValue(header + contextPath + "/" + objectClassName + "/" + query);
		this.setRel("self");
		this.setHref(header + contextPath + "/" + objectClassName + "/" + query);
		this.setType("application/rdap+json");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Link [id=" + id + ", value=" + value + ", rel=" + rel + ", href=" + href + ", hreflang=" + hreflang
				+ ", title=" + title + ", media=" + media + ", type=" + type + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((href == null) ? 0 : href.hashCode());
		result = prime * result + ((hreflang == null) ? 0 : hreflang.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((media == null) ? 0 : media.hashCode());
		result = prime * result + ((rel == null) ? 0 : rel.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Link))
			return false;
		Link other = (Link) obj;
		if (href == null) {
			if (other.href != null)
				return false;
		} else if (!href.equals(other.href))
			return false;
		if (hreflang == null) {
			if (other.hreflang != null)
				return false;
		} else if (!hreflang.equals(other.hreflang))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (media == null) {
			if (other.media != null)
				return false;
		} else if (!media.equals(other.media))
			return false;
		if (rel == null) {
			if (other.rel != null)
				return false;
		} else if (!rel.equals(other.rel))
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
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
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
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * @return the rel
	 */
	public String getRel() {
		return rel;
	}

	/**
	 * @param rel
	 *            the rel to set
	 */
	public void setRel(String rel) {
		this.rel = rel;
	}

	/**
	 * @return the href
	 */
	public String getHref() {
		return href;
	}

	/**
	 * @param href
	 *            the href to set
	 */
	public void setHref(String href) {
		this.href = href;
	}

	/**
	 * @return the hreflag
	 */
	public List<String> getHreflang() {
		return hreflang;
	}

	/**
	 * @param hreflag
	 *            the Array of hreflags to set
	 */
	public void setHreflang(List<String> hreflang) {
		this.hreflang = hreflang;
	}

	public void addHreflang(String hreflang) {
		this.hreflang.add(hreflang);
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
	 * @return the media
	 */
	public String getMedia() {
		return media;
	}

	/**
	 * @param media
	 *            the media to set
	 */
	public void setMedia(String media) {
		this.media = media;
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

}
