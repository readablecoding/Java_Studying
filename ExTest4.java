package global.sesoc.java1.exception;

import java.io.IOException;
public class ExTest4 
{
	public static void main(String[] args) throws Exception
	{
		int a;
		
		a = System.in.read();
		/*
		 * try { a = System.in.read(); // read()메소드는 한 글자만 입력받는다.IOException 오류 발생 }
		 * catch(IOException e) { e.printStackTrace(); // printStackTrace()은 개발자 본인을 위해 날라온 정보를 보여줌 }
		 */
		
		System.out.println(a);
		
	}//main()
}//class Extest3 
