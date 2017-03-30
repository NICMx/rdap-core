package mx.nic.rdap.core.catalog;

public enum RemarkType {
	RESULT_SET_AUTHORIZATION("result set truncated due to authorization", "The list of results does not contain all results due to lack of authorization.  This may indicate to some clients that proper authorization will yield a longer result set."),
	RESULT_SET_LOAD("result set truncated due to excessive load", "The list of results does not contain all results dueto an excessively heavy load on the server.  This may indicate to some clients that requerying at a later time will yield a longer result set."),
	RESULT_SET_UNEXPLAINABLE("result set truncated due to unexplainable reasons", "The list of results does not contain all results for an unexplainable reason.  This may indicate to some clients that requerying for any reason will not yield a longer result set."),
	OBJECT_AUTHORIZATION("object truncated due to authorization", "The object does not contain all data due to lack of authorization."),
	OBJECT_LOAD("object truncated due to excessive load", "The object does not contain all data due to an excessively heavy load on the server.  This may indicate to some clients that requerying at a later time will yield all data of the object."),
	OBJECT_UNEXPLAINABLE("object truncated due to unexplainable reasons", "The object does not contain all data for an unexplainable reason.");
	
	private String type;

	private String description;

	RemarkType(String type, String description) {
		this.type = type;
		this.description = description;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

}
