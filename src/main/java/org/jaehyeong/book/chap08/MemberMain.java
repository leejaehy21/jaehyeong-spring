package org.jaehyeong.book.chap08;

import java.io.InputStream;
import java.util.Properties;

import javax.sql.DataSource;

import org.mariadb.jdbc.MariaDbDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * p.204 [λ¦¬μ€?Έ 8.13]λ₯? Mainκ³? Serviceλ‘? λΆλ¦¬? Main λΆ?λΆ?<br>
 * Spring?Όλ‘? bean? κ΄?λ¦¬νμ§? ??
 * 
 * @author Jacob
 */
public class MemberMain {

	public static void main(String[] args) throws Exception {
		new MemberMain().go();
	}

	public void go() throws Exception {
		Properties props = new Properties();

		// ?΄??€?¨?€? ?? db.properties ??Ό?? ??Ό?Ό?°λ₯? ?½??€.
		InputStream in = getClass().getClassLoader()
				.getResourceAsStream("db.properties");
		props.load(in);

		// db.url ??Ό?Ό?° κ°μΌλ‘? ?°?΄?°??€ μ΄κΈ°?
		DataSource dataSource = new MariaDbDataSource(
				props.getProperty("db.url"));

		// dataSourceλ₯? jdbcTemplate? ?£??€. (Injection)
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource);

		// jdbcTemplate? memberDao? ?£??€. (Injection)
		MemberDaoImplUsingSpringJdbc memberDao = new MemberDaoImplUsingSpringJdbc();
		memberDao.setJdbcTemplate(jdbcTemplate);

		// memberDaoλ₯? memberService? ?£??€. (Injection)
		MemberService memberService = new MemberService();
		memberService.setMemberDao(memberDao);

		// λΉμ¦??€ λ©μ? ?€?
		memberService.insertMember();
		memberService.selectAll();
	}
}
