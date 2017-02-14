package mx.nic.rdap.core.db;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a jCard with the entity’s contact information.
 *
 */
public class VCard {

	/**
	 * A unique identifier.
	 */
	private Long id;

	/**
	 * An individual person's name or an organization's name.
	 */
	private String name;

	/**
	 * The organization's name
	 */
	private String companyName;

	/**
	 * The person or organization web site.
	 */
	private String companyURL;

	/**
	 * An email address where you can contact the person or organization.
	 */
	private String email;

	/**
	 * A phone number.
	 */
	private String voice;
	/**
	 * A cellphone number.
	 */
	private String cellphone;
	/**
	 * A fax number
	 */
	private String fax;

	/**
	 * Job title of the person.
	 */
	private String jobTitle;

	/**
	 * Postal Information of this contact.
	 */
	private List<VCardPostalInfo> postalInfo;

	public VCard() {
		postalInfo = new ArrayList<>();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "VCard [id=" + id + ", name=" + name + ", companyName=" + companyName + ", companyURL=" + companyURL
				+ ", email=" + email + ", voice=" + voice + ", cellphone=" + cellphone + ", fax=" + fax + ", jobTitle="
				+ jobTitle + ", postalInfo=" + postalInfo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cellphone == null) ? 0 : cellphone.hashCode());
		result = prime * result + ((companyName == null) ? 0 : companyName.hashCode());
		result = prime * result + ((companyURL == null) ? 0 : companyURL.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((fax == null) ? 0 : fax.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((jobTitle == null) ? 0 : jobTitle.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((postalInfo == null) ? 0 : postalInfo.hashCode());
		result = prime * result + ((voice == null) ? 0 : voice.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof VCard))
			return false;
		VCard other = (VCard) obj;
		if (cellphone == null) {
			if (other.cellphone != null)
				return false;
		} else if (!cellphone.equals(other.cellphone))
			return false;
		if (companyName == null) {
			if (other.companyName != null)
				return false;
		} else if (!companyName.equals(other.companyName))
			return false;
		if (companyURL == null) {
			if (other.companyURL != null)
				return false;
		} else if (!companyURL.equals(other.companyURL))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (fax == null) {
			if (other.fax != null)
				return false;
		} else if (!fax.equals(other.fax))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (jobTitle == null) {
			if (other.jobTitle != null)
				return false;
		} else if (!jobTitle.equals(other.jobTitle))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (postalInfo == null) {
			if (other.postalInfo != null)
				return false;
		} else if (postalInfo.size() != other.postalInfo.size() || !postalInfo.containsAll(other.postalInfo))
			return false;
		if (voice == null) {
			if (other.voice != null)
				return false;
		} else if (!voice.equals(other.voice))
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyURL() {
		return companyURL;
	}

	public void setCompanyURL(String companyURL) {
		this.companyURL = companyURL;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getVoice() {
		return voice;
	}

	public void setVoice(String voice) {
		this.voice = voice;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public List<VCardPostalInfo> getPostalInfo() {
		return postalInfo;
	}

	public void setPostalInfo(List<VCardPostalInfo> postalInfo) {
		this.postalInfo.addAll(postalInfo);
	}

	public void setPostalInfo(VCardPostalInfo postalInfo) {
		this.postalInfo.add(postalInfo);
	}

}
