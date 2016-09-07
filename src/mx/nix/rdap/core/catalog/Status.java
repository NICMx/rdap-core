package mx.nix.rdap.core.catalog;

/**
 * The state of a registered object
 * 
 * @author dalpuche
 *
 */
public enum Status {

	VALIDATED(1,"Signifies that the data of the object instance has been found to be accurate. This type of status is usually"
			+"found on entity object instances to note the validity of identifying contact information."),
	RENEW_PROHIBITED(2,"Renewal or reregistration of the object instance is forbidden.");
	
	/**
	 * An unique identifier
	 */
	private int id;
	
	/**
	 *The description of the status 
	 */
	private String description;
	
	/**
	 * Constructor
	 * @param id
	 * @param description
	 */
	Status(int id,String description){
		this.id=id;
		this.description=description;
	}
}
