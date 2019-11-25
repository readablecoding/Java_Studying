package workbook.address3.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import workbook.address3.vo.AddressVO;

/**
 * ȸ�������� ����, ����, �˻����ִ� ��� ��� Ŭ����
 */
public class AddressManagerImpl implements AddressManager // AddressUI���� �� ���� ���������.
{
	//�������: �ʱⰪ�� ���� null�̴�. ��ü�� �������� �ʾ����� nullpointerException
	ArrayList<AddressVO> list;				//ȸ�� ������ ������ ����Ʈ
	ObjectInputStream inFile;				//���Ϸκ��� ��ü�� ���� ��Ʈ��
	ObjectOutputStream outFile;				//���Ͽ� ��ü�� ������ ��Ʈ��
	final String filename = "address.dat";	//���ϸ� -> ������ ���� ���� ���ϰ� final�� ����
	
	public AddressManagerImpl() 
	{
		//���� ����� �� ������ �о���̰�, ������ ����Ʈ ���� -> ������ ��η� Ȯ��
		try 
		{
			inFile = new ObjectInputStream(new FileInputStream(filename)); 
			//������ ������ new FileInputStream(filename))���� ����,  new ObjectInputStream���� ���� �߻��� IOException
			list = (ArrayList<AddressVO>) inFile.readObject(); 
			//�ּ������� ArrayList���� ����. readObject()�� ���Ϸκ��� ��ü �б��ϸ� ���� ����ȯ�ȿ� ������ ���ٸ� readObject()���� EOFException
			inFile.close();
		}
		catch (Exception e) 
		{
			list = new ArrayList<AddressVO>(); //����ִ� ArrayList ����
		}
	}
	
	@Override
	public boolean addAddress(AddressVO vo) //�Ű������� AddressVOŬ������ vo�� �޴´�.
	{
		//���� ��ȣ�� ȸ���� �ִ��� Ȯ��
		if (getAddress(vo.getNum()) != null)  //vo.getNum() ���� ���� , getAddress�� ���� 
		{
			return false; //�ּҰ� �ִٴ� ���� �̹� ȸ���� �ִٴ� ���̴� add ���ϰ� false
		}
		//������ ����
		list.add(vo);
		return true; //���� ����
	}

	@Override
	public ArrayList<AddressVO> getList() 
	{
		return list; //AddressVO Ÿ���� ArrayList�� toString()�� ȣ���� �� �������� list�� ��� �� ���
	}

	@Override
	public AddressVO getAddress(int num) 
	{
		AddressVO vo = null;
		for (int i = 0; i < list.size(); i++) 
		{
			vo = list.get(i); 		//ArrayList���� i��° ���� �����ͼ�  	
			if (num == vo.getNum())	// �˻��� ��ȣ n�� ArrayList�� i��°�� ȸ����ȣ�� ������ ��
			{
				return vo; //vo�� ��� ��ü�� �ּҸ� ����
			}
		}
		return null; //�˻��� ��ȣ n�� ���� ArrayList�� i��°�� ȸ����ȣ�� ���ٸ� null�� ����
	}
	
	@Override
	public ArrayList<AddressVO> getAddress(String name) 
	{
		//�˻������ ������ ����Ʈ ����
		ArrayList<AddressVO> searchList = new ArrayList<>();
		AddressVO vo = null;
		
		for (int i = 0; i < list.size(); i++) 
		{
			vo = list.get(i);
			//�̸��� ���� ȸ���� ������ �� ����Ʈ�� �߰�
			if (name.equals(vo.getName())) //�Է¹��� �̸��� AddressVOŬ������ ȸ����ȣ �̸��� ������?
			{
				searchList.add(vo); 
			}
		}
		return searchList;
	}

	@Override
	public boolean deleteAddress(int num) 
	{
		AddressVO vo = null;
		
		for (int i = 0; i < list.size(); i++) 
		{
			vo = list.get(i);
			//���޹��� ��ȣ�� ȸ�������� ������ ����
			if (num == vo.getNum()) 
			{
				list.remove(i);
				return true;
			}
		}
		//������ false����
		return false;
	}

	@Override
	public void saveFile() 
	{
		try 
		{
			//���� ArrayList�� ���Ͽ� ����
			outFile = new ObjectOutputStream(new FileOutputStream(filename)); //new ObjectOutputStream �ϸ� ������ �������
			outFile.writeObject(list);	//���� ���¸� ���� ArrayList�� ���Ͽ� ����. ArrayList�� ����ȭ�� �� ��°�� �ѹ濡 �����.
			outFile.close();			//�ּ� ������ ���� ArrayList�� ����� ���·� ��Ʈ�� ����
			System.out.println("������ ����Ǿ����ϴ�.");
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
