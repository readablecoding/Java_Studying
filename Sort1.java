class Sort1 // ��ȯ����
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
		for(int i = 0; i < ar.length - 1; i++)
		{
			 for(int j = i + 1; j < ar.length; j++) 
			{
				if(ar[i] > ar[j])
				{
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
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
