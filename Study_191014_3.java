import java.util.Scanner;
class Study_191014_3
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int n;

		System.out.print("������ �Է��ϼ��� : ");
		n = in.nextInt();

		if(n >100 || n < 0)
		{
			System.out.println("�߸� �Է��߽��ϴ�.");
		}
		else if(n >= 90)
		{
			System.out.println("��");
		}
		else if(n >= 80)
		{
			System.out.println("��");
		}
		else if(n >= 70)
		{
			System.out.println("��");
		}
		else if(n >= 60)
		{
			System.out.println("��");
		}
		else 
		{
			System.out.println("��");
		}	
	}
}
