package mx.nic.rdap.core.catalog;

public enum IpVersion {
	V4(4, "v4"), V6(6, "v6");

	private final int version;
	private final String versionName;

	private IpVersion(int version, String versionName) {
		this.version = version;
		this.versionName = versionName;
	}

	public int getVersion() {
		return version;
	}

	public String getVersionName() {
		return versionName;
	}

	public static IpVersion getByVersionNumber(int version) {
		switch (version) {
		case 4:
			return V4;
		case 6:
			return V6;
		default:
			return null;
		}
	}

}
