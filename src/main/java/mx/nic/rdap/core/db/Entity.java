package mx.nic.rdap.core.db;

import java.util.ArrayList;
import java.util.List;

import mx.nic.rdap.core.catalog.Rol;

/**
 * Represents the information of organizations, corporations, governments,
 * non-profits, clubs, individual persons, and informal groups of people.
 *
 */
public class Entity extends RdapObject {

	/**
	 * A unique identifier of the entity.
	 */
	private Long id;

	/**
	 * a jCard with the entity’s contact information
	 */
	private List<VCard> vCardList;

	/**
	 * Entity's public ids.
	 */
	private List<PublicId> publicIds;

	/**
	 * Roles of the entity
	 */
	private List<Rol> roles;

	/**
	 * An array of ip network objects
	 */
	private List<IpNetwork> ipNetworks;

	public Entity() {
		publicIds = new ArrayList<>();
		vCardList = new ArrayList<>();
		roles = new ArrayList<>();
		ipNetworks = new ArrayList<>();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((vCardList == null) ? 0 : vCardList.hashCode());
		result = prime * result + ((publicIds == null) ? 0 : publicIds.hashCode());
		result = prime * result + ((roles == null) ? 0 : roles.hashCode());
		result = prime * result + ((ipNetworks == null) ? 0 : ipNetworks.hashCode());
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
		if (publicIds == null) {
			if (other.publicIds != null)
				return false;
		} else if (publicIds.size() != other.publicIds.size() || !publicIds.containsAll(other.publicIds))
			return false;
		if (vCardList == null) {
			if (other.vCardList != null)
				return false;
		} else if (vCardList.size() != other.vCardList.size() || !vCardList.containsAll(other.vCardList))
			return false;
		if (roles == null) {
			if (other.roles != null)
				return false;
		} else if (roles.size() != other.roles.size() || !roles.containsAll(other.roles))
			return false;
		if (ipNetworks == null) {
			if (other.ipNetworks != null)
				return false;
		} else if (ipNetworks.size() != other.ipNetworks.size() || !ipNetworks.containsAll(other.ipNetworks))
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

	public List<VCard> getVCardList() {
		return vCardList;
	}

	public void setvCardList(List<VCard> vCardList) {
		this.vCardList = vCardList;
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

	public List<IpNetwork> getIpNetworks() {
		return ipNetworks;
	}

	public void setIpNetworks(List<IpNetwork> ipNetworks) {
		this.ipNetworks = ipNetworks;
	}

}