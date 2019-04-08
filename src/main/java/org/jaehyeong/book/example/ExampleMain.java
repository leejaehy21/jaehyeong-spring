package org.jaehyeong.book.example;

public class ExampleMain {

	public static void main(String[] args) {
		MemberDao memberDao = new MemberDao();

		// Default constructorÎ°? ?Éù?Ñ± ?õÑ memberDaoÎ•? ?Ñ£?ñ¥Ï§?
		ArticleService articleService = new ArticleService();
		articleService.setMemberDao(memberDao);

		// memberDaoÎ•? ?Ñ£?ñ¥Ï£ºÎäî constructor ?Ç¨?ö©
		PaymentService paymentService = new PaymentService(memberDao);

		articleService.addArticle();
		paymentService.pay();
	}
}
