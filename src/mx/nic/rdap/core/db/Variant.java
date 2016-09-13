package mx.nic.rdap.core.db;

import java.util.List;

import mx.nix.rdap.core.catalog.VariantRelation;

/**POJO representing the Variant object
 * @author evaldes
 *
 */
public class Variant{

	/**
	 * An unique identifier for the variant
	 */
	private Integer id;
	
	/**
	 * A string containing the name of the IDN table of codepoints 
	 */
	private String idnTable;
	
	/**
	 * An array of VariantName objects {@link VariantName}
	 */
	private List<VariantName> variantNames;
	
	/**
	 * An array of VariantRelation objects {@link VariantRelation}
	 */
	private List<VariantRelation> relations;
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the idnTable
	 */
	public String getIdnTable() {
		return idnTable;
	}

	/**
	 * @param idnTable the idnTable to set
	 */
	public void setIdnTable(String idnTable) {
		this.idnTable = idnTable;
	}

	/**
	 * @return the variantNames
	 */
	public List<VariantName> getVariantNames() {
		return variantNames;
	}

	/**
	 * @param variantNames the variantNames to set
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
	 * @param relations the relations to set
	 */
	public void setRelations(List<VariantRelation> relations) {
		this.relations = relations;
	}

}
