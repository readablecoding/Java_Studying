/*
�ζ� 1 ~ 45�� �� 6���� ������ ��
���� ���� ������ �ȵȴ�.(�ߺ� x)
���� ���� ������ �� ó���ϴ� ����� �߿��ϴ�
*/
class ArrayTest6 
{
	public static void main(String[] args) 
	{
		
		int ar[] = new int[6];						// int�� ���� 6�� ����� 0���� �ʱ�ȭ

		// ���������� ä��
		for(int i = 0; i < 6; i++)					// ��ü 6�� ����
		{
			ar[i] = (int)(Math.random() * 45) + 1;	// 1 ~ 45 ���� ���� �ֱ�
			for(int j = 0; j < i; j++)				//  �� ���������� ��� ����
			{
				if(ar[i] == ar[j])					// ���� ���� �߰ߵ�
				{
					i--;							// ���� ���ڸ� �ٽ� �����Ϸ� ��. i�� ���� ���ְ� �ٽ� �Է�����
					break;							// �ش� for�� ���� j Ż���ϱ�
				}
			} // for�� ���� j
		} //for�� ���� i	

		// �迭�� ��� ���� ���
		for(int i = 0; i < 6; i++)
		{
			System.out.print(ar[i] + " ");
		}
		
	}	// main
}	// class