import java.util.Scanner;
class Study_191014_2 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int money;
		int m50000, m10000, m5000, m1000, m500, m100, m50, m10;

		System.out.print("�ݾ� : "); //�ݾ����� 65250���� ���� ���̴�.
		money = in.nextInt();

		m50000 = money / 50000;
		money = money % 50000;
		m10000 = money / 10000;
		money = money % 10000;
		m5000 = money / 5000;
		money = money % 5000;
		m1000 = money / 1000;
		money = money % 1000;
		m500 = money / 500;
		money = money % 500;
		m100 = money / 100;
		money = money % 100;
		m50 = money / 50;
		money = money % 50;
		m10 = money / 10;
		money = money % 10;

		System.out.println("50000�� " + m50000 + "��");
		System.out.println("10000�� " + m10000 + "��");
		System.out.println("5000�� " + m5000 + "��");
		System.out.println("1000�� " + m100 + "��");
		System.out.println("500�� " + m500 + "��");
		System.out.println("100�� " + m100 + "��");
		System.out.println("50�� " + m50 + "��");
		System.out.println("10�� " + m10 + "��");
	}
}
