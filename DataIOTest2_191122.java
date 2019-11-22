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
		//Data_191122 ��ü���� ����Ǿ� �ִ� ������ �д´�
		//������ ȭ�鿡 ���
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
				d = (Data_191122) in.readObject(); //return�� Object�̹Ƿ� ���� Ÿ���̶� ���� Ÿ���� Data_19112�� ��������ȯ
				System.out.println(d);
				
				/*���
				Data_191122 [name=ȫ�浿, age=20, address=���ֽ�]
				Data_191122 [name=��浿, age=30, address=�����]
				Data_191122 [name=�ڱ浿, age=40, address=�λ��]
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
