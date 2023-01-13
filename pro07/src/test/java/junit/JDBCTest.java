
package junit;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.go.gov.dto.SampleDTO;
import kr.go.gov.model.SampleDAO;
import kr.go.gov.service.SampleService;

@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class JDBCTest {
	private static final Logger logger = LoggerFactory.getLogger(JDBCTest.class);

	@Inject
	DataSource dataSource;

	@Inject
	SqlSession sqls;

	@Test
	public void sqlConnectionTest() throws SQLException {
		Connection con = dataSource.getConnection();
		logger.info(con.toString());
		con.close();
	}

	@Test
	public void mybatisTest() throws Exception {
		List<SampleDTO> sampleList = sqls.selectList("sample.sampleList");
		logger.info(sampleList.toString());
		System.out.println("리스트 : " + sampleList.toString());
		sqls.close();
	}

	@Test
	public void dtoTest() throws Exception {
		SampleDTO dto = new SampleDTO();
		dto.setId("admin");
		dto.setPw("1234");
		logger.info(dto.getId());
		logger.info(dto.getPw());
	}
}
