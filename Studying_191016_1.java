class Studying_191016_1 
{
	public static void main(String[] args) 
	{
		//0 1 2 3 4
		for(int i = 0; i < 5; i++)
		{
			System.out.print(i + " ");
			
		}
		System.out.println();

		// 1 2 3 4 5
		for(int i = 1; i <= 5; i++)
		{
			System.out.print(i + " ");
			
		}
		System.out.println();

		// 5 4 3 2 1
		for(int i = 5; i > 0; i--)
		{
			System.out.print(i + " ");
		}
		System.out.println();

		// 10 20 30 40 50
		for(int i = 10; i <= 50; i += 10)
		{
			System.out.print(i + " ");
		}
		System.out.println();

		/// 1 3 5 7 9 -> 1��° ���
		for(int i = 1; i <= 10; i+=2)
		{
			System.out.print(i + " ");
		}
		System.out.println();
		
		/// 1 3 5 7 9 -> 2��° ���
		for(int i = 1; i < 10; i++)
		{
			if(i % 2 == 1)
			{
				System.out.print(i + " ");
			}
		}
		System.out.println();

		//1 2 3 4 6 7 8 9 -> 1��° ���
		for(int i = 1; i < 10; i++)
		{
			if(i != 5)
			{
				System.out.print(i + " ");
			}
		}
		System.out.println();

		//1 2 3 4 6 7 8 9 -> 1��° ���
		for(int i = 1; i < 10; i++)
		{
			if(i == 5)
			{
				continue;
			}
			System.out.print(i + " ");
		}
		System.out.println();
		
		//1 10 100 1000 10000
		for(int i = 1; i <= 10000; i *=10)
		{
			System.out.print(i + " ");
		}
		System.out.println();

		// continue, break, return, System.exit(0); Ȱ���
		for(int i = 1; i < 10; i++)
		{
			if(i == 5)
			{
				continue;			// �������� �ʰ� �ٷ� ���ǹ����� ���� ���� ���� ����
				//break;			// �ݺ����� �����.
				//return;			// �޼��带 �����Ѵ�.
				//System.exit(0);	// ���α׷��� �����Ѵ�.
			}
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();

		// 1+2+3+4+5+6+7+8+9+10�� �հ�
		int sum = 0;
		for(int i = 1; i <= 10; i++)
		{
			sum = sum + i;
		}
		System.out.println("�հ� : " + sum);

		// 1 ~ 100 �߿��� Ȧ���� �հ� -> 1��° ���
		sum = 0;
		for(int i = 1; i <= 100; i+=2)
		{
			sum = sum + i;
		}
		System.out.println("�հ� : " + sum);

		// 1 ~ 100 �߿��� Ȧ���� �հ� -> 2��° ���
		sum = 0;
		for(int i = 1; i <= 100; i++)
		{	
			if(i % 2 == 1)
			{
				sum = sum + i;
			}
		}
		System.out.println("�հ� : " + sum);
		
		// 1 ~ 100 �߿��� Ȧ���� �հ� -> 3��° ���
		sum = 0;
		for(int i = 1; i <= 100; i++)
		{	
			if(i % 2 == 0)
			{
				continue;
			}
			sum = sum + i;
		}
		System.out.println("�հ� : " + sum);


		// 1 ~ 100 �߿��� 3�� ����̰ų� 5�� ����� ���� �հ� -> 1��° ���
		sum = 0;
		for(int i = 1; i <= 100; i++)
		{
			if(i % 3 == 0 || i % 5 == 0)
			{
				sum = sum + i;
			}
		}
		System.out.println("�հ� : " + sum);

		// 1 ~ 100 �߿��� 3�� ����̰ų� 5�� ����� ���� �հ� -> 1��° ���
		sum = 0;
		for(int i = 1; i <= 100; i++)
		{
			if(i % 3 != 0 && i % 5 != 0)
			{
				continue;
			}
				sum = sum + i;
		}
		System.out.println("�հ� : " + sum);

		// 1���� �������� �հ踦 ���ϴµ�, �հ谡 4000�� �Ѵ� ������ ���ڴ�? -> 1��° ���
		sum = 0;
		for(int i = 1; ; i++)
		{
			sum = sum + i;
			if(sum > 4000)
			{
				System.out.println("4000�� ���� ���� ���ڴ� " + i + "�Դϴ�.");
				break;
			}
		}
		System.out.println("�հ� : " + sum);

		// 1���� �������� �հ踦 ���ϴµ�, �հ谡 4000�� �Ѵ� ������ ���ڴ�? -> 2��° ���
		int n = 1;
		sum = 0;
		for(; sum < 4000; n++)
		{
			sum = sum + n;
		}
		System.out.println(n-1 + "��° �����Դϴ�.");
		System.out.println();

		// 22���� 122���� �����ڵ� ǥ ���, �� �ٿ� 5������. ��) 22: ?, 23: ?, 24 : ?
		int cnt = 0; // ���� �����ֱ� ���� �뵵�� ���� cnt�� ������
		for(int ch = 22; ch <= 122; ch++)
		{
			System.out.print(ch + ": " + (char)ch + ", "); 
			//ū �ڷ����� ���� �ڷ������� �ٲ��ִ� ��������ȯ�� �����Ѵ�. (char)ch -> int(4����Ʈ)���� char(2����Ʈ)��
			cnt++;
			if(cnt % 5 == 0) //5������ �� �ٷ� ��Ÿ���� ���� 5�� ��������� �˾ƺ���.
			{
				System.out.println(); // 5�� ������ �����ٷ� �ڸ� �ű�
			}
		}
		System.out.println();
		System.out.println();


		// 0���� 150���� �����ڵ� ǥ ���, �� �ٿ� 4������. ��) 0: ?, 1: ?, 2 : ?
		int cnt1 = 0;
		for(int num = 0; num <= 150; num++)
		{
			System.out.print(num + ": " + (char)num + ", "); // ���ڿ� �ش� �����ڵ� �� ������
			cnt1++;
			if(cnt1 % 4 == 0)		// 4���� �� �ٿ� �־�� �ϹǷ� �������� 0�� �Ǹ� ���� �ٷ� �̵�			
			{	
				System.out.println();
			}
		}
		System.out.println();
		int line = cnt1 / 4;
		System.out.println("�� " + line + "���� �ڷᰡ ���Խ��ϴ�."); // �ڷ� ���̸� ������
		
	}
}
