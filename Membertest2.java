// 다음과 같이 출력
// 김ㅁㅁ 28세 18.7 정상
// 김ㅁㅁ 21세 55.1 비만
// 김ㅁㅁ 28세 18.7 정상
// 김ㅁㅁ 28세 18.7 정상
// 김ㅁㅁ 28세	 18.7 정상

import java.util.Scanner;
public class Membertest2 
{
	public static void main(String[] args) 
	{
		// 5명의 회원정보를 담을 배열 생성
		Member array[];
		array = new Member[5];
		

		// 키보드로 반복문을 이용하여 5명 회원의 정보를 입력받는다.
		Scanner scan = new Scanner(System.in);

		String name;
		String birth;
		double height;
		double weight;
		String type;


		for(int i = 0; i < array.length; i++)
		{
			System.out.print((i + 1) + "번째 회원의 이름을 입력하세요 : ");
			name = scan.next();
			

			System.out.print((i + 1) + "번째 회원의 생년월일을 입력하세요 : ");
			birth = scan.next();
			

			System.out.print((i + 1) + "번째 회원의 키를 입력하세요 : ");
			height = scan.nextDouble();
			

			System.out.print((i + 1) + "번째 회원의 몸무게를 입력하세요 : ");
			weight = scan.nextDouble();

			System.out.print((i + 1) + "번째 회원의 혈액형을 입력하세요 : ");
			type = scan.next();
			
			array[i] = new Member(name, birth, height, weight, type);
			System.out.println();
				
		}

		for(int i = 0; i < array.length; i++)
		{
			System.out.println(array[i].getName() + " " + array[i].getAge() + "세 " + array[i].getBmi() + " " + array[i].getBmi("GRADE") +  " " +array[i].getType() + "형");
		}
		

	} //main
} //class

/*

1번째 회원의 이름을 입력하세요 : a
1번째 회원의 생년월일을 입력하세요 : 101010
1번째 회원의 키를 입력하세요 : 185
1번째 회원의 몸무게를 입력하세요 : 87
1번째 회원의 혈액형을 입력하세요 : a

2번째 회원의 이름을 입력하세요 : b
2번째 회원의 생년월일을 입력하세요 : 050505
2번째 회원의 키를 입력하세요 : 175
2번째 회원의 몸무게를 입력하세요 : 95
2번째 회원의 혈액형을 입력하세요 : b

3번째 회원의 이름을 입력하세요 : c
3번째 회원의 생년월일을 입력하세요 : 020202
3번째 회원의 키를 입력하세요 : 162
3번째 회원의 몸무게를 입력하세요 : 45
3번째 회원의 혈액형을 입력하세요 : o

4번째 회원의 이름을 입력하세요 : d
4번째 회원의 생년월일을 입력하세요 : 040404
4번째 회원의 키를 입력하세요 : 170
4번째 회원의 몸무게를 입력하세요 : 65
4번째 회원의 혈액형을 입력하세요 : a

5번째 회원의 이름을 입력하세요 : e
5번째 회원의 생년월일을 입력하세요 : 060606
5번째 회원의 키를 입력하세요 : 173
5번째 회원의 몸무게를 입력하세요 : 95
5번째 회원의 혈액형을 입력하세요 : b

a 9세 25.0 비만 A형
b 14세 31.0 비만 B형
c 17세 17.0 저체중 O형
d 15세 22.0 정상체중 A형
e 13세 32.0 비만 B형

*/