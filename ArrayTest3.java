// ����ڿ��� �Է��� ������ ������ ��� �迭 ���� -> ���ڰ� 10����� 11�� �ʿ���. ���� 10���� �հ� ���� 1��
// �ݺ������� ���� �Է� ����
// �迭�� ������ ���ҿ� �ٸ� ���ڵ��� �հ踦 ���
// ��� ���
// 1+2+3+4+5+6+7+8+9+10=55

import java.util.Scanner;
class ArrayTest3 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int a[] = null;  // �迭 a �ʱ�ȭ
		int size;		// �Էµ� ���� ���� + �հ� ���ϴ� 1�� ������ ���� size
		System.out.print("�Է��� ���� ����: ");  // �Է� �䱸
		size = scan.nextInt();				 // �Է� �ޱ�
		a = new int[size + 1]; // �迭 a ����
		
	
		for(int i = 0; i < a.length - 1; i++)  
		{	
			System.out.print("���� �Է� : ");
			a[i] = scan.nextInt();
		}

		for(int i = 0; i < a.length - 1; i++)
		{	
			a[a.length - 1] += a[i]; // �� �����ִ� �뵵
		}

		for(int i = 0; i < a.length - 1; i++)
		{
			if(i < a.length - 2)
			{
				System.out.print(a[i] + "+");
			}
		
			else
			{	
				System.out.print(a[i] + "=");
			}
		}
		System.out.print(a[a.length - 1]); 
		System.out.println();
	} // main
}	// class
