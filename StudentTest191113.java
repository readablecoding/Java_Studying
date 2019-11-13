package global.sesoc.java1.oop191113;
import java.util.ArrayList;
public class StudentTest 
{
	public static void main(String[] args)
	{
		Student a = new Student();
		Student b = new Student(new String("김"), 90, 90, 90);
		Student c = new Student(new String("김"), 90, 90, 90);
	
		System.out.println(b); 			 // 김 90 90 90 90.0
		System.out.println(b.getAvg());  // 평균 점수를 doubl형으로 리턴
		System.out.println(b == c); 	 // false -> 주소 비교, 같은 객체인지 확인
		System.out.println(b.equals(c)); // true -> println에서 equals가 안됨, equals를 오버라이딩 해야 함
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("박", 10, 10, 10));
		list.add(new Student("이", 10, 10, 10));
		System.out.println(list);		// [박 10 10 10 10.0, 이 10 10 10 10.0]
		list.contains(new Student("박", 10, 10, 10));
			
	}//main()
}//class StudentTest
