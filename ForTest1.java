class ForTest1 
{
	public static void main(String[] args) 
	{	
		//0 1 2 3 4
		for(int i = 0; i < 5; i++) // for(�ʱⰪ ; ���ǽ�; ������) { ���� }
		{
			System.out.print(i + " ");  // �� ĭ ��� �����.
		}
		System.out.println();			// �ٸ� �� �� �ٲٴ� ��

		// 1 2 3 4 5
		for(int i = 1; i < 6; i++) // i�� 6���� �۾ƾ� ��� ����
		{
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 5 4 3 2 1
		for(int i = 5; i > 0; i--) //i�� 1�� �����ϰ� ��
		{
			System.out.print(i + " ");
		}
		System.out.println();


		// 10 20 30 40 50
		for(int i = 10; i <= 50; i += 10) //i�� 10�� ���� ���� i�� �־� 50������ ������ ��
		{
			System.out.print(i + " ");
		}
		System.out.println();

		// 1 3 5 7 9
		for(int i = 1; i < 10; i += 2)
		{
			System.out.print(i + " ");
		}
		System.out.println();

			/*
			for(int i = 1; i < 10; i++) 
			{	
				if(i % 2 == 1) //i���� 2�� ���� �������� 1�� Ȧ���� ��µǰ� ��
				{
					System.out.print(i + " ");
				}
			/*
			

		//1 2 3 4 6 7 8 9
		
		for(int i = 1; i < 10; i++) 
		{
			if( i != 5)
			{
			System.out.print(i + " ");
			}
		}
		System.out.println();
			
			/*
			for(int i = 1; i < 10; i++)
			{
				if(i % 5 != 0) //i�� 5�� ����̸� ��� �ȵǰ� ��
				{
				System.out.print(i + " ");
				}
			}	
			System.out.println();
			*/
		
		//1 10 100 1000 10000
		for(int i = 1; i <= 10000; i *= 10) // i�� 10���� ���� ���� i�� �־� ���� 10000 ���ϰ� ������ ��
		{
			System.out.print(i + " ");
		}
		System.out.println();
		

		// continue, break, return, System.exit(0); Ȱ���

		for(int i = 0; i <= 10; i++)
		{
			if(i == 5)
			{
				continue;
				//break;
				//return;
				//System.exit(0);;   
				//continue�� 5�� �ǳʶڰ� ������ ����, break�� 4������ �����ϰ� for�� ���, return�� 4������ �����ϰ� �޼ҵ� ����, System.exit(0);�� 4���� �����ϰ� ���α׷� ����
			}

			System.out.print(i + " ");
		}
		System.out.println(" ");
	}
}
		


