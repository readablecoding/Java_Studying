class InheritTest 
{
	public static void main(String[] args) 
	{
		A ob1 = new A();				// AŬ������ ������ -> �����ڸ� �̿��� A��� Ŭ������ ��ü ����. ob1�� ���۷��� �����̴�.
		ob1.print();					// AŬ������ �޼ҵ� -> public�̶� ���������� ���� ����.
		System.out.println(ob1.num);	// 1 -> ��ü �ȿ� �ִ� ������ ���� ���
		System.out.println();
		
										// AŬ������ ������
		B ob2 = new B();				// BŬ������ ������ -> ���� Ŭ���� ��ü�� ���� �� ���� Ŭ���� ��ü�� ���� ����ȴ�.�׷��� AŬ������ �����ڰ� ���� ����
		ob2.print();					// BŬ������ print �޼ҵ� -> �޼ҵ� �����Ǹ� �ϴϱ� �ܺκ��� ���� ã�´�. �������̵��� ��ӹ��� ���� �ٽ� ����� ��
		System.out.println(ob2.num);	// 2
		System.out.println();

										// AŬ������ ������
		A ob3 = new B();				// BŬ������ ������ -> A ob3�� AŬ������ ����Ų��. B��� Ÿ���� ��ü�� �������� A ob3�� B ��ü�� ���� ���� �ִ����� �𸥴�.
		ob3.print();					// BŬ������ print �޼ҵ�
		System.out.println(ob3.num);	// 1
		//ob3.bMethod();				// cannot find symbol
		//System.out.println(ob3 instanceof B);	// true
		//System.out.println(ob3 instanceof A);	// true
		((B)ob3).bMethod();				// BŬ������ bMethod �޼ҵ� -> ���� �ּҸ� B Ÿ������ �ٲ۴�. �� �������� ���
		B ob4 = (B) ob3;				// ob3�� B Ÿ���̶�� ���� ��Ÿ���� ����� ��� -> ���� ob4�� b
		ob4.bMethod();					// BŬ������ bMethod �޼ҵ�
		//System.out.println(ob4 instanceof B);	// true
		//System.out.println(ob4 instanceof A);	// true
		ob4.print();					// BŬ������ print �޼ҵ�	
		System.out.println();
	}// main()
}// class
