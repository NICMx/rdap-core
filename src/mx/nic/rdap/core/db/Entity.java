package mx.nic.rdap.core.db;

/**
 * POJO for the entity object.This object class represents the information of
 * organizations, corporations, governments, non-profits, clubs, individual
 * persons, and informal groups of people.
 * 
 * @author dhfelix
 *
 */
public class Entity {

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((handle == null) ? 0 : handle.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((port43 == null) ? 0 : port43.hashCode());
		result = prime * result + ((rarId == null) ? 0 : rarId.hashCode());
		result = prime * result + ((registrar == null) ? 0 : registrar.hashCode());
		result = prime * result + ((vCard == null) ? 0 : vCard.hashCode());
		result = prime * result + ((vCardId == null) ? 0 : vCardId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Entity))
			return false;
		Entity other = (Entity) obj;
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
}
