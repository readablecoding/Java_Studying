package global.sesoc.java1.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextEditor 
{	
	public static void main(String[] args) 
	{
		//���� ���� �� �ʱ�ȭ
		Scanner scan = new Scanner(System.in);
		String filename;
		File file;					//FileŬ������ file ������ ����
		BufferedWriter out = null;	//���� ���� �����͸� ����ϴ� BufferedWriter Ŭ������ out������ �ʱ�ȭ
		String text;				//���� �Է� �޴� �뵵
		int num = 0;				//�� ������ �ش��ȣ�� �����ִ� �뵵
		
		//���ϸ� �Է¹޾� File��ü ����. �ִ� �̸��̸� �ٽ� �Է¹���
		while(true)
		{
			System.out.print("���ϸ� : ");
			filename = scan.nextLine();
			file = new File(filename);		//�Է¹��� ���ϸ��� �����ڷ� �ϴ� FileŬ������ file���� ����
			if(!file.isFile())				//�ش� ������ ���� ��� while���� ����������.
			{
				break;
			}
			System.out.println("�̹� ��� ���� �̸��Դϴ�. �ٽ� �Է��ϼ���.");	//�ٽ� while�� ó������ ����.
		}
		
		
		//��½�Ʈ�� ����
		try 
		{
			out = new BufferedWriter(new FileWriter(file));//������ ������ ���� �о������  BufferedWriter ��ü ����
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
				System.out.print(++num + " :");
				text = scan.nextLine();
				
				if(text.equals("")) //nextLine()���� �Է¹޴µ� ���͸� ������ �����ϵ��� �� 
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
			System.out.println("���� ���� �� ���� �߻�");
		}
	
	}//main()

}//class TextEditor 


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
