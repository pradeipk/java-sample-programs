package com.p2.exception;

public class UserDefinedExceptionExample {

	public static void main(String[] args) {

	}

}

class UserDefinedCheckedException extends Exception {

	public UserDefinedCheckedException() {
		super();
	}

	public UserDefinedCheckedException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public UserDefinedCheckedException(String message, Throwable cause) {
		super(message, cause);
	}

	public UserDefinedCheckedException(String message) {
		super(message);
	}

	public UserDefinedCheckedException(Throwable cause) {
		super(cause);
	}	
	
}


class UserDefinedUnCheckedException extends RuntimeException {
	
	
	
	
}

