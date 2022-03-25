package com.multiplex.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.multiplex.exception.BookingNotAddedException;
import com.multiplex.exception.EmailAlreadyExistException;
import com.multiplex.exception.EmailIdFormatException;
import com.multiplex.exception.PasswordNotMatchException;
import com.multiplex.exception.ShowException;
import com.multiplex.exception.WrongCredentialsException;

@RestControllerAdvice
public class GlobalHandler extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@ExceptionHandler(WrongCredentialsException.class)
	public ResponseEntity<Object> handleWrongCredentialsException(WrongCredentialsException exception) {
		return new ResponseEntity<>(Constants.ENTER_CORRECT_CREDENTIALS, HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(EmailAlreadyExistException.class)
	public ResponseEntity<Object> handleEmailAlreadyExistException(EmailAlreadyExistException exception) {
		return new ResponseEntity<>(Constants.EMAIL_ID_ALREADY_EXIST, HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(BookingNotAddedException.class)
	public ResponseEntity<Object> handleBookingNotAddedException(BookingNotAddedException exception) {
		return new ResponseEntity<>(Constants.BOOKING_NOT_HAPPENED, HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(ShowException.class)
	public ResponseEntity<Object> handleShowException(ShowException exception) {
		return new ResponseEntity<>(Constants.SHOW_NOT_FOUND, HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(PasswordNotMatchException.class)
	public ResponseEntity<Object> handlePasswordNotMatchException(PasswordNotMatchException exception) {
		return new ResponseEntity<>(Constants.PASSWORD_NOT_MATCH, HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(EmailIdFormatException.class)
	public ResponseEntity<Object> handleEmailIdFormatException(EmailIdFormatException exception) {
		return new ResponseEntity<>(Constants.EMAIL_ID_FORMAT_NOT_CORRECT, HttpStatus.NOT_FOUND);
	}
}
