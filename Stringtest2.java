/**	 
	<1900 ~ 1999���>
String id = "900101-1234567"; -> ����
String id = "951225-2345678"; -> ����
	<2000 ~ 2099���>
String id = "010513-3456789"; -> ����
String id = "020820-4567890"; -> ����
	<1800 ~ 1899���>
String id = "890627-9012345"; -> ����
Stirng id = "931005-0123456"; -> ����

	<char �� ��>
System.out.println((char)48);	// ���� 0 -> ��������
System.out.println((char)49);	// ���� 1
System.out.println((char)50);	// ���� 2
System.out.println((char)50);	// ���� 3
System.out.println((char)50);	// ���� 4
System.out.println((char)50);	// ���� 5
System.out.println((char)50);	// ���� 6
System.out.println((char)50);	// ���� 7
System.out.println((char)56);	// ���� 8
System.out.println((char)57);	// ���� 9 -> ��������

	<1,2��° ���ڿ� ���� ����>
System.out.println("19" + id.substring(0, 2));	// 1, 2 -> 1900����
System.out.println("20" + id.substring(0, 2));	// 3, 4 -> 2000����
System.out.println("18" + id.substring(0, 2));	// 9, 0 -> 1800����
			
	<900123-1234567 �Է½�>
System.out.println(array[0].charAt(0));
System.out.println(Integer.parseInt(array[0].substring(0, 1)));	// 9
System.out.println(Integer.parseInt(array[0].substring(1, 2)));	// 0
System.out.println(Integer.parseInt(array[0].substring(2, 3)));	// 0
System.out.println(Integer.parseInt(array[0].substring(3, 4)));	// 1
System.out.println(Integer.parseInt(array[0].substring(4, 5)));	// 2
System.out.println(Integer.parseInt(array[0].substring(5, 6)));	// 3
System.out.println();

System.out.println(Integer.parseInt(array[1].substring(0, 1)));	// 1
System.out.println(Integer.parseInt(array[1].substring(1, 2)));	// 2
System.out.println(Integer.parseInt(array[1].substring(2, 3)));	// 3
System.out.println(Integer.parseInt(array[1].substring(3, 4)));	// 4
System.out.println(Integer.parseInt(array[1].substring(4, 5)));	// 5
System.out.println(Integer.parseInt(array[1].substring(5, 6)));	// 6
System.out.println(Integer.parseInt(array[1].substring(6, 7)));	// 7		
*/
import java.util.Scanner;	// Ű���� �Է� �뵵
import java.util.Calendar;	// ��¥, �ð� �Է� �뵵
class Stringtest2 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in); 
		String id = null;			//	�Է¹��� �ֹε�Ϲ�ȣ
		String birthYear = null;	//	�¾ �⵵ -> �ֹε�Ϲ�ȣ ���ڸ� �� ù ���� 2���� Ȱ��
		int presentYear;			//	���� �⵵ �� -> Calender ���
		String sex = null;			//	���� -> �ֹε�Ϲ�ȣ ���ڸ� �� ù ���� Ȱ��
	
		while(true)	// �Է��� �ϰ� �Է� ���ǿ� �´��� Ȯ���ϰ� �ƴϸ� ���Է� �䱸
		{
			System.out.print("�ֹε�Ϲ�ȣ �Է� (900101-1234567 ����) : ");
			id = scan.next();	// �Է¹޾� String ��ü id�� ����

			//1) 14���ڰ� �ƴϸ� �ٽ� �Է¹���
			// .length()�� ���� 14�� �ƴϸ� continue�� ���� �ٽ� �Է�

			if(id.length() != 14)
			{
				System.out.println("���ڼ��� Ʋ���ϴ�.");
				continue;	// while���� true�� �̵�
			}

			//2) 7��° ���� (index 6)�� '-' -> 0������ ���� ����
			// .charAt(���ڹ�ȣ)�� ���� 6���� -���� ���� �ƴϸ� continue�� ���� �ٽ� �Է�
			
			if(id.charAt(6) != '-')
			{
				System.out.println("-�� �Է����� �ʾҽ��ϴ�.");
				continue;	// while���� true�� �̵�
			}
		

			//3) �� ���� ���ڴ� ��� ���ڿ��� �� -> ������ ���ڰ� ���ͼ��� �ȵ�
			// .split���� - ���ķ� �ڸ��� 1�� �迭�� 0~5�� ����, 2�� �迭�� 0~6������ char�� ������ continue
			
			boolean checkItem = false; // true�� �Ǹ� if������ continue�� ���� while�� ó������ �̵�
			String array[] = id.split("-"); // -�� �������� �� �ڸ� �迭 2�� �ڸ�
			String a1 = array[0];	// ��������� �� �迭
			String a2 = array[1];	// ���� �� ��Ÿ ������ �� �迭
			

			for(int i = 0; i < 6; i++) // ������Ͽ� 6�� ���� 0 ~ 9�� �ƴ� ���ڰ� ������ Ȯ��
			{
				if(a1.charAt(i) < (char)48 || a1.charAt(i) > (char)57)
				{
					System.out.println("7��°�� -�� ���� �ٸ� ���� ����(0~9)�� �Է��ϼ���.");
					checkItem = true;	// �߸� �Է������� üũ
					break;	// for�� Ż��
				}
			}
			if(checkItem == true)
			{
				continue;	// �߸��� ���ڸ� �Է������Ƿ� while�� ó������ ���ư�
			}
			
			
			for(int i = 0; i < 7; i++) // ���� �� ��Ÿ ������  0 ~ 9�� �ƴ� ���ڰ� ������ Ȯ��
			{
				if(a2.charAt(i) < (char)48 || a2.charAt(i) > (char)57)
				{	
					System.out.println("7��°�� -�� ���� ���ڸ� �Է��ϼ���.");
					checkItem = true;	// �߸� �Է������� üũ
					break;	// for�� Ż��
				}
			}
			if(checkItem == true)
			{
				continue;	// �߸��� ���ڸ� �Է������Ƿ� while�� ó������ ���ư�
			}

			// 4) 9, 0, 1, 2, 3, 4 �� �ϳ� �Է��ϰ� �����
			
			if(id.charAt(7) == '5'|| id.charAt(7) == '6' || id.charAt(7) == '7' || id.charAt(7) == '8')
			{
				System.out.println("8��°�� 9, 0, 1, 2, 3, 4 �� �ϳ��� �Է��ϼ���.");
				continue;	
			}
			

			// 5) ���� 1 ~ 12 -> ���ڷ� ��ȯ�� �ش� ���ڿ� �ش��ϴ��� �˾ƺ���
			// Integer.parseInt ���
			
			if(Integer.parseInt(id.substring(2, 4)) <= 0 || Integer.parseInt(id.substring(2, 4)) >= 13)
			{
				System.out.println("���� 1���� 12���� �Է��ϼ���.");
				continue;
			}
	
			
			// 6) ���� 1 ~ 31 -> ���ڷ� ��ȯ�� �ش� ���ڿ� �ش��ϴ��� �˾ƺ���. 
			// Integer.parseInt ���
			
			if(Integer.parseInt(id.substring(4, 6)) <= 0 || Integer.parseInt(id.substring(4,6)) >= 32)
			{
				System.out.println("���� 1���� 31���� �Է��ϼ���.");
				continue;
			}

			break; // ���� ���ǿ� �ϳ��� �ɸ��� �ʴ´ٸ� break�� ���� while���� ����������.

		} // while�� -> �Է� ������ ������Ű�� 7�� �¾ ���� �������� �̵�
		
		// 7) �¾ ���� ����
		//  8��° ���ڰ� 1,2�̸� 1900����̰� 3, 4�̸� 2000����̸� 9, 0�̸� 1800��� ���

		if(id.substring(7, 8).equals("1") || id.substring(7, 8).equals("2"))
		{
			birthYear = "19" + id.substring(0, 2);
			//System.out.println(birthYear);
		}
		if(id.substring(7, 8).equals("3") || id.substring(7, 8).equals("4"))
		{
			birthYear = "20" + id.substring(0, 2);
			//System.out.println(birthYear);
		}
		if(id.substring(7, 8).equals("9") || id.substring(7, 8).equals("0"))
		{
			birthYear = "18" + id.substring(0, 2);
			//System.out.println(birthYear);
		}
		
		// 8) 8��° ���ڰ� 1,3,9 �̸� �����̰� 2, 4, 0�̸� �����̴�

		if(id.substring(7, 8).equals("1") || id.substring(7, 8).equals("3") || id.substring(7, 8).equals("9"))
		{
			sex = "����";
		}
		if(id.substring(7, 8).equals("2") || id.substring(7, 8).equals("4") || id.substring(7, 8).equals("0"))
		{
			sex = "����";
		}
		
		Calendar c = Calendar.getInstance();	// �޷� ���� �޾ƿ� c�� ����
		presentYear = c.get(Calendar.YEAR);		// ���� �⵵�� ����
		int age = presentYear - Integer.parseInt(birthYear) + 1;	// ���� �⵵�� �¾ �⵵�� ���̿� 1�� ���� ���� ���� �Ի� 		
		int month = Integer.parseInt(id.substring(2, 4));	// �� 
		int day = Integer.parseInt(id.substring(4, 6));		// �� 
		System.out.println(birthYear + "��� " + month + "�� " + day + "�ϻ� " + age + "�� " + sex + "�Դϴ�");		
	
	} // main()
} // class



