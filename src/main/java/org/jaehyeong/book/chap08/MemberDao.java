package org.jaehyeong.book.chap08;

import java.util.List;

import org.jaehyeong.book.chap03.Member;

/**
 * p.184 [리스?�� 8.2] MemberDao �? interface�? ?��?��<br>
 * ?��?�� ?��?��블을 조작?��?�� Data Access Object
 * 
 * @author Jacob
 */
public interface MemberDao {

	/**
	 * ?��메일�? ?��?�� ?���? �??��?��
	 */
	Member selectByEmail(String email);

	/**
	 * ?��?��?���? ???��
	 */
	void insert(Member member);

	/**
	 * ?��?��?���? ?��?��
	 */
	void update(Member member);

	/**
	 * ?��?�� 목록
	 */
	List<Member> selectAll(int offset, int count);
}
