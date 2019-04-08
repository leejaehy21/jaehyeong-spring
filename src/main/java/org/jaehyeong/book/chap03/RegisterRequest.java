package org.jaehyeong.book.chap03;

/**
 * p.63 [λ¦¬μ€?Έ 3.7] RegisterRequest ?? <br>
 * ??κ°???  ? ?¬?©?κ°? ?? ₯?΄? ?λ²λ‘ λ³΄λ΄? ?? ? λ³?
 * 
 * @author Jacob
 */
public class RegisterRequest {
	String email; // ?΄λ©μΌ
	String password; // λΉλ?λ²νΈ
	String name; // ?΄λ¦?

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
