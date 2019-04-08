package org.jaehyeong.book.chap03;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * MemberRegisterServiceÎ•? ?Öå?ä§?ä∏?ïú?ã§.<br>
 * Spring ApplicationContextÎ°? ÎπàÏùÑ ?Éù?Ñ±?ïú?ã§.
 * 
 * @author Jacob
 */
public class MemberMainUsingSpring {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext(
				"chap03.xml");
		MemberRegisterService regService = ctx.getBean("memberRegisterService",
				MemberRegisterService.class);

		// registerRequest Ï¥àÍ∏∞?ôî
		RegisterRequest req = new RegisterRequest();
		req.setEmail("jacob@irafe.com");
		req.setPassword("xxxx");
		req.setName("Jacob");

		// ?öå?õê ?ì±Î°?
		regService.regist(req);
		ctx.close();
	}
}
