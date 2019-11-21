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
		
		//객체를 파일에 저장	
		ObjectOutputStream out = null;
		try 
		{
			out = new ObjectOutputStream(new FileOutputStream("object.obj")); //객체를 object.obj로 내보낸다.
		} 
		catch (IOException e) 
		{
			System.out.println("파일 생성 실패");
		} 
		
		//파일에서 객체 읽기	
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
