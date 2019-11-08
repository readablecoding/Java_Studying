import java.util.ArrayList;		//ArrayList 클래스를 쓰기 위한 준비작업
import java.util.Collections;	//Collections 클래스를 쓰기 위한 준비작업 
import java.util.Scanner;		//Scanner 클래스를 쓰기 위한 준비작업
class ListTest1 
{
	public static void main(String[] args) 
	{
		// cannot find symbol이므로 import java.util.ArrayList;가 필요하다
		ArrayList<String> list = new ArrayList<String>(); // ArrayList<자료형> 변수명 = new ArrayList<자료형>(생성자 호출)
		// ArrayList<String> list = new ArrayList<>(); -> 뒷부분에 <>식으로 생략해 쓴다.
		System.out.println(list); // []
		System.out.println();
		
		// 객체에 값 저장
		list.add("aaa"); // 문자열을 저장한다. String객체가 만들어지고 0번에 "aaa"의 주소가 들어가 참조하는 것
		list.add("bbb"); // String객체가 만들어지고 1번에 "bbb"의 주소가 들어가 참조하는 것
		list.add("ccc");
		list.add("ddd");

		System.out.println(list);				// 저장된 모든 요소 출력 -> [aaa, bbb, ccc, ddd]
		System.out.println(list.get(0));		// 0번 요소 읽어서 리턴 -> aaa
		System.out.println(list.size());		// 저장된 개수 -> 4
		System.out.println();

		// 한 줄에 하나씩 출력하는 방법
		for(int i = 0; i < list.size(); i++)	
		{
			System.out.println(list.get(i));	// 0번부터 size-1까지만 출력한다.
		}//for문
		System.out.println();

		// list의 요소 중에 "ccc"가 몇번째?
		for(int i = 0; i < list.size(); i++)	// 반복은 list.size()만큼 하도록 한다. 4번
		{
			if(list.get(i).equals("ccc"))		// 내용이 같은지 보기 위해 equals()메소드를 사용한다.
			{
				System.out.println(i + "번째");	// 위치 출력 -> 2번째
				break;							// break가 있으면 for문을 탈출한다.
			}//if문
		}//for문
		System.out.println();

		// list의 요소 중에 "ccc"가 몇번째?
		System.out.println(list.indexOf("ccc") + "번째");		// 2번째
		System.out.println();

		// 여러 메소드 사용
		System.out.println(list.contains("ccc"));			// true
		list.remove(0);										// 0번째 데이터 지움
		System.out.println(list);							// [bbb, ccc, ddd]
		list.remove("bbb");									// "bbb"를 지움
		System.out.println(list);							// [ccc, ddd]
		System.out.println(list.size());					// 2
		System.out.println(list.isEmpty());					// false
		System.out.println();
		System.out.println(list.lastIndexOf("ccc"));		// 0
		System.out.println();

		// Wrapper 클래스를 통해 숫자 입력과 출력
		ArrayList<Integer> list2 = new ArrayList<>();	// 숫자 10개를 담을 수 있게 된다.
		list2.add(new Integer(3));
		list2.add(new Integer(1));
		list2.add(new Integer(9));
		list2.add(new Integer(2));
		System.out.println(list2);	// [3, 1, 9, 2]
		System.out.println();

		// 정렬 -> cannot find symbol가 나온다. import java.util.Collections;가 필요하다
		Collections.sort(list2); // ArrayList를 주며 정렬해주라는 것 -> [1, 2, 3, 9]
		System.out.println(list2);

		//list2.remove(9) 
		list2.remove(new Integer(9));	// 숫자 9가 들어간 곳의 9를 지운다.
		System.out.println(list2);		// [1, 2, 3]
		System.out.println();
		
		// 삭제할 값을 키보드로 입력받아 지우기
		System.out.println(list2);
		System.out.print("삭제할 값 입력 : ");		//
		Scanner scan = new Scanner(System.in);	//	
		int n = scan.nextInt();					// 2 -> 키보드 값 입력받아 int형 변수 n에 대입
		if(list2.remove(new Integer(n)))		// new Integer(n) n을 객체를 만든다.// int형 변수 n을 Integer 객채로 만들고 그 값이 들어있는 곳에서 값을 지운다. 지웠으면 true, 안지웠으면 false
		{
			System.out.println("삭제되었습니다.");
		}
		else
		{
			System.out.println("찾는 값이 없습니다");
		list2.remove(new Integer(n));			
		System.out.println(list2);				// [1, 3]

	}//main()
}// class
