package workbook.address3.ui;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import workbook.address3.service.AddressManager;
import workbook.address3.service.AddressManagerImpl;
import workbook.address3.vo.AddressVO;

/**
 * ����� ȭ�� 
 */
public class AddressUI 
{	//AddressUI ��ü ������ ��������� �κ�
	Scanner keyin = new Scanner(System.in);
	AddressManagerImpl manager = new AddressManagerImpl(); //manager��ü ����, ���⸦ �ϰ� public AddressUI()�� �̵�
	
	/**
	 * ������
	 */
	public AddressUI() 
	{
		//AddressUI��ü�� ������ �� ���ѹݺ�.
		while (true) 
		{
			int m = menuPrint();
			switch (m) 
			{
				case 1: 
					write(); 
					break;
				case 2: 
					list(); 
					break;
				case 3: 
					search(); 
					break;
				case 4: 
					delete(); 
					break;
				case 0: 
					end(); //����Ŭ������ end()�� �̵�
					return; //������
			}
		}
	}
	
	/**
	 * �޴� ���, ��ȣ �Է¹ޱ�
	 * @return �Է¹��� ��ȣ
	 */
	public int menuPrint() 
	{
		System.out.println("[ ȸ�� �ּҷ� ]");
		System.out.println("1. ȸ�� ���� ���");
		System.out.println("2. ��ü ȸ�� ����");
		System.out.println("3. ȸ�� �˻�");
		System.out.println("4. ȸ�� ���� ����");
		System.out.println("0. ����");
		System.out.print("* ���� > ");
		
		int num = 0;
		
		while (true) 
		{
			try 
			{
				num = keyin.nextInt();
			}
			catch (InputMismatchException e) //���ڰ� �ƴ� ��� ���� �޽����� �Բ� continue�� �ݺ��� �������� �̵�
			{
				System.out.print("* �ٽ� �Է��ϼ��� > ");
				continue;
			}
			if (num < 0 || num > 4) //�޴������� ���� �ʴ� ���ڶ�� ���� �޽����� �Բ� continue�� �ݺ��� �������� �̵�
			{
				System.out.print("* �ٽ� �Է��ϼ��� > ");
				continue;
			}
			break;
		}
		return num;
	}
	
	/**
	 * ȸ�� ���� ���
	 */
	public void write() 
	{
		System.out.println("[ ȸ�� ���� ��� ]");
		int num;
		String name, phone, address;
		
		try 
		{
			System.out.print("ȸ����ȣ: ");
			num = keyin.nextInt();	//���� �Է��ϰ� ���� �Էµ�, ���ڶ�� ���� �߻�		
			keyin.nextLine();		//Enter ����
			System.out.print("�̸�: ");
			name = keyin.nextLine();
			System.out.print("��ȭ��ȣ: ");
			phone = keyin.nextLine();
			System.out.print("�ּ�: ");
			address = keyin.nextLine();
		}
		catch (Exception e) 
		{
			System.out.println("�Է��� �߸��Ǿ����ϴ�.");
			keyin.nextLine(); //���� ����.
			return;
		}
		
		AddressVO vo = new AddressVO(num, name, phone, address); //AddressVO ��ü �ȿ� ���� ���.
		//UI������ ���� ������ ó�� �����ϸ� �ȵ�. �����͸� ó���ϴ� ������ �����ϱ�.
		boolean check = manager.addAddress(vo);
		if (check) 
		{
			System.out.println("����Ǿ����ϴ�.");
		}
		else 
		{
			System.out.println("���� �����߽��ϴ�.");
		}
	}

	/**
	 * ��ü ȸ�� ����
	 */
	public void list() 
	{
		System.out.println("[ ��ü ȸ�� ��� ]");
		ArrayList<AddressVO> list = manager.getList();
		
		for (AddressVO vo : list) // ���� for�� ->list ���̸�ŭ�� AddressVO Ŭ������ vo ������ list�� ������ �� ó��
		{
			System.out.println(vo);
		}
		System.out.println("�� " + list.size() + "���� ȸ���� �ֽ��ϴ�.");
	}
	
	/**
	 * ȸ�� �˻�
	 */
	public void search() 
	{
		System.out.println("[ ȸ���˻� ]");
		int n;
		ArrayList<AddressVO> list;
		AddressVO b;
		String name;
		
		System.out.println("1. ��ȣ �˻�");
		System.out.println("2. �̸� �˻�");
		while (true) 
		{
			try 
			{
				System.out.print("���� > ");
				n = keyin.nextInt(); //���� �߻� ��ġ
				if (n < 1 || n > 2) 
				{
					continue;
				}
			}
			catch (Exception e) //���ڰ� �ƴ� ���°� �ԷµǸ� ���ܰ� �߻��ؼ� ����� �´�.
			{
				keyin.nextLine();	//���۸� ����.
				continue;			//�ٽ� �Է��� ���� continue�� while�� �������� ���ư�
			}
			break;				//����� �ԷµǸ� break�� while�� Ż��
		}
	
		if (n == 1) 
		{
			while (true) 
			{
				try 
				{
					System.out.print("�˻��� ��ȣ : ");
					n = keyin.nextInt();
				}
				catch (Exception e) 
				{
					keyin.nextLine();
					continue;
				}
				break;
			}
			b = manager.getAddress(n);	//
			if (b == null) 
			{
				System.out.println("�ش� ��ȣ�� �����ϴ�.");
			}
			else 
			{
				System.out.println(b);
			}
		}
		else if (n == 2) 
		{
			System.out.print("�˻��� �̸� : ");
			name = keyin.next();
			list = manager.getAddress(name);
			if (list == null || list.size() == 0) 
			{
				System.out.println("�ش� �̸��� �����ϴ�.");
			}
			else 
			{
				for (AddressVO vo : list) 
				{
					System.out.println(vo);
				}
			}
		}
	}

	/**
	 * ȸ������
	 */
	public void delete() 
	{
		System.out.println("[ ȸ�� ���� ]");
		int n;
		
		while (true) 
		{
			try 
			{
				System.out.print("������ ȸ����ȣ �Է�: ");
				n = keyin.nextInt();
			}
			catch (Exception e) 
			{
				keyin.nextLine(); 
				continue;
			}
			break;
		}
		
		if (manager.deleteAddress(n)) 
		{
			System.out.println("�����Ǿ����ϴ�.");
		}
		else 
		{
			System.out.println("�ش� ��ȣ�� ȸ���� �����ϴ�.");
		}
	}
	
	/**
	 * ���� �����ϰ� ����
	 */
	public void end() 
	{
		manager.saveFile(); //manager�� saveFile() ȣ��
		System.out.println("* ���α׷��� �����մϴ�.");
		return;
	}
}
