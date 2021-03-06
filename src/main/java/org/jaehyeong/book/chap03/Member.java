package org.jaehyeong.book.chap03;

/**
 * p.60 [λ¦¬μ€?Έ 3.3] Member ?΄??€ ?? <br>
 * ??? λ³? ?λ©μΈ ?€λΈμ ?Έ. ?? ??΄λΈκ³Ό λ§€ν??€.
 * 
 * @author Jacob
 */
public class Member {
	String memberId; // ??΄?
	String email; // ?΄λ©μΌ
	String password; // λΉλ?λ²νΈ
	String name; // ?΄λ¦?

	/**
	 * Default Constructor
	 */
	public Member() {
	}

	/**
	 * email, password, name ?Όλ‘? μ΄κΈ°??? μ»¨μ€?Έ?­?°
	 * 
	 * @param email    ?΄λ©μΌ
	 * @param password λΉλ?λ²νΈ
	 * @param name     ?΄λ¦?
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
