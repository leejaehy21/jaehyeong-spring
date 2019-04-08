package org.jaehyeong.book.chap04;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jaehyeong.book.chap03.DuplicateMemberException;
import org.jaehyeong.book.chap03.Member;
import org.jaehyeong.book.chap03.RegisterRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * p.55 [ë¦¬ìŠ¤?Š¸ 3.1] MemberRegisterService ?ˆ˜? •<br>
 * ?šŒ?›?„ ?“±ë¡í•˜?Š” ?„œë¹„ìŠ¤
 * 
 * @author Jacob
 */
@Service
public class MemberRegisterService {

	@Autowired
	private MemberDao memberDao;

	static Logger logger = LogManager.getLogger();

	/**
	 * ?šŒ?› ?“±ë¡?
	 * 
	 * @param req ?‚¬?š©?ê°? ?…? ¥?•œ ?šŒ?› ? •ë³?
	 * @throws DuplicateMemberException ?´ë©”ì¼?´ ì¤‘ë³µ?  ê²½ìš°?— ë°œìƒ
	 */
	public void regist(RegisterRequest req) {
		logger.debug(req);
		Member member = memberDao.selectByEmail(req.getEmail());

		// ?šŒ?›?´ ?´ë¯? ì¡´ì¬?•˜ë©? ?˜ˆ?™¸ ë°œìƒ
		if (member != null) {
			throw new DuplicateMemberException("?´ë©”ì¼ ì¤‘ë³µ " + req.getEmail());
		}

		// ?šŒ?›? •ë³? ???¥
		Member newMember = new Member(req.getEmail(), req.getPassword(),
				req.getName());
		memberDao.insert(newMember);
		logger.debug("?šŒ?› ? •ë³´ë?? ???¥?–ˆ?Šµ?‹ˆ?‹¤.");
	}
}
