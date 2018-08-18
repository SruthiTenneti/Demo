package GIT;

import org.testng.annotations.Test;

public class Gitrep2 {
	@Test(priority=1)
	public void method1()
	{
		System.out.println("first gitrep2");
	}
	@Test(priority=2)
	public void method2()
	{
		System.out.println("second gitrep2");
	}
	@Test(priority=3)
	public void method3()
	{
		System.out.println("third gitrep2");
	}

}
