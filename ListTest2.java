import java.util.ArrayList;
import java.util.Scanner;
class ListTest2 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		ArrayList<Student> slist = new ArrayList<Student>();
		String n;
		int k, e, m;

		while(true)
		{
			System.out.print("�̸� : ");
			n = scan.next();
			System.out.print("�������� : ");
			k = scan.nextInt();
			System.out.print("�������� : ");
			e = scan.nextInt();
			System.out.print("�������� : ");
			m= scan.nextInt();
			slist.add(new Student(n, k, e, m));				// �Է¹��� ���� Student ��ü�� ����� �� ���� �����Ѵ�.
			System.out.print("��� �Է��Ͻðڽ��ϱ�? (y/n)");
			if(scan.next().equalsIgnoreCase("n"))
			{
				break;
			}//if��		
		}//while��
		System.out.println(slist);							// [Student@28d93b30] -> ��ü�� �ּҸ� �����ش�.
		Student s = new Student("ȫ�浿", 100, 100, 100);
		System.out.println(slist.indexOf(s));				// -1 -> ���� ���� ������ -1�� ����
		
	}//main()
}//class
