// ������ ���� ���
// �褱�� 28�� 18.7 ����
// �褱�� 21�� 55.1 ��
// �褱�� 28�� 18.7 ����
// �褱�� 28�� 18.7 ����
// �褱�� 28��	 18.7 ����

import java.util.Scanner;
public class Membertest2 
{
	public static void main(String[] args) 
	{
		// 5���� ȸ�������� ���� �迭 ����
		Member array[];
		array = new Member[5];
		

		// Ű����� �ݺ����� �̿��Ͽ� 5�� ȸ���� ������ �Է¹޴´�.
		Scanner scan = new Scanner(System.in);

		String name;
		String birth;
		double height;
		double weight;
		String type;


		for(int i = 0; i < array.length; i++)
		{
			System.out.print((i + 1) + "��° ȸ���� �̸��� �Է��ϼ��� : ");
			name = scan.next();
			

			System.out.print((i + 1) + "��° ȸ���� ��������� �Է��ϼ��� : ");
			birth = scan.next();
			

			System.out.print((i + 1) + "��° ȸ���� Ű�� �Է��ϼ��� : ");
			height = scan.nextDouble();
			

			System.out.print((i + 1) + "��° ȸ���� �����Ը� �Է��ϼ��� : ");
			weight = scan.nextDouble();

			System.out.print((i + 1) + "��° ȸ���� �������� �Է��ϼ��� : ");
			type = scan.next();
			
			array[i] = new Member(name, birth, height, weight, type);
			System.out.println();
				
		}

		for(int i = 0; i < array.length; i++)
		{
			System.out.println(array[i].getName() + " " + array[i].getAge() + "�� " + array[i].getBmi() + " " + array[i].getBmi("GRADE") +  " " +array[i].getType() + "��");
		}
		

	} //main
} //class

/*

1��° ȸ���� �̸��� �Է��ϼ��� : a
1��° ȸ���� ��������� �Է��ϼ��� : 101010
1��° ȸ���� Ű�� �Է��ϼ��� : 185
1��° ȸ���� �����Ը� �Է��ϼ��� : 87
1��° ȸ���� �������� �Է��ϼ��� : a

2��° ȸ���� �̸��� �Է��ϼ��� : b
2��° ȸ���� ��������� �Է��ϼ��� : 050505
2��° ȸ���� Ű�� �Է��ϼ��� : 175
2��° ȸ���� �����Ը� �Է��ϼ��� : 95
2��° ȸ���� �������� �Է��ϼ��� : b

3��° ȸ���� �̸��� �Է��ϼ��� : c
3��° ȸ���� ��������� �Է��ϼ��� : 020202
3��° ȸ���� Ű�� �Է��ϼ��� : 162
3��° ȸ���� �����Ը� �Է��ϼ��� : 45
3��° ȸ���� �������� �Է��ϼ��� : o

4��° ȸ���� �̸��� �Է��ϼ��� : d
4��° ȸ���� ��������� �Է��ϼ��� : 040404
4��° ȸ���� Ű�� �Է��ϼ��� : 170
4��° ȸ���� �����Ը� �Է��ϼ��� : 65
4��° ȸ���� �������� �Է��ϼ��� : a

5��° ȸ���� �̸��� �Է��ϼ��� : e
5��° ȸ���� ��������� �Է��ϼ��� : 060606
5��° ȸ���� Ű�� �Է��ϼ��� : 173
5��° ȸ���� �����Ը� �Է��ϼ��� : 95
5��° ȸ���� �������� �Է��ϼ��� : b

a 9�� 25.0 �� A��
b 14�� 31.0 �� B��
c 17�� 17.0 ��ü�� O��
d 15�� 22.0 ����ü�� A��
e 13�� 32.0 �� B��

*/