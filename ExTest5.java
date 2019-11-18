package global.sesoc.java1.exception;

import java.io.IOException;
import java.io.FileNotFoundException;

public class ExTest5 
{

	public static void main(String[] args) throws Exception
	{
		int a = 0;
		try
		{
			a = sub(); // sub()메소드 호출한 것을 a에 대입
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		System.out.println(a); // a를 출력
	}
	
	public static int sub() throws IOException // 나를 호출한 곳(여기서는 main())으로 문제를 보낸다.
	{
		int ch;
		ch = System.in.read();  //  read()메소드 호출. 문제 발생시 IOException
		return ch;
	}

}
