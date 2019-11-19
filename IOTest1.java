package global.sesoc.java1.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class IOTest1 
{
	public static void main(String[] args) 
	{
		//1.File��ü ����
		File file = new File("C:\\Java\\source\\test.java"); //File ��ü ����, ������ file
		
		//2.������ �ִ��� ������ Ȯ��
		if(!file.isFile())
		{
			System.out.println(file.getName() + " ������ �����ϴ�.");
			return;
		}
		
		//3.FileInputStream Ŭ���� ���
		FileInputStream inFile = null; // ���� ������ �ʱ�ȭ, { } �ȿ��� ���� ���� { } �ۿ��� �� ���� ����
		try 
		{
			inFile = new FileInputStream(file); //FileInputStream ��ü �����. ��� �����ؼ� �ϵ��ũ�κ��� ���� �б�, File��ü�� �������� file�� �ִ´�
			//inFile = new FileInputStream("\\Users\\user\\Downloads\\text.txt");
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace(); // ����ڰ� ���� ȭ���� �ƴ� ���α׷��Ӱ� ���� �뵵. ����ڿ��� �� �� ���� �뵵��
		} 
		
		//4.read() �޼ҵ� ���
		int n;
		try 
		{
			while(true)
			{
				n = inFile.read();	//���� �� 1����Ʈ�� �о�´�. ���� Ÿ���� int��
				if(n == -1) 		//������ �� �о��°�? �� �о����� -1�� ���´�.
				{
					break; 			//�׷��� break
				}
				System.out.print((char)n); //n�� �׳� ������ ���´�. (char)�� ���� ���ڷ� ��ȯ
			}	
		} 
		catch (IOException ex) // while�� �ۿ� catch�� �־� ���� �߻��� ����� �´�.
		{
			ex.printStackTrace();
		} 		
		
		//5.FileInputStream �ݱ�
		try 
		{
			inFile.close(); //�׸� �о�� �� �� close()�Ѵ�.
		} 
		catch(IOException e)
		{
			e.printStackTrace();
		}
				
	}//main()
}//class IOTest1 
