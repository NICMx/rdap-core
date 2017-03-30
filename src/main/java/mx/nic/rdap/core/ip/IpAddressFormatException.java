package mx.nic.rdap.core.ip;

/**
 * TODO
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
