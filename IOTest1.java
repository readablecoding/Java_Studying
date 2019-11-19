package global.sesoc.java1.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class IOTest1 
{
	public static void main(String[] args) 
	{
		//1.File객체 생성
		File file = new File("C:\\Java\\source\\test.java"); //File 객체 생성, 변수명 file
		
		//2.파일이 있는지 없는지 확인
		if(!file.isFile())
		{
			System.out.println(file.getName() + " 파일이 없습니다.");
			return;
		}
		
		//3.FileInputStream 클래스 사용
		FileInputStream inFile = null; // 변수 생성과 초기화, { } 안에서 만든 것은 { } 밖에서 못 쓰기 때문
		try 
		{
			inFile = new FileInputStream(file); //FileInputStream 객체 만들기. 통로 연결해서 하드디스크로부터 파일 읽기, File객체의 변수명인 file을 넣는다
			//inFile = new FileInputStream("\\Users\\user\\Downloads\\text.txt");
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace(); // 사용자가 보는 화면이 아닌 프로그래머가 보는 용도. 사용자용은 좀 더 좋은 용도로
		} 
		
		//4.read() 메소드 사용
		int n;
		try 
		{
			while(true)
			{
				n = inFile.read();	//읽을 때 1바이트만 읽어온다. 리턴 타입은 int형
				if(n == -1) 		//끝까지 다 읽었는가? 다 읽었으면 -1이 나온다.
				{
					break; 			//그러면 break
				}
				System.out.print((char)n); //n은 그냥 정수로 나온다. (char)를 통해 문자로 변환
			}	
		} 
		catch (IOException ex) // while문 밖에 catch가 있어 예외 발생시 여기로 온다.
		{
			ex.printStackTrace();
		} 		
		
		//5.FileInputStream 닫기
		try 
		{
			inFile.close(); //그만 읽어야 할 때 close()한다.
		} 
		catch(IOException e)
		{
			e.printStackTrace();
		}
				
	}//main()
}//class IOTest1 
