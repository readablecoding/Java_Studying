import java.util.Scanner;
class Study_191014_5
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int a, b, c;

		System.out.println("�ٹ� �ð��� �Է��ϼ���");
		System.out.print("�ٹ� �ð�: ");
		a = in.nextInt();
		if(a < 0)
		{
			System.out.println("�߸��� �ð��� �Է��߽��ϴ�. ���� ������ �Է��ϼ���");
		}
		else if(a <= 50)
		{
			b = a * 100000;
			System.out.println("�Ƹ�����Ʈ �޿��� " + b + "�� �Դϴ�");
		}
		else
		{
			c = a - 50;
			b = (int)(50 * 10000 + (c * 10000 * 1.1));
			System.out.println("�Ƹ�����Ʈ �޿��� " + b + "�� �Դϴ�");
		}
	}
}
