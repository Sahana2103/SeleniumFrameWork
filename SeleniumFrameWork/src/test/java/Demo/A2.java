package Demo;

import org.testng.annotations.Test;

public class A2 {
	@Test(groups = {"SmokeTest","RegressionTest"})
	public void m2()
	{
		System.out.println("m2 executed");;
	}
	@Test 
	public void m3()
	{
		String Browser=System.getProperty("browser");
		String URL=System.getProperty("url");
		System.out.println(Browser);
		System.out.println(URL);
	}

	
	

}
