package org.jaehyeong.book.chap03;

/**
 * MemberRegisterServiceë¥? ?…Œ?Š¤?Š¸?•œ?‹¤.<br>
 * newë¥? ?‚¬?š©?•´?„œ ì§ì ‘ ?¸?Š¤?„´?Š¤ë¥? ?ƒ?„±?•œ?‹¤.
 * 
 * @author Jacob
 */
public class MemberMain {

	public static void main(String[] args) {
		MemberDao memberDao = new MemberDao();
		MemberRegisterService regService = new MemberRegisterService();
		regService.setMemberDao(memberDao);
		

		// registerRequest ì´ˆê¸°?™”
		RegisterRequest req = new RegisterRequest();
		req.setEmail("jacob@irafe.com");
		req.setPassword("xxxx");
		req.setName("Jacob");

		// ?šŒ?› ?“±ë¡?
		regService.regist(req);
	}
}
