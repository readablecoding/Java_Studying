/*
[ ���� �Է� ]
����1 : 90
����2 : 80
����3 : 70

��� : 80.0
��� : true

����: 3���� ����� 60.0 �̻��̰� 40�� �̸��� ������ �ϳ��� ������ true (=�հ�)
*/


import java.util.Scanner; // Ű���� �Է� �޴� Scanner ��ü ���ڴ�.

class OpTest2 
{
	public static void main(String[] args) 
	{   Scanner in;
	    int a, b, c; //���� 3�� ����
		double avg;// �Ҽ��� �Ʒ� ����
		boolean result; // true, false �� ����

		in= new Scanner(System.in); 


		System.out.println("[ ���� �Է� ]");
		System.out.print("����1 : " ); 
		a = in.nextInt(); // nextInt�� �ϴ� ���α׷��� �����.���ڸ� �Է� �ް� a�� ����
		System.out.print("����2 : " );
		b = in.nextInt();
		System.out.print("����3 : " );
		c = in.nextInt();

        avg = (a + b + c) / 3.0; 
		//avg = (double)(a + b + c) / 3;
		result = (avg >= 60.0) && a >= 40 && (b>= 40) && (c >= 40);
		// ����� 60.0 �̻��̰� �� �����̶� 40�� �̸��̸� ����, true �Ǵ� false�� ���� 

		System.out.println("��� : " + avg); 
		System.out.println(result ? "�հ�" : "���հ�"); //boolean ���� Ȱ��
	}
}