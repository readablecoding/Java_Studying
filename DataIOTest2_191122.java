package myPractice;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DataIOTest2_191122 
{
	public static void main(String[] args) 
	{
		//Data_191122 객체들이 저장되어 있는 파일을 읽는다
		//내용을 화면에 출력
		ObjectInputStream in = null;
		Data_191122 d = null;
		
		try 
		{
			in = new ObjectInputStream(new FileInputStream("data2.dat"));
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		try
		{
			while(true)
			{
				d = (Data_191122) in.readObject(); //return이 Object이므로 상위 타입이라서 하위 타입인 Data_19112로 강제형변환
				System.out.println(d);
				
				/*결과
				Data_191122 [name=홍길동, age=20, address=광주시]
				Data_191122 [name=김길동, age=30, address=서울시]
				Data_191122 [name=박길동, age=40, address=부산시]
				*/
			}
		} 
		catch (ClassNotFoundException e) 
		{
			
		} 
		catch (EOFException e)
		{
			
		}
		catch (IOException e) 
		{
			
		} 
	
	}//main()

}//class DataIOTest2_191122
