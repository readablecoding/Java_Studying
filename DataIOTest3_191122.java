package myPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class DataIOTest3_191122 
{

	public static void main(String[] args) 
	{
		ArrayList<Data_191122> list = new ArrayList<>();
		list.add(new Data_191122("��", 10, "����"));
		list.add(new Data_191122("��", 20, "����"));
		
		//��ü ����
		ObjectOutputStream out;
		
		try 
		{
			out = new ObjectOutputStream(new FileOutputStream("list2.dat"));
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
			in = new ObjectInputStream(new FileInputStream("list2.dat"));
			ArrayList<Data_191122> a;
			a = (ArrayList<Data_191122>) in.readObject();	 
			System.out.println(a);
			/*���
			 [Data_191122 [name=��, age=10, address=����], Data_191122 [name=��, age=20, address=����]]
			 */
			in.close();
		} 
		catch (FileNotFoundException e) 
		{	
			e.printStackTrace();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
	
	}//main()

}//class DataIOTest3_191122
