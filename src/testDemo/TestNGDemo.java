package testDemo;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestNGDemo {
  @Test(groups="one")
  public void testDemo0() {
	  //@Test 标记TestNG,要测试的方法，要执行的用例
		System.out.println("Test0");
	  }
  @Test(groups="one")
  public void testDemo1() {
	  //@Test 标记TestNG,要测试的方法，要执行的用例
	  System.out.println("Test1");
  }
  @Test(priority=2)
  public void testDemo2() {
	  System.out.println("Test2");
  }
 @Test(priority=3)
  public void testDemo3() {
	  System.out.println("Test3");
	  }
  @Test(priority=1)
  public void testDemo4() {
	  //@Test 标记TestNG,要测试的方法，要执行的用例
	  System.out.println("Test4");
  }
  @BeforeGroups(groups="one")		//定义好@test方法的组别，定义好在哪一组测试之前运行
  public void beforeGroup1() {
	  //@Test 标记TestNG,要测试的方法，要执行的用例
	  System.out.println("beforeGroup1,groups='one'");
  }
  @AfterGroups(groups="one")		//定义好@test方法的组别，定义好在哪一组测试之后运行
  public void afterGroup1() {
	  System.out.println("afterGroup1,groups='one'");
  }
  @BeforeClass		//注解的方法将只运行一次，在当前类中的所有测试方法之前调用。
  public void beforeClassDemo() {
	  System.out.println("beforeClass");
  }
  @AfterClass		//注解的方法将只运行一次，当前类中的所有测试方法之后调用
  public void afterClassDemo() {
	  System.out.println("afterClass");
  }
  @BeforeSuite		//注解的方法将只运行一次，在所有测试套件前运行
  public void beforeSuite() {
	  System.out.println("beforeSuite");
  }
  @AfterSuite		//注解的方法将只运行一次，在所有测试套件后运行
  public void afterSuit() {
	  System.out.println("afterSuit");
  }
  @BeforeTest		//注解的方法将在所有的内部类的 <test>标签的测试方法前运行	
  public void beforeTest() {
	  System.out.println("beforeTest");
  }
  @AfterTest		//注解的方法将在所有的内部类的 <test>标签的测试方法后运行。
  public void afterTest() {
	  System.out.println("afterTest");
  }
  @BeforeMethod		//注解的方法将在每个测试方法之前运行。如有多个@test方法也就是会被多次运行
  public void beforeMethod() {
	  System.out.println("beforeMethod");
  }
  @AfterMethod		//注解的方法将在每个测试方法之后运行。如有多个@test方法也就是会被多次运行
  public void afterMethod() {
	  System.out.println("afterMethod");
  }
}
