package test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

public class ImdbTest extends BaseTest {
	
	@Test(priority=1)
	public void countryTest() {
		imdbpage.imdbHome();
		AssertJUnit.assertEquals(imdbpage.conuntry(), "India");
		
	}
	@Test(priority=2)
	public void dateTest() {
		AssertJUnit.assertEquals(imdbpage.date(), "17 December 2021");
		
		
	}
}
