import java.util.Scanner; 
class IfTest2 
{
	public static void main(String[] args) 
	{   // ���� 1��
		
		Scanner in = new Scanner(System.in);  
	    
	    int a, b, c;

		
		System.out.print("���� 1 : " ); 
		a = in.nextInt();      
		System.out.print("���� 2 : " );
		b = in.nextInt();
		System.out.print("���� 3 : " );
		c = in.nextInt();

		if(a >= b)
		{
			if(a > c) //a�� b���� ũ�� c���� ū ���
			{
				System.out.println(a);
			}
			else  // a�� b���ٴ� ũ���� c���� ���� ���
			{
				System.out.println(c);
			}
		}
		else 
		{
			if(b > c)  // b�� a���� ũ�� c���� ū ���
			{
				System.out.println(b);
			}
			else       //b�� a���� ũ���� c���� ���� ���
			{
				System.out.println(c);
			}
		}

		int max = Integer.MIN_VALUE;  // ���� ū ���� MIN_VALUE���� ������
		if(max < a)
		{
			max = a;  // a�� max���� ũ�� a�� max�� ����
		}
		if(max < b)
		{
			max = b; // b�� max���� ũ�� b�� max�� ����
		}
		if(max < c)
		{
			max = c;
		}
		System.out.println(max);
		

		// ���� 2��
		
		Scanner in = new Scanner(System.in);  
	    int time;	// �ð�
		int money;	// �޿�
		final int pay = 10000;	// �ñ�

		System.out.print("�ٹ��ð� : ");
		time = in.nextInt();

		if(time <= 50)
		{
			money = time * pay;
		}
		else
		{
			money = (int)(50 * pay + (time - 50) * pay * 1.1);

		}
		System.out.println("�޿� : " + money);
		

		// ���� 3��
		Scanner in = new Scanner(System.in);
		int y;

		System.out.print("�⵵ : " ); 
		y = in.nextInt();      
		
		if(y % 4 == 0 &&  y % 100 != 0 || y % 400 == 0)
		{
			System.out.println(y + "���� �����Դϴ�");
		}
		else
		{
			System.out.println(y + "���� ����Դϴ�");
		}



	}
}