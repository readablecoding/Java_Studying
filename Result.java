import java.util.Scanner;

class Result
 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int a, b, c;
		double d;
        boolean e;
		//String e;


        System.out.println("[ ���� �Է� ]");
		System.out.print("����1 : " ); // ù��° ���� ���� �Է�
		a = in.nextInt();       
		System.out.print("����2 : " ); // �ι�° ���� ���� �Է�
		b = in.nextInt();
		System.out.print("����3 : " ); // ����° ���� ���� �Է�
		c = in.nextInt();

		d = (a + b + c) / 3; // ��� ���ϱ�
		e = (d > 60.0) & (a > 40) & (b > 40) & (c > 40); 
		//e = (d > 60.0 & a > 40 & b > 40 & c > 40) ? "True" : "False";
		//����� 60.0 �̻��̰� 40�� �̸��� ������ �ϳ��� ������ true(=�հ�)
		System.out.println("��� : " + d);
		System.out.println("��� : " + e);

		
	}
}
