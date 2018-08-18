package GIT;
import org.testng.annotations.Test;
public class Gitrep {
	

	public class GitRep {
		@Test(priority=1)
		public void method1()
		{
			System.out.println("first gitrep");
		}
		@Test(priority=2)
		public void method2()
		{
			System.out.println("second gitrep");
		}
		@Test(priority=3)
		public void method3()
		{
			System.out.println("third gitrep");
		}

	}


}
