import java.util.Scanner; 
class LoopTest 
{
	public static void main(String[] args) 
	{   // �ݺ� ���� �� ���� �ϴ� �ܰ�
		Scanner scan = new Scanner(System.in);  
	    int n;
		int s = 0; // ��� �����ֱ� ���� 0���� �ʱ�ȭ��
		
		//for�� ���. ���� 5�� �Է¹޾� �հ�
		for(int i = 0; i < 5; i++)
		{
			n = scan.nextInt(); //
			s = s + n; //�Է��� ���ڸ� 5�� ���ϰ� �ϴ� ��
		}
		System.out.println("�հ�: " + s);	
		System.out.println(); 

		//while�� ���. ���� �ݺ� �Է¹޾� �հ�. 0 �Է��ϸ� ����
		s = 0;
		while(true)
		{
			n = scan.nextInt();
			if(n == 0)
			{
				break; // �Է� �޾� 0�� �Ǹ� 
			}
			s = s + n;
			
		}
		System.out.println("�հ�: " + s);
		System.out.println(); 

		// do ~ while���� ���. ���� �ݺ� �Է¹޾� �հ�. 0 �Է��ϸ� ����
		s = 0;
		do
		{
			n = scan.nextInt();
			s = s + n;
		}
		while (n != 0);
		System.out.println("�հ�: " + s);
		System.out.println(); 

		// 1���� 100������ Ȧ�� ���
		s = 0;
		n = 0;
		while(n <= 100)
		{
			if(n % 2 == 1)
			{
				s = s + n;
			}
			n++;
		}
		System.out.println("�հ�: " + s);
		System.out.println();
		System.out.println();
		
		// 5 x 5 ���� ������ �ϴ� ���
		n = 0;
		
		while(n < 5)
		{
			s = 0;
			while(s < 5 )
			{
				
				System.out.print(s + " ");
				s++;
			}
			System.out.println();
			n++;
		}
		System.out.println();
		

		//��ø�� while�� -> 0 1 2 3 4�� 5�� ����
		int x, y;
		x = 0; // x�� ���� ���� 0���� ����� �׽�Ʈ �غ�
		while(x < 5)
		{
			y = 0; // y�� ���� ���� 0���� ����� �׽�Ʈ �غ�
			while(y < 5)
			{
				System.out.print(y + " ");
				y++; // y�� 1���� 4���� ����ϱ� ����
			}
			System.out.println(); // 5�� �ְ� ���� �ٷ� �ű�� �뵵
			x++; // x�� 1���� 4���� ����ϱ� ����
		}
		System.out.println();

		// 1���� 25���� �����µ� 5�ٷ� ����
		int a, b;
		int cnt = 0;
		a = 0; // a�� ���� ���� 0���� ����� �׽�Ʈ �غ�
		while(a < 5)
		{
			b = 0; // b�� ���� ���� 0���� ����� �׽�Ʈ �غ�
			while(b < 5)
			{
				cnt++;
				System.out.print(cnt + " ");
				b++; // b�� 1���� 4���� ����ϱ� ����
			}
			System.out.println(); // 5�� �ְ� ���� �ٷ� �ű�� �뵵
			a++; // a�� 1���� 4���� ����ϱ� ����
		}
		System.out.println();

		// *��  5 x 5�� ���� 
		int i, j;

		i = 0;
		while(i < 5)
		{
			j = 0;
			while(j < 5)
			{
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		System.out.println("-------------");


		 /*
		 *****
		 ****
		 ***
		 **
		 *
		 ------------
		 */
		i = 0;
		while(i < 5)
		{
			j = 0;
			while(j < (5 - i))
			{
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		System.out.println("-------------");

		i = 0;
		int start = 3;
		int end = 3;
		while(i < 4)
		{
			j = 0;
			while(j < 7)
			{

				System.out.print("*");	
	
				j++;	
			}
			while(start <= 
			System.out.println();
			i++;
			start++;
			end--;
		}

	} // main
} // class