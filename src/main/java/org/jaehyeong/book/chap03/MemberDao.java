package org.jaehyeong.book.chap03;

import java.util.HashMap;
import java.util.Map;

/**
 * p.62 [λ¦¬μ€?Έ 3.5] MemberDao ?? <br>
 * ?? ??΄λΈμ μ‘°μ?? Data Access Object
 * 
 * @author Jacob
 */
public class MemberDao {

	/**
	 *  ??? λ³? λ§? (?? ??΄λΈ?)
	 */
	Map<String, Member> map = new HashMap<>();

	/**
	 * ?΄λ©μΌλ‘? ?? ? λ³? κ°?? Έ?΄
	 */
	public Member selectByEmail(String email) {
		return map.get(email);
	}

	/**
	 * ??? λ³? ???₯
	 */
	public void insert(Member member) {
		map.put(member.getEmail(), member);
	}
}
