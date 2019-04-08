package org.jaehyeong.book.chap08cs;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jaehyeong.book.chap03.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * p.204 [Î¶¨Ïä§?ä∏ 8.13]Î•? MainÍ≥? ServiceÎ°? Î∂ÑÎ¶¨?ïú Service Î∂?Î∂?
 * 
 * @author Jacob
 */
@Service
public class MemberService {

	Logger logger = LogManager.getLogger();

	@Autowired
	MemberDao memberDao;


	public void selectAll() {
		List<Member> members = memberDao.selectAll(0, 100);
		logger.debug(members);
	}

	public void updateMember() {
		Member member = memberDao.selectByEmail("jacob@irafe.com");
		member.setPassword("b");
		memberDao.update(member);
		logger.debug("Update complete.");
	}

	public void insertMember() {
		Member member = new Member();
		member.setEmail("jacob123@naver.com");
		member.setPassword("a");
		member.setName("Ï°∞Ïõê?Ñù");
		memberDao.insert(member);
		logger.debug("Insert complete.");
	}
}
