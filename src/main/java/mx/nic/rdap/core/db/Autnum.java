package mx.nic.rdap.core.db;

/**
 * The Autnum class models the Autonomous System Number (ASN) registrations
 * found in RIRs
 *
 */
public class Autnum extends RdapObject {

	/**
	 * An unique identifier of the domain
	 */
	private Long id;

	/*
	 * A number representing the starting number in the block of Autonomous
	 * System Numbers
	 */
	private Long startAutnum;

	/*
	 * A number representing the final number in the block of Autonomous System
	 * Numbers
	 */
	private Long endAutnum;

	/**
	 * An identifier given to the autnum registration by the registration holder
	 */
	private String name;

	/**
	 * A string containing an RIR-specific classification of the autnum
	 */
	private String type;

	/**
	 * A String containing the two character country code of the autnum
	 */
	private String countryCode;

	/**
	 * 
	 */
	public Autnum() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((countryCode == null) ? 0 : countryCode.hashCode());
		result = prime * result + ((endAutnum == null) ? 0 : endAutnum.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((startAutnum == null) ? 0 : startAutnum.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Autnum))
			return false;
		Autnum other = (Autnum) obj;
		if (countryCode == null) {
			if (other.countryCode != null)
				return false;
		} else if (!countryCode.equals(other.countryCode))
			return false;
		if (endAutnum == null) {
			if (other.endAutnum != null)
				return false;
		} else if (!endAutnum.equals(other.endAutnum))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (startAutnum == null) {
			if (other.startAutnum != null)
				return false;
		} else if (!startAutnum.equals(other.startAutnum))
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
	 * @return the startAutnum
	 */
	public Long getStartAutnum() {
		return startAutnum;
	}

	/**
	 * @param startAutnum
	 *            the startAutnum to set
	 */
	public void setStartAutnum(Long startAutnum) {
		this.startAutnum = startAutnum;
	}

	/**
	 * @return the endAutnum
	 */
	public Long getEndAutnum() {
		return endAutnum;
	}

	/**
	 * @param endAutnum
	 *            the endAutnum to set
	 */
	public void setEndAutnum(Long endAutnum) {
		this.endAutnum = endAutnum;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
	 * @return id assigned to country
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * @param countryId
	 *            the country id must be set to retrieve it from model.
	 */
	public void setCountry(String countryCode) {
		this.countryCode = countryCode;
	}

}