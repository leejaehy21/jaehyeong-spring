package org.jaehyeong.book.chap04;

import org.jaehyeong.book.chap03.RegisterRequest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * MemberRegisterServiceÎ•? ?Öå?ä§?ä∏?ïú?ã§.<br>
 * component scan?úºÎ°? ÎπàÏùÑ ?Éù?Ñ±?ïú?ã§.
 * 
 * @author Jacob
 */
public class MemberMainUsingComponentScan {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext(
				"chap04.xml");
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
