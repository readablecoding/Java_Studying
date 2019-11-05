import java.util.Scanner;
public class MemberTest3 
{	
	
	Member ar[] = new Member[5]; // ȸ�������� ���� �迭 ����, ar�� ��ü 5���� ���� �迭�� �ּҸ� ����
	int count; // ������� ����� ȸ�� ��
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) 
	{
		MemberTest3 m = new MemberTest3(); // ��ü�� �����. �迭�� �ϳ� �����, count�� 0�̴�. ��Ϲް� count�� 1����.�� ���� 5�� �ȴ�.
		while(true)
		{	
			int num = m.menuPrint();	//�޴� ����ϰ� �޴���ȣ �Է¹���
			switch(num)					//�޴� ��ȣ �Է¹޾� �޼ҵ� ȣ��
			{
				case 1:
					m.input();
					break;
				case 2:
					m.output();
					break;
				case 3:
					m.search();
					break;
				case 0:
					System.out.println("���α׷��� �����մϴ�.");
					return;
			}
			
		}

	}//main()

	//�޴� ��� �޼ҵ�
	public int menuPrint()  // return�� int���� ������ �� ������ num�� ���� �Ѱ� switch������ 1~0�߿��� ������ �޴� ���� ����
	{
		int n = 0;
		System.out.println("[ȸ������ ���α׷�]");
		System.out.println("1.���");
		System.out.println("2.��ü���");
		System.out.println("3.�˻�");
		System.out.println("0.����");
		System.out.print("���� > ");

		// 0, 1, 2, 3�� �ƴϸ� �ٽ� �Է� ����
		while(true)
		{
			n = scan.nextInt();
			if(n < 0 || n > 3)
			{
				System.out.println("�ٽ� �����ϼ���.");
			}
			else
			{
				break;
			}
		}
		return n; // n���� �������� �� ������ �����ϰ� �����.
	}//menuPrint()

	//ȸ�� ��� �޼ҵ�
	public void input()
	{
			
		System.out.println("[ȸ�� ���]");
			
		/*
		// ���� �迭�� ���ҿ� ���� ���ϰ� ��
		if(count == ar.length) 
		{
			System.out.println("�� �̻� ����� �� �����ϴ�.");
			return;
		}
		*/

		// �غ��� �迭�� ��� á�� ���� �迭�� 2�� ũ��� �ø�
		if(count == ar.length)
		{
			Member x[] = new Member[ar.length * 2]; // x �迭�� ar �迭�� 2�� ���̰� �ȴ�.
			for(int i = 0; i < count; i++) // count �� ��ŭ �ݺ�
			{
				x[i] = ar[i]; // ar�� �� ���ҵ��� x�� �ű��.
			}
			ar = x; // x�� ar �迭�� ����Ű�� �����. x�� ����Ű�� �ִ� �ּҸ� ar�� ������ ar�� �� �迭�� ���� �ȴ�.
		}		
		ar[count] = new Member(); // ó������ 0������ ä��� �� �ϰ� �������� 1���� ä��� ������
		System.out.print("�̸�: ");
		ar[count].setName(scan.next());
		System.out.print("�������(YYMMDD): ");
		ar[count].setBirth(scan.next());
		System.out.print("Ű : ");
		ar[count].setHeight(scan.nextDouble());
		System.out.print("������ : ");
		ar[count].setWeight(scan.nextDouble());
		System.out.print("������ : ");
		ar[count].setType(scan.next());
		count++;	// 1�� �ߴٴ� ���� 1 ���������ν� ������
		System.out.println("* ��ϵǾ����ϴ�.");
		
	}//input()


	//��ü ȸ�� ��� �׽�Ʈ
	public void output()
	{	
		if(count == 0)
		{
			System.out.println("* ��ϵ� ȸ���� �����ϴ�.");
			return;
		}
		
		for(int i = 0; i < count; i++)	//0������ count��ŭ(��ϵ� ��� �� ��ŭ) �ݺ��ǵ��� �Ѵ�.
		{	
			System.out.println("[��ü ȸ�� ���]");
			System.out.println(ar[i].getName() + "\t" + ar[i].getAge() + "\t" + ar[i].getBmi() + "\t" + ar[i].getBmi("GRADE"));
		}
		
	}//output()

	//ȸ�� �˻� �޼ҵ�
	public void search()
	{
		System.out.println("[ȸ�� �˻�]");
		System.out.print("�˻��� ȸ�� : ");
		String name = scan.next();
		int n = 0; // ���� ���� ���� Ȯ���ϱ� ���� ����
		for(int i = 0; i < count; i++)
		{
			if(name.equals(ar[i].getName())) // .euqls()�� ��ü �� �޼����̴�. .���� �Ͱ� ()�� ���� ������ ������ ����
			{
				n++; // ȸ���� ������ 1 �����Ѵ�.
				System.out.println(ar[i].getName() + "\t" + ar[i].getAge() + "\t" + ar[i].getBmi() + "\t" + ar[i].getBmi("GRADE"));
			}
		}
		if(n == 0)
		{
			System.out.println("ȸ���� �����ϴ�.");
		}
		else
		{
			System.out.println("�� " + n + "���� �˻��Ǿ����ϴ�.");
		}
	}//search

}//class