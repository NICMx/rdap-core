package mx.nic.rdap.core.exception;

/**
 * Generic problems with the search request.
 * 
 * @author dalpuche
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
		super( message);
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
