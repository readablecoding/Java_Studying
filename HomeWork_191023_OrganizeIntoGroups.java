/*
�л� 18�� ���� �迭
�� �л��� �̸� ��� �迭�� ����
�ο� �� �Է¹���
�� ��(������ ���� �ο� ���ڶ� ���� ����)

�������� �� ��
5���̶�� 4�����ε� ������ ���� 3���̴�
�л��鿡 �� ��ȣ�� �ο��Ѵ�.
*/
import java.util.Scanner;
class HomeWork_191023_OrganizeIntoGroups
{

	public static void main(String[] args) 
	{
		String member[] = {"�輺��", "�����", "�ڼ���", 
							"�ڿ� ", "������", "����ȯ",
							"�躸��", "������", "�ڹο�",
							"������", "����ä", "������", 
							"�迵��", "���±�", "�ڼ���",  
							"����ȭ", "����ȯ", "�߰��"};
		 
		// 1) ������� ���� © �� + �� �� ������ �Է� �޴´�.
		
		/*
		Scanner scan = new Scanner(System.in);
		System.out.print("�� ���� ���� ���ϰڽ��ϱ�? : ");
		int n = scan.nextInt(); // �׷� ���� ����
		
		int cnt = 0;
		
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < (member.length / n); j++)
			{	
				
				System.out.print(member[cnt] + " ");
				cnt++;
			}	
			System.out.println();
			
		}
		if(member.length > cnt)
		{
			for(int j = 0; j < (member.length % n); j++)
			{
				System.out.print(member[member.length - 1 - j] + " ");
			}
		}
		System.out.println();	
		*/

		
		// 2) ���� ���� ���� © �� + �� �� ������ �Է� �޴´�

		Scanner scan = new Scanner(System.in);
		System.out.print("�� ���� ���� ���ϰڽ��ϱ�? : ");
		int n = scan.nextInt(); // �׷� ���� ����
		String a[] = new String [member.length];
		int i, j, k;
		

		// ���� ���� -> ���� ���ڸ� �޾� ���ο� �迭�� �ֵ� �ߺ��� ���Բ� �Ѵ�.
		for(i = 0; i < member.length; i++)
		{
			
			a[i] = member[(int)(Math.random() * 18)]; // ���Ƿ� 0���� 17������ �迭�� ����� ����
			for(j = 0; j < i; j++)
			{
				if(a[i].equals(a[j]))	// �ߺ��� �߰ߵǸ� a[i]�� ���� �ٽ� �ްԲ� �Ѵ�.
				{
					i--;
				}
			}
		}
		System.out.println();

		// ���� ���� �׷� ����
		int cnt = 0;	// ������ �����ֱ� ����
		for(i = 0; i < n; i++)
		{
			System.out.print((i + 1) + "�� : ");
			for(j = 0; j < (a.length / n); j++)
			{
				System.out.print(a[cnt] + " ");
				cnt++;
			}
			System.out.println();
		}
		
		// �������� ���� �� �׷� ����
		if(a.length % n != 0)	// �������� 0�� �ȵǸ� ������ ���� ���Ѵ�.
		{
			cnt++;	// ������ ���߱� ���� cnt�� 1�� ���Ѵ�.
			System.out.print((n + 1) + "�� : ");
			for(i = 0; i < (a.length % n); i++)
			{
				System.out.print(a[cnt - 1 + i] + " ");	// ���� ��� �������� ������ ���� ��ŭ �ݺ��ϸ� ���
			}
			System.out.println();
		}

	}	// main
}	// class
