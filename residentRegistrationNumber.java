/*
�ֹε�Ϲ�ȣ �ޱ�
���� ó��: Ű���� �Է� �ޱ� 14���� �ƴϸ� ���α׷� ����������
14���ڰ� �ƴϸ� ����
<1900 ~ 1999���>
String id = "900101-1234567"; -> ����
String id = "951225-2345678"; -> ����
<2000 ~ 2099���>
String id = "010513-3456789"; -> ����
String id = "020820-4567890"; -> ����
<1800 ~ 1899���>
String id = "890627-9012345"; -> ����
Stirng id = "931005-0123456"; -> ����

14�����̸� ������ ������ ���
90�� 01�� 01�ϻ� �����Դϴ�.
95�� 12�� 25�ϻ� �����Դϴ�.
���ڸ� �߶� Ȯ�� 
�ι�° ���� ù ���ڷ� 1, 3, 9�� �����̰� 2, 4, 0�� ���ڴ�.

*/
import java.util.Scanner;
class residentRegistrationNumber
{
	public static void main(String[] args) 
	{
			
		Scanner scan = new Scanner(System.in); // Ű����� �Է� �ްڴ�.
		String man = "����";		// ���ڸ� �����ֱ� ���� String ��ü ����
		String woman = "����";	// ���ڸ� �����ֱ� ���� String ��ü ����
		String manNumber[] = {"1", "3", "9"};	// ���ڰ� ���� ���ڴ� 1, 3, 9
		String womanNumber[] = {"2", "4", "0"};	// ���ڰ� ���� ���ڴ� 2, 4, 0
		 
		// 14���ڰ� �ƴϸ� ����
		System.out.println("�ֹε�Ϲ�ȣ�� �Է��ϼ���. -�� �����ϼ���.");
		System.out.print("�ֹε�Ϲ�ȣ : ");
		String id = scan.next();	// �ֹε�Ϲ�ȣ �Է� �ޱ�
		while(true)
		{
			if(id.length() != 14)	// String id�� �Է��� 14�ڰ� �ƴϸ� ���α׷� ����
			{
				System.out.println("�߸� �Է��߽��ϴ�. ���α׷��� �����մϴ�.");
				System.exit(0);
			}	// if��
			else
			{
				break;	// 14�ڸ� �Է��ϸ� while���� Ż���� ����� ���� �������� �̵���
			}	// else��
		}	//while��
		

		/*�����
		System.out.println(id.charAt(7));
		System.out.println(id.substring(7,8));
		*/

		
		if(id.substring(7,8).equals(manNumber[0])) // ���ڿ��� 7��° ���� 1�ڸ��� 1�� ��� -> 1900��� ����
		{
			System.out.println("19"+ id.substring(0,2) + "�� " + id.substring(2,4) + "�� " + id.substring(4,6) + "�ϻ� " + man + "�Դϴ�.");
		}
		else if(id.substring(7,8).equals(manNumber[1]))	// ���ڿ��� 7��° ���� 1�ڸ��� 3�� ��� -> 2000��� ����
		{
			System.out.println("20" + id.substring(0,2) + "�� " + id.substring(2,4) + "�� " + id.substring(4,6) + "�ϻ� " + man + "�Դϴ�.");
		}

		else if(id.substring(7,8).equals(manNumber[2]))	// ���ڿ��� 7��° ���� 1�ڸ��� 9�� ��� -> 1800��� ����
		{
			System.out.println("18" + id.substring(0,2) + "�� " + id.substring(2,4) + "�� " + id.substring(4,6) + "�ϻ� " + man + "�Դϴ�.");
		}

		else if(id.substring(7,8).equals(womanNumber[0]))	// ���ڿ��� 7��° ���� 1�ڸ��� 2�� ��� -> 1900��� ����
		{
			System.out.println("19" + id.substring(0,2) + "�� " + id.substring(2,4) + "�� " + id.substring(4,6) + "�ϻ� " + woman + "�Դϴ�.");
		}
		else if(id.substring(7,8).equals(womanNumber[1]))	// ���ڿ��� 7��° ���� 1�ڸ��� 4�� ��� -> 2000��� ����
		{
			System.out.println("20" + id.substring(0,2) + "�� " + id.substring(2,4) + "�� " + id.substring(4,6) + "�ϻ� " + woman + "�Դϴ�.");
		
		}
		else if(id.substring(7,8).equals(womanNumber[2]))	// ���ڿ��� 7��° ���� 1�ڸ��� 0�� ��� -> 1800��� ����
		{
			System.out.println("18" + id.substring(0,2) + "�� " + id.substring(2,4) + "�� " + id.substring(4,6) + "�ϻ� " + woman + "�Դϴ�.");
		}
		else
		{
			System.out.println("�߸� �Է��߽��ϴ�. ���α׷��� �����մϴ�."); // 1, 3, 9, 2, 4, 0 �̿��� ���� �Է½� ���α׷�����
			return;	// ���α׷� ����
		}
		
	}	// main()		
}	// class
