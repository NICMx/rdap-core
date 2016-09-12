package mx.nic.rdap.core.db;

import java.util.List;

/**
 * POJO for the remark object
 * 
 * @author dalpuche
 *
 */
public class Remark  {

	/**
	 * An unique identifier
	 */
	private int id;
	
	/**
	 * The title of the remark
	 */
	private String title;
	
	/**
	 * 
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
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
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
	 * @param type the type to set
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
	 * @param language the language to set
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
	 * @param descriptions the descriptions to set
	 */
	public void setDescriptions(List<RemarkDescription> descriptions) {
		this.descriptions = descriptions;
	}


}
