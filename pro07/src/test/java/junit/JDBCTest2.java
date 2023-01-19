
package junit;


import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.go.gov.dto.SampleDTO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class JDBCTest2 {
	private static final Logger logger = LoggerFactory.getLogger(JDBCTest2.class);

	@Inject
	SqlSession sqls;


	@Test
	public void mybatisTest() throws Exception {
		List<SampleDTO> sampleList = sqls.selectList("sample.sampleList");
		logger.info(sampleList.toString());
		System.out.println("리스트 : " + sampleList.toString());
		sqls.close();
	}
}