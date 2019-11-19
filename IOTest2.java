package global.sesoc.java1.io;

import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
public class IOTest2 {

	public static void main(String[] args) 
	{
		//1.������ �ʱ�ȭ
		FileReader infile = null;
		File file = null;
		int n = 0;
		
		//2.�ؽ�Ʈ ������ ����Ű�� File ��ü ����
		file = new File("C:\\Java\\source\\test.java");
		
		//3.������ �ִ��� ������ Ȯ��
		if(!file.isFile())
		{
			System.out.println(file.getName() + " ������ �����ϴ�.");
		}
		
		//4.�ش� ���ϰ� ����Ǵ� ��Ʈ�� FileReader ��ü ����
		try 
		{
			infile = new FileReader(file); // FileReader ��ü ������ �����ڷ� file�� �ִ� ���ڿ��� ����
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		//5.���� �б�
		try
		{
			while(((n = infile.read()) != -1))  // ���� ���� ������ -1�� ���´�. -1�� �Ǹ�  while�� Ż��
			{
				System.out.print((char) n);
			}					
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		//6.��Ʈ�� �ݱ�
		try
		{
			infile.close();
		} 
		catch (IOException e)
		{	
			e.printStackTrace();
		}
		
	}//main()

}//class IOTest2
