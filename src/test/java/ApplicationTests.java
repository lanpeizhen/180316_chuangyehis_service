import com.charge.service.ChargeService;
import com.config.CxfClientUtil;
import com.domain.HisChargeInterface;
import com.domain.ReturnCode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=ApplicationTests.class)
public class ApplicationTests {

//	@Autowired
//	private ChargeService chargeService;
//	@Test
//	public void tsstSql() {
//		List<HisChargeInterface> chargeList = chargeService.getChargeList();
//		System.out.println(chargeList);
//	}

	@Test
	public void showUnMarshaller() {
		String str = "<?xml version=\"1.0\" encoding=\"UTF-16LE\" standalone=\"no\"?>" +
				"<Response>" +
				"<ResultCode>-1</ResultCode>" +
				"<ErrorMsg>找不到该患者对应的手术安排记录，不能记帐!</ErrorMsg>" +
				"</Response>";
//		String str = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>" +
//				"<book id=\"100\">" +
//				"    <author>James</author>" +
//				"   <calendar>2013-03-29T09:25:56.004+08:00</calendar>" +
//				"  <price_1>23.45</price_1>" +
//				"</book>";
		ReturnCode returnCode = new CxfClientUtil().converyToJavaBean(str, ReturnCode.class);
//		Book book = JaxbUtil.converyToJavaBean(str, Book.class);
		System.out.println(returnCode.getResultCode());
	}

}
