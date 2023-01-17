
package junit;

import javax.inject.Inject;
import static org.junit.Assert.fail;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.go.gov.dto.SampleDTO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class JDBCTest4 {
	private static final Logger logger = LoggerFactory.getLogger(JDBCTest4.class);

	@Inject
	SqlSession sqlSession;
	
	@Inject
	SampleDTO dto = new SampleDTO();
	
	@Test
	public void daoTest() {
		int cnt = 99;
		try {
			cnt = daoCall();
			logger.info("DAO 단위 테스트가 성공적으로 처리되었음");
			logger.info("회원수 : "+cnt);
			Assert.assertEquals(cnt, 8);
		} catch (Exception e) {
			logger.info("DAO 단위 테스트가 실패 되었습니다.");
			fail("DAO 단위 테스트 실패");
		}
	}
	
	
	public int daoCall() throws Exception {
		dto.setId("testid2");
		dto.setPw("tesetpw2");
		return sqlSession.insert("sample.addSample",dto);
	}
}
