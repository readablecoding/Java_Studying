package global.sesoc.java1.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class IOTest4 {

	public static void main(String[] args) 
	{
		File file = new File("C:\\Java\\workspace\\java1\\b.txt");
		FileWriter outFile = null;
		String filename = "b.txt";
		int n;
		
		if(!file.isFile())
		{
			System.out.println(file.getName() + " ������ �ֽ��ϴ�.");
			return;
		}
			
		try 
		{
			outFile = new FileWriter(filename);  //���� ����
			outFile.write(100);						//int�� ���޹޾� 1���� ����
			outFile.write('A');
			outFile.write('��');
			outFile.close();						//��Ʈ�� �ݱ�	
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}//main()

}//class IOTest4
