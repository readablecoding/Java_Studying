package global.sesoc.java1.exception;

//������ �ݺ� �Է¹޾� �հ�. ������ �ƴ� ���� ������ ����

import java.util.Scanner;
import java.util.InputMismatchException;

public class ExTest3 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n, s = 0;
		
		try
		{
			while(true) 
			{
				System.out.print("���� �Է� : ");
				n = scan.nextInt(); // ���� �߻� ��ġ - ������ �ƴ� �� ������ catch�� ���� while�� Ż���Ѵ�.
				if(n < 0) throw new InputMismatchException(); // InputMismatchException�� ����� catch�� ���ܸ� ó���ϰԲ� �Ѵ�.	
				s = s + n;
			}
		}
		catch(InputMismatchException e) // catch���� while���� ��������.�ű������ �Է��ϰԲ� �Ѵ�.
		{
			System.out.println("������ �Է��߽��ϴ�.");
		}
		System.out.println("�հ�: " + s);
	}//main()
}//class Extest3 
