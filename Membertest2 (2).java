// 다음과 같이 출력
// 김ㅁㅁ 28세 18.7 정상
// 김ㅁㅁ 21세 55.1 비만
// 김ㅁㅁ 28세 18.7 정상
// 김ㅁㅁ 28세 18.7 정상
// 김ㅁㅁ 28세	 18.7 정상

import java.util.Scanner;
public class Membertest2 
{
	// 5명의 회원정보를 담을 배열 생성
	Member ar[] = new Member[5]; // 멤버 객체 5개의 주소를 담을 수 있게 한다. 아직 객체 생성은 안됨 new라고 돼야 그때 사용 가능
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) 
	{
		Membertest2 m = new Membertest2(); // 현재 클래스 객체를 만든다.
		m.test(); // 메소드 실행됨 -> // main은 static으로 객체 없이 실행되는데 test()는 static이 아니어서 객체가 있어야 실행이 되므로 안된다 static메서드는 static이 아닌 메서드를 호출 못함
		m.input(); // 반복문으로 5명 정보를 맏는다.
		m.output();	// 출력 메소드를 통해 현재 ar배열의 회원 정보를 출력하는 것
	} //main()

	public void test()
	{
		System.out.println("메소드 실행됨");
	} //test()
	
	// 키보드로 회원정보 입력받아 배열에 저장
	public void input()
	{
		for(int i = 0; i < ar.length; i++)
		{
			/*
			ar[0] = new Member();	// Member 객체를 만들어 0번 주소에 넣는다.	
			ar[0].setName("zaaa"); // 배열의 0번 방에 지금 null값이 들어있다. 객체가 없다. 객체 생성 안됨.아무것도 가리키지 않는다. nullpointerexception이다.  ar[0] = new Member(); 해줘야 한다.
			*/

			ar[i] = new Member();	// Member 객체를 만들어 i번 주소에 넣는다.
			System.out.print("이름 : ");
			ar[i].getName(scan.next());	// 입력 받은 것을 setName()메소드를 호출해 값을 보낸다.
			System.out.print("생년월일(YYMMDD) : ");
			ar[i].setBirth(scan.next()); // 입력 받은 것을 setBirth()메소드를 호출해 값을 보낸다.
			System.out.print("키 : ");
			ar[i].setHeight(scan.nextDouble()); // 입력 받은 것을 setHeight()메소드를 호출해 값을 보낸다.
			System.out.print("몸무게 : ");
			ar[i].setWeight(scan.nextDouble()); // 입력 받은 것을 setWeight()메소드를 호출해 값을 보낸다.
			System.out.print("혈액형 : ");
			ar[i].setType(scan.next()); // 입력 받은 것을 setType()메소드를 호출해 값을 보낸다.
			System.out.println();
		}
	} //input()

	// 배열로 모든 회원정보 출력
	public void output()
	{
		for(int i = 0; i < ar.length; i++)
		{
			System.out.println(ar[i].getName() + "\t" + ar[i].getAge() + "세\t" + ar[i].getBmi() + "\t" + ar[i].getBmi("GRADE"));
		}
	} //output()
} //class

/*

메소드 실행됨
이름 : a
생년월일(YYMMDD) : 900101
키 : 167
몸무게 : 68
혈액형 : o

이름 : b
생년월일(YYMMDD) : 890202
키 : 176
몸무게 : 89
혈액형 : a

이름 : c
생년월일(YYMMDD) : 950303
키 : 162
몸무게 : 47
혈액형 : b

이름 : d
생년월일(YYMMDD) : 970404
키 : 178
몸무게 : 70
혈액형 : o

이름 : e
생년월일(YYMMDD) : 930505
키 : 180
몸무게 : 89
혈액형 : a

a       29세    24.0    과체중  O
b       30세    29.0    비만    A
c       24세    18.0    저체중  B
d       22세    22.0    정상체중        O
e       26세    27.0    비만    A

*/