package org.jaehyeong.book.chap03;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * MemberRegisterService�? ?��?��?��?��?��.<br>
 * Spring ApplicationContext�? 빈을 ?��?��?��?��.
 * 
 * @author Jacob
 */
public class MemberMainUsingSpring {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext(
				"chap03.xml");
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
