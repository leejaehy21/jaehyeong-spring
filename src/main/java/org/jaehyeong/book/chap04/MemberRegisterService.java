package org.jaehyeong.book.chap04;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jaehyeong.book.chap03.DuplicateMemberException;
import org.jaehyeong.book.chap03.Member;
import org.jaehyeong.book.chap03.RegisterRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * p.55 [λ¦¬μ€?Έ 3.1] MemberRegisterService ?? <br>
 * ??? ?±λ‘ν? ?λΉμ€
 * 
 * @author Jacob
 */
@Service
public class MemberRegisterService {

	@Autowired
	private MemberDao memberDao;

	static Logger logger = LogManager.getLogger();

	/**
	 * ?? ?±λ‘?
	 * 
	 * @param req ?¬?©?κ°? ?? ₯? ?? ? λ³?
	 * @throws DuplicateMemberException ?΄λ©μΌ?΄ μ€λ³΅?  κ²½μ°? λ°μ
	 */
	public void regist(RegisterRequest req) {
		logger.debug(req);
		Member member = memberDao.selectByEmail(req.getEmail());

		// ???΄ ?΄λ―? μ‘΄μ¬?λ©? ??Έ λ°μ
		if (member != null) {
			throw new DuplicateMemberException("?΄λ©μΌ μ€λ³΅ " + req.getEmail());
		}

		// ??? λ³? ???₯
		Member newMember = new Member(req.getEmail(), req.getPassword(),
				req.getName());
		memberDao.insert(newMember);
		logger.debug("?? ? λ³΄λ?? ???₯??΅??€.");
	}
}
