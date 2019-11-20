package global.sesoc.java1.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileCopy 
{

	public static void main(String[] args) 
	{
		//변수 선언
		Scanner scan = new Scanner(System.in);
		String filename1;
		String filename2;
		File file1;
		File file2;
		FileInputStream in = null; 
		FileOutputStream out = null;
		int temp = 0; //FileInputStream의 read()메소드의 값이 -1이 되면 값 없다는 것을 확인하는 것
		
	
		
		//원본 파일의 이름과 경로를 입력받음 (예: \java\a.jpg)
		//파일이 없으면 다시 입력받음
		while(true)
		{
			System.out.print("원본 파일명: ");
			filename1 = scan.nextLine();	//입력받은 것을 filename1에 대입
			file1 = new File(filename1);	// File클래스의 객체 file1이 파일에 대한 정보 가짐
			if(file1.isFile())				
			{
				break;	//파일이 있으면 입력받지 않고 while문 탈출
			}
			System.out.println("파일이 없습니다.");
		}//while문
		
		
		//복사본 파일의 이름과 경로를 입력받음 (예: .\a2.jpg)
		//파일이 있으면 다시 입력받음
		while(true)
		{
			System.out.print("복사본 파일명:  ");
			filename2 = scan.nextLine();
			file2 = new File(filename2);
			if(!file2.isFile())
			{
				break;	//파일이 없으면 입력받지 않고 while문 탈출
			}
			System.out.println("이미 사용중인 파일명입니다.");
		}//while문
		
		//입,출력 스트림 생성
		try 
		{
			in = new FileInputStream(filename1);	//
			out = new FileOutputStream(filename2); 	//
		} 
		catch (FileNotFoundException e1) 
		{
			e1.printStackTrace();
		}
		
		//1 byte씩 복사
		try 
		{
			while((temp = in.read()) != -1) //원본으로부터 1바이트씩 옮기는 것
			{
				out.write(temp);
			}	
			
			in.close();
			out.close();
			System.out.println(filename1 + " -> " + "복사 완료");
		} 
		catch (IOException e) 
		{
			
			e.printStackTrace();
		}	

	}//main()
}//class FileCopy
