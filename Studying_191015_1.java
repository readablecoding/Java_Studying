import java.util.Scanner;
class Studying_191015_1
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		String a;

		System.out.println("���ڸ� �Է��ϼ���");
		System.out.print("a, b, c �� ������ : ");
		a = in.nextLine();
		switch(a)
		{
			case "a" :
				System.out.println("�ȳ��ϼ���.");
				break;

			case "b" :
				System.out.println("�ݰ����ϴ�.");
				break;

			case "c" :
				System.out.println("�����ϴ�.");
				break;

			default :
				System.out.println("�߸� �Է��߽��ϴ�. a, b, c�� �Է��ϼ���.");
				break;
		}
	}
}

