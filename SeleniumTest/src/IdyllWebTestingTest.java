import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.regex.Pattern;
import org.openqa.selenium.server.*;

public class IdyllWebTestingTest extends SeleneseTestCase {
	static SeleniumServer server = null;
	
	@Before
	public void setUp() throws Exception {
		try
		{
			if (server == null)
			{
				server = new SeleniumServer();
				server.start();
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://webtesting.idyll.org/");
		selenium.start();
	}

	@Test
	public void testIdyllWebTesting() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
