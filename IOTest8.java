package global.sesoc.java1.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class IOTest8 
{

	public static void main(String[] args) 
	{
		ObjectInputStream in = null;
		StringBuffer a;
		Integer b;
		ArrayList<String> c;
		
		
		/*
		try 
		{
			in = new ObjectInputStream(new FileInputStream("object.obj"));
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		
		try 
		{
			a = (StringBuffer) in.readObject(); //readObject()�� ��ȯŸ���� Object�� ����ȯ �ʿ�
			System.out.println(a);	//abcde
			b = (Integer) in.readObject();
			System.out.println(b);	//100
			c = (ArrayList<String>) in.readObject();
			System.out.println(c);	//[aaa, bbb, ccc]
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{	
			e.printStackTrace();
		} 
		
		
		//��� �о���� �Ŀ� �ٽ� �б� �õ�
		 
		
		in.readObject();
		-> EOFException �߸� �׸��ϰ� �Ѵ�.
		
		*/
		
		
		
		
	}//main()

}//class IOTest8
