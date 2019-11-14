package board.ui;

import java.util.ArrayList;
import java.util.Scanner;

import board.service.BoardManager;
import board.service.BoardManagerImpl;
import board.vo.Board;

/**
 * ����� ȭ�� 
 */
public class BoardUI 
{
	Scanner keyin = new Scanner(System.in);
	BoardManager manager = new BoardManagerImpl(); //BoardManagerŬ������ BoardManagerImpl ��ü�� ����
	
	/**
	 * ������
	 */
	public BoardUI() 
	{
		//BoardUI��ü�� ������ �� ���ѹݺ�.
		while (true) 
		{
			int m = menuPrint(); // menuPrint() ȣ����
			switch (m) 
			{
				case 1: this.write(); break;
				case 2: this.list(); break;
				case 3: this.read(); break;
				case 4: this.delete(); break;
				case 0: 
					System.out.println("* ���α׷��� �����մϴ�.");
					return; //  BoardUI() �����ڸ� ������ BoardMain()���� ���ϵ�. ������ �ƹ��͵� ���� ���α׷� ����
			}
		}
	}
	
	/**
	 * �޴� ���, ��ȣ �Է¹ޱ�
	 * @return �Է¹��� ��ȣ
	 */
	public int menuPrint() 
	{
		System.out.println("[ �Խ��� ]");
		System.out.println("1. �۾���");
		System.out.println("2. ��ü �ۺ���");
		System.out.println("3. ���б�");
		System.out.println("4. �ۻ���");
		System.out.println("0. ����");
		System.out.print("* ���� > ");
		
		int num = 0;
		
		while (true) // ����� �Է¹޴��� Ȯ��
		{
			num = keyin.nextInt();
			if (num < 0 || num > 4) 
			{
				System.out.print("* �ٽ� �Է��ϼ��� > ");
				continue; // while (true)�� �̵���Ŵ, �ٽ� �Է��ϰԲ�
			}
			break;
		}
		return num; // int m = menuPrint()��  �ٽ� ���ư�
	}
	
	/**
	 * �۾���
	 */
	public void write() 
	{
		System.out.println("[ �۾��� ]");
		int num;
		String id, title, contents;
		
		System.out.print("��ȣ: ");
		num = keyin.nextInt();
		keyin.nextLine();		//Enter ���� -> Scanner.nextInt �޼ҵ�� ����� �Է��� ���� ������ ���๮��(����, newline)�� �������� ����
		System.out.print("ID: ");
		id = keyin.nextLine();
		System.out.print("����: ");
		title = keyin.nextLine();
		System.out.print("����: ");
		contents = keyin.nextLine();
		
		Board b = new Board(num, id, title, contents); // Board ��ü�� ���� ����
		boolean check = manager.add(b);				// manager ��ü�� ������ ��ü ����, ����Ǹ� true
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
	 * ��ü �ۺ���
	 */
	public void list() 
	{
		System.out.println("[ ��ü �۸�� ]");
		ArrayList<Board> list = manager.listAll();
		
		for (Board b : list) 
		{
			System.out.println(b);
		}
		System.out.println("�� " + list.size() + "���� ���� �ֽ��ϴ�.");
	}
	
	/**
	 * ���б�
	 */
	public void read() 
	{
		System.out.println("[ ���б� ]");
		int n;
		Board b;
		
		System.out.print("�۹�ȣ �Է�: ");
		n = keyin.nextInt();
		
		b = manager.getBoard(n);
		if (b != null) 
		{
			System.out.println("��ȣ : " + b.getNum());
			System.out.println("�ۼ��� : " + b.getId());
			System.out.println("���� : " + b.getTitle());
			System.out.println("���� : " + b.getContents());
		}
		else {
			System.out.println("�ش� ��ȣ�� ���� �����ϴ�.");
		}
	}
	
	/**
	 * �ۻ���
	 */
	public void delete() 
	{
		System.out.println("[ �ۻ��� ]");
		int n;
		
		System.out.print("�۹�ȣ �Է�: ");
		n = keyin.nextInt(); // ���� �ޱ�
		
		if (manager.remove(n)) // manager���� �����޶�� ��ȣ�� �Ѱ���
		{
			System.out.println("�����Ǿ����ϴ�.");
		}
		else 
		{
			System.out.println("�ش� ��ȣ�� ���� �����ϴ�.");
		}
	}
}
