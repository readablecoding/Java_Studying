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
		����� 1000 2
		Ű���� 500 5
		���콺 300 2
		*/
	
		File file = null;
		BufferedReader inFile = null;
		String fileName = "C:\\Users\\user\\Downloads\\product.txt";
		String line;
		int amount;  
		
		//�ؽ�Ʈ ���� ����
		 try
		 {
			 inFile = new BufferedReader(new FileReader(fileName));
		 }
		 catch(FileNotFoundException e)
		 {
		 System.out.println(fileName + " ���� ���� ����");
		 }
		  
		 //�� �� ������ �о StringŸ������ ����
		 try
		 {
			 while((line = inFile.readLine()) != null) //������ ���� null�̸� while�� ����
			 {
				//���� �� ���� ��ĭ �������� �и�
				String ar[] = line.split(" ");
				 
				//��ǰ��� �ݾ�(�ܰ� * ����)�� ��� 
				amount = Integer.parseInt(ar[1]) * Integer.parseInt(ar[2]);
				System.out.println("��ǰ��:" + ar[0] +"," + " �ݾ�:" + amount);			
				 	
			 }
		  }
		  catch(IOException e)
		  {
		  	e.printStackTrace();
		  }
		  
		 //��Ʈ�� �ݱ�
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
