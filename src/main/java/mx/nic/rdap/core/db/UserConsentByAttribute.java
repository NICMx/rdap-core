package mx.nic.rdap.core.db;

public class UserConsentByAttribute implements UserConsent{

	private boolean handle;
	
	private boolean name;

	private boolean companyName;

	private boolean companyURL;

	private boolean email;

	private boolean voice;

	private boolean cellphone;

	private boolean fax;

	private boolean jobTitle;

	private boolean contactUri;

	private boolean type;

	private boolean country;

	private boolean countryCode;

	private boolean city;

	private boolean state;

	private boolean street1;

	private boolean street2;

	private boolean street3;

	private boolean postalCode;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (cellphone ? 1231 : 1237);
		result = prime * result + (city ? 1231 : 1237);
		result = prime * result + (companyName ? 1231 : 1237);
		result = prime * result + (companyURL ? 1231 : 1237);
		result = prime * result + (contactUri ? 1231 : 1237);
		result = prime * result + (country ? 1231 : 1237);
		result = prime * result + (countryCode ? 1231 : 1237);
		result = prime * result + (email ? 1231 : 1237);
		result = prime * result + (fax ? 1231 : 1237);
		result = prime * result + (handle ? 1231 : 1237);
		result = prime * result + (jobTitle ? 1231 : 1237);
		result = prime * result + (name ? 1231 : 1237);
		result = prime * result + (postalCode ? 1231 : 1237);
		result = prime * result + (state ? 1231 : 1237);
		result = prime * result + (street1 ? 1231 : 1237);
		result = prime * result + (street2 ? 1231 : 1237);
		result = prime * result + (street3 ? 1231 : 1237);
		result = prime * result + (type ? 1231 : 1237);
		result = prime * result + (voice ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserConsentByAttribute other = (UserConsentByAttribute) obj;
		if (cellphone != other.cellphone)
			return false;
		if (city != other.city)
			return false;
		if (companyName != other.companyName)
			return false;
		if (companyURL != other.companyURL)
			return false;
		if (contactUri != other.contactUri)
			return false;
		if (country != other.country)
			return false;
		if (countryCode != other.countryCode)
			return false;
		if (email != other.email)
			return false;
		if (fax != other.fax)
			return false;
		if (handle != other.handle)
			return false;
		if (jobTitle != other.jobTitle)
			return false;
		if (name != other.name)
			return false;
		if (postalCode != other.postalCode)
			return false;
		if (state != other.state)
			return false;
		if (street1 != other.street1)
			return false;
		if (street2 != other.street2)
			return false;
		if (street3 != other.street3)
			return false;
		if (type != other.type)
			return false;
		if (voice != other.voice)
			return false;
		return true;
	}



	
	@Override
	public boolean isHandleConsent() {
		return isHandle();
	}
	
	public void setHandle(boolean handle) {
		this.handle = handle;
	}
	
	public boolean isHandle() {
		return handle;
	}
	
	public void setName(boolean name) {
		this.name = name;
	}
	
	public boolean isName() {
		return name;
	}
	
	public void setCompanyName(boolean companyName) {
		this.companyName = companyName;
	}
	
	public boolean isCompanyName() {
		return companyName;
	}
	
	public void setCompanyURL(boolean companyURL) {
		this.companyURL = companyURL;
	}
	
	public boolean isCompanyURL() {
		return companyURL;
	}

	public boolean isEmail() {
		return email;
	}

	public void setEmail(boolean email) {
		this.email = email;
	}

	public boolean isVoice() {
		return voice;
	}

	public void setVoice(boolean voice) {
		this.voice = voice;
	}

	public boolean isCellphone() {
		return cellphone;
	}

	public void setCellphone(boolean cellphone) {
		this.cellphone = cellphone;
	}

	public boolean isFax() {
		return fax;
	}

	public void setFax(boolean fax) {
		this.fax = fax;
	}

	public boolean isJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(boolean jobTitle) {
		this.jobTitle = jobTitle;
	}

	public boolean isContactUri() {
		return contactUri;
	}

	public void setContactUri(boolean contactUri) {
		this.contactUri = contactUri;
	}

	public boolean isType() {
		return type;
	}

	public void setType(boolean type) {
		this.type = type;
	}

	public boolean isCountry() {
		return country;
	}

	public void setCountry(boolean country) {
		this.country = country;
	}

	public boolean isCountryCode() {
		return countryCode;
	}

	public void setCountryCode(boolean countryCode) {
		this.countryCode = countryCode;
	}

	public boolean isCity() {
		return city;
	}

	public void setCity(boolean city) {
		this.city = city;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public boolean isStreet1() {
		return street1;
	}

	public void setStreet1(boolean street1) {
		this.street1 = street1;
	}

	public boolean isStreet2() {
		return street2;
	}

	public void setStreet2(boolean street2) {
		this.street2 = street2;
	}

	public boolean isStreet3() {
		return street3;
	}

	public void setStreet3(boolean street3) {
		this.street3 = street3;
	}

	public boolean isPostalCode() {
		return postalCode;
	}

	public void setPostalCode(boolean postalCode) {
		this.postalCode = postalCode;
	}
	
	public boolean isAllTrue() {
		if (handle && name && companyName && companyURL && email && voice && cellphone && fax && jobTitle && contactUri
				&& type && country && countryCode && city && state && street1 && street2 && street3 && postalCode)
			return true;
		return false;
	}

	public boolean isAllFalse() {
		if (handle || name || companyName || companyURL || email || voice || cellphone || fax || jobTitle || contactUri
				|| type || country || countryCode || city || state || street1 || street2 || street3 || postalCode)
			return false;
		return true;
	}
	
}
