package myPractice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DataIOTest_191122 
{

	public static void main(String[] args) 
	{
		//��ü ����
		Data_191122 d1 = new Data_191122("ȫ�浿", 20, "���ֽ�");
		Data_191122 d2 = new Data_191122("��浿", 30, "�����");
		Data_191122 d3 = new Data_191122("�ڱ浿", 40, "�λ��");
		
		//���� ����
		ObjectOutputStream out = null;
		
		//���� ��� ��Ʈ���� ���� -> ��ü ���� -> ��Ʈ�� �ݱ�
		try 
		{
			//���Ϸ� ����ϴ� ��Ʈ�� ����
			out = new ObjectOutputStream(new FileOutputStream("data2.dat"));
			//��ü ����
			out.writeObject(d1);
			out.writeObject(d2);
			out.writeObject(d3);
			//��Ʈ�� �ݱ�
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
