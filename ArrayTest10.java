import java.util.Scanner;
class ArrayTest10
{
	public static void main(String[] args) 
	{	
		String s[] = {"ȫ�浿", "��ö��", "�̿���"};
		//String test = "abcd";
		String name;	// ���ڿ�
		//double d;		// �Ǽ���
		int i;

		
		/*
		System.out.print("�Ǽ� �Է� : ");
		d = in.nextDouble();	// double ������ �Է¹޴´�.
		System.out.print("���ڿ� �Է� : ");
		name = in.next();		// String ������ �Է¹޴´�. next�� ���� ���� �� ���ڸ� ���� �� �ִ�.
		*/
		Scanner in = new Scanner(System.in);
		System.out.print("�˻��� �̸� : ");
		name = in.next();
		for(i = 0; i < s.length; i++)
		{
			//if(names == s[i]) -> �ȿ� ����ִ� �ּҸ� ���ϰ� �ȴ�. ���� �񱳴� ����.
			if(name.equals(s[i])) // -> ���ڿ��� ������ ���ϰ� �ȴ�.
			{
				break;
			}
		}
		
		if(i == s.length)
		{
			System.out.println("�˻������ �����ϴ�.");
		}
		else
		{
			System.out.println(i + "��°���� �˻��Ǿ����ϴ�.");
		}
		System.out.println();

	}
}
