class ForTest2 
{
	public static void main(String[] args) 
	{
		// 1+2+3+4+5+6+7+8+9+10
		int sum = 0; //�հ踦 ������ ������ for�� ���� �̸� ������
		for(int i = 1; i <= 10; i++)
		{
			sum = sum + i; //ó�� sum�� ���� i�� ���� ���ϰ� �װ��� �ٽ� sum�� �ִ´�.
		}
		System.out.println("1 ~ 10 �հ� : " + sum);	

		
		
		
		// 1 ~ 100 �߿��� Ȧ���� �հ�
		sum = 0; // sum = 0; -> ������ �ٽ� ���� �ʹٸ� �̷��� ǥ���Ѵ�
		for(int i = 1; i <= 100; i++)
		{
			if(i % 2 == 1)
			{
				sum = sum + i;
			}
		}
		System.out.println("1 ~ 100 �߿��� Ȧ���� �հ� : " + sum);
			
		
		sum = 0;
		for(int i = 1; i <= 100; i += 2) //���������� 2�� ����.
		{
			sum = sum + i;
		}
		System.out.println("1 ~ 100 �߿��� Ȧ���� �հ� : " + sum);



		// 1 ~ 100 �߿��� 3�� ����̰ų� 5�� ����� ���� �հ�
		sum = 0;
		for(int i = 1; i <= 100; i++)
		{
			if(i % 3 == 0 || i % 5 == 0) 
			{
				sum = sum + i;
			}
		}
		System.out.println("�հ� : " + sum);

		// 1���� �������� �հ踦 ���ϴµ�, �հ谡 4000�� �Ѵ� ������ ���ڴ�?
		sum = 0;
		for(int i = 1; ; i++)  
		{
			sum = sum + i;
			if(sum > 4000)
			{
				System.out.println("1���� �������� �հ踦 ���ϴµ�, �հ谡 4000�� �Ѵ� ������ ���� : " + i);
				break;
			}						
		}
		
		sum = 0;
		int i = 1; // main ���� ������ �ӹ����� �ȴ�.
		for(; sum < 4000 ; i++)  
		{
			sum = sum + i;
		}
		System.out.println("1~ " + (i-1) + "������ �հ� : "  + sum);
		
				
		// 22���� 122���� �����ڵ� ǥ ���, �� �ٿ� 5������. ��:  22: ?, 23: ?, 24 : ?
		
		
		
		int cnt = 0; //5�� ������ �� 1�� ���� ���� ǥ���ϱ� ����
		for(int ch =22; ch <= 122; ch++)  //ch�� ���ڸ� ����
		{
			System.out.print(ch + " : " + (char)ch + "\t");     //int�� ch�� char�� ǥ��,  \t�� ������ ��ĭ ��� ��
			cnt++;
			if(cnt % 5 == 0)
			{
				System.out.println();
			}	
		}
		
		/*
		int cnt = 0; 
		for(int ch = 0; ch <= 100; ch++)  
		{
			System.out.print(ch + " : " + (char)ch + "\t");     
			cnt++;
			if(cnt % 5 == 0)
			{
				System.out.println();   
			}	
		}
		*/
	}
}
	


