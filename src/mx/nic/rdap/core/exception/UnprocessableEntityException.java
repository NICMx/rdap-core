package mx.nic.rdap.core.exception;

/**
 * Throws when a server receives a search request but cannot process the request
 * because it does not support a particular style of partial match searching
 *
 */
public class UnprocessableEntityException extends Exception {

	private static final long serialVersionUID = 1L;
	/**
	 * The code we'll return in the HTTP response.
	 * https://en.wikipedia.org/wiki/List_of_HTTP_status_codes
	 */
	private int httpResponseStatusCode = 422;

	/**
	 * 
	 * @param attributeName
	 *            the attribute missing
	 * @param className
	 *            the class
	 */
	public UnprocessableEntityException(String message) {
		super(message);
	}

	public UnprocessableEntityException() {
		super("Unprocessable Entity");
	}

	/**
	 * @see #httpResponseStatusCode
	 */
	public int getHttpResponseStatusCode() {
		return httpResponseStatusCode;
	}
}
