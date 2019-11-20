package global.sesoc.java1.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextEditor 
{
	/*
	파일명: abc
	내용을 입력하세요.
	종료는 새로운 행에서 엔터
	
	가나다라
	abcd
	
	입력받을 때 Scanner
	파일명 입력은 Stream 생성
	내용은 파일 쓰기
	그만 입력하겠다는 것은 Stream 닫고 마지막 문구 내보내기
	*/
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String filename;
		File file;
		BufferedWriter out = null;
		String text;
		int num = 0;
		
		//파일명 입력받아 File객체 생성. 있는 이름이면 다시 입력받음
		while(true)
		{
			System.out.print("파일명 : ");
			filename = scan.nextLine();
			file = new File(filename);
			if(!file.isFile())
			{
				break;
			}
			System.out.println("이미 사용 중인 이름입니다. 다시 입력하세요.");
		}
		
		
		//출력스트림 생성
		try 
		{
			out = new BufferedWriter(new FileWriter(file));
		} 
		catch (IOException e) 
		{
			System.out.println("파일 생성 중 오류");
		}
		
		//반복적으로 한 줄 입력받아 한 줄 저장
		//입력없이 엔터치면 반복 종료
		//스트림 닫고 프로그램 종료
		try
		{
			System.out.println("내용을 입력하세요. 종료는 새로운 행에서 엔터");
			while(true)
			{
				System.out.println(++num + " :");
				text = scan.nextLine();
				
				if(text.equals("")) //nextLine()으로 입력받을 때 엔터만 받을 때 종료하도록 함 
				{	
					break;
				}
				//Scanner에서 끝나는 방법이 다르다.
				//text == null은 안된다.			(X)
				//text.length() == 0 해도 된다.	(O)
				//text.isEmpty()로 해도 된다.   	(O)
				
			
				out.write(text);
				out.newLine(); //줄을 바꿈. 안 그러면 계속 연이어 나오기 때문
			}
			out.close();
			System.out.println(file.getName() + " 파일이 저장되었습니다.");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
		 
		
	
		
		
		
		
		



	}//main()

}//class TextEditor 
