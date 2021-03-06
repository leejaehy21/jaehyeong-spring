package org.jaehyeong.article;

import java.util.List;

/**
 * articleDaoλ₯? ?¬?©?΄? κΈ? λͺ©λ‘, μ‘°ν, μΆκ?, ?? , ?­? λ₯? ??€.
 * 
 * @author Jacob
 */
public class ArticleService {

	ArticleDao articleDao;

	public void setArticleDao(ArticleDao articleDao) {
		this.articleDao = articleDao;
	}

	/**
	 * κΈ? λͺ©λ‘
	 */
	public void listArticles() {
		List<Article> articles = articleDao.listArticles();
		System.out.println(articles);
	}

	/**
	 * κΈ? μ‘°ν
	 */
	public void getArticle() {
		Article article = articleDao.getArticle("3");
		System.out.println(article);
	}

	/**
	 * κΈ? ?±λ‘?
	 */
	public void addArticle() {
		Article article = new Article();
		article.setTitle("?λ‘μ΄ '?°λ―Έλ€?΄?°' ??? ?€?Έ?΄ κ³΅κ°??€(?¬μ§? 6?₯)");
		article.setContent(
				"μ§?? 2?, ? ??€ μΉ΄λ©λ‘? κ°λ?? ?? ?΄ ? ?μ€μΈ ?λ‘μ΄ ?ν°λ―Έλ€?΄?°?? ??? κ°?? λ₯? κ³΅κ°??€. ?ν°λ―Έλ€?΄?° : ?€?¬ ??΄?Έ(Terminator: Dark Fate)?€. ?΄ ? λͺ©μ? ?΄?  κ°?? κ°? ?? ? ? ? λͺ©μ΄ ?κ³?, 20?ΈκΈ? ?­?€? 4? 6?Ό, ?΄ ??? ?€?Έ? κ³΅κ°??€.");
		article.setUserId("1");
		article.setName("μ‘°μ?");
		if (articleDao.addArticle(article) > 0)
			System.out.println("κΈ?? μΆκ???΅??€.");
		else
			System.out.println("κΈ?? μΆκ??μ§? λͺ»ν?΅??€.");
	}

	/**
	 * κΈ? ?? 
	 */
	public void updateArticle() {
		Article article = new Article();
		article.setArticleId("7");
		article.setTitle("This is modified title.");
		article.setContent("This is modified content");
		if (articleDao.updateArticle(article) > 0)
			System.out.println("κΈ?? ?? ??΅??€.");
		else
			System.out.println("κΈ?? ?? ?μ§? λͺ»ν?΅??€.");
	}

	/**
	 * κΈ? ?­? 
	 */
	public void deleteArticle() {
		if (articleDao.deleteArticle("8") > 0)
			System.out.println("κΈ?? ?­? ??΅??€.");
		else
			System.out.println("κΈ?? ?­? ?μ§? λͺ»ν?΅??€.");
	}
}
