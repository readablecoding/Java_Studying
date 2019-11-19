package global.sesoc.java1.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class IOTest4 {

	public static void main(String[] args) 
	{
		File file = new File("C:\\Java\\workspace\\java1\\b.txt");
		FileWriter outFile = null;
		String filename = "b.txt";
		int n;
		
		if(!file.isFile())
		{
			System.out.println(file.getName() + " 파일이 있습니다.");
			return;
		}
			
		try 
		{
			outFile = new FileWriter(filename);  //파일 생성
			outFile.write(100);						//int형 전달받아 1문자 저장
			outFile.write('A');
			outFile.write('가');
			outFile.close();						//스트림 닫기	
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}//main()

}//class IOTest4
