import java.util.Scanner;
public class MemberTest3 
{	
	
	Member ar[] = new Member[5]; // 회원정보를 담을 배열 생성, ar은 객체 5개를 가진 배열의 주소를 가짐
	int count; // 현재까지 저장된 회원 수
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) 
	{
		MemberTest3 m = new MemberTest3(); // 객체를 만든다. 배열이 하나 생기고, count는 0이다. 등록받고 count는 1증가.다 차면 5가 된다.
		while(true)
		{	
			int num = m.menuPrint();	//메뉴 출력하고 메뉴번호 입력받음
			switch(num)					//메뉴 번호 입력받아 메소드 호출
			{
				case 1:
					m.input();
					break;
				case 2:
					m.output();
					break;
				case 3:
					m.search();
					break;
				case 0:
					System.out.println("프로그램을 종료합니다.");
					return;
			}
			
		}

	}//main()

	//메뉴 출력 메소드
	public int menuPrint()  // return이 int형인 이유는 이 다음에 num에 값을 넘겨 switch문에서 1~0중에서 선택해 메뉴 실행 위함
	{
		int n = 0;
		System.out.println("[회원관리 프로그램]");
		System.out.println("1.등록");
		System.out.println("2.전체목록");
		System.out.println("3.검색");
		System.out.println("0.종료");
		System.out.print("선택 > ");

		// 0, 1, 2, 3이 아니면 다시 입력 받음
		while(true)
		{
			n = scan.nextInt();
			if(n < 0 || n > 3)
			{
				System.out.println("다시 선택하세요.");
			}
			else
			{
				break;
			}
		}
		return n; // n값을 돌려보내 그 값으로 선택하게 만든다.
	}//menuPrint()

	//회원 등록 메소드
	public void input()
	{
			
		System.out.println("[회원 등록]");
			
		/*
		// 없는 배열의 원소에 접근 못하게 함
		if(count == ar.length) 
		{
			System.out.println("더 이상 등록할 수 없습니다.");
			return;
		}
		*/

		// 준비한 배열이 모두 찼을 때는 배열을 2배 크기로 늘림
		if(count == ar.length)
		{
			Member x[] = new Member[ar.length * 2]; // x 배열은 ar 배열의 2배 길이가 된다.
			for(int i = 0; i < count; i++) // count 수 만큼 반복
			{
				x[i] = ar[i]; // ar의 각 원소들을 x로 옮긴다.
			}
			ar = x; // x가 ar 배열을 가리키게 만든다. x가 가리키고 있는 주소를 ar에 대입해 ar이 긴 배열을 갖게 된다.
		}		
		ar[count] = new Member(); // 처음에는 0번방을 채우고 다 하고 다음에는 1번방 채우는 식으로
		System.out.print("이름: ");
		ar[count].setName(scan.next());
		System.out.print("생년월일(YYMMDD): ");
		ar[count].setBirth(scan.next());
		System.out.print("키 : ");
		ar[count].setHeight(scan.nextDouble());
		System.out.print("몸무게 : ");
		ar[count].setWeight(scan.nextDouble());
		System.out.print("혈액형 : ");
		ar[count].setType(scan.next());
		count++;	// 1명 했다는 것을 1 증가함으로써 저장함
		System.out.println("* 등록되었습니다.");
		
	}//input()


	//전체 회원 출력 테스트
	public void output()
	{	
		if(count == 0)
		{
			System.out.println("* 등록된 회원이 없습니다.");
			return;
		}
		
		for(int i = 0; i < count; i++)	//0번부터 count만큼(등록된 사람 수 만큼) 반복되도록 한다.
		{	
			System.out.println("[전체 회원 목록]");
			System.out.println(ar[i].getName() + "\t" + ar[i].getAge() + "\t" + ar[i].getBmi() + "\t" + ar[i].getBmi("GRADE"));
		}
		
	}//output()

	//회원 검색 메소드
	public void search()
	{
		System.out.println("[회원 검색]");
		System.out.print("검색할 회원 : ");
		String name = scan.next();
		int n = 0; // 같은 것의 수를 확인하기 위한 변수
		for(int i = 0; i < count; i++)
		{
			if(name.equals(ar[i].getName())) // .euqls()는 객체 비교 메서드이다. .앞의 것과 ()의 것의 내용이 같은지 비교함
			{
				n++; // 회원이 같으면 1 증가한다.
				System.out.println(ar[i].getName() + "\t" + ar[i].getAge() + "\t" + ar[i].getBmi() + "\t" + ar[i].getBmi("GRADE"));
			}
		}
		if(n == 0)
		{
			System.out.println("회원이 없습니다.");
		}
		else
		{
			System.out.println("총 " + n + "건이 검색되었습니다.");
		}
	}//search

}//class