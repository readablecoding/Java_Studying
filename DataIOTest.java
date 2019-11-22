package global.sesoc.java1.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DataIOTest 
{
	public static void main(String[] args) 
	{
		//��ü ����
		Data d1 = new Data("ȫ�浿", 20, "���ֽ�"); // DateŬ������ d1�����̰�, Date��ü�� ����µ� ���ڷ� �̸�, ����, �ּ�
		Data d2 = new Data("��浿", 30, "�����");
		Data d3 = new Data("�ڱ浿", 40, "�λ��");
		
		//���� ����
		ObjectOutputStream out = null;

		//���� ��� ��Ʈ���� ���� -> ��ü ���� -> ��Ʈ�� �ݱ� 
		try 
		{
			//���Ϸ� ����ϴ� ��Ʈ�� ����
			out = new ObjectOutputStream(new FileOutputStream("data.dat")); //���� ����Ǵ� ����
			//��ü�� ����
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
}//class DataIOTest
