/*
[���α׷� ����]
1. �Է�
2. ����
3. ����
4. ���
0. ����
��ȣ ���� > _
*/
import java.util.Scanner;
class MenuTest 
{
	public static void main(String[] args) 
	{	
		// �̸� �غ��ؾ� �ϴ� ��ü �����̳� ���� ���� ��
		Scanner scan = new Scanner(System.in);
		String names[] = new String [10];	// 10����� �̸��� ������ �� �ִ� �迭. ��ü�� �ƹ��͵� ����Ű�� ����-> null ���� ����ִ�.
		int cnt = 0;					// �� ����� �����߳�?
		int menuNum;
		
		
		// ���α׷� ��ü�� ���� �ݺ�
		while(true)
		{
			// �޴� ����ϴ� �޼ҵ� ȣ��
			printMenu();
			
			// �޴���ȣ �Է¹���
			menuNum = scan.nextInt();

			// �Է��� ��ȣ�� ���� �б�
			switch(menuNum)
			{
				case 1:
					System.out.println("[ �Է� ]");
					System.out.print("�̸� �Է� : ");
					scan.nextLine();				// ���ۿ� �ִ� ���� �о���� �����.
					names[cnt] = scan.nextLine();	// ����� ��� ���� ��ҿ� ����, ���ڿ� �Է¹���, ���۰� ������� �ٽ� ���� �Է� �ް� ��.
					cnt++;						// ����� ���� ����
					break;	// break�� ������ ���� ������� �� �����Ѵ�. ���� �� break ����ϱ�
				case 2: 
					System.out.println("2�� ����");
					break;
				case 3: 
					System.out.println("3�� ����");
					break;
				case 4: 
					System.out.println("[ ��� ]");
					// ��ϵ� ��� �̸��� ����Ѵ�.
					for(int i = 0; i < cnt; i++)
					{
						System.out.print(names[i] + " ");	// cnt���� ���� ���� names �迭�� ���� ������� ������
					}
					System.out.println();
					break;
				// 0�� �Է��ϸ� ����
				case 0: 
					System.out.println("���α׷��� �����մϴ�.");
					return;	// main �޼ҵ带 �����ϰ� �ȴ�.
				default :
					System.out.println("��ȣ�� �ٽ� �����ϼ���");
					break;	// �������� break�� �� ���� while�� ó������ ���ư�
			}	// switch��
			System.out.println();

		}	// while��
	
	}	// main �޼���
	
	//�޴��� ����ϰ� ����ϰ� ����� �޼ҵ带 �����.
	public static void printMenu()	// ���� ������ �ʰ� ������ �ʴ´�. 
	{
		// �޴� ���
		System.out.println("[���α׷� ����]");
		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ����");
		System.out.println("4. ���");
		System.out.println("0. ����");
		System.out.print("��ȣ ���� > ");
	}	// printMenu �޼ҵ�� �޴� ��¸� �Ϸ��� ���� ��. ��� �ҷ���� ����ȴ�.

}	// class MenuTest
