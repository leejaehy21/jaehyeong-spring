package org.jaehyeong.book.chap03;

/**
 * MemberRegisterService�? ?��?��?��?��?��.<br>
 * new�? ?��?��?��?�� 직접 ?��?��?��?���? ?��?��?��?��.
 * 
 * @author Jacob
 */
public class MemberMain {

	public static void main(String[] args) {
		MemberDao memberDao = new MemberDao();
		MemberRegisterService regService = new MemberRegisterService();
		regService.setMemberDao(memberDao);
		

		// registerRequest 초기?��
		RegisterRequest req = new RegisterRequest();
		req.setEmail("jacob@irafe.com");
		req.setPassword("xxxx");
		req.setName("Jacob");

		// ?��?�� ?���?
		regService.regist(req);
	}
}
