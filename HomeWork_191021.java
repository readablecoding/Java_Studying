/*
���� 10���� �Է��ϼ���.
10
25
-4
-22
100
30
30
40
-8
-1

�հ� : 200
��� : 20.0
�ִ밪 : 100
�ּҰ� : -22
��հ� 10 �̻� ���̳��� �� : 10 -22  -> �� �ÿ����� ��
*/

import java.util.Scanner;		// Ű����� ���� �Է¹ޱ� ���� Scanner�� ���� ���� �ҷ���
import java.lang.Math;			// ���밪�� ���ϴ� �뵵�� Math.abs�� ���� ���� �ҷ���
class HomeWork_191021
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int a[] = new int[10];		// int�� �迭 a�� 10���� ������ ����� 0���� �ʱ�ȭ
		System.out.println("���� 10���� �Է��ϼ���.");  // �Է� ��û
		// �� �Է� �ޱ�
		for(int i = 0; i < a.length; i++)
		{
			a[i] = scan.nextInt();					// �Է� �޴� ���� �迭 a�� ���� ����
		}
		System.out.println();
		

		// ����ϱ�
		int sum = 0;	// �� ������ ���� sum�� 0���� �ʱ�ȭ
		double mean;;	// ����� ���� ���� mean ����
		int max;		// �ִ밪�� ���� ���� max ����
		int min;		// �ּҰ��� ���� ���� min ����
		
		// �հ�
		for(int i = 0; i < a.length; i++)
		{
			sum = sum + a[i];					// sum�� �� �迭 ��ġ�� ���� ����
		}
		System.out.println("�հ� : " + sum);

		// ���
		mean = sum / a.length;					// ������ �հ�(sum)�� �迭 ���̸�ŭ���� ������
		System.out.println("��� : " + mean);

		// �ִ밪, �ּҰ�
		max = a[0];								// �񱳸� ���� �켱 �迭�� ù��° ���� max�� ����
		min = a[0];								// �񱳸� ���� �켱 �迭�� ù��° ���� min�� ����
		for(int i = 0; i < a.length; i++)
		{
			if(max < a[i])
			{
				max = a[i];						// max �� ��ȭ�� ���� a[i]�� ���� max�� ����
			}
			if(min > a[i])
			{
				min = a[i];						// min �� ��ȭ�� ���� a[i]�� ���� min�� ����
			}
		}
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);

		// ��հ� 10 �̻� ���̳��� ��
		int cnt = 0;
		System.out.print("��հ� 10 �̻� ���̳��� �� : ");
		for(int i = 0; i < a.length; i++)
		{
			if(Math.abs(mean - a[i]) >= 10)		// ��հ� a[i] ���� ���밪�� 10 �̻��� ���
			{
				System.out.print(a[i] + " ");	// ����� 10 �̻� ���̳��� ���� ����ϰ� �� ĭ ��
				cnt++;							// ��հ� ���̰� 10�̻��̹Ƿ� ������ 1 ������Ŵ
			}
		}
		System.out.println();
		System.out.println("��հ� 10 �̻� ���̳��� ���� �� " + cnt + "�� �Դϴ�.");
		System.out.println();
	
	} // main
}	// class 
