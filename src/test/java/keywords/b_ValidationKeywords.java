package keywords;


import org.testng.Assert;

public class b_ValidationKeywords extends a_GenericKeywords{
	
	public void validateTitle(String expTitle)
	{
		Assert.assertEquals(driver.getTitle(), expTitle);
	}

}