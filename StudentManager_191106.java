/*
[학생 성적 관리]
1. 등록
2. 전체 학생 성적 출력
3. 검색
0. 종료	

-등록은 학생이름, 국/영/수 점수를 입력받아 배열에 저장(Student 클래스 이용)
-출력은 학생이름, 국/영/수 점수, 총점, 평균, 석차를 출력
-검색은 학생이름을 입력받아 같은 이름의 학생정보 모두 출력
-석차 계산방법
1)성적순 정렬 
2)1등은 내 위에 아무도 없다. 평균점수 기준으로 나보다 큰 점수가 몇 개가 있는지 보고 +1 한다. 아무도 위에 없다면 1 더해서 1등
*/
import java.util.Scanner;
public class StudentManager 
{	
	Student ar[] = new Student[10]; // 객체 10개의 주소를 담을 ar 배열 선언
	Scanner scan = new Scanner(System.in); // 키보드 입력받기
	static int count; // 입력받은 학생들 수를 세기 위한 용도

	
	
	// 메뉴 출력 메소드
	public int menuPrint()
	{	
		int n = 0;
		System.out.println("[학생 성적 관리]");
		System.out.println("1. 등록");
		System.out.println("2. 전체 학생 성적 출력");
		System.out.println("3. 검색");
		System.out.println("0. 종료");
		System.out.print("선택 > ");
		while(true)
		{
			n = scan.nextInt();
			if(n < 0 || n > 3)	// 0부터 3까지 입력하지 않으면 다시 입력하도록 만든다.
			{
				System.out.println("잘못 입력했습니다. 다시 입력하세요.");
			}
			else
			{
				break;
			}
		}
		return n;
	}// menuPrint()

	// 학생 등록 메소드
	public void input()
	{
		System.out.println("[학생 등록]");
		if(count == ar.length)
		{
			Student x[] = new Student[ar.length * 2]; // 배열 ar 길이의 2배가 되는 배열 x 선언
			for(int i = 0; i < count; i++)
			{
				x[i] = ar[i];
			}
			ar = x; // 배열 x의 주소를 배열 ar에 넘겨 배열 길이가 2배가 되도록 한다.
		}
		ar[count] = new Student(); // 객체 생성
		System.out.print("이름 : ");
		ar[count].setName(scan.next());
		System.out.print("국어 점수 : ");
		ar[count].setKor(scan.nextInt());
		System.out.print("영어 점수 : ");
		ar[count].setEng(scan.nextInt());
		System.out.print("수학 점수 : ");
		ar[count].setMat(scan.nextInt());
		rankCheck(count);
		count++;
		System.out.println("* 등록되었습니다.");
	}// input()


	// 전체 학생 성적 출력 메소드
	public void output()
	{
		if(count == 0)
		{
			System.out.println("* 등록된 학생이 없습니다.");
			return;
		}
		
		
		/*
		double array[] = new double [10];
		double temp;
		boolean flag;
		for(int i = 0; i < count; i++)
		{
			array[i] = ar[i].getAvg();
		}
		for(int i = count - 1; i > 0; i--)
		{
			flag = true;
			for(int j = 0; j < i; j++)
			{
				if(array[i] < array[i + 1])
				{	
					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					flag = false;
				}
			}
			if(flag == true)
			{
				break;
			}
		}
		*/
		

		// Arrays.sort(ar, Collections.reverseOrder());

		/*
		for(int i = 0; i < ar.length - 1; i++)
		{
			for(int j = 0; j < ar.length; j++)
			{
				if(ar[i].getAvg() < ar[i].getAvg())
				{
					double temp = ar[i].getAvg();
					ar[i].getAvg() = ar[j].getAvg();	//  error: unexpected type
					ar[j].getAvg() = temp;				//  error: unexpected type
				}
			}
		}
		*/
		

		for(int i = 0; i < count; i++)
		{
			System.out.println("[전체 학생 성적]");
			System.out.println("이름 : " + ar[i].getName());
			System.out.println("국어 점수 : " + ar[i].getKor() + " 영어 점수 : " + ar[i].getEng() + " 수학 점수 : " + ar[i].getMat());
			System.out.println("총점 : " + ar[i].getTotal() + " 평균 : " + ar[i].getAvg() + " 석차 : " + ar[i].getRank() + "등");
		}
	}// output()



	// 학생 검색 메소드
	public void search()
	{
		System.out.println("[학생 검색]");
		System.out.print("검색할 학생 이름 : ");
		String name = scan.next();
		int n = 0;
		for(int i = 0; i < count; i++)
		{
			if(name.equals(ar[i].getName()))
			{
				n++;
				System.out.println(i + "번째 학생 성적입니다.");
				System.out.println("이름 : " + ar[i].getName());
				System.out.println("국어 점수 : " + ar[i].getKor() + " 영어 점수 : " + ar[i].getEng() + " 수학 점수 : " + ar[i].getMat());
				System.out.println("총점 : " + ar[i].getTotal() + " 평균 : " + ar[i].getAvg() + " 석차 : " + ar[i].getRank() + "등");
			}
		}
		if(n == 0)
		{
			System.out.println("등록된 학생이 없습니다.");
		}
		else
		{
			System.out.println("총 " + n + "건이 검색되었습니다.");
		}
	}// search()

	public void rankCheck(int count)
	{
		
		for (int i = 0; i <= count; i++)
		{
			int rank = 1;
			for (int j = 0; j <= count; j++)
			{
				if (ar[i].getTotal() < ar[j].getTotal()) 
				{
					rank++;
				}
				else 
				{
					continue;
				}
			}
			ar[i].setRank(rank);
		}
	}


	// main 메소드
	public static void main(String[] args) 
	{
		StudentManager s = new StudentManager();
		while(true)
		{
			int num = s.menuPrint();
			switch(num)
			{
				case 1:
					s.input();
					break;
				case 2:
					s.output();
					break;
				case 3:
					s.search();
					break;
				case 0:
					System.out.println("프로그램을 종료합니다.");
					return;
			}// switch문
		}// while문
		
	}// main()
}// class
