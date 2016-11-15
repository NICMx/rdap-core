package mx.nic.rdap.core.db;

import java.util.ArrayList;
import java.util.List;

import mx.nic.rdap.core.catalog.VariantRelation;

/**
 * Alternative names of a {@link Domain}, also contains
 */
public class Variant {

	/**
	 * An unique identifier for the variant, also contains it´s relation with
	 * the domain.
	 */
	private Long id;

	/**
	 * A string containing the name of the Internationalized Domain Name
	 * (IDN)table of codepoints
	 */
	private String idnTable;

	/**
	 * An unique identifier of a variant´s domain
	 */
	private Long domainId;

	/**
	 * An array of VariantName objects {@link VariantName}
	 */
	private List<VariantName> variantNames;

	/**
	 * An array of VariantRelation objects {@link VariantRelation}
	 */
	private List<VariantRelation> relations;

	public Variant() {
		variantNames = new ArrayList<>();
		relations = new ArrayList<>();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((domainId == null) ? 0 : domainId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((idnTable == null) ? 0 : idnTable.hashCode());
		result = prime * result + ((relations == null) ? 0 : relations.hashCode());
		result = prime * result + ((variantNames == null) ? 0 : variantNames.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Variant))
			return false;
		Variant other = (Variant) obj;
		if (domainId == null) {
			if (other.domainId != null)
				return false;
		} else if (!domainId.equals(other.domainId))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (idnTable == null) {
			if (other.idnTable != null)
				return false;
		} else if (!idnTable.equals(other.idnTable))
			return false;
		if (relations == null) {
			if (other.relations != null)
				return false;
		} else if (relations.size() != other.relations.size() || !relations.containsAll(other.relations))// !relations.equals(other.relations))
			return false;
		if (variantNames == null) {
			if (other.variantNames != null)
				return false;
		} else if (variantNames.size() != other.variantNames.size() || !variantNames.containsAll(other.variantNames))// !variantNames.equals(other.variantNames))
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
	 * @return the idnTable
	 */
	public String getIdnTable() {
		return idnTable;
	}

	/**
	 * @param idnTable
	 *            the idnTable to set
	 */
	public void setIdnTable(String idnTable) {
		this.idnTable = idnTable;
	}

	/**
	 * @return the domainId
	 */
	public Long getDomainId() {
		return domainId;
	}

	/**
	 * @param domainId
	 *            the domainId to set
	 */
	public void setDomainId(Long domainId) {
		this.domainId = domainId;
	}

	/**
	 * @return the variantNames
	 */
	public List<VariantName> getVariantNames() {
		return variantNames;
	}

	/**
	 * @param variantNames
	 *            the variantNames to set
	 */
	public void setVariantNames(List<VariantName> variantNames) {
		this.variantNames = variantNames;
	}

	/**
	 * @return the relations
	 */
	public List<VariantRelation> getRelations() {
		return relations;
	}

	/**
	 * @param relations
	 *            the relations to set
	 */
	public void setRelations(List<VariantRelation> relations) {
		this.relations = relations;
	}

}
