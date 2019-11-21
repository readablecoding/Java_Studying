package global.sesoc.java1.io;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.ClassNotFoundException;

public class IOTest9 
{

	public static void main(String[] args) 
	{
		ObjectOutputStream out = null;
		ObjectInputStream in = null;
		Integer i;
		
		//��ü�� ���Ͽ� ����
		try
		{
			out = new ObjectOutputStream(new FileOutputStream("a.obj"));
			out.writeObject(new Integer(33));
			out.writeObject(new Integer(11));
			out.writeObject(new Integer(22));
			out.writeObject(new Integer(99));
			out.close();	//���� �ϼ������� ��Ʈ�� ������
		} 
		catch (IOException e) 
		{	
			e.printStackTrace();
		}
		
		//���Ϸκ��� ��ü �б�
		try 
		{
			in = new ObjectInputStream(new FileInputStream("a.obj"));
		} 
		catch (FileNotFoundException e1) 
		{
			e1.printStackTrace();
		} 
		catch (IOException e1) {
			e1.printStackTrace();
		}
		
		try
		{
			while(true)
			{
				i = (Integer) in.readObject(); //���̻� ���� ���� ������ while�� Ż���� catch�� �̵�
				System.out.println(i); 
			}
		}
		catch(ClassNotFoundException e) //�ڿ������� �������� �ȿ� �����
		{
			
		}
		catch(EOFException e) //�ڿ������� �������� �ȿ� �����
		{
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		try 
		{
			in.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}	
		
	}//main()
}//class IOTest9
