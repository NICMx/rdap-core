package mx.nic.rdap.core.db;

import java.util.ArrayList;
import java.util.List;

/**
 * POJO for the entity (registrar) object. This object class represents the
 * information of a registrar. This separation from entity is because we want to
 * handle different methods Registrars from registrants.
 * 
 * @author dhfelix
 *
 */
public class Registrar {
	/**
	 * A unique identifier of the entity.
	 */
	private Long id;

	/**
	 * string representing a registry unique identifier of the entity
	 */
	private String handle;

	/**
	 * string containing the fully qualified host name or IP address of the
	 * WHOIS server where the containing object instance may be found.
	 */
	private String port43;

	/**
	 * a jCard with the entity’s contact information
	 */
	private List<VCard> vCardList;

	// TODO Add password, hash and encryption attributes and modify the
	// registrar.sql file too.

	public Registrar() {
		vCardList = new ArrayList<>();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((handle == null) ? 0 : handle.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((port43 == null) ? 0 : port43.hashCode());
		result = prime * result + ((vCardList == null) ? 0 : vCardList.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Registrar))
			return false;
		Registrar other = (Registrar) obj;
		if (handle == null) {
			if (other.handle != null)
				return false;
		} else if (!handle.equals(other.handle))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (port43 == null) {
			if (other.port43 != null)
				return false;
		} else if (!port43.equals(other.port43))
			return false;
		if (vCardList == null) {
			if (other.vCardList != null)
				return false;
		} else if (vCardList.size() != other.vCardList.size() || !vCardList.containsAll(other.vCardList))
			return false;
		return true;
	}

	// ***** Getters and setters *****
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHandle() {
		return handle;
	}

	public void setHandle(String handle) {
		this.handle = handle;
	}

	public String getPort43() {
		return port43;
	}

	public void setPort43(String port43) {
		this.port43 = port43;
	}

	public List<VCard> getvCardList() {
		return vCardList;
	}

	public void setvCardList(List<VCard> vCardList) {
		this.vCardList.addAll(vCardList);
	}

	public void setVCardToList(VCard vCard) {
		vCardList.add(vCard);
	}

}
