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
		list.add(new Data("±è", 10, "±¤ÁÖ"));
		list.add(new Data("¹Ú", 20, "¼­¿ï"));
		
		//°´Ã¼ ÀúÀå
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
		
		
		//°´Ã¼ ÀÐ±â
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
		/* °á°ú
		 * [Data [name=±è, age=10, address=±¤ÁÖ], Data [name=¹Ú, age=20, address=¼­¿ï]]
		 */


	}//main()

}//class DataIOTest3
