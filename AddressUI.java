package ui;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

import service.AddressManager;
import service.AddressManagerImpl;
import vo.Address;


/**
 * ����� ȭ��
 */
public class AddressUI 
{
	Scanner keyin = new Scanner(System.in);
	AddressManager manager = new AddressManagerImpl();
	/**
	 * ������
	 */
	public AddressUI() 
	{
		int m;
		//AddressUI�� ������ �� ���ѹݺ�
		while(true)
		{
			try
			{
				m = menuPrint();
			}
			catch(InputMismatchException e)
			{
				System.out.println("���� �Է����� �ʾ� ���� �߻�. ���� �Է� ��Ź");
				keyin.nextLine();
				continue;
			}
			switch(m)
			{	case 1:
					this.write();
					break;
				case 2:
					this.list();
					break;
				case 3:
					this.read();
					break;
				case 0:
					System.out.println("* ���α׷��� �����մϴ�.");
					return;
			}
			
		}//while
		
	}//AddressUI()
	/**
	 * �޴� ���, ��ȣ �Է� �ޱ�
	 * @return �Է¹��� ��ȣ
	 */
	public int menuPrint()
	{
		System.out.println("[ȸ�� �ּҷ�]");
		System.out.println("1.ȸ�� ���� ���");
		System.out.println("2.��ü ȸ�� ����");
		System.out.println("3.ȸ�� �˻�");
		System.out.println("0.���α׷� ����");
		System.out.print("* ���� > ");
		int num = 0;
		while(true)
		{
			num = keyin.nextInt();
			if(num < 0 || num > 3)
			{
				System.out.print("* �ٽ� �Է��ϼ��� > ");
				continue;
			}
			break;
		}	
		return num;
	}//menuprint()
	
	/**
	 * �� ����
	 */
	public void write()
	{
		System.out.println("[ȸ�� ���� ���]");
		int num;
		String name, telenum, adrs;
		
		while(true)
		{
			try
			{
				System.out.print("ȸ����ȣ : ");
				num = keyin.nextInt();
				keyin.nextLine();
				System.out.print("�̸� : ");
				name = keyin.nextLine();
				System.out.print("��ȭ��ȣ : ");
				telenum= keyin.nextLine();
				System.out.print("�ּ� : ");
				adrs = keyin.nextLine();
			}
			catch(InputMismatchException e)
			{
				System.out.println("��Ȯ�ϰ� ������ �����ּ���.");
				keyin.nextLine();
				continue;
			}
			break;
		}
		
		Address a = new Address(num, name, telenum, adrs);
		boolean check = manager.add(a);
		if(check)
		{
			System.out.println("����Ǿ����ϴ�.");
		}
		else
		{
			System.out.println("���� �����߽��ϴ�.");
		}
			
		
	}//write()
	
	/**
	 * ��ü �� ����
	 */
	public void list()
	{
		System.out.println("[��ü ȸ�� ����]");
		ArrayList<Address> list = manager.listAll();
		
		for(Address a : list)
		{
			System.out.println(a);
		}
		System.out.println("��" + list.size() + "���� ���� �ֽ��ϴ�.");	
	}//list()
	
	
	/**
	 * �� �б�
	 */
	public void read()
	{
		System.out.println("[ȸ�� �˻�]");
		System.out.println("1.��ȣ�� �˻�");
		System.out.println("2.�̸����� �˻�");
		
		int num, numSearch;
		String nameSearch;
		Address a;
		
		while(true)
		{	
			try
			{
				System.out.print("* ���� > ");
				num = keyin.nextInt();
				if(num < 1 || num > 2) 
				{
					throw new InputMismatchException();
				}
			}
			catch(InputMismatchException e)
			{
				System.out.println("����� �Է����� �ʾҽ��ϴ�. �ٽ� �Է��ϼ���.");
				keyin.nextLine();
				continue;
			}
			break;
		}//while	
		
		if(num == 1)
		{
			while(true)
			{
				System.out.print("�˻��� ��ȣ: ");	
				try
				{
					numSearch = keyin.nextInt();
					
				}
				catch(InputMismatchException e)
				{
					System.out.println("���ڸ� �Է����� �ʾҽ��ϴ�. ���ڸ� �ٽ� �Է��ϼ���.");
					keyin.nextLine();
					continue;
				}
				a = manager.getAddress(numSearch);
				if(a != null)
				{
					System.out.println("��� " + a.getNum() + " " 
					+ a.getName() + " " + a.getTeleNum() + " " + a.getAdrs());
				}
				else
				{
					System.out.println("�ش� ��ȣ�� ���� �����ϴ�.");
				}
				break;
			}//while
		}//if
		
		if(num == 2)
		{	
			while(true)
			{	
				keyin.nextLine();
				System.out.print("�˻��� �̸�: ");
				try
				{
					nameSearch = keyin.nextLine();
				}
				catch(InputMismatchException e)
				{
					System.out.println("���ڸ� �Է����� �ʾҽ��ϴ�. ���ڸ� �Է��ϼ���.");
					keyin.nextLine();
					continue;
				}
				a = manager.getAddress(nameSearch);
				if(a != null)
				{
					System.out.println("��� " + a.getNum() + " " 
					+ a.getName() + " " + a.getTeleNum() + " " + a.getAdrs());
				}
				else
				{
					System.out.println("�ش� �̸��� ���� �����ϴ�.");
				}
				break;
			}//while	
		}//if		
	}//read()		
}//class AddressUI
