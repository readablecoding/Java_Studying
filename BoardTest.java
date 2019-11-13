package global.sesoc.java1.oop191113;
import java.util.ArrayList;
import java.util.Scanner;
public class BoardTest 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		ArrayList<Board> list = new ArrayList<>();
		list.add(new Board(1, "aaa", "������1", "�۳���1"));
		list.add(new Board(2, "bbb", "������2", "�۳���2"));
		list.add(new Board(3, "aaa", "������3", "�۳���3"));
		System.out.println(list); 	// toString()�޼��尡 �ʿ���
		
		System.out.print("���� �� ��ȣ : ");
		int n = scan.nextInt();
		
		//�ش� ��ȣ�� �� �ϳ��� ���
		boolean check = true;
		for(int i = 0; i < list.size(); i++)
		{
			Board b = list.get(i);
			if(n == b.getNum())
			{
				System.out.println(b);
				check = false;
			}
			
		}//for��
		if(check)
		{
			System.out.println("�ش� ��ȣ�� ���� �����ϴ�.");
		}

	}//main()

}//class BoardTest
