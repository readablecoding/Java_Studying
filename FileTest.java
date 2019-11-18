package global.sesoc.java1.io;

import java.io.File;
import java.io.IOException;
import java.util.Date;
public class FileTest 
{

	public static void main(String[] args) 
	{
		File a = new File("\\Windows"); // ������, ���ڿ� �ȿ����� \\��� �ؾ� Ư�����ڶ�� ���� ����
		File b = new File(".");			// ����� 
		File c = new File("./sub");		// sub���� -> .�� ���� ����
		File d = new File("a.txt");		// ��������  a.txt�� ����Ű�� ��ü d�� ���� 
		File e = new File("\\Java\\source\\Sort1.java"); //������
		
		//�޼ҵ� ����
		System.out.println(a.getAbsolutePath()); 	// C:\Windows ->���� ��ġ�� ����� ������ �������� ����  
		System.out.println(b.getAbsolutePath()); 	// C:\Java\workspace\java1\.
		System.out.println(b.getParent()); 			// null -> ���� ��ġ �ٷ� ����
		System.out.println(c.getAbsolutePath()); 	// C:\Java\workspace\java1\sub
		System.out.println(d.getAbsolutePath()); 	// C:\Java\workspace\java1\a.txt
		System.out.println(e.getAbsolutePath()); 	// C:\Java\source\Sort1.java -> ���� ��� ����
		System.out.println(e.getName());			// Sort1.java -> ���� �̸� 
		System.out.println(e.getParent()); 			// \Java\source -> ���� ���� �̸�
		System.out.println();
		
		//����, ���� �ִ��� ���� Ȯ��
		System.out.println(a.exists()); //true -> ���� �ִ��� ������ �� �� �ִ�.
		System.out.println(a.isFile());	//false -> ������ �ִ��� Ȯ��
		System.out.println(a.isDirectory()); //true -> ������ �ִ��� Ȯ��
		System.out.println(a.canRead()); //true
		System.out.println();
		
		//���丮 ����
		if(c.mkdir()) // ���� ������ ������ش�. booleanŸ������ ��������
		{
			System.out.println(c.getName() + "�� ������"); //sub�� ������
		}
		else
		{
			System.out.println("���� ���� ����");
		}
		System.out.println();
		
		/*
		//���� ����
		try
		{
			if(d.createNewFile())   // ���� ����� IOException�� ���´�.
			{
				System.out.println(d.getName() + "�� ������");  //a.txt�� ������
			}
			else
			{
				System.out.println("���� ���� ����");
			}
		}
		catch(IOException e1)
		{
			System.out.println("���� ���� ����");
		}
		System.out.println();
		*/
		
		//���� ����
		/*
		if(d.isFile())
		{
			d.delete();
		} 
		*/
		
		//���� �̸� ���� -> ���� ���� ���� �κ��� �ּ�ó�� �ؾ� �Ѵ�.	
		File n = new File("b.txt"); //��ü n�� b.txt��� ���� ����Ű���� �� ��
		d.renameTo(n); 				// d�� ����Ű�� ���� "b.txt"�� �ǰԲ� �Ѵ�.
		System.out.println(d.getName()); // a.txt
		System.out.println(d.isFile());	// false
		System.out.println(n.getName()); // b.txt
		System.out.println(n.isFile());	// true -> b.txt�� �ٲ�
		System.out.println();
		
		
		//���� ���� �������� & ������ �̸��� �о�´�.
		String names[] = a.list();
		for(int i = 0; i < names.length; i++)
		{
			System.out.println(names[i]);
		}
		System.out.println();
		
		//���� ���� �������� & ������ ������ ���� File��ü���� �о�´�.
		File files[] = a.listFiles();
		for(int i = 0; i < files.length; i++)
		{
			System.out.print(files[i].getName() + "\t");
			System.out.print(new Date(files[i].lastModified()) + "\t");
			System.out.print(files[i].length() + "bytes");							
		}
		System.out.println();		
		
	}//main()
}//clsss FileTest
