package mx.nic.rdap.core.db;

import java.util.ArrayList;
import java.util.List;

import mx.nic.rdap.core.db.struct.NameserverIpAddressesStruct;

/**
 * POJO for the Nameserver object.The nameserver object class represents
 * information regarding DNS nameservers used in both forward and reverse DNS
 * 
 * @author dalpuche
 *
 */
public class Nameserver extends RdapObject {
	/**
	 * An unique identifier of the nameserver
	 */
	private Long id;

	/**
	 * A string containing the unicode name of the nameserver
	 */
	private String punycodeName;

	/**
	 * An object containing two arrays (v4 and v6) of ipAddresses
	 * {@link NameserverIpAddressesStruct}
	 */
	private NameserverIpAddressesStruct ipAddresses;

	/**
	 * An array of entity objects {@link Entity}
	 */
	private List<Entity> entities;

	/**
	 * The id of the rar sponsor
	 */
	private Long rarId;

	/**
	 * Constructor
	 */
	public Nameserver() {
		super();
		ipAddresses = new NameserverIpAddressesStruct();
		entities = new ArrayList<Entity>();
		
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
	 * @return the punycodeName
	 */
	public String getPunycodeName() {
		return punycodeName;
	}

	/**
	 * @param punycodeName
	 *            the punycodeName to set
	 */
	public void setPunycodeName(String punycodeName) {
		this.punycodeName = punycodeName;
	}

	/**
	 * Return the ldh name from the punycode name
	 * 
	 * @return the ldh name of the domain
	 */
	public String getLdhName() {
		return this.getPunycodeName();// ldh name is the punycode
	}

	/**
	 * Return the unicode name from the punycode name
	 * 
	 * @return the unicode name of the domain
	 */
	public String getUnicodeName() {
		// TODO:Magic stuff here
		return "";// ldh name is the punycode
	}


	/**
	 * @return the ipAddresses
	 */
	public NameserverIpAddressesStruct getIpAddresses() {
		return ipAddresses;
	}

	/**
	 * @param ipAddresses
	 *            the ipAddresses to set
	 */
	public void setIpAddresses(NameserverIpAddressesStruct ipAddresses) {
		this.ipAddresses = ipAddresses;
	}

	/**
	 * @return the entities
	 */
	public List<Entity> getEntities() {
		return entities;
	}

	/**
	 * @param entities
	 *            the entities to set
	 */
	public void setEntities(List<Entity> entities) {
		this.entities = entities;
	}

	/**
	 * @return the rarId
	 */
	public Long getRarId() {
		return rarId;
	}

	/**
	 * @param rarId
	 *            the rarId to set
	 */
	public void setRarId(Long rarId) {
		this.rarId = rarId;
	}

}
