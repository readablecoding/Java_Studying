/*
�ƹ��� ���� 9���� �ִ´�
�迭�� ������ ����ϵ� ���̻��� ���м��� �־ �ϱ�
*/

class HomeWork_191024_char
{
	public static void main(String[] args) 
	{		
		String ch[][] = new String [3][3];
		char tmp = 65;
		
		// 1) �Է�
		int cnt = 0;	// 
		for(int i = 0; i < ch.length; i++)	// ch.length�� 3�̴�.
		{
			for(int j = 0; j < ch[i].length; j++)	// ch[i].length�� 3�̴�.
			{
				ch[i][j] = (int)(tmp + cnt) + ""; // ���� �ٲ��� ���� ��� ����
				cnt++;
			}
			System.out.println();
		}

		/*
		int a = 1;			//  ���ڸ� int�� ���� a�� ����
		char b = 'a';		// ���ڸ� char�� ���� b�� ����
		String c = a + "";	// int�� String���� ��ȯ
		b = (char)(b + 1);	// int�� char�� ��ȯ
		*/
		
		// 2) ���
		System.out.println("��������������������������");				
		for(int i = 0; i < ch.length; i++)
		{		
			for(int j = 0; j < ch[i].length; j++)	// ch[i].length�� 3�̴�.
			{		
				System.out.print("�� " +ch[i][j]);
				
			}
			System.out.println("��");
			if(i < (ch[i].length - 1))
			{
				System.out.println(" ����������������������");
			}
		}
		System.out.println("��������������������������");
					
	}	// main
}	//	class
