package global.sesoc.java1.exception;

import java.util.InputMismatchException;
import java.util.Scanner;
public class ExTest2 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n, s = 0;
		
	
		while(true)
		{
			System.out.print("���� �Է�: ");
			try
			{
				n = scan.nextInt(); // �߸��� �� �ִ� �κ��� try~catch�� ���Ѵ�.	
			}
			catch(InputMismatchException ex)
			{
				System.out.println("�Է� ����. �ٽ� �Է��ϼ���.");
				scan.nextLine(); // �߸� �Է��� �� �����
				continue; // �ݺ����� �������� �̵�->while(true)�� �̵�
			}
			if(n == 0)
			{
				break; // �����ڴٴ� ��ȣ -> 0��� a�� �Է��ϸ� �ƹ��͵� ���ϰ� ���������.
			}
			s = s + n;	
				
		}
		System.out.println("�հ�: " + s);
		
	}

}
