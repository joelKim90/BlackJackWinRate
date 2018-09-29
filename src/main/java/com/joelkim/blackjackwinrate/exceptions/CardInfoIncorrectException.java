package com.joelkim.blackjackwinrate.exceptions;

public class CardInfoIncorrectException extends Exception {

	/**
	 *  Generated serial version uid
	 */
	private static final long serialVersionUID = -470416328210291606L;

	public CardInfoIncorrectException() {
		super();
	}
	
	public CardInfoIncorrectException(String msg) {
		super(msg);
	}
	
	public CardInfoIncorrectException(Throwable cause) {
		super(cause);
	}
	
	public CardInfoIncorrectException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
