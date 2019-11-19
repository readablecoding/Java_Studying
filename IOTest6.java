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
		����� 1000 2
		Ű���� 500 5
		���콺 300 2
		*/
		
		File file = null;
		BufferedReader inFile = null;
		String fileName = "C:\\Users\\user\\Downloads\\product.txt";
		
		String s = null; // BufferedReader���� 1�� �޴� ��	
		String ar[] = new String[3]; // split �޴� ��	
		int sum = 1; // ������
		
		//ArrayList<String> list = new ArrayList<String>();
		//String array[] = list.toArray(new String[list.size()]);
	
		
		
		//�ؽ�Ʈ ���� ���� -> FileReader	
		//�� �� ������ �о String Ÿ������ ���� -> BufferedReader
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
				System.out.println(ar[0] + " �հ�� " + sum + "�Դϴ�.");
				sum = 1;
			}		
			inFile.close();  //��Ʈ�� �ݱ�
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
		
		
	
		
		//���� ������ ��ĭ �������� �и� -> split
		
		
	
		
		//��ǰ��� �ݾ�(�ܰ�*����)�� ��� -> int�� ��ȯ �� ���
		// �ܰ� -> Integer.parseInt("����");
		// ���� -> Integer.parseInt("����");
		// �ܰ� * ���� ->
		// System.out.println(�ܰ� * ����);
		
		
		//��Ʈ�� �ݱ�
		
		
		
	}//main()

}//class IOTest6 
