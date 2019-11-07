import java.io.File;
import java.io.Reader;
public class StringTest3 
{
	public static void main(String[] args) 
	{
		//변수 선언. 변수가 각각의 주소를 가리키고 있다.
		java.lang.String a = new String("aaaa");
		//aaa.bbb.String a2 = "aaaa";	
		String b = new String("abc");
		StringBuffer c = new StringBuffer("abc");
		StringBuffer d = new StringBuffer("abc");

		System.out.println(a); // abc
		System.out.println(b); // abc
		System.out.println(c); // abc
		System.out.println(d); // abc	
		
		// 객체를 가리키는 변수의 주소가 같은지 비교
		System.out.println(a == b); // false
		System.out.println(c == d); // false
		//System.out.println(a == c);	// incomparable types: String and StringBuffer -> String과 StringBuffer는 비교안됨 

		// 객체가 가진 내용을 비교
		System.out.println(a.equals(b));  // true
		System.out.println(c.equals(d));	// false -> equals() 메서드를 써도 내용 비교 안됨
		

		a = a + "d"; // String에 한 글자 붙임. 객체를 고치는 메소드가 
		c.append("d");	// StringBuffer에 한 글자 붙이는데 append()를 쓴다.

		System.out.println(a.equals(c.toString())); // true -> .toString은 StringBuffer를 String으로 만들어 주는 것
		
	}//main()
}//class
