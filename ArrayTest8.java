//����ڿ��� ��, ���� �Է¹޴´�.
// �� ���� 1.1���� �ش� ��¥�� ��ĥ°����
// ��) 2�� 3���� 34��°
//���� ���: 2���� 29�Ϸ� ó���Ѵ�. 2020�� 3�� 1���̶�� 31 + 29 + 1�� 61���̴�.
//for��, fianl, �迭, �Է¹ޱ�, �������� �ƴ��� ���

import java.util.Scanner;
class ArrayTest8 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		final int year = 2020; // �ӽ������� ����. ����ڰ� year ���� �� ��ġ�� ���� ������Ŵ
		
		int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // �� ���� �ϼ��� �迭�� ����
		int sum = 0;	//	���� ��¥ �հ�
		int total = 0;	//	���� ��¥�� ���� �� �� �հ�

		System.out.print("���� �Է��ϼ��� : ");
		int month = scan.nextInt(); //	�� �Է� ����
		System.out.print("���� �Է��ϼ��� : ");
		int day = scan.nextInt();	//	�� �Է� ����
		
		// ���⿡ �ش��ϴ°�?
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
		 // 4�� �������� �� �������� 0�̸鼭 100���� ������ �� �������� 0�� �ƴϰ�, 400���� ������ ���� �������� 0�� ���
		{
			days[1] = 29;
			System.out.print("�����Դϴ�");
			
		}
		else
		{	
			days[1] = 28;
			System.out.print("����Դϴ�");
		}
		System.out.println();

		// ���ó��
		for(int i = 0; i < month - 1; i++)
		{
			sum = sum + days[i];
		}
		total = sum + day;
	
		System.out.print(year + "�� " + month + "�� " + day +"���� 1�� 1�Ϻ��� " + total + "��°");
		System.out.println();

	}	// main
}	// class
