package global.sesoc.java1.exception;

import java.io.IOException;
public class ExTest4 
{
	public static void main(String[] args) throws Exception
	{
		int a;
		
		a = System.in.read();
		/*
		 * try { a = System.in.read(); // read()�޼ҵ�� �� ���ڸ� �Է¹޴´�.IOException ���� �߻� }
		 * catch(IOException e) { e.printStackTrace(); // printStackTrace()�� ������ ������ ���� ����� ������ ������ }
		 */
		
		System.out.println(a);
		
	}//main()
}//class Extest3 
