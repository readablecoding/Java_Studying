package global.sesoc.java1.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.File;

public class IOTest5 {

	public static void main(String[] args) 
	{	
		//���� ���ڸ� �� ���� ������ �� ���� �������  BufferedWriter Ŭ���� ���
		BufferedWriter outFile = null;
		String filename = "c.txt"; 
	
		try 
		{
			outFile = new BufferedWriter(new FileWriter(filename));  //���� ����� FileWriter�� �ϴµ� BufferedWriter�� ������ 
			outFile.write("abcdefghijklmnopqrstuvwxyz");
			outFile.write("\r\n");	//�̷��� �ڵ��ϸ� �ȵȴ�. �÷����� ������ �� �޴´ٴ� �̽ļ��� ���� ����. �ٹٲ��� �ý��۸��� �ٸ��� ����
			outFile.write("�����ٶ� ���̻��");
			outFile.newLine(); 	// ���� �ý��ۿ� �°� ���� �ٲٴ� ���ڸ� ��������. �ý��ۿ� �°� �˾Ƽ� �۵�
			outFile.close();	// Stream �ݱ�
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
			
	}//main()

}//class IOTest4