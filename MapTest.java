import java.util.HashMap;
class MapTest
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> map = new HashMap<>();
		
		//일단 기본 자료형을 객체로 만들어서 Key와 Value 형태로 인자를 넣는다.
		map.put(new Integer(1), new String("김"));
		map.put(new Integer(2), new String("이"));
		map.put(new Integer(3), new String("박"));
		System.out.println(map);						// {1=김, 2=이, 3=박}
		System.out.println();

		map.put(new Integer(1), new String("최"));		// {1=최, 2=이, 3=박} -> 같은 키 값이 2번 들어갈 수 없다.있던 것을 수정함
		System.out.println(map);
		System.out.println();
		
		System.out.println(map.get(new Integer(1)));	// 최 -> 키 값을 주면 해당 값을 보여준다.
		map.remove(new Integer(1));						// {2=이, 3=박} -> 키 값을 주면 해당 키와 값을 삭제
		System.out.println(map);
		System.out.println();

		HashMap<String, Object> map2 = new HashMap<>(); // 키는 문자열로 받고, 값은 아무거나 담겠다.
		map2.put("id", "abc");
		map2.put("name", "홍길동");
		map2.put("cart", new ArrayList<Integer>());		
		map2.put("age", new Integer(10));
	
	}//main()
}//class
