package org.jaehyeong.book.chap08cs;

import java.util.List;

import org.jaehyeong.book.chap03.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 * ?��?��?��?��?�� MemberDao?�� 구현�?. SpringJdbc�? ?��?��?��?�� 구현
 * 
 * @author Jacob
 */
@Repository("memberDao")
public class MemberDaoImplUsingSpringJdbc implements MemberDao {

	static final String SELECT_BY_EMAIL = "SELECT memberId, email, name FROM member WHERE email=?";

	static final String INSERT = "INSERT member(email, password, name) VALUES(?, sha2(?,256), ?)";

	static final String UPDATE = "UPDATE member SET email=?, password=sha2(?,256), name=? WHERE memberId=?";

	static final String SELECT_ALL = "SELECT memberId, email, name FROM member ORDER BY memberId desc LIMIT ?,?";

	@Autowired
	JdbcTemplate jdbcTemplate;

	/**
	 * p.194?�� memberRowMapper<br>
	 * Member ?��브젝?��?? member ?��?��블의 ?�� ?��?�� 매핑?��?�� rowMapper
	 */
	RowMapper<Member> memberRowMapper = new BeanPropertyRowMapper<>(
			Member.class);

	/**
	 * p.192 [리스?�� 8.8]?�� selectByEmail() 메서?�� ?��?��
	 */
	@Override
	public Member selectByEmail(String email) {
		return jdbcTemplate.queryForObject(SELECT_BY_EMAIL, memberRowMapper,
				email);
	}

	/**
	 * p.201 [리스?�� 8.12]?�� insert() 메서?�� ?��?��
	 */
	@Override
	public void insert(Member member) {
		jdbcTemplate.update(INSERT, member.getEmail(), member.getPassword(),
				member.getName());
	}

	/**
	 * p.198 [리스?�� 8.11]?�� update() 메서?�� ?��?��
	 */
	@Override
	public void update(Member member) {
		jdbcTemplate.update(UPDATE, member.getEmail(), member.getPassword(),
				member.getName(), member.getMemberId());
	}

	/**
	 * p.195 [리스?�� 8.9] selectAll() 메서?�� ?��?��
	 */
	@Override
	public List<Member> selectAll(int offset, int count) {
		return jdbcTemplate.query(SELECT_ALL, memberRowMapper, 0, 100);
	}
}
