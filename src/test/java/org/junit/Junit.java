package org.junit;

public class Junit {
	@BeforeClass
	public static void beforeClass() {
		System.out.println("beforeclass");
	}
	@AfterClass
	public static void afterClass() {
           System.out.println("afterclass");
	}
	@Before
	  public void before() {
		System.out.println("before");
 	}
	@After
	public void after() {
       System.out.println("after");
	}
	@Test
	public void test() {
           System.out.println("test");
	}
	

}
