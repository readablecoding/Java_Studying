import java.util.Scanner;
class ArrayTest9 
{
	public static void main(String[] args) 
	{
		// �迭 �����ϰ� ������ �� 5���� ä�� ( 1 ~ 15 ������ ����)
		// ����ڿ��� ���� �ϳ��� �Է� ����
		// �Է¹��� ���� �迭 ���� �ִ���? -> �ϳ��ϳ� Ȯ���� �غ��� �Ѵ�.

		// 1) ī��Ʈ �ϴ� ���� cnt�� Ȱ���ϴ� ���
		/*
		Scanner scan = new Scanner(System.in); // �Է� ���� �غ�
		int a[] = new int[5];	// int�� �迭 5�� �����ϰ� 0���� �ʱ�ȭ
		int cnt = 0;			// ��ġ�� ���� Ȯ���ϱ� ���� ���� ����

		for(int i = 0; i < a.length; i++)
		{
			a[i] = (int)(Math.random() * 15) + 1; // ���� ���� �迭�� ������� ����
			for(int j = 0; j < i; j++)
			{
				if(a[i] == a[j])	// ���� �迭�� ���� �迭�� ���� ���� ��
				{
					i--;			// ���� �迭�� �ٽ� ���� ���� �ֱ� ���� i�� 1 ����
				}
			}	
		}
		
		/*
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " "); // ���� ��� ���Դ��� Ȯ���ϴ� �뵵
		}
		*/

		/*
		System.out.println();
		System.out.print("���� 1 ~ 15 ���� �� �ϳ��� �Է��ϼ��� : ");	
		int n = scan.nextInt();	// �Է��� ������ n�� ����
		
		
		for(int i = 0; i < a.length; i++)
		{
			if(n == a[i])
			{
				System.out.println("���� ��ġ�մϴ�");	// ��ġ�Ѵٴ� ���� ����
				cnt++;	// ���� ��ġ�Ѵٴ� ���� �����ֱ� ���� cnt ���� 1 ������Ŵ
				break;	// for���� ����� �뵵
			}
		}

		if(cnt == 0)
		{
			System.out.println("���� ��ġ���� �ʽ��ϴ�");
		}
		*/
		

		// 2) ���� i�� Ȱ���ϴ� ���
		Scanner in = new Scanner(System.in);
		int ar[] = new int[5];
		int i, num;
		
		for(i = 0; i < ar.length; i++)	// 0���� 4���� �ݺ�
		{
			ar[i] = (int)(Math.random() * 15) + 1; // 1 ~ 15���� ���ڰ� �����Բ� ����
		}
		System.out.print("������ �Է��ϼ��� : ");
		num = in.nextInt();
		 
		for(i = 0; i < ar.length ; i++)	// 0���� 4���� �ݺ�
		{
			if(num == ar[i])
			{
				break; 
			}	
		}
		if(i == ar.length)	// i�� ���� ���� for�� ���� �̸� i�� ������. for���� �� ������ �� break �ȵǸ�
		{
			System.out.println("X");
		}
		else
		{
			System.out.println("O");
		}
		
	} // main
}	// class
