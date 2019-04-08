package org.jaehyeong.book.example;

public class PaymentService {
	MemberDao memberDao;

	// constructor for memberDao injection
	public PaymentService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	public void pay() {
		memberDao.getMember();
		System.out.println("ì§?ê¸‰ì´ ?™„ë£Œë˜?—ˆ?Šµ?‹ˆ?‹¤.");
	}
}
