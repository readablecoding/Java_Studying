package global.sesoc.java1.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class IOTest7 
{

	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer("abcde");
		Integer in = new Integer(100);
		ArrayList<String> list = new ArrayList<>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		//��ü�� ���Ͽ� ����	
		ObjectOutputStream out = null;
		try 
		{
			out = new ObjectOutputStream(new FileOutputStream("object.obj")); //��ü�� object.obj�� ��������.
		} 
		catch (IOException e) 
		{
			System.out.println("���� ���� ����");
		} 
		
		//���Ͽ��� ��ü �б�	
		try 
		{
			out.writeObject(sb);
			out.writeObject(in);
			out.writeObject(list);
			out.close();	
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
			
		
		

	}

}
