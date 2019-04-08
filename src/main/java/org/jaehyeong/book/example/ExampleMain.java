package org.jaehyeong.book.example;

public class ExampleMain {

	public static void main(String[] args) {
		MemberDao memberDao = new MemberDao();

		// Default constructor�? ?��?�� ?�� memberDao�? ?��?���?
		ArticleService articleService = new ArticleService();
		articleService.setMemberDao(memberDao);

		// memberDao�? ?��?��주는 constructor ?��?��
		PaymentService paymentService = new PaymentService(memberDao);

		articleService.addArticle();
		paymentService.pay();
	}
}
