package com.sahadina.app.ws.responses;

public enum ErrorMessages {
	MISSING_REQUIRED_FIELD("Missing required field."),
	RECORDS_ALREADY_EXISTS("Record already exists."),
	INTERNAL_SERVER_ERROR("Internal Sahadina server error."),
	NO_RECORD_FOUND("Record with provided id is not found.");
	
	private String errorMessage;

	private ErrorMessages(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	
}
