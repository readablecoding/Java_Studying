package global.sesoc.java1.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DataIOTest 
{
	public static void main(String[] args) 
	{
		//객체 생성
		Data d1 = new Data("홍길동", 20, "광주시"); // Date클래스의 d1변수이고, Date객체를 만드는데 인자로 이름, 나이, 주소
		Data d2 = new Data("김길동", 30, "서울시");
		Data d3 = new Data("박길동", 40, "부산시");
		
		//변수 선언
		ObjectOutputStream out = null;

		//파일 출력 스트림을 생성 -> 객체 저장 -> 스트림 닫기 
		try 
		{
			//파일로 출력하는 스트림 생성
			out = new ObjectOutputStream(new FileOutputStream("data.dat")); //실제 저장되는 순간
			//객체를 저장
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
}//class DataIOTest
