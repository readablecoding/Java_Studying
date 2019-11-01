class StudentTest 
{
	public static void main(String[] args) 
	{
		Student s = new Student(); // s라는 변수는 종류가 Student 타입으로 만든 것. 4바이트 레퍼런스 변수. 제품을 만드려면 new Student함. 그러면 제품 찍음
		Student s2 = new Student();
		Student s3 = new Student("홍길동");				// 홍길동
		Student s4 = new Student(100, 90, 80);			// 100, 90, 80
		Student s5 = new Student("홍길동", 10, 20, 30);	// 홍길동, 10, 20, 30
		System.out.println();
		//s.kor = 100;
		//s.eng = 90;
		//s.mat = 80;
		//s.name = "홍길동";

		//System.out.println(s.name + " "); // 홍길동 -> 띄어쓰기나 빈칸을 넣어야 한다. 
		//System.out.println(s.kor);  // 100
		//System.out.println(s2.kor); // 0
		//System.out.println();		// 한 줄 띄기

		// 적당한 모양으로 출력하게 하려면? 미리 출력을 할 수 있게 준비해둬야 한다.  객체.변수명()
		//System.out.println(s);
		//s.print();	// 홍길동 100 90 80
		//s2.print();	// null 0 0 0

		s.setKor(100);	// 국어점수 -> 괄호 안에 숫자를 넣으면 parameter에 100을 전달
		System.out.println(s.getKor());	

		s.setEng(100);	// 영어점수
		System.out.println(s.getEng());

		s.setMat(100);	// 수학점수
		System.out.println(s.getMat());
		System.out.println();

		int t = s.getTotal();	// 300 -> 총점 메소드를 사용 
		double d = s.getAvg();  // 100.0 -> 평균점수 메소드를 사용
		String g = s.getGrade(); // "수" -> 등급 메소드를 사용
	} //main
} //class
