package mx.nic.rdap.core.db;

import java.util.ArrayList;
import java.util.List;

import mx.nix.rdap.core.catalog.Rol;

/**
 * POJO for the entity object.This object class represents the information of
 * organizations, corporations, governments, non-profits, clubs, individual
 * persons, and informal groups of people.
 * 
 * @author dhfelix
 *
 */
public class Entity extends RdapObject {

	/**
	 * A unique identifier of the entity.
	 */
	private Long id;

	/**
	 * The registrar sponsor of this entity.
	 */
	private Registrar registrar;

	/**
	 * The registrar sponsor Id
	 */
	private Long rarId;

	/**
	 * a jCard with the entity’s contact information
	 */
	private VCard vCard;

	/**
	 * The jCard id
	 */
	private Long vCardId;

	/**
	 * Entity's public ids.
	 */
	private List<PublicId> publicIds;

	/**
	 * Roles of the entity
	 */
	private List<Rol> roles;

	public Entity() {
		publicIds = new ArrayList<>();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((rarId == null) ? 0 : rarId.hashCode());
		result = prime * result + ((registrar == null) ? 0 : registrar.hashCode());
		result = prime * result + ((vCard == null) ? 0 : vCard.hashCode());
		result = prime * result + ((vCardId == null) ? 0 : vCardId.hashCode());
		result = prime * result + ((publicIds == null) ? 0 : publicIds.hashCode());
		result = prime * result + ((roles == null) ? 0 : roles.hashCode());
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
		if (!(obj instanceof Entity))
			return false;
		Entity other = (Entity) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (rarId == null) {
			if (other.rarId != null)
				return false;
		} else if (!rarId.equals(other.rarId))
			return false;
		if (registrar == null) {
			if (other.registrar != null)
				return false;
		} else if (!registrar.equals(other.registrar))
			return false;
		if (vCard == null) {
			if (other.vCard != null)
				return false;
		} else if (!vCard.equals(other.vCard))
			return false;
		if (vCardId == null) {
			if (other.vCardId != null)
				return false;
		} else if (!vCardId.equals(other.vCardId))
			return false;
		if (publicIds == null) {
			if (other.publicIds != null)
				return false;
		} else if (publicIds.size() != other.publicIds.size() || !publicIds.containsAll(other.publicIds))
			return false;
		if (roles == null) {
			if (other.roles != null)
				return false;
		} else if (roles.size() != other.roles.size() || !roles.containsAll(other.roles))
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

	public Registrar getRegistrar() {
		return registrar;
	}

	public void setRegistrar(Registrar registrar) {
		this.registrar = registrar;
	}

	public Long getRarId() {
		return rarId;
	}

	public void setRarId(Long rarId) {
		this.rarId = rarId;
	}

	public VCard getVCard() {
		return vCard;
	}

	public void setVCard(VCard vCard) {
		this.vCard = vCard;
	}

	public Long getVCardId() {
		return vCardId;
	}

	public void setVCardId(Long vCardId) {
		this.vCardId = vCardId;
	}

	public List<PublicId> getPublicIds() {
		return publicIds;
	}

	public void setPublicIds(List<PublicId> publicIds) {
		this.publicIds = publicIds;
	}

	public List<Rol> getRoles() {
		return roles;
	}

	public void setRoles(List<Rol> roles) {
		this.roles = roles;
	}
}
