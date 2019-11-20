package global.sesoc.java1.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;

public class IOTest6 
{
	public static void main(String[] args) 
	{
		/*product.txt
		모니터 1000 2
		키보드 500 5
		마우스 300 2
		*/
	
		File file = null;
		BufferedReader inFile = null;
		String fileName = "C:\\Users\\user\\Downloads\\product.txt";
		String line;
		int amount;  
		
		//텍스트 파일 열기
		 try
		 {
			 inFile = new BufferedReader(new FileReader(fileName));
		 }
		 catch(FileNotFoundException e)
		 {
		 System.out.println(fileName + " 파일 열기 실패");
		 }
		  
		 //한 줄 단위로 읽어서 String타입으로 리턴
		 try
		 {
			 while((line = inFile.readLine()) != null) //들어오는 것이 null이면 while문 종료
			 {
				//읽은 한 줄을 빈칸 기준으로 분리
				String ar[] = line.split(" ");
				 
				//상품명과 금액(단가 * 수량)을 출력 
				amount = Integer.parseInt(ar[1]) * Integer.parseInt(ar[2]);
				System.out.println("상품명:" + ar[0] +"," + " 금액:" + amount);			
				 	
			 }
		  }
		  catch(IOException e)
		  {
		  	e.printStackTrace();
		  }
		  
		 //스트림 닫기
		 try
		 {
			 inFile.close();
		 }
		 catch(IOException e)
		 {
		 	e.printStackTrace();
		 }
	
	}//main()
}//class IOTest6 
