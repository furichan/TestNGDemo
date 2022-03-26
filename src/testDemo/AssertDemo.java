package testDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertDemo {
  @Test
  public void assertEqualsDemo() {
	  String a = "abc";
	  String b = "abc";
	  Assert.assertEquals(a,b,"a和b不相等");
	  System.out.println("对比字符串a和b是否相等");
  }
  @Test
  public void assertNotEqualsDemo() {
	  int c = 1;
	  int d = 2;
	  Assert.assertNotEquals(c, d,"c和d不相等");
	  System.out.println("对比整型c和d是否相等");
  }
  @Test
  public void assertNullDemo() {
	  String e = null;
	  Assert.assertNull(e,"字符串e不为空");
	  System.out.println("字符串e为空");
	  
  }
}
