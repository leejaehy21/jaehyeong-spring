package org.jaehyeong.book.chap03;

/**
 * p.63 [ë¦¬ìŠ¤?Š¸ 3.7] RegisterRequest ?ˆ˜? •<br>
 * ?šŒ?›ê°??…?•  ?•Œ ?‚¬?š©?ê°? ?…? ¥?•´?„œ ?„œë²„ë¡œ ë³´ë‚´?Š” ?šŒ?› ? •ë³?
 * 
 * @author Jacob
 */
public class RegisterRequest {
	String email; // ?´ë©”ì¼
	String password; // ë¹„ë?ë²ˆí˜¸
	String name; // ?´ë¦?

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
		return "RegisterRequest [email=" + email + ", name=" + name + "]";
	}
}
