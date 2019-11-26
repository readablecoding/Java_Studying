package board.ui;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import board.service.BoardManagerImpl;
import board.vo.Board;

public class BoardUI 
{
	//��������� ���� �� ���� ����� ����
	Scanner keyin = new Scanner(System.in);
	BoardManagerImpl manager = new BoardManagerImpl(); //BoardManagerImpl() ������ ����
	
	//������
	public BoardUI()
	{
		//BoardMain Ŭ�������� �����ϸ� �ݺ����� ����
		//�Ʒ� �ݺ����� ����Ǹ� main()�޼ҵ�� ���ϵǸ� ���α׷� ����
		while(true)
		{
			int m = mainMenu();
			switch(m)
			{
			case 1:
				write(); //���� Ŭ������ �޼ҵ��� write()�� ���޵Ǵ� ���� ����. �ڱ� �� �� �ϰ� ���ƿ´�.
				break;		
			case 2:
				list();
				break;
			case 3:
				read();
				break;		
			case 4:
				delete();
				break;		
			case 0:
				end();
				return; //���α׷��� ������ ����
			}
		}
	}
	
	//���� �޴� ����ϰ� ��ȣ �Է¹޾� ����
	public int mainMenu()
	{
		System.out.println("[�Խ���]");
		System.out.println("1. �۾���");
		System.out.println("2. ��ü �ۺ���");
		System.out.println("3. �۹�ȣ�� �б�");
		System.out.println("4. ����");
		System.out.println("0. ����");
		
		int n = 0;
		while(true)
		{	
			try
			{	System.out.print("��ȣ���� > ");		
				n = keyin.nextInt();
				if(n < 0 || n > 4) 
				{
					continue;
				}
			}
			catch(InputMismatchException e)
			{
				keyin.nextLine();
				continue;
			}
			break;	
		}
		return n;	
	}
	

	//�۾���
	public void write()
	{
		System.out.println("[�۾���]");
		int num;
		String name, title, contents;
		
		//4������ �Է¹޾� add �޼ҵ�� Board ��ü�� ����
		try
		{
			System.out.print("��ȣ: ");
			num = keyin.nextInt();
			keyin.nextLine();
			System.out.print("�̸�: ");
			name = keyin.nextLine();
			System.out.print("����: ");
			title = keyin.nextLine();
			System.out.print("����: ");
			contents = keyin.nextLine();
		}
		catch(Exception e)
		{
			System.out.println("�Է��� �߸��Ǿ����ϴ�.");
			keyin.nextLine();
			return;
		}
		
		Board b = new Board(num, name, title, contents);
		boolean check = manager.add(b);
		if(check)
		{
			System.out.println("����Ǿ����ϴ�.");
		}
		else
		{
			System.out.println("���� �����Ͽ����ϴ�.");
		}
	
	}
	
	//�� ��ü����
	public void list()
	{
		System.out.println("[��ü �� ����]");
		ArrayList<Board> list = manager.listAll();
		for(Board b : list)
		{
			System.out.print("[" + b.getNum() + "] ");
			System.out.print("�ۼ���: " + b.getName() +", ");
			System.out.print("����: " + b.getTitle() + ", ");
			System.out.println("����: " + b.getContents());
		}
		System.out.println("�� " + list.size() +"���� ���� �ֽ��ϴ�.");
	}
	
	//�� �б�
	public void read()
	{
		System.out.println("[�� ��ȣ�� �б�]");
		int n;
		Board b;
		while(true)
		{
			try
			{
				System.out.print("ã�� ��ȣ: ");
				n = keyin.nextInt();
			}
			catch(Exception e)
			{
				keyin.nextLine();
				continue;				
			}
			break;
		}
		b = manager.getBoard(n);
		if(b == null)
		{
			System.out.println("���� �������� �ʽ��ϴ�.");	
		}
		else
		{
			System.out.println(b);
		}	
	}
	
	//�� ����
	public void delete()
	{
		System.out.println("[����]");
		int n;
		while(true)
		{
			try
			{
				System.out.print("������ ��ȣ: ");
				n = keyin.nextInt();
			}	
			catch(Exception e)
			{	
				keyin.nextLine();
				continue;
			}
			break;
		}
		if(manager.remove(n))
		{
			System.out.println("���� �Ǿ����ϴ�.");
		}
		else
		{
			System.out.println("���� �������� �ʽ��ϴ�.");
		}
	}
	
	//���� ���� �� ����
	public void end()
	{
		manager.saveFile();
		System.out.println("���α׷��� �����մϴ�.");
	}
	
	
}//class BoardUI
