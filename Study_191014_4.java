import java.util.Scanner;
class Study_191014_4 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int n1, n2, n3;
		System.out.print("���� �Է� 1: ");
		n1 = in.nextInt();
		System.out.print("���� �Է� 2: ");
		n2 = in.nextInt();
		System.out.print("���� �Է� 3: ");
		n3 = in.nextInt();

		if(n1 > n2)
		{
			if(n1 > n3)
			{
				System.out.println("���� ū ���� " + n1 + " �Դϴ�");

			}
			else

			{
				System.out.println("���� ū ���� " + n3 + " �Դϴ�");
			}
		}
		else
		{
			if(n2 > n3)
			{
				System.out.println("���� ū ���� " + n2 + " �Դϴ�");
			}
			else
			{
				System.out.println("���� ū ���� " + n3 + " �Դϴ�");
			}
		}
	}
}
