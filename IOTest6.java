package global.sesoc.java1.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//import java.util.ArrayList;
//import java.lang.ArrayIndexOutOfBoundsException;
import java.io.File;
//import java.lang.NumberFormatException;


public class IOTest6 
{

	public static void main(String[] args) 
	{
		/*
		모니터 1000 2
		키보드 500 5
		마우스 300 2
		*/
		
		File file = null;
		BufferedReader inFile = null;
		String fileName = "C:\\Users\\user\\Downloads\\product.txt";
		
		String s = null; // BufferedReader부터 1줄 받는 것	
		String ar[] = new String[3]; // split 받는 것	
		int sum = 1; // 곱셈용
		
		//ArrayList<String> list = new ArrayList<String>();
		//String array[] = list.toArray(new String[list.size()]);
	
		
		
		//텍스트 파일 열기 -> FileReader	
		//한 줄 단위로 읽어서 String 타입으로 리턴 -> BufferedReader
		try 
		{
			inFile = new BufferedReader(new FileReader(fileName));
			 
			while(true) 
			{
				s = inFile.readLine();
				if(s == null)
				{
					break;
				}
				ar = s.split(" ");
				for(int i = 1; i < ar.length; i++)
				{	
					sum = sum * Integer.parseInt(ar[i]);	
				}
				System.out.println(ar[0] + " 합계는 " + sum + "입니다.");
				sum = 1;
			}		
			inFile.close();  //스트림 닫기
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException ex) 
		{
			ex.printStackTrace();
		}
	
			
		/*
		try
		{
			inFile = new BufferedReader(new FileReader(fileName));
			String read = null;
			while((read = inFile.readLine()) != null)
			{
				String [] splited = read.split(" ");
				for(String part : splited)
				{
					System.out.print(part + " ");
				}
				System.out.println();
			}
		
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch(NumberFormatException ex)
		{
			ex.printStackTrace();
		}
		*/
		
		
	
		
		//읽은 한줄을 빈칸 기준으로 분리 -> split
		
		
	
		
		//상품명과 금액(단가*수량)을 출력 -> int로 변환 후 계산
		// 단가 -> Integer.parseInt("숫자");
		// 수량 -> Integer.parseInt("숫자");
		// 단가 * 수량 ->
		// System.out.println(단가 * 수량);
		
		
		//스트림 닫기
		
		
		
	}//main()

}//class IOTest6 
