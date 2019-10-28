class StringTest1 // String ����  
{
	public static void main(String[] args) 
	{
		String a;
		String b = null;
		String c = "abc";
		String d = "abc";
		String e = new String("abc");
		String f = new String("abc");
	
		//��� Ȯ��
		//System.out.println(a);	// error: variable a might not have been initialized -> �ʱ�ȭ�� ���ؼ� ����
		System.out.println(b);		// null
		System.out.println(c);		// abc
		System.out.println(d);		// abc
		System.out.println(e);		// abc
		System.out.println(f);		// abc
		System.out.println(c == d);			// true -> ��ü�� �ϳ��̰� ���� �ּҸ� ����Ŵ
		System.out.println(e == f);			// false -> ��ü�� ���� �ٸ��Ƿ� �ٸ� �ּҸ� ����Ŵ
		boolean x = c.equals(d); // true �Ǵ� false�̹Ƿ� boolean Ÿ���� ����.
		boolean y = e.equals(f); // true �Ǵ� false�̹Ƿ� boolean Ÿ���� ����.
		System.out.println(x);	// true -> ��ü�� ������ �����Ƿ� true
		System.out.println(y);	// true -> ��ü�� ������ �����Ƿ� true
		System.out.println(c.length());		// ��ü�� ���̸� ������
		//System.out.println(b.length());		// Exception in thread "main" java.lang.NullPointerException ���� -> ��ü�� �ִ� �� �˾Ҵµ� ���� ��
		
		a = "abcABCabcABC";
		
		
		System.out.println(a.charAt(1));	// b -> �ش� ��°�� ���� ������. ���� ��ȣ �θ� �� ���� �߻� Exception in thread "main" java.lang.StringIndexOutOfBoundsException
		System.out.println(a.indexOf('d'));	// 2 -> �ش� ������ ��ġ ������. ���� ���� �Է� �� ����ϸ� -1�� ���´�. 
		System.out.println(a.indexOf("cccc"));	// -1 -> ���� ���ڿ��ε��� -1�� ����.	
		System.out.println(a.indexOf('c',1)); // 2 -> 1�� ���ķ� c�� ã�ƶ�
		System.out.println(a.lastIndexOf('A'));	// 9 -> �� �ڿ������� A�� ã�´�.
		System.out.println(a.substring(2,5)); //cAB -> ���ڿ��� 2������ 5�� ������ �д´�.
		System.out.println(a.substring(6)); // abcABC -> ���ڿ��� 6������ ������ �� �д´�.
	
		a = "Abc";
		System.out.println(a.equals("abc"));			// false -> ��ҹ��� ������ �ϸ� ��. �˻��� �Ҹ���
		System.out.println(a.equalsIgnoreCase("abc"));  // true  -> ��ҹ��� ���� ���ϰ� ��. �˻��� ������
		System.out.println(a.compareTo("abc"));			// 0      -32 -> �ڵ� �� ���� ��. ù ���ں��� ���ؼ� ������ ���� ���� ū ��, ������� ���� ���� ū ��
		
		System.out.println(a.startsWith("Ab"));			// true -> "Ab"�� �����ϴ°�?
		System.out.println(a.endsWith("c"));			// true -> "c"�� �����°�?
		System.out.println(a.replace("b", "B"));		// ABc -> ���ڿ� ���� "b"�� ��� "B"�� ����
		
		a = "abcde";
		System.out.println(a.compareTo("abc"));			// 2 -> �պκ��� ���Ƽ� ���� �� ���̸� ������


		a = "010-1234-5678";
		String array[] = a.split("-");	// Ư�� ���ڸ� ������ �߶� �迭�� ����� �ִ� ��. �̸��� �ּҿ��� ���̵� �κи� ã�� ��
		System.out.println(array[0]);	// �迭 ��ġ ù��°
		System.out.println(array[1]);	// �迭 ��ġ �ι�°
		System.out.println(array[2]);	// �迭 ��ġ ����°

	}	// main()
}	// class
