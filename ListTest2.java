import java.util.ArrayList;
import java.util.Scanner;
class ListTest2 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		ArrayList<Student> slist = new ArrayList<Student>();
		String n;
		int k, e, m;

		while(true)
		{
			System.out.print("이름 : ");
			n = scan.next();
			System.out.print("국어점수 : ");
			k = scan.nextInt();
			System.out.print("영어점수 : ");
			e = scan.nextInt();
			System.out.print("수학점수 : ");
			m= scan.nextInt();
			slist.add(new Student(n, k, e, m));				// 입력받은 것을 Student 객체를 만들어 그 곳에 저장한다.
			System.out.print("계속 입력하시겠습니까? (y/n)");
			if(scan.next().equalsIgnoreCase("n"))
			{
				break;
			}//if문		
		}//while문
		System.out.println(slist);							// [Student@28d93b30] -> 객체의 주소를 보여준다.
		Student s = new Student("홍길동", 100, 100, 100);
		System.out.println(slist.indexOf(s));				// -1 -> 같은 것이 없으니 -1이 나옴
		
	}//main()
}//class
