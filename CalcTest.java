// Calc Ŭ������ ��ü�� ����� ����ϴ� �κ�
public class CalcTest 
{
	public static void main(String[] args) 
	{
		Calc c = new Calc();
		int a[] = {1, 2, 3, 4, 5};
		
		// 1) �迭�� ���޹޾� ��������� �����ϴ� �޼ҵ� 
		c.setArray(a);
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		// 2) �迭�� ���� ������ �����ϴ� �޼ҵ�
		int cnt = c.count();
		System.out.println("���� : " + cnt);

		// 3) �迭 ���� ��� ���� �հ踦 �����ϴ� �޼ҵ�
		int s = c.sum();
		System.out.println("�հ� : " + s);
		
		// 4) int�� ���� �ϳ��� ���޹޾� ��� ���ҿ� ���ϱ� �ϴ� �޼ҵ�
		c.setNumber(1);
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		// 5)���� 2���� ���޹޾� a�� b���� ���Ͽ� �����ϴ� �޼ҵ�
		c.square(2,3);
		System.out.println(c.square(2,3));
	}
}
