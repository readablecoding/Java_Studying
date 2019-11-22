package global.sesoc.java1.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class DataIOTest3 {

	public static void main(String[] args) 
	{
		ArrayList<Data> list = new ArrayList<>();
		list.add(new Data("��", 10, "����"));
		list.add(new Data("��", 20, "����"));
		
		//��ü ����
		ObjectOutputStream out;
		try 
		{	
			out = new ObjectOutputStream(new FileOutputStream("list.dat"));
			out.writeObject(list);
			out.close();
		} 
		catch (FileNotFoundException e) 
		{		
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		
		//��ü �б�
		ObjectInputStream in;
		try 
		{
			in = new ObjectInputStream(new FileInputStream("list.dat"));
			ArrayList<Data> a;
			a = (ArrayList<Data>)in.readObject();	
			System.out.println(a);
			in.close();		
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		/* ���
		 * [Data [name=��, age=10, address=����], Data [name=��, age=20, address=����]]
		 */


	}//main()

}//class DataIOTest3
