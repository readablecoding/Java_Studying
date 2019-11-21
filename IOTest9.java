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
		
		//객체를 파일에 저장
		try
		{
			out = new ObjectOutputStream(new FileOutputStream("a.obj"));
			out.writeObject(new Integer(33));
			out.writeObject(new Integer(11));
			out.writeObject(new Integer(22));
			out.writeObject(new Integer(99));
			out.close();	//파일 완성했으니 스트림 끝내기
		} 
		catch (IOException e) 
		{	
			e.printStackTrace();
		}
		
		//파일로부터 객체 읽기
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
				i = (Integer) in.readObject(); //더이상 읽을 것이 없으면 while문 탈출해 catch로 이동
				System.out.println(i); 
			}
		}
		catch(ClassNotFoundException e) //자연스럽게 끝나도록 안에 비워둠
		{
			
		}
		catch(EOFException e) //자연스럽게 끝나도록 안에 비워둠
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
