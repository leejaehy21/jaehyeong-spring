package org.jaehyeong.book.chap03;

/**
 * p.60 [리스?�� 3.3] Member ?��?��?�� ?��?��<br>
 * ?��?��?���? ?��메인 ?��브젝?��. ?��?�� ?��?��블과 매핑?��?��.
 * 
 * @author Jacob
 */
public class Member {
	String memberId; // ?��?��?��
	String email; // ?��메일
	String password; // 비�?번호
	String name; // ?���?

	/**
	 * Default Constructor
	 */
	public Member() {
	}

	/**
	 * email, password, name ?���? 초기?��?��?�� 컨스?��?��?��
	 * 
	 * @param email    ?��메일
	 * @param password 비�?번호
	 * @param name     ?���?
	 */
	public Member(String email, String password, String name) {
		this.email = email;
		this.password = password;
		this.name = name;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", email=" + email
				+ ", password=" + password + ", name=" + name + "]\n";
	}
}
