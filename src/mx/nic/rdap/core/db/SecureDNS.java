package mx.nic.rdap.core.db;

/**
 * POJO representing the SecureDNS object
 * @author evaldes
 *
 */
public class SecureDNS{
	/**
	 * An unique identifier for the secureDNS object
	 */
	private Long id;
	
	/**
	 * A boolean that is true when zone is signed
	 */
	private Boolean zoneSigned;
	
	/**
	 * A boolean that is true when delegation is signed
	 */
	private Boolean delegationSigned;
	
	/**
	 * An integer representing the signature lifetime in seconds
	 */
	private Integer maxSigLife; 
	
	/**
	 * An object containing information about the DS record
	 */
	private DsData dsData;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the zoneSigned
	 */
	public Boolean getZoneSigned() {
		return zoneSigned;
	}

	/**
	 * @param zoneSigned the zoneSigned to set
	 */
	public void setZoneSigned(Boolean zoneSigned) {
		this.zoneSigned = zoneSigned;
	}

	/**
	 * @return the delegationSigned
	 */
	public Boolean getDelegationSigned() {
		return delegationSigned;
	}

	/**
	 * @param delegationSigned the delegationSigned to set
	 */
	public void setDelegationSigned(Boolean delegationSigned) {
		this.delegationSigned = delegationSigned;
	}

	/**
	 * @return the maxSigLife
	 */
	public Integer getMaxSigLife() {
		return maxSigLife;
	}

	/**
	 * @param maxSigLife the maxSigLife to set
	 */
	public void setMaxSigLife(Integer maxSigLife) {
		this.maxSigLife = maxSigLife;
	}

	/**
	 * @return the dsData
	 */
	public DsData getDsData() {
		return dsData;
	}

	/**
	 * @param dsData the dsData to set
	 */
	public void setDsData(DsData dsData) {
		this.dsData = dsData;
	}

}
