class ArrayTest5 
{
	public static void main(String[] args) 
	{
		
		int a[]= new int[10];	 // int�� ���� 10���� ����� 0���� �ʱ�ȭ��
		int n = 0;
		for(int i = 0; i < a.length; i++)
		{
			n += 10;			//	n�� 10�� ����
			a[i] = n;			//	n�� a[i]�� �־��� 
			
		}
		
		System.out.println(Math.random()); // Math Ŭ������ �׳� �ᵵ �ȴ�. 0�̻� 1�̸��� ���� double�� ���ڸ� �ϳ� ������. 0.0 <= x < 1.0 
		System.out.println((int)(Math.random() * 10)); // �Ҽ����� �ڸ� ������ ������ ���ڷ� 0 ~ 9 �� �ϳ��� ����
		System.out.println((int)(Math.random() * 10) + 1); // 1 ~ 10���� ������ ��
		System.out.println(((int)(Math.random() * 10) + 1) * 10); // 10, 20, ~ 100���� ������ ��
		System.out.println();
		
		/*
		// 0 ~ 100�� ������ ������ ������ �迭�� ����
		for(int i = 0; i < a.length; i++)
		{
			a[i] = (int)(Math.random() * 101); // 1) 101�� ���� 2)int�� ��������ȯ -> 0 ~ 100���� ����
			System.out.println(a[i]);
		}
		System.out.println();
		*/

		// ������ �� �׽�Ʈ
		/*
		for(int i = 0; i < 100; i++)
		{
			System.out.println((int)(Math.random() * 10) + " ");
		}
		System.out.println();

		for(int i = 0; i < 100; i++)
		{
			System.out.println((int)(Math.random() * 101) + " ");
		}
		System.out.println();

		for(int i = 0; i < 100; i++)
		{	
			System.out.println(((int)(Math.random() * 10) + 1) * 10);
		}
		System.out.println();
		*/

		// �ֻ����� 5�� ������ ��, 1 ~ 6������ ���� ���´�.
		for(int i = 0; i < 5; i++)  // i�� 0���� 4���� 5�� ����
		{
			a[i] = (int)(Math.random() * 6) + 1; // 1)6�� ���� 2)int�� ��������ȯ 3)1�� ������
			System.out.print(a[i] + " ");
		}
		System.out.println();


	} // main
}	// class
