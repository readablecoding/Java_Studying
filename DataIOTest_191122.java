package myPractice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DataIOTest_191122 
{

	public static void main(String[] args) 
	{
		//객체 생성
		Data_191122 d1 = new Data_191122("홍길동", 20, "광주시");
		Data_191122 d2 = new Data_191122("김길동", 30, "서울시");
		Data_191122 d3 = new Data_191122("박길동", 40, "부산시");
		
		//변수 선언
		ObjectOutputStream out = null;
		
		//파일 출력 스트림을 생성 -> 객체 저장 -> 스트림 닫기
		try 
		{
			//파일로 출력하는 스트림 생성
			out = new ObjectOutputStream(new FileOutputStream("data2.dat"));
			//객체 저장
			out.writeObject(d1);
			out.writeObject(d2);
			out.writeObject(d3);
			//스트림 닫기
			out.close();
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		
		

	}//main()

}//class DataIOTest_191122
