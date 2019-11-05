// ������ ���� ���
// �褱�� 28�� 18.7 ����
// �褱�� 21�� 55.1 ��
// �褱�� 28�� 18.7 ����
// �褱�� 28�� 18.7 ����
// �褱�� 28��	 18.7 ����

import java.util.Scanner;
public class Membertest2 
{
	// 5���� ȸ�������� ���� �迭 ����
	Member ar[] = new Member[5]; // ��� ��ü 5���� �ּҸ� ���� �� �ְ� �Ѵ�. ���� ��ü ������ �ȵ� new��� �ž� �׶� ��� ����
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) 
	{
		Membertest2 m = new Membertest2(); // ���� Ŭ���� ��ü�� �����.
		m.test(); // �޼ҵ� ����� -> // main�� static���� ��ü ���� ����Ǵµ� test()�� static�� �ƴϾ ��ü�� �־�� ������ �ǹǷ� �ȵȴ� static�޼���� static�� �ƴ� �޼��带 ȣ�� ����
		m.input(); // �ݺ������� 5�� ������ ���´�.
		m.output();	// ��� �޼ҵ带 ���� ���� ar�迭�� ȸ�� ������ ����ϴ� ��
	} //main()

	public void test()
	{
		System.out.println("�޼ҵ� �����");
	} //test()
	
	// Ű����� ȸ������ �Է¹޾� �迭�� ����
	public void input()
	{
		for(int i = 0; i < ar.length; i++)
		{
			/*
			ar[0] = new Member();	// Member ��ü�� ����� 0�� �ּҿ� �ִ´�.	
			ar[0].setName("zaaa"); // �迭�� 0�� �濡 ���� null���� ����ִ�. ��ü�� ����. ��ü ���� �ȵ�.�ƹ��͵� ����Ű�� �ʴ´�. nullpointerexception�̴�.  ar[0] = new Member(); ����� �Ѵ�.
			*/

			ar[i] = new Member();	// Member ��ü�� ����� i�� �ּҿ� �ִ´�.
			System.out.print("�̸� : ");
			ar[i].getName(scan.next());	// �Է� ���� ���� setName()�޼ҵ带 ȣ���� ���� ������.
			System.out.print("�������(YYMMDD) : ");
			ar[i].setBirth(scan.next()); // �Է� ���� ���� setBirth()�޼ҵ带 ȣ���� ���� ������.
			System.out.print("Ű : ");
			ar[i].setHeight(scan.nextDouble()); // �Է� ���� ���� setHeight()�޼ҵ带 ȣ���� ���� ������.
			System.out.print("������ : ");
			ar[i].setWeight(scan.nextDouble()); // �Է� ���� ���� setWeight()�޼ҵ带 ȣ���� ���� ������.
			System.out.print("������ : ");
			ar[i].setType(scan.next()); // �Է� ���� ���� setType()�޼ҵ带 ȣ���� ���� ������.
			System.out.println();
		}
	} //input()

	// �迭�� ��� ȸ������ ���
	public void output()
	{
		for(int i = 0; i < ar.length; i++)
		{
			System.out.println(ar[i].getName() + "\t" + ar[i].getAge() + "��\t" + ar[i].getBmi() + "\t" + ar[i].getBmi("GRADE"));
		}
	} //output()
} //class

/*

�޼ҵ� �����
�̸� : a
�������(YYMMDD) : 900101
Ű : 167
������ : 68
������ : o

�̸� : b
�������(YYMMDD) : 890202
Ű : 176
������ : 89
������ : a

�̸� : c
�������(YYMMDD) : 950303
Ű : 162
������ : 47
������ : b

�̸� : d
�������(YYMMDD) : 970404
Ű : 178
������ : 70
������ : o

�̸� : e
�������(YYMMDD) : 930505
Ű : 180
������ : 89
������ : a

a       29��    24.0    ��ü��  O
b       30��    29.0    ��    A
c       24��    18.0    ��ü��  B
d       22��    22.0    ����ü��        O
e       26��    27.0    ��    A

*/