import java.util.Scanner;
class Studying_191015_2 
{ 
	public static void main(String[] args) 
	{
		System.out.println("�з� �ڵ�� 1: ö��, 2: ����, 3: ��ȸ����, 4: ��Ÿ"); 
		System.out.print("�з��ڵ带 �Է��ϼ���: ");
		Scanner inputValue = new Scanner(System.in);
		int code = inputValue.nextInt();
		switch(code)
		{
			case 1 :
				System.out.println("ö���Դϴ�.");
				break;
			
			case 2 :
				System.out.println("�����Դϴ�.");
				break;
			case 3 :
				System.out.println("ö���Դϴ�.");
				break;
			default :
				System.out.println("��ȸ�����Դϴ�.");
				break;
		}
	}
}
