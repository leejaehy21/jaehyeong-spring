package org.jaehyeong.book.chap03;

import java.util.HashMap;
import java.util.Map;

/**
 * p.62 [리스?�� 3.5] MemberDao ?��?��<br>
 * ?��?�� ?��?��블을 조작?��?�� Data Access Object
 * 
 * @author Jacob
 */
public class MemberDao {

	/**
	 *  ?��?��?���? �? (?��?�� ?��?���?)
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
