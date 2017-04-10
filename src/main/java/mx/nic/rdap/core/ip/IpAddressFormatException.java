package mx.nic.rdap.core.ip;

/**
 * The input cannot be converted to an IP address (or a prefix) due to sintactic
 * or semantic problems.
 */
public class IpAddressFormatException extends Exception {

	/** We should really silence that warning. */
	private static final long serialVersionUID = 1L;

	public IpAddressFormatException(String msg) {
		super(msg);
	}

	public IpAddressFormatException(String msg, Throwable cause) {
		super(msg, cause);
	}

}
