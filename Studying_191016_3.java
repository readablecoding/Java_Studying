class Studying_191016_3 
{
	public static void main(String[] args) 
	{
		for(int i = 0; i < 10; i++)
		{
			if(i == 5)
			{
				continue;		   // ����� 0 1 2 3 4 6 7 8 9 -> 5�� ������ ������ ����
				//break;		   // ����� 0 1 2 3 4 -> 5�� �� ���� �ݺ����� ���
				//return;		   // ����� 0 1 2 3 4 -> 5�� �� ���� �޼ҵ�(���⼭�� main)�� ������
				//System.exit(0);  // ����� 0 1 2 3 4 -> 5�� �� ���� ���α׷� ����
			}
			System.out.print(i + " ");
		}
	}
}
