import java.util.Scanner;
class ArrayTest10
{
	public static void main(String[] args) 
	{	
		String s[] = {"홍길동", "김철수", "이영희"};
		//String test = "abcd";
		String name;	// 문자열
		//double d;		// 실수형
		int i;

		
		/*
		System.out.print("실수 입력 : ");
		d = in.nextDouble();	// double 형으로 입력받는다.
		System.out.print("문자열 입력 : ");
		name = in.next();		// String 형으로 입력받는다. next는 공백 없이 한 글자만 받을 수 있다.
		*/
		Scanner in = new Scanner(System.in);
		System.out.print("검색할 이름 : ");
		name = in.next();
		for(i = 0; i < s.length; i++)
		{
			//if(names == s[i]) -> 안에 들어있는 주소만 비교하게 된다. 내용 비교는 못함.
			if(name.equals(s[i])) // -> 문자열의 내용을 비교하게 된다.
			{
				break;
			}
		}
		
		if(i == s.length)
		{
			System.out.println("검색결과가 없습니다.");
		}
		else
		{
			System.out.println(i + "번째에서 검색되었습니다.");
		}
		System.out.println();

	}
}
