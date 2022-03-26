package testDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertDemo {
  @Test
  public void assertEqualsDemo() {
	  String a = "abc";
	  String b = "abc";
	  Assert.assertEquals(a,b,"a��b�����");
	  System.out.println("�Ա��ַ���a��b�Ƿ����");
  }
  @Test
  public void assertNotEqualsDemo() {
	  int c = 1;
	  int d = 2;
	  Assert.assertNotEquals(c, d,"c��d�����");
	  System.out.println("�Ա�����c��d�Ƿ����");
  }
  @Test
  public void assertNullDemo() {
	  String e = null;
	  Assert.assertNull(e,"�ַ���e��Ϊ��");
	  System.out.println("�ַ���eΪ��");
	  
  }
}
