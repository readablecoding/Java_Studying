/*
[�л� ���� ����]
1. ���
2. ��ü �л� ���� ���
3. �˻�
0. ����	

-����� �л��̸�, ��/��/�� ������ �Է¹޾� �迭�� ����(Student Ŭ���� �̿�)
-����� �л��̸�, ��/��/�� ����, ����, ���, ������ ���
-�˻��� �л��̸��� �Է¹޾� ���� �̸��� �л����� ��� ���
-���� �����
1)������ ���� 
2)1���� �� ���� �ƹ��� ����. ������� �������� ������ ū ������ �� ���� �ִ��� ���� +1 �Ѵ�. �ƹ��� ���� ���ٸ� 1 ���ؼ� 1��
*/
import java.util.Scanner;
public class StudentManager 
{	
	Student ar[] = new Student[10]; // ��ü 10���� �ּҸ� ���� ar �迭 ����
	Scanner scan = new Scanner(System.in); // Ű���� �Է¹ޱ�
	static int count; // �Է¹��� �л��� ���� ���� ���� �뵵

	
	
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
			}
			else
			{
				break;
			}
		}
		return n;
	}// menuPrint()

	// �л� ��� �޼ҵ�
	public void input()
	{
		System.out.println("[�л� ���]");
		if(count == ar.length)
		{
			Student x[] = new Student[ar.length * 2]; // �迭 ar ������ 2�谡 �Ǵ� �迭 x ����
			for(int i = 0; i < count; i++)
			{
				x[i] = ar[i];
			}
			ar = x; // �迭 x�� �ּҸ� �迭 ar�� �Ѱ� �迭 ���̰� 2�谡 �ǵ��� �Ѵ�.
		}
		ar[count] = new Student(); // ��ü ����
		System.out.print("�̸� : ");
		ar[count].setName(scan.next());
		System.out.print("���� ���� : ");
		ar[count].setKor(scan.nextInt());
		System.out.print("���� ���� : ");
		ar[count].setEng(scan.nextInt());
		System.out.print("���� ���� : ");
		ar[count].setMat(scan.nextInt());
		rankCheck(count);
		count++;
		System.out.println("* ��ϵǾ����ϴ�.");
	}// input()


	// ��ü �л� ���� ��� �޼ҵ�
	public void output()
	{
		if(count == 0)
		{
			System.out.println("* ��ϵ� �л��� �����ϴ�.");
			return;
		}
		
		
		/*
		double array[] = new double [10];
		double temp;
		boolean flag;
		for(int i = 0; i < count; i++)
		{
			array[i] = ar[i].getAvg();
		}
		for(int i = count - 1; i > 0; i--)
		{
			flag = true;
			for(int j = 0; j < i; j++)
			{
				if(array[i] < array[i + 1])
				{	
					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					flag = false;
				}
			}
			if(flag == true)
			{
				break;
			}
		}
		*/
		

		// Arrays.sort(ar, Collections.reverseOrder());

		/*
		for(int i = 0; i < ar.length - 1; i++)
		{
			for(int j = 0; j < ar.length; j++)
			{
				if(ar[i].getAvg() < ar[i].getAvg())
				{
					double temp = ar[i].getAvg();
					ar[i].getAvg() = ar[j].getAvg();	//  error: unexpected type
					ar[j].getAvg() = temp;				//  error: unexpected type
				}
			}
		}
		*/
		

		for(int i = 0; i < count; i++)
		{
			System.out.println("[��ü �л� ����]");
			System.out.println("�̸� : " + ar[i].getName());
			System.out.println("���� ���� : " + ar[i].getKor() + " ���� ���� : " + ar[i].getEng() + " ���� ���� : " + ar[i].getMat());
			System.out.println("���� : " + ar[i].getTotal() + " ��� : " + ar[i].getAvg() + " ���� : " + ar[i].getRank() + "��");
		}
	}// output()



	// �л� �˻� �޼ҵ�
	public void search()
	{
		System.out.println("[�л� �˻�]");
		System.out.print("�˻��� �л� �̸� : ");
		String name = scan.next();
		int n = 0;
		for(int i = 0; i < count; i++)
		{
			if(name.equals(ar[i].getName()))
			{
				n++;
				System.out.println(i + "��° �л� �����Դϴ�.");
				System.out.println("�̸� : " + ar[i].getName());
				System.out.println("���� ���� : " + ar[i].getKor() + " ���� ���� : " + ar[i].getEng() + " ���� ���� : " + ar[i].getMat());
				System.out.println("���� : " + ar[i].getTotal() + " ��� : " + ar[i].getAvg() + " ���� : " + ar[i].getRank() + "��");
			}
		}
		if(n == 0)
		{
			System.out.println("��ϵ� �л��� �����ϴ�.");
		}
		else
		{
			System.out.println("�� " + n + "���� �˻��Ǿ����ϴ�.");
		}
	}// search()

	public void rankCheck(int count)
	{
		
		for (int i = 0; i <= count; i++)
		{
			int rank = 1;
			for (int j = 0; j <= count; j++)
			{
				if (ar[i].getTotal() < ar[j].getTotal()) 
				{
					rank++;
				}
				else 
				{
					continue;
				}
			}
			ar[i].setRank(rank);
		}
	}


	// main �޼ҵ�
	public static void main(String[] args) 
	{
		StudentManager s = new StudentManager();
		while(true)
		{
			int num = s.menuPrint();
			switch(num)
			{
				case 1:
					s.input();
					break;
				case 2:
					s.output();
					break;
				case 3:
					s.search();
					break;
				case 0:
					System.out.println("���α׷��� �����մϴ�.");
					return;
			}// switch��
		}// while��
		
	}// main()
}// class
