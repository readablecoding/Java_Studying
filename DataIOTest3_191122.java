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
		list.add(new Data_191122("±è", 10, "±¤ÁÖ"));
		list.add(new Data_191122("¹Ú", 20, "¼­¿ï"));
		
		//°´Ã¼ ÀúÀå
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
		
		//°´Ã¼ ÀÐ±â
		ObjectInputStream in;
		
		try 
		{
			in = new ObjectInputStream(new FileInputStream("list2.dat"));
			ArrayList<Data_191122> a;
			a = (ArrayList<Data_191122>) in.readObject();	 
			System.out.println(a);
			/*°á°ú
			 [Data_191122 [name=±è, age=10, address=±¤ÁÖ], Data_191122 [name=¹Ú, age=20, address=¼­¿ï]]
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
