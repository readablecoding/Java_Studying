package global.sesoc.java1.io;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DataIOTest2 
{
	public static void main(String[] args) 
	{
		//Data 객체들이 저장되어 있는 파일을 읽는다
		//내용을 화면에 출력
		ObjectInputStream in = null;
		Data d = null;
		
		try 
		{
			in = new ObjectInputStream(new FileInputStream("data.dat")); 
			//ObjectInputStream 객체는 파일로부터 객체를 읽어온다.
		} 
		catch (FileNotFoundException e2) 
		{
			e2.printStackTrace();
		} 
		catch (IOException e2) 
		{
			e2.printStackTrace();
		} 
			
		try 
		{
			while(true)
			{
			//getName()메서드는 상위 타입이 하위 타입을 참조못하므로 강제 형변환
			d = (Data) in.readObject();
			//더 이상 readObject()로부터 읽어올 것이 없으면 while문 탈출
			System.out.println(d);	
			}
		}
		catch (ClassNotFoundException e) 
		{
				
		}
		catch(EOFException e)
		{
				
		}	
		catch (IOException e) 
		{
				
		}
		
		//스트림 닫기
		try 
		{
			in.close();
		} 
		catch (IOException e1) 
		{
			e1.printStackTrace();
		}	

		/*결과
		Data [name=홍길동, age=20, address=광주시]
		Data [name=김길동, age=30, address=서울시]
		Data [name=박길동, age=40, address=부산시] 
		*/
		
	}//main()

}//DateIOTest2 
