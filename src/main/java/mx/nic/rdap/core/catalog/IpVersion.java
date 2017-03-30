package mx.nic.rdap.core.catalog;

/**
 * Version of Ips
 */
public enum IpVersion {
	V4(4, "v4"), V6(6, "v6");

	/**
	 * The version
	 */
	private final int version;
	/**
	 * The name of the version
	 */
	private final String versionName;

	/**
	 *Constructor 
	 */
	private IpVersion(int version, String versionName) {
		this.version = version;
		this.versionName = versionName;
	}

	/**
	 *Get the ipversion by a number of version 
	 */
	public static IpVersion getByVersionNumber(int version) {
		for (IpVersion iv : IpVersion.values()) {
			if (iv.version == version) {
				return iv;
			}
		}
		return null;
	}
	
	public int getVersion() {
		return version;
	}

	public String getVersionName() {
		return versionName;
	}

}
