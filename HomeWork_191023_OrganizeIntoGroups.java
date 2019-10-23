/*
학생 18명 넣은 배열
반 학생들 이름 모두 배열에 저장
인원 수 입력받음
조 편성(마지막 조는 인원 모자랄 수도 있음)

랜덤으로 조 편성
5명이라면 4개조인데 마지막 조는 3명이다
학생들에 조 번호를 부여한다.
*/
import java.util.Scanner;
class HomeWork_191023_OrganizeIntoGroups
{

	public static void main(String[] args) 
	{
		String member[] = {"김성현", "김언주", "박선미", 
							"박완 ", "이진원", "진동환",
							"김보성", "문지연", "박민열",
							"심재형", "조은채", "강수현", 
							"김영수", "김태균", "박세훈",  
							"유송화", "정수환", "추경민"};
		 
		// 1) 순서대로 조를 짤 때 + 조 편성 개수는 입력 받는다.
		
		/*
		Scanner scan = new Scanner(System.in);
		System.out.print("몇 개의 조로 편성하겠습니까? : ");
		int n = scan.nextInt(); // 그룹 수를 정함
		
		int cnt = 0;
		
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < (member.length / n); j++)
			{	
				
				System.out.print(member[cnt] + " ");
				cnt++;
			}	
			System.out.println();
			
		}
		if(member.length > cnt)
		{
			for(int j = 0; j < (member.length % n); j++)
			{
				System.out.print(member[member.length - 1 - j] + " ");
			}
		}
		System.out.println();	
		*/

		
		// 2) 순서 없이 조를 짤 때 + 조 편성 개수는 입력 받는다

		Scanner scan = new Scanner(System.in);
		System.out.print("몇 개의 조로 편성하겠습니까? : ");
		int n = scan.nextInt(); // 그룹 수를 정함
		String a[] = new String [member.length];
		int i, j, k;
		

		// 순서 섞기 -> 랜덤 숫자를 받아 새로운 배열에 넣되 중복이 없게끔 한다.
		for(i = 0; i < member.length; i++)
		{
			
			a[i] = member[(int)(Math.random() * 18)]; // 임의로 0에서 17까지의 배열을 만들어 대입
			for(j = 0; j < i; j++)
			{
				if(a[i].equals(a[j]))	// 중복이 발견되면 a[i]의 값을 다시 받게끔 한다.
				{
					i--;
				}
			}
		}
		System.out.println();

		// 몫을 통해 그룹 설정
		int cnt = 0;	// 순서를 보여주기 위함
		for(i = 0; i < n; i++)
		{
			System.out.print((i + 1) + "조 : ");
			for(j = 0; j < (a.length / n); j++)
			{
				System.out.print(a[cnt] + " ");
				cnt++;
			}
			System.out.println();
		}
		
		// 나머지가 있을 때 그룹 설정
		if(a.length % n != 0)	// 나머지가 0이 안되면 마지막 조로 편성한다.
		{
			cnt++;	// 순서를 맞추기 위해 cnt에 1을 더한다.
			System.out.print((n + 1) + "조 : ");
			for(i = 0; i < (a.length % n); i++)
			{
				System.out.print(a[cnt - 1 + i] + " ");	// 이전 계산 다음부터 나머지 개수 만큼 반복하며 출력
			}
			System.out.println();
		}

	}	// main
}	// class
