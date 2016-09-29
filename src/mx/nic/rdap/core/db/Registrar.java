package mx.nic.rdap.core.db;

import java.util.ArrayList;
import java.util.List;

import mx.nix.rdap.core.catalog.Rol;

/**
 * POJO for the entity (registrar) object. This object class represents the
 * information of a registrar. This separation from entity is because we want to
 * handle different methods Registrars from registrants.
 * 
 * @author dhfelix
 *
 */
public class Registrar extends RdapObject {
	/**
	 * A unique identifier of the entity.
	 */
	private Long id;

	/**
	 * a jCard with the entity’s contact information
	 */
	private List<VCard> vCardList;

	// TODO Add password, hash and encryption attributes and modify the
	// registrar.sql file too.

	/**
	 * Rol of this registrar, only could be Registrar or sponsor
	 */
	private Rol rol;
	
	/**
	 * Registrar's public ids.
	 */
	private List<PublicId> publicIds;
	
	public Registrar() {
		vCardList = new ArrayList<>();
		publicIds = new ArrayList<>();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((vCardList == null) ? 0 : vCardList.hashCode());
		result = prime * result + ((publicIds == null) ? 0 : publicIds.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (!super.equals(obj))
			return false;
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Registrar))
			return false;
		Registrar other = (Registrar) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (vCardList == null) {
			if (other.vCardList != null)
				return false;
		} else if (vCardList.size() != other.vCardList.size() || !vCardList.containsAll(other.vCardList))
			return false;
		if (publicIds == null) {
			if (other.publicIds != null)
				return false;
		} else if (publicIds.size() != other.publicIds.size() || !publicIds.containsAll(other.publicIds))
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

	public List<VCard> getvCardList() {
		return vCardList;
	}

	public void setvCardList(List<VCard> vCardList) {
		this.vCardList.addAll(vCardList);
	}

	public void setVCardToList(VCard vCard) {
		vCardList.add(vCard);
	}
	
	public Rol getRol() {
		return rol;
	}
	
	public void setRol(Rol rol) {
		this.rol = rol;
	}
	
	public List<PublicId> getPublicIds() {
		return publicIds;
	}
	
	public void setPublicIds(List<PublicId> publicIds) {
		this.publicIds = publicIds;
	}
	
}
