package org.jaehyeong.book.chap03;

/**
 * p.60 [ë¦¬ìŠ¤?Š¸ 3.3] Member ?´?˜?Š¤ ?ˆ˜? •<br>
 * ?šŒ?›? •ë³? ?„ë©”ì¸ ?˜¤ë¸Œì ?Š¸. ?šŒ?› ?…Œ?´ë¸”ê³¼ ë§¤í•‘?•œ?‹¤.
 * 
 * @author Jacob
 */
public class Member {
	String memberId; // ?•„?´?””
	String email; // ?´ë©”ì¼
	String password; // ë¹„ë?ë²ˆí˜¸
	String name; // ?´ë¦?

	/**
	 * Default Constructor
	 */
	public Member() {
	}

	/**
	 * email, password, name ?œ¼ë¡? ì´ˆê¸°?™”?•˜?Š” ì»¨ìŠ¤?Š¸?Ÿ­?„°
	 * 
	 * @param email    ?´ë©”ì¼
	 * @param password ë¹„ë?ë²ˆí˜¸
	 * @param name     ?´ë¦?
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
