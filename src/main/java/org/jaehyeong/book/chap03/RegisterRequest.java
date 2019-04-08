package org.jaehyeong.book.chap03;

/**
 * p.63 [리스?�� 3.7] RegisterRequest ?��?��<br>
 * ?��?���??��?�� ?�� ?��?��?���? ?��?��?��?�� ?��버로 보내?�� ?��?�� ?���?
 * 
 * @author Jacob
 */
public class RegisterRequest {
	String email; // ?��메일
	String password; // 비�?번호
	String name; // ?���?

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
