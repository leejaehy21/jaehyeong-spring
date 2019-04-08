package org.jaehyeong.book.chap04;

import java.util.HashMap;
import java.util.Map;

import org.jaehyeong.book.chap03.Member;
import org.springframework.stereotype.Repository;

/**
 * p.62 [ë¦¬ìŠ¤?Š¸ 3.5] MemberDao ?ˆ˜? •<br>
 * ?šŒ?› ?…Œ?´ë¸”ì„ ì¡°ì‘?•˜?Š” Data Access Object
 * 
 * @author Jacob
 */
@Repository
public class MemberDao {

	/**
	 * ?šŒ?›? •ë³? ë§? (?šŒ?› ?…Œ?´ë¸?)
	 */
	Map<String, Member> map = new HashMap<>();

	/**
	 * ?´ë©”ì¼ë¡? ?šŒ?› ? •ë³? ê°?? ¸?˜´
	 */
	public Member selectByEmail(String email) {
		return map.get(email);
	}

	/**
	 * ?šŒ?›? •ë³? ???¥
	 */
	public void insert(Member member) {
		map.put(member.getEmail(), member);
	}
}
