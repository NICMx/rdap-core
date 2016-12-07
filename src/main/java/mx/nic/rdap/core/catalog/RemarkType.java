package mx.nic.rdap.core.catalog;

public enum RemarkType {
	RESULT_SET_AUTHORIZATION(1, "result set truncated due to authorization", "The list of results does not contain all results due to lack of authorization.  This may indicate to some clients that proper authorization will yield a longer result set."),
	RESULT_SET_LOAD(2, "result set truncated due to excessive load", "The list of results does not contain all results dueto an excessively heavy load on the server.  This may indicate to some clients that requerying at a later time will yield a longer result set."),
	RESULT_SET_UNEXPLAINABLE(3, "result set truncated due to unexplainable reasons", "The list of results does not contain all results for an unexplainable reason.  This may indicate to some clients that requerying for any reason will not yield a longer result set."),
	OBJECT_AUTHORIZATION(4, "object truncated due to authorization", "The object does not contain all data due to lack of authorization."),
	OBJECT_LOAD(5, "object truncated due to excessive load", "The object does not contain all data due to an excessively heavy load on the server.  This may indicate to some clients that requerying at a later time will yield all data of the object."),
	OBJECT_UNEXPLAINABLE(6, "object truncated due to unexplainable reasons", "The object does not contain all data for an unexplainable reason.");
	
	private int id;

	private String type;

	private String description;

	RemarkType(int id, String type, String description) {
		this.id = id;
		this.type = type;
		this.description = description;
	}

	public static RemarkType getById(int id) {
		switch (id) {
		case 1:
			return RemarkType.RESULT_SET_AUTHORIZATION;
		case 2:
			return RemarkType.RESULT_SET_LOAD;
		case 3:
			return RemarkType.RESULT_SET_UNEXPLAINABLE;
		case 4:
			return RemarkType.OBJECT_AUTHORIZATION;
		case 5:
			return RemarkType.OBJECT_LOAD;
		case 6:
			return RemarkType.OBJECT_UNEXPLAINABLE;
		default:
			return null;
		}
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

}
