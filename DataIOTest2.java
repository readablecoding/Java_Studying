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
		//Data ��ü���� ����Ǿ� �ִ� ������ �д´�
		//������ ȭ�鿡 ���
		ObjectInputStream in = null;
		Data d = null;
		
		try 
		{
			in = new ObjectInputStream(new FileInputStream("data.dat")); 
			//ObjectInputStream ��ü�� ���Ϸκ��� ��ü�� �о�´�.
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
			//getName()�޼���� ���� Ÿ���� ���� Ÿ���� �������ϹǷ� ���� ����ȯ
			d = (Data) in.readObject();
			//�� �̻� readObject()�κ��� �о�� ���� ������ while�� Ż��
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
		
		//��Ʈ�� �ݱ�
		try 
		{
			in.close();
		} 
		catch (IOException e1) 
		{
			e1.printStackTrace();
		}	

		/*���
		Data [name=ȫ�浿, age=20, address=���ֽ�]
		Data [name=��浿, age=30, address=�����]
		Data [name=�ڱ浿, age=40, address=�λ��] 
		*/
		
	}//main()

}//DateIOTest2 
