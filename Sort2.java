class Sort2	// �������� 
{
	public static void main(String[] args) 
	{
		// ������ ����
		int ar[] = {10, 5, 1, 60, 35, 40, 90, 15, 10, 80};
		int temp;
		
		// ���� ���� ���
		for(int i = 0; i < ar.length; i++)
		{
			System.out.print(ar[i] + " ");
		}
		System.out.println();

		// �� ��ȯ
		
		// ��������
		for(int i = ar.length - 1; i > 0 ; i--) // i�� ���⼭ Ƚ���� �ǹ���. ù ������ �迭���� -1���� �ݺ�. ������ ������ ����
		{
			 for(int j = 0; j < i; j++) // j�� 0���� i-1���� �ٷ� ���� �Ͱ� ���Ѵ�.
			{
				if(ar[j] > ar[j+1])
				{
					temp = ar[j];		// ū ���� �ӽ÷� ����
					ar[j] = ar[j+1];	// ���� ���� ������ �ű�
					ar[j+1] = temp;		// �ӽ÷� ������ ū ���� ������ �ű�
				}
			}	//for�� ���� j
		} //for�� ���� i


		// ����� ���� ���
		for(int i = 0; i < ar.length; i++)
		{
			System.out.print(ar[i] + " ");
		}
		System.out.println();
		
	}	// main()
}	// class