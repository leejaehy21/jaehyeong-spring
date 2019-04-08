package org.jaehyeong.book.chap04;

import org.jaehyeong.book.chap03.RegisterRequest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * MemberRegisterService�? ?��?��?��?��?��.<br>
 * component scan?���? 빈을 ?��?��?��?��.
 * 
 * @author Jacob
 */
public class MemberMainUsingComponentScan {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext(
				"chap04.xml");
		MemberRegisterService regService = ctx.getBean("memberRegisterService",
				MemberRegisterService.class);
		
		// registerRequest 초기?��
		RegisterRequest req = new RegisterRequest();
		req.setEmail("jacob@irafe.com");
		req.setPassword("xxxx");
		req.setName("Jacob");

		// ?��?�� ?���?
		regService.regist(req);
		ctx.close();
	}
}
