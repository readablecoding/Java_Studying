import java.util.Scanner; // Ű����� �Է��� �ްڴ�.
import java.util.ArrayList;
public class StudentManager2
{
	ArrayList<Student> list = new ArrayList<Student>(); // ArrayList�� ����� Student Ŭ������ �ڷ������� ����� ���� list�� �迭�� �ּҸ� ������
	Scanner scan = new Scanner(System.in);

	// main �޼ҵ�
	public static void main(String[] args) 
	{
		StudentManager m = new StudentManager(); // StudentManager Ŭ������ ���������� ������ m(��ü m)�� �����. ���������� ���� ������ �޼������ static�� �ƴϾ
		while(true)
		{
			int num = m.menuPrint(); // �Էµ� n�� ��ȯ�޾� num�� ����
			switch(num)
			{
				case 1:
					m.input();	// ��� �޼��� ȣ��
					break;
				case 2:
					m.output();	// ���� �޼��� ȣ��
					break;
				case 3:
					m.search();	// �˻� �޼��� ȣ��
					break;
				case 0:
					System.out.println("���α׷��� �����մϴ�.");
					return;
			}// switch��
		}// while��
	}// main()

	// �޴� ��� �޼ҵ�
	public int menuPrint()
	{	
		int n = 0;
		System.out.println("[�л� ���� ����]");
		System.out.println("1. ���");
		System.out.println("2. ��ü �л� ���� ���");
		System.out.println("3. �˻�");
		System.out.println("0. ����");
		System.out.print("���� > ");
		while(true)
		{
			n = scan.nextInt();
			if(n < 0 || n > 3)	// 0���� 3���� �Է����� ������ �ٽ� �Է��ϵ��� �����.
			{
				System.out.println("�߸� �Է��߽��ϴ�. �ٽ� �Է��ϼ���.");
				System.out.print("���� > ");
			}// if��
			else
			{
				break; // ����� �Է��ϸ� while�� Ż��
			}// else��
		}// while��
		return n; // �Էµ� n�� ��ȯ�Ѵ�.
	}// menuPrint()

	// �л� ��� �޼ҵ�
	public void input()
	{
		System.out.println();
		System.out.println("[�л� ���]");
		System.out.print("�̸� : ");
		String n = scan.next();
		System.out.print("�������� : ");
		int k = scan.nextInt();
		System.out.print("��������: ");
		int e = scan.nextInt();
		System.out.print("��������: ");
		int m = scan.nextInt();
		list.add(new Student(n, k, e, m));
		System.out.println("* ��ϵǾ����ϴ�.");
		System.out.println();
	}// input()

	// ��ü �л� ���� ��� �޼ҵ�
	public void output()
	{
		if(list.size() == 0)
		{
			System.out.println("* ��ϵ� �л��� �����ϴ�.");
			System.out.println();
			return;
		}// if��
		System.out.println();
		System.out.println("[��ü �л� ���]");
		System.out.println("�̸�\t����\t����\t����\t����\t���\t����");
		for(int i = 0; i < list.size(); i++)
		{
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%3.1f\t%d\n", 
					list.get(i).getName(),list.get(i).getKor(), list.get(i).getEng(), 
					list.get(i).getMat(), list.get(i).getTotal(), list.get(i).getAvg(), 
					this.getRank(list.get(i).getAvg()));
			System.out.println();
		}// for��
	}// output()

	// �л� �˻� �޼ҵ�
	public void search()
	{
		System.out.println();
		System.out.println("[�л� �˻�]");
		System.out.print("�˻��� �л� �̸� : ");
		String name = scan.next(); // �̸� �Է� �ޱ�
		int n = 0; // ���� ����� �ִ��� ���ϱ� ���� ���� ����
		System.out.println("�̸�\t����\t����\t����\t����\t���\t����");
		for(int i = 0; i < list.size(); i++)
		{
			if(list.contains(name)) // �Է¹��� �̸��� �迭�� ������ ��ü�� �̸��� ��
			{	
				n++; 
				System.out.printf("%s\t%d\t%d\t%d\t%d\t%3.1f\t%d\n", 
					list.get(i).getName(),list.get(i).getKor(), list.get(i).getEng(), 
					list.get(i).getMat(), list.get(i).getTotal(), list.get(i).getAvg(), 
					this.getRank(list.get(i).getAvg()));
				System.out.println();
			}// if��
		}// for��
		if(list.isEmpty())
		{
			System.out.println("��ϵ� �л��� �����ϴ�.");
			System.out.println();
		}// if��
		else
		{
			System.out.println("�� " + n + "���� �˻��Ǿ����ϴ�.");
			System.out.println();
		} // else��
	}// search()

	// ���޹��� ������ ��ü �� �� ������ ���Ͽ� ����
	public int getRank(double avg) // getAvg()�� ����� ��� ���� �������ڷ� avg�� ��.
	{
		int rank = 1; // ���� ū ���̶�� 1 �״�� 1���� �ȴ�.
		for(int i = 0; i < list.size(); i++)
		{
			if(avg < list.get(i).getAvg()) // ���������� ���� avg�� ��ü ���� ��հ� �׶��׶� ��
			{
				rank++; // ���� �����Ƿ� ������ 1 �����Ѵ�.
			}// if��
		}// for�� ���� i
		return rank; // ���� ������ ����������.
	}// getRank()

}//class
