package org.jaehyeong.book.chap03;

/**
 * p.62 [๋ฆฌ์ค?ธ 3.6]? DuplicateMemgerException ?? <br>
 * ???ฑ๋กํ  ? ๊ฐ์? ?ด๋ฉ์ผ? ???ด ?ด๋ฏ? ์กด์ฌ?๋ฉ? ๋ฐ์??ค.
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
