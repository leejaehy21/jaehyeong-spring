package org.jaehyeong.book.chap03;

/**
 * p.62 [리스?�� 3.6]?�� DuplicateMemgerException ?��?��<br>
 * ?��?��?��록할 ?�� 같�? ?��메일?�� ?��?��?�� ?���? 존재?���? 발생?��?��.
 * 
 * @author Jacob
 */
public class DuplicateMemberException extends RuntimeException {

	public DuplicateMemberException() {
		// TODO Auto-generated constructor stub
	}

	public DuplicateMemberException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public DuplicateMemberException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public DuplicateMemberException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public DuplicateMemberException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}
}
