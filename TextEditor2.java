package global.sesoc.java1.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//����ڰ� �Է��� �������� �ؽ�Ʈ ���� ����� (StringBuffer �̿�)
public class TextEditor2 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String filename = null;
		File file = null;
		BufferedWriter out = null;
		String text = null;
		StringBuffer buffer = null;
		String yn = null;
		int num = 0;

		//�ݺ������� ���� �Է¹޾� StringBuffer ����
		//�Է¾��� ����ġ�� �ݺ� ����
		buffer = new StringBuffer();
		
		System.out.println("������ �Է��ϼ���. ����� ���ο� �࿡�� ����");
		while (true) 
		{
			System.out.print(++num + ": ");
			text = scan.nextLine();
			if (text.equals("")) 
			{
				break;
			}
			buffer.append(text);	//�Է��� ���� StringBuffer�� �߰�
			buffer.append("\r\n");	//�� �ٲ޹��� �߰�
		}

		//���� ���� ���� Ȯ��
		System.out.print("�����Ͻðڽ��ϱ�? (y/n)");
		yn = scan.nextLine();
		if (yn.equalsIgnoreCase("n")) //�빮��, �ҹ��ڿ��� ������ n�̸� �ȴ�.
		{
			System.out.println("������ ����մϴ�.");
			return;
		}
		
		//���ϸ� �Է¹޾� File��ü ����. �ִ� �̸��̸� Ȯ�� �� �ٽ� �Է¹���
		while (true) 
		{
			System.out.print("���ϸ� : ");
			filename = scan.nextLine();
			file = new File(filename + ".txt");
			if (!file.isFile()) 
			{
				break;
			}
			System.out.print("�̹� �����ϴ� ���ϸ��Դϴ�. ������? (y/n)"); //n�̸� �ٽ� ���ϸ� �Է��ϰ� �����.
			yn = scan.nextLine();
			if (yn.equalsIgnoreCase("y")) 
			{
				break;
			}
		}
		
		//��½�Ʈ������. StringBuffer�� ���� ����
		try 
		{
			out = new BufferedWriter(new FileWriter(file));
			out.write(buffer.toString());
			out.close();
			System.out.println(file.getName() + " ������ ����Ǿ����ϴ�.");
		} 
		catch (IOException e) 
		{
			System.out.println("���� ���� �� ����");
		}
		
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













