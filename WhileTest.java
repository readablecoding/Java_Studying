class WhileTest 
{
	public static void main(String[] args) 
	{
		int i; // ������ ��Ȱ�� �ϱ� ���� �̸� ������
		
		// for�� ���
		for(i = 0; i < 5; i++)  // �ʱ��(���� ���� ��), ����(true���� �ѹ��� ������), ������ 
		{
			System.out.println("Hello World!"); // hello world 5�� �ݺ�(i�� 0���� 4���� �ݺ�)
		} //for ���� i
		System.out.println();

		// while�� ���
		i = 0;
		while(i < 5)
		{
			System.out.println("Hello World!");
			i++;
		}
		System.out.println();

		// do ~ while�� ���
		i = 0; 
		do
		{
			System.out.println("Hello World!");
			i++;
		}
		while (i < 5);
		System.out.println();

		//while�� ��� �ǰ� �ϴ� ��� -> ���ǿ� true�� ���� ��� break�� ���� ���� ���
		i = 0;
		while(true)
		{
			System.out.println("Hello World!");
			if(i >= 4)
			{
				break; // 5�� �ݺ��ϰ� �ϴ� ������� break�� �־���. ���� �ݺ����� ����
			}
			i++;
		}
		System.out.println();


	} // main 
} // class
