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
			a = sub(); // sub()�޼ҵ� ȣ���� ���� a�� ����
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		System.out.println(a); // a�� ���
	}
	
	public static int sub() throws IOException // ���� ȣ���� ��(���⼭�� main())���� ������ ������.
	{
		int ch;
		ch = System.in.read();  //  read()�޼ҵ� ȣ��. ���� �߻��� IOException
		return ch;
	}

}
