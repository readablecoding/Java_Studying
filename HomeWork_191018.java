import java.util.Scanner;
class HomeWork_191018 
{
	public static void main(String[] args) 
	{
		// ���� 1�� : ������ �Է¹޾� 1���� �� �������� �հ� ���ϱ�
		Scanner in = new Scanner(System.in);
		int n; // �Է� ���� ����
		int s = 0; //�հ踦 ���� ����
		System.out.println("���� 1�� : ������ �Է� �޾� 1���� �� �������� �հ� ���ϱ�");
		System.out.println("������ �Է��ϰ� ���͸� ��������. 1�̻� �Է��ؾ� �մϴ�.");
		while(true)
		{
			n = in.nextInt(); // �Է� �޴� ���� ������ n�� ����
			if(n <= 0) // n�� 0�̰ų� 0���� ������ break�� ���� while���� ����������.
			{
				System.out.println("1�̻� �Է����� �ʾ� ���α׷��� �����մϴ�."); 
				break;
			}
			s = s + n ; // s�� n���� �����Ѵ�.
		}
		System.out.println("�հ�� " + s + "�Դϴ�."); // �հ踦 ������
		System.out.println("------------------------------------------------------------");   // �� �� ���




		// ���� 2�� : 100�� ��� ����� ���
		System.out.println("���� 2��: 100�� ��� ����� ���");
		n = 2;
		System.out.print("100�� ��� ����� ");
		while(n <= 100)
		{

			if(100 % n == 0) // 100�� n�� ������ �������� 0�̸� 100�� ����� �ȴ�.
			{	
				System.out.print(n + " ");
				n++;
			}
			else
			{
				n++;
			}   
		}
		System.out.print("�Դϴ�");
		System.out.println();
		System.out.println("------------------------------------------------------------");
		

		// ���� 3�� �Է¹��� ������ n! ���ϱ�
		System.out.println("���� 3�� :  �Է¹��� ������ n! ���ϱ�");
		System.out.print("���� �Է� : ");
		n = in.nextInt();
		int m = n; // ���߿� n�� ���� �״�� �����ֱ� ���� m�� ������
		double sum = 1;
		if(m < 1 || m > 100)
		{
			System.out.println("1 ~ 100 ������ ���� �Է��ϼ���");
			return; 
		}
		while(m > 0)
		{
			sum = sum * m;
			m--;
			
		}
			System.out.println(n + "! = " + (int)sum);
			System.out.println("------------------------------------------------------------");
		

		// ���� 4�� : �Է� ���� �� ���� ������ 3�� ����̰ų� 7�� ����� ���� ����
		System.out.println("���� 4�� : �Է� ���� �� ���� ������ 3�� ����̰ų� 7�� ����� ���� ����");
		System.out.println("������ �Է����ּ���. 10������ �Էµ˴ϴ�.");
		n = 0;
		int cnt = 0;
		for(int i = 0; i < 10; i++)  // 10�������� �޴´�.
		{
			n = in.nextInt();
			if(n <= 0 )
			{	
				System.out.println("�߸� �Է��߽��ϴ�. �ٽ� �Է��ϼ���");
				n = in.nextInt();
			}
			if((n % 3 == 0) || (n % 7 == 0))
			{
				cnt++;
			}
		}
		System.out.println("3�� ����̰ų� 7�� ����� " + cnt + "�� �Դϴ�.");

		/* �޸��ϴ� �κ�
		�Է¹��� ���� ������ 1�̻��̾�� �Ѵ�. 1���� ������ ����. (�Է� ���� ���� ������) < 1 -> ����
		����� ������ cnt�� �������� �Ѵ�.
		(�Է¹��� ��) % 3 == 0 || (�Է¹��� ��) % 7 == 0
		�׷��� cnt++;
		�� ������ System.out.println("3�� ����̰ų� 7�� ����� " + cnt + "�� �Դϴ�.");
		for(int cnt = 0; (n % 3 == 0) || (n % 7 == 0); cnt++)
		*/

	} // main
} // class
