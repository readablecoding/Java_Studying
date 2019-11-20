package global.sesoc.java1.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileCopy 
{

	public static void main(String[] args) 
	{
		//���� ����
		Scanner scan = new Scanner(System.in);
		String filename1;
		String filename2;
		File file1;
		File file2;
		FileInputStream in = null; 
		FileOutputStream out = null;
		int temp = 0; //FileInputStream�� read()�޼ҵ��� ���� -1�� �Ǹ� �� ���ٴ� ���� Ȯ���ϴ� ��
		
	
		
		//���� ������ �̸��� ��θ� �Է¹��� (��: \java\a.jpg)
		//������ ������ �ٽ� �Է¹���
		while(true)
		{
			System.out.print("���� ���ϸ�: ");
			filename1 = scan.nextLine();	//�Է¹��� ���� filename1�� ����
			file1 = new File(filename1);	// FileŬ������ ��ü file1�� ���Ͽ� ���� ���� ����
			if(file1.isFile())				
			{
				break;	//������ ������ �Է¹��� �ʰ� while�� Ż��
			}
			System.out.println("������ �����ϴ�.");
		}//while��
		
		
		//���纻 ������ �̸��� ��θ� �Է¹��� (��: .\a2.jpg)
		//������ ������ �ٽ� �Է¹���
		while(true)
		{
			System.out.print("���纻 ���ϸ�:  ");
			filename2 = scan.nextLine();
			file2 = new File(filename2);
			if(!file2.isFile())
			{
				break;	//������ ������ �Է¹��� �ʰ� while�� Ż��
			}
			System.out.println("�̹� ������� ���ϸ��Դϴ�.");
		}//while��
		
		//��,��� ��Ʈ�� ����
		try 
		{
			in = new FileInputStream(filename1);	//
			out = new FileOutputStream(filename2); 	//
		} 
		catch (FileNotFoundException e1) 
		{
			e1.printStackTrace();
		}
		
		//1 byte�� ����
		try 
		{
			while((temp = in.read()) != -1) //�������κ��� 1����Ʈ�� �ű�� ��
			{
				out.write(temp);
			}	
			
			in.close();
			out.close();
			System.out.println(filename1 + " -> " + "���� �Ϸ�");
		} 
		catch (IOException e) 
		{
			
			e.printStackTrace();
		}	

	}//main()
}//class FileCopy
