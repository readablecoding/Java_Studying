import java.util.Scanner; // 키보드로 입력을 받겠다.
import java.util.ArrayList;
public class StudentManager2
{
	ArrayList<Student> list = new ArrayList<Student>(); // ArrayList를 사용해 Student 클래스를 자료형으로 사용해 변수 list가 배열의 주소를 참조함
	Scanner scan = new Scanner(System.in);

	// main 메소드
	public static void main(String[] args) 
	{
		StudentManager m = new StudentManager(); // StudentManager 클래스의 참조데이터 변수명 m(객체 m)을 만든다. 참조변수를 만든 이유는 메서드들이 static이 아니어서
		while(true)
		{
			int num = m.menuPrint(); // 입력된 n을 반환받아 num에 대입
			switch(num)
			{
				case 1:
					m.input();	// 등록 메서드 호출
					break;
				case 2:
					m.output();	// 성적 메서드 호출
					break;
				case 3:
					m.search();	// 검색 메서드 호출
					break;
				case 0:
					System.out.println("프로그램을 종료합니다.");
					return;
			}// switch문
		}// while문
	}// main()

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
				System.out.print("선택 > ");
			}// if문
			else
			{
				break; // 제대로 입력하면 while문 탈출
			}// else문
		}// while문
		return n; // 입력된 n을 반환한다.
	}// menuPrint()

	// 학생 등록 메소드
	public void input()
	{
		System.out.println();
		System.out.println("[학생 등록]");
		System.out.print("이름 : ");
		String n = scan.next();
		System.out.print("국어점수 : ");
		int k = scan.nextInt();
		System.out.print("영어점수: ");
		int e = scan.nextInt();
		System.out.print("수학점수: ");
		int m = scan.nextInt();
		list.add(new Student(n, k, e, m));
		System.out.println("* 등록되었습니다.");
		System.out.println();
	}// input()

	// 전체 학생 성적 출력 메소드
	public void output()
	{
		if(list.size() == 0)
		{
			System.out.println("* 등록된 학생이 없습니다.");
			System.out.println();
			return;
		}// if문
		System.out.println();
		System.out.println("[전체 학생 목록]");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t석차");
		for(int i = 0; i < list.size(); i++)
		{
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%3.1f\t%d\n", 
					list.get(i).getName(),list.get(i).getKor(), list.get(i).getEng(), 
					list.get(i).getMat(), list.get(i).getTotal(), list.get(i).getAvg(), 
					this.getRank(list.get(i).getAvg()));
			System.out.println();
		}// for문
	}// output()

	// 학생 검색 메소드
	public void search()
	{
		System.out.println();
		System.out.println("[학생 검색]");
		System.out.print("검색할 학생 이름 : ");
		String name = scan.next(); // 이름 입력 받기
		int n = 0; // 같은 사람이 있는지 비교하기 위해 만든 변수
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t석차");
		for(int i = 0; i < list.size(); i++)
		{
			if(list.contains(name)) // 입력받은 이름과 배열이 참조한 객체의 이름과 비교
			{	
				n++; 
				System.out.printf("%s\t%d\t%d\t%d\t%d\t%3.1f\t%d\n", 
					list.get(i).getName(),list.get(i).getKor(), list.get(i).getEng(), 
					list.get(i).getMat(), list.get(i).getTotal(), list.get(i).getAvg(), 
					this.getRank(list.get(i).getAvg()));
				System.out.println();
			}// if문
		}// for문
		if(list.isEmpty())
		{
			System.out.println("등록된 학생이 없습니다.");
			System.out.println();
		}// if문
		else
		{
			System.out.println("총 " + n + "건이 검색되었습니다.");
			System.out.println();
		} // else문
	}// search()

	// 전달받은 점수가 전체 중 몇 등인지 구하여 리턴
	public int getRank(double avg) // getAvg()의 결과인 평균 값을 전달인자로 avg로 들어감.
	{
		int rank = 1; // 제일 큰 값이라면 1 그대로 1위가 된다.
		for(int i = 0; i < list.size(); i++)
		{
			if(avg < list.get(i).getAvg()) // 전달인자의 값인 avg와 객체 안의 평균과 그때그때 비교
			{
				rank++; // 값이 작으므로 순위가 1 증가한다.
			}// if문
		}// for문 변수 i
		return rank; // 구한 순위를 돌려보낸다.
	}// getRank()

}//class
