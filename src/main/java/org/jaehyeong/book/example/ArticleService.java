package org.jaehyeong.book.example;

public class ArticleService {

	MemberDao memberDao;

	// memberDao setter for injection
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	public void addArticle() {
		memberDao.getMember();
		System.out.println("�??�� ?��록했?��?��?��.");
	}
}
