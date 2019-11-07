import java.io.File;
import java.io.Reader;
public class StringTest3 
{
	public static void main(String[] args) 
	{
		//���� ����. ������ ������ �ּҸ� ����Ű�� �ִ�.
		java.lang.String a = new String("aaaa");
		//aaa.bbb.String a2 = "aaaa";	
		String b = new String("abc");
		StringBuffer c = new StringBuffer("abc");
		StringBuffer d = new StringBuffer("abc");

		System.out.println(a); // abc
		System.out.println(b); // abc
		System.out.println(c); // abc
		System.out.println(d); // abc	
		
		// ��ü�� ����Ű�� ������ �ּҰ� ������ ��
		System.out.println(a == b); // false
		System.out.println(c == d); // false
		//System.out.println(a == c);	// incomparable types: String and StringBuffer -> String�� StringBuffer�� �񱳾ȵ� 

		// ��ü�� ���� ������ ��
		System.out.println(a.equals(b));  // true
		System.out.println(c.equals(d));	// false -> equals() �޼��带 �ᵵ ���� �� �ȵ�
		

		a = a + "d"; // String�� �� ���� ����. ��ü�� ��ġ�� �޼ҵ尡 
		c.append("d");	// StringBuffer�� �� ���� ���̴µ� append()�� ����.

		System.out.println(a.equals(c.toString())); // true -> .toString�� StringBuffer�� String���� ����� �ִ� ��
		
	}//main()
}//class
