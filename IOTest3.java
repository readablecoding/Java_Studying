package global.sesoc.java1.io;

import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;
public class IOTest3 
{

	public static void main(String[] args) 
	{
		FileOutputStream outFile = null; //선언과 초기화
		String filename = "abc.txt";
		
		try 
		{
			outFile = new FileOutputStream(filename);	//파일 생성
			outFile.write(100); 						//int형 전달받아 1byte 저장, 메모장은 d로 저장 
			outFile.write('A');							//65인데, 메모장은 문자 A로 나타냄
			outFile.write('가');							//2바이트인데 1바이트만 저장하니 실제 보면 잘려 있다.
			outFile.close(); 							//스트림 닫기
			
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}	

	}//main() 

}//class IOTest3 
