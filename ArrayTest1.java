class ArrayTest1 
{
	public static void main(String[] args) 
	{
		int i = 0;						// ���� 1�� ����
		int ar[] = new int[5];			// ���� 5���� �ѹ��� ���� ��. ar�� ������, 

		System.out.println(i);			// �Ϲ� �����̴� ������ ���� �����
		System.out.println(ar);			// ar���� �迭�� �ּҸ� ���ڷκ�����
		System.out.println(ar.length);	// . ���� ��ü�̰� �迭 �̸� ���� length�� �迭�� ����
		
		
		System.out.println(ar[0]);		// ar�� �迭 �� �� ó���� ��Ҹ� ã����  
		System.out.println(ar[1]);		// ar �迭�� 1�� ��Ҹ� ã�ƿ�
		System.out.println(ar[2]);		
		System.out.println(ar[3]);		
		System.out.println(ar[4]);		
		//System.out.println(ar[5]);	// ���� �߻���. ���� ��ġ�̹Ƿ�.

		for(i = 0; i < ar.length; i++)			// for���� Ȱ��. i�� 0���� 4����
		{
			System.out.println(ar[i]);	// i�� 0���� 4���� 5�� �迭�� �� �����.
		}

		ar = new int[10]; // int�� �迭�� 10ĭ�� ����� ar�� �ּҸ� ����
		for(i = 0; i < ar.length; i++)			// for���� Ȱ��. i�� 0���� 9����
		{
			System.out.println(ar[i]);	// i�� 0���� 9���� 10�� �迭�� �� �����.
		}

	} // main()
} // class ArrayTest1
