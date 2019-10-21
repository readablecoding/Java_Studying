class ArrayTest4

{
	public static void main(String[] args) 
	{
		
		
		int a[] = new int[3];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		
		
		// 생성 및 초기화
		int b[] = {10, 20, 30}; // 중괄호 만큼 값이 생긴다. new int[3]이 생략된 것이다. 한번만 쓸 수 있다.
		double c[] = { 1.5, 3.14, 5.5, 3.3};  // new double c[4]
		char d[] = { 'a', 'b', 'c'};
		String e[] = { "aaa", "bbb", "ccc"};
		
		
		
	
		System.out.println(b);
		for(int i = 0; i < b.length; i++)
		{
			System.out.print(b[i] + " ");
		}
		System.out.println();
		System.out.println();

		System.out.println(c);
		for(int i = 0; i < c.length; i++)
		{
			System.out.print(c[i] + " ");
		}
		System.out.println();
		System.out.println();

		System.out.println(d);
		for(int i = 0; i < d.length; i++)
		{
			System.out.print(b[i] + " ");
		}
		System.out.println();
		System.out.println();

		System.out.println(e);
		for(int i = 0; i < e.length; i++)
		{
			System.out.print(e[i] + " ");
		}
		System.out.println();
		System.out.println();

		
	}
}
