import java.util.Scanner;
class ArrayTest11 // 2���� �迭 ����
{
	public static void main(String[] args) 
	{
		int a[] = new int[6];		// 1���� �迭	
		int b[][] = new int[2][3];	// 2���� �迭

		/*
		System.out.println(a.length);	// �迭�� ���̴� 6
		System.out.println(b.length);	// �迭�� ���̴� 2 -> �� ������ŭ ������
		System.out.println(b[0].length);	//  0���� ĭ ������ 3 (0, 1, 2)
		System.out.println(b[1].length);	//	1���� ĭ ������ 3 (0, 1, 2)
		System.out.println(a[0]);			//
		System.out.println(b[0][0]);		// �迭 b�� 0�� 0��
		System.out.println(b[1][2]);		// �迭 b�� 1�� 2�� -> �迭�� ������ ��ġ
		*/
		
		/*
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println();
		
		for(int i = 0; i < b.length; i++)	// �� ���� ��ŭ �ݺ�
		{
			for(int j = 0; j < b[i].length; j++)	// �ش� ���� �� ���� ��ŭ �ݺ�
			{
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		*/
	
		// �л� 5���� ����, ����, ���� ����
		/*
		0�� �л� �����Է�
		����0: 100
		����1: 90
		����2: 80
		1�� �л� �����Է�
		����0: 100
		����1: 90
		����2: 80
		3�� �л� �����Է�
		����0: 100
		����1: 90
		����2: 80
		4�� �л� �����Է�
		����0: 100
		����1: 90
		����2: 80
		---------------------
				���� ���� ����
		�л�0		100	90	80
		�л�1		100 90	80
		...

		*/

		// 1)  ���� �Է�
		int score[][] = new int [5][3]; // �� 5 * 3 ���� 15���� ���������. ��ȣ�� 2�� �ٿ��� �Ѵ�.
		Scanner in = new Scanner(System.in);
		for(int i = 0; i < score.length; i++)
		{	
			System.out.println(i + "�� �л� �����Է�");	// �л��� �Է��ϵ��� ����
			for(int j = 0; j < score[i].length; j++)
			{
				System.out.print("���� " + j + ":" + " ");	// ������ �Է½�Ŵ
				score[i][j] = in.nextInt();					// ������ �迭 score�� �ش� ��, ���� ��ġ��Ŵ
			}
		}
		// 2) ���� ���
		System.out.println("-------------------------------");
		System.out.println("\t����\t����\t����");	// �� �κ� ��� ���̰� �ϴ� �뵵�� ����(\t)�� ��
		for(int i = 0; i < score.length; i++)	// �� ���� score.length��ŭ �ݺ�
		{
			System.out.print("�л�" + i);	// �л����� ������ ���̰� �ϰ� ����
			for(int j = 0; j < score[i].length; j++)	// �� ���� score[i].length��ŭ �ݺ�
			{
				System.out.print("\t " + score[i][j]);	// ���� �Է� �� ������ ����
			}
			System.out.println();
		}
		System.out.println();

		// 3) ���� ���: ����, ����, ���� ���� ���� 
		System.out.println("-------------------------------");
		for(int i = 0; i < score[0].length; i++)	// score[0].length�� 5�̴�.
		{
			for(int j = 0; j < score.length; j++)	// score.length�� 3�̴�.
			{
				System.out.print("\t" + score[j][i]);  // �� * �� 
			}
			System.out.println();
		}



	}	// main	
}	// class	
