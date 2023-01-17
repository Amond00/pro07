
package junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.go.gov.dto.SampleDTO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class JDBCTest3 {
	private static final Logger logger = LoggerFactory.getLogger(JDBCTest3.class);

	@Test
	public void dtoTest() throws Exception {
		SampleDTO dto = new SampleDTO();
		dto.setId("admin");
		dto.setPw("1234");
		logger.info(dto.getId());
		logger.info(dto.getPw());
	}
	

}
