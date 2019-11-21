package global.sesoc.java1.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//����ڰ� �Է��� �������� �ؽ�Ʈ ���� ����� (�ӽ����� �̿�)
public class TextEditor4 {
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String filename = null;
		File file = null;
		File tempfile = null;
		BufferedWriter out = null;
		String text = null;
		String yn = null;
		int num = 0;

		//�ӽ����� ����
		try 
		{
			tempfile = new File("./temp.tmp");
			out = new BufferedWriter(new FileWriter(tempfile));
		}
		catch (IOException e) 
		{
			e.printStackTrace();
			return;
		}
		
		//�Է¹��� ������ �ӽ����Ͽ� �����ϰ� ����
		System.out.println("������ �Է��ϼ���. ����� ���ο� �࿡�� ����");
		try 
		{
			while (true) 
			{
				System.out.print(++num + ": ");
				text = scan.nextLine();
				if (text.equals("")) break;
				out.write(text);
				out.newLine();
			}
			out.close();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
			return;
		}
		
		//���� ���� ���� Ȯ��
		System.out.print("�����Ͻðڽ��ϱ�? (y/n)");
		yn = scan.nextLine();
		if (yn.equalsIgnoreCase("n")) 
		{
			//�������� ���� ���� �ӽ����� ����
			System.out.println("������ ����մϴ�.");
			tempfile.delete();
			return;
		}
		
		//���ϸ� �Է¹޾� File��ü ����. �ִ� �̸��̸� Ȯ�� �� �ٽ� �Է¹���
		while (true) 
		{
			System.out.print("���ϸ� : ");
			filename = scan.nextLine();
			file = new File(filename + ".txt");
			if (!file.isFile()) break;
			System.out.print("�̹� �����ϴ� ���ϸ��Դϴ�. ������? (y/n)");
			yn = scan.nextLine();
			if (yn.equalsIgnoreCase("y"))
			{
				break;
			}
		}
		
		//�ӽ������� �̸��� �Է¹��� �������� ����
		tempfile.renameTo(file);
		System.out.println(file.getName() + " ������ ����Ǿ����ϴ�.");
		
	}
}

/*
*������ �Է��ϼ���. ����� ���ο� �࿡�� ����
1:�����ٶ�
2:abcd
3:
�����Ͻðڽ��ϱ�? (y/n) y
���ϸ� : a
�̹� �����ϴ� ���ϸ��Դϴ�. ������? (y/n) n
���ϸ� : b
* b.txt ������ ����Ǿ����ϴ�.

*/













