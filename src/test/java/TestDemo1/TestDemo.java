package TestDemo1;

import org.testng.Assert;
import org.testng.annotations.Test;




public class TestDemo {
	
	@Test
	
	public static void sum() {
		
		System.out.println("SUM");
		
		int a=10;
		int b=20;
		Assert.assertEquals(30, a+b);
				
		
	}

}
