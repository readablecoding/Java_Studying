package global.sesoc.java1.io;

import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;
public class IOTest3 
{

	public static void main(String[] args) 
	{
		FileOutputStream outFile = null; //����� �ʱ�ȭ
		String filename = "abc.txt";
		
		try 
		{
			outFile = new FileOutputStream(filename);	//���� ����
			outFile.write(100); 						//int�� ���޹޾� 1byte ����, �޸����� d�� ���� 
			outFile.write('A');							//65�ε�, �޸����� ���� A�� ��Ÿ��
			outFile.write('��');							//2����Ʈ�ε� 1����Ʈ�� �����ϴ� ���� ���� �߷� �ִ�.
			outFile.close(); 							//��Ʈ�� �ݱ�
			
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}	

	}//main() 

}//class IOTest3 
