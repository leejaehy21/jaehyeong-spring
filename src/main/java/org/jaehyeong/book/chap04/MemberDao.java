package org.jaehyeong.book.chap04;

import java.util.HashMap;
import java.util.Map;

import org.jaehyeong.book.chap03.Member;
import org.springframework.stereotype.Repository;

/**
 * p.62 [리스?�� 3.5] MemberDao ?��?��<br>
 * ?��?�� ?��?��블을 조작?��?�� Data Access Object
 * 
 * @author Jacob
 */
@Repository
public class MemberDao {

	/**
	 * ?��?��?���? �? (?��?�� ?��?���?)
	 */
	Map<String, Member> map = new HashMap<>();

	/**
	 * ?��메일�? ?��?�� ?���? �??��?��
	 */
	public Member selectByEmail(String email) {
		return map.get(email);
	}

	/**
	 * ?��?��?���? ???��
	 */
	public void insert(Member member) {
		map.put(member.getEmail(), member);
	}
}
