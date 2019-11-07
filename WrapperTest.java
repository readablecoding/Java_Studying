class WrapperTest 
{
	public static void main(String[] args) 
	{
		int a = 10;
		Integer b = new Integer(10);
		String c = "10";

		//�� ���: ��� 10�̶�� ���� ���̰� �ȴ�.
		/*
		System.out.println(a);	// 10
		System.out.println(b);	// 10
		System.out.println(c);	// 10
		*/
		
		// System.out.println("�����" + (a + a))'; // ��ȣ�� ��� �Ѵ�.
		System.out.println();
		System.out.println(a + a);	//20
		System.out.println(a + c);	//1010
		System.out.println(a + "" + b);	//1010
		System.out.println(Integer.toString(a) + b.toString());	//1010 -> int�� String���� �ٲٰ�, ��ü�� String���� �ٲٴ� �� 
		// Integer.toString(a)�� static�̰� parameter�� �޴� ���̰� b.toString()�� �Ϲ� �޼ҵ� �� parameter�� ���� �ʴ� ��
		System.out.println(a + b.intValue());	//20 -> ��ü�� int�� �ٲ㼭 10 + 10�� �ϴ� ��


		//�⺻�ڷ��� -> Wrapper ��ü ��ȯ
		Integer d = new Integer(a); // int�� a�� Integer �����ڷ� �� ��ü �����.

		//�⺻�ڷ��� -> String ��ȯ: ��ü�� ������� �ʰ� ��ȯ
		String e = Integer.toString(a); // static�� Integer.toString()�޼ҵ带 ���� int�� ���ڿ��� �ٲ���
		//String e = (String) a;			// a�� int���ε� Ŭ�����̸����� ����ȯ�Ѵٴ� ���� �Ұ����ϴ�. ���� �߻�
	
		//String -> Wrapper ��ü ��ȯ
		Integer f = new Integer(c); // ������ ������ �޾� �����

		//String -> �⺻�ڷ��� ��ȯ
		int g = Integer.parseInt(c); // ���ڿ��� int�� �ٲ���. 

		//Wrapper ��ü -> �⺻�ڷ��� ��ȯ
		int h = b.intValue();

		//Wrapper ��ü -> String ��ȯ
		String i = b.toString();



		Integer x = new Integer(100);	// 100�̶�� ���ڸ� �����ϴ� ��ü�� ����� ���� x�� �ּҸ� �����Ѵ�.
		Integer y = new Integer(100);	
		// ��ü���� �񱳿����� �� �� ����.
		System.out.println(x == y);	//false -> �ּҺ�. ��ü�� ���� �ٸ� �ּҸ� ���� �־ false ����
		System.out.println(x > y);	//false	
		System.out.println(x < y);	//false
		System.out.println(x.compareTo(y)); // 0 -> ���� ��. ������ 0, ������ ũ�� 1 �������� ũ�� -1

		/* String ���ڿ� ��
		String m = "a";
		String n = "c";
		System.out.println(m.compareTo(n)); // -2
		*/

	}//main()
}//class
