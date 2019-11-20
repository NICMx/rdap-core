package mx.nic.rdap.core.db;

public class UserConsentGlobal implements UserConsent{

	private boolean globalConsent;
	
	public void setGlobalConsent(boolean globalConsent) {
		this.globalConsent = globalConsent;
	}
	
	public boolean isGlobalConsent() {
		return globalConsent;
	}
	
	@Override
	public boolean isHandleConsent() {
		return globalConsent;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (globalConsent ? 1231 : 1237);
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
		UserConsentGlobal other = (UserConsentGlobal) obj;
		if (globalConsent != other.globalConsent)
			return false;
		return true;
	}
	
	
	
}
