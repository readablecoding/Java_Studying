import java.util.Scanner;
class Study_191014_1 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int a, b, c;
		double avg;
		boolean result;


		System.out.println("[ ���� �Է� ]");
		System.out.print("����1 : ");
		a = in.nextInt();
		System.out.print("����2 : ");
		b = in.nextInt();
		System.out.print("����3 : ");
		c = in.nextInt();

		avg = (double)(a + b + c) / 3;
		result = (avg >= 60.0) && (a >= 40) && (b >= 40) && (c >= 40);

		System.out.println("��� : " + avg);
		System.out.println(result ? "�հ�" : "���հ�");
		// System.out.print("���: " + result);
	}
}
