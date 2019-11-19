package global.sesoc.java1.io;

import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
public class IOTest2 {

	public static void main(String[] args) 
	{
		//1.생성과 초기화
		FileReader infile = null;
		File file = null;
		int n = 0;
		
		//2.텍스트 파일을 가리키는 File 객체 생성
		file = new File("C:\\Java\\source\\test.java");
		
		//3.파일이 있는지 없는지 확인
		if(!file.isFile())
		{
			System.out.println(file.getName() + " 파일은 없습니다.");
		}
		
		//4.해당 파일과 연결되는 스트림 FileReader 객체 생성
		try 
		{
			infile = new FileReader(file); // FileReader 객체 생성시 생성자로 file에 있는 문자열을 받음
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		//5.문자 읽기
		try
		{
			while(((n = infile.read()) != -1))  // 없는 값을 읽으면 -1이 나온다. -1이 되면  while문 탈출
			{
				System.out.print((char) n);
			}					
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		//6.스트림 닫기
		try
		{
			infile.close();
		} 
		catch (IOException e)
		{	
			e.printStackTrace();
		}
		
	}//main()

}//class IOTest2
