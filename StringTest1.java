class StringTest1 // String 공부  
{
	public static void main(String[] args) 
	{
		String a;
		String b = null;
		String c = "abc";
		String d = "abc";
		String e = new String("abc");
		String f = new String("abc");
	
		//결과 확인
		//System.out.println(a);	// error: variable a might not have been initialized -> 초기화를 안해서 오류
		System.out.println(b);		// null
		System.out.println(c);		// abc
		System.out.println(d);		// abc
		System.out.println(e);		// abc
		System.out.println(f);		// abc
		System.out.println(c == d);			// true -> 객체가 하나이고 같은 주소를 가리킴
		System.out.println(e == f);			// false -> 객체가 서로 다르므로 다른 주소를 가리킴
		boolean x = c.equals(d); // true 또는 false이므로 boolean 타입을 쓴다.
		boolean y = e.equals(f); // true 또는 false이므로 boolean 타입을 쓴다.
		System.out.println(x);	// true -> 객체의 내용이 같으므로 true
		System.out.println(y);	// true -> 객체의 내용이 같으므로 true
		System.out.println(c.length());		// 객체의 길이를 보여줌
		//System.out.println(b.length());		// Exception in thread "main" java.lang.NullPointerException 예외 -> 객체가 있는 줄 알았는데 없는 것
		
		a = "abcABCabcABC";
		
		
		System.out.println(a.charAt(1));	// b -> 해당 번째의 문자 보여줌. 없는 번호 부를 시 예외 발생 Exception in thread "main" java.lang.StringIndexOutOfBoundsException
		System.out.println(a.indexOf('d'));	// 2 -> 해당 문자의 위치 보여줌. 없는 글자 입력 후 출력하면 -1이 나온다. 
		System.out.println(a.indexOf("cccc"));	// -1 -> 없는 문자열인데도 -1이 나옴.	
		System.out.println(a.indexOf('c',1)); // 2 -> 1번 이후로 c를 찾아라
		System.out.println(a.lastIndexOf('A'));	// 9 -> 맨 뒤에서부터 A를 찾는다.
		System.out.println(a.substring(2,5)); //cAB -> 문자열의 2번부터 5번 전까지 읽는다.
		System.out.println(a.substring(6)); // abcABC -> 문자열의 6번부터 끝까지 다 읽는다.
	
		a = "Abc";
		System.out.println(a.equals("abc"));			// false -> 대소문자 구분을 하며 비교. 검색시 불리함
		System.out.println(a.equalsIgnoreCase("abc"));  // true  -> 대소문자 구분 안하고 비교. 검색시 용이함
		System.out.println(a.compareTo("abc"));			// 0      -32 -> 코드 값 빼는 것. 첫 글자부터 비교해서 양수라면 앞의 값이 큰 것, 음수라면 뒤의 값이 큰 것
		
		System.out.println(a.startsWith("Ab"));			// true -> "Ab"로 시작하는가?
		System.out.println(a.endsWith("c"));			// true -> "c"로 끝나는가?
		System.out.println(a.replace("b", "B"));		// ABc -> 문자열 내의 "b"를 모두 "B"로 변경
		
		a = "abcde";
		System.out.println(a.compareTo("abc"));			// 2 -> 앞부분이 같아서 글자 수 차이를 보여줌


		a = "010-1234-5678";
		String array[] = a.split("-");	// 특정 문자를 단위로 잘라서 배열로 만들어 주는 것. 이메일 주소에서 아이디 부분만 찾을 때
		System.out.println(array[0]);	// 배열 위치 첫번째
		System.out.println(array[1]);	// 배열 위치 두번째
		System.out.println(array[2]);	// 배열 위치 세번째

	}	// main()
}	// class
