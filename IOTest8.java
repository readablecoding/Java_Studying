package global.sesoc.java1.io;

import java.io.EOFException;
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
			a = (StringBuffer) in.readObject(); //readObject()의 반환타입이 Object라서 형변환 필요
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
		
		
		//모두 읽어들인 후에 다시 읽기 시도
		 
		try
		{
			while(true)
			{
				i = (Integer) in.readObject(); //더이상 읽을 것이 없으면 while문 탈출해 catch로 이동
				System.out.println(i); 
			}
		}
		catch(EOFException e) //자연스럽게 끝나도록 안에 비워둠
		{
			
		}
		
		*/
		
		
		
		
	}//main()

}//class IOTest8
