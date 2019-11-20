package global.sesoc.java1.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextEditor 
{
	/*
	���ϸ�: abc
	������ �Է��ϼ���.
	����� ���ο� �࿡�� ����
	
	�����ٶ�
	abcd
	
	�Է¹��� �� Scanner
	���ϸ� �Է��� Stream ����
	������ ���� ����
	�׸� �Է��ϰڴٴ� ���� Stream �ݰ� ������ ���� ��������
	*/
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String filename;
		File file;
		BufferedWriter out = null;
		String text;
		int num = 0;
		
		//���ϸ� �Է¹޾� File��ü ����. �ִ� �̸��̸� �ٽ� �Է¹���
		while(true)
		{
			System.out.print("���ϸ� : ");
			filename = scan.nextLine();
			file = new File(filename);
			if(!file.isFile())
			{
				break;
			}
			System.out.println("�̹� ��� ���� �̸��Դϴ�. �ٽ� �Է��ϼ���.");
		}
		
		
		//��½�Ʈ�� ����
		try 
		{
			out = new BufferedWriter(new FileWriter(file));
		} 
		catch (IOException e) 
		{
			System.out.println("���� ���� �� ����");
		}
		
		//�ݺ������� �� �� �Է¹޾� �� �� ����
		//�Է¾��� ����ġ�� �ݺ� ����
		//��Ʈ�� �ݰ� ���α׷� ����
		try
		{
			System.out.println("������ �Է��ϼ���. ����� ���ο� �࿡�� ����");
			while(true)
			{
				System.out.println(++num + " :");
				text = scan.nextLine();
				
				if(text.equals("")) //nextLine()���� �Է¹��� �� ���͸� ���� �� �����ϵ��� �� 
				{	
					break;
				}
				//Scanner���� ������ ����� �ٸ���.
				//text == null�� �ȵȴ�.			(X)
				//text.length() == 0 �ص� �ȴ�.	(O)
				//text.isEmpty()�� �ص� �ȴ�.   	(O)
				
			
				out.write(text);
				out.newLine(); //���� �ٲ�. �� �׷��� ��� ���̾� ������ ����
			}
			out.close();
			System.out.println(file.getName() + " ������ ����Ǿ����ϴ�.");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
		 
		
	
		
		
		
		
		



	}//main()

}//class TextEditor 
