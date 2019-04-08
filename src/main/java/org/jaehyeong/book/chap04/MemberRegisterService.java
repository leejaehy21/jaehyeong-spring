package org.jaehyeong.book.chap04;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jaehyeong.book.chap03.DuplicateMemberException;
import org.jaehyeong.book.chap03.Member;
import org.jaehyeong.book.chap03.RegisterRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * p.55 [리스?�� 3.1] MemberRegisterService ?��?��<br>
 * ?��?��?�� ?��록하?�� ?��비스
 * 
 * @author Jacob
 */
@Service
public class MemberRegisterService {

	@Autowired
	private MemberDao memberDao;

	static Logger logger = LogManager.getLogger();

	/**
	 * ?��?�� ?���?
	 * 
	 * @param req ?��?��?���? ?��?��?�� ?��?�� ?���?
	 * @throws DuplicateMemberException ?��메일?�� 중복?�� 경우?�� 발생
	 */
	public void regist(RegisterRequest req) {
		logger.debug(req);
		Member member = memberDao.selectByEmail(req.getEmail());

		// ?��?��?�� ?���? 존재?���? ?��?�� 발생
		if (member != null) {
			throw new DuplicateMemberException("?��메일 중복 " + req.getEmail());
		}

		// ?��?��?���? ???��
		Member newMember = new Member(req.getEmail(), req.getPassword(),
				req.getName());
		memberDao.insert(newMember);
		logger.debug("?��?�� ?��보�?? ???��?��?��?��?��.");
	}
}
