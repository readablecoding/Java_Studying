import java.util.Random;
import java.util.Date;
import java.util.Calendar;
class MathTest // 필요한 메소드 보고 주석 달기 -> java.lang.Math
{
	public static void main(String[] args) 
	{
		//Math m = new Math(); // Math() has private access in Math -> 생성자가 있는데 private라 못 부름
		//Integer i = new Integer(); // no suitable constructor found for Integer(no arguments) -> Integer()라는 생성자가 없다.

		// Math.pow(double a, double b)
		double a = Math.pow(2, 10);	// 2의 10승을 리턴한다.정확히는 2.0 과 10.0이 들어간다.
		System.out.println(a);	// 1024.0 
		a = Math.pow(0.5, 2);		// 0.25의 2승을 리턴한다.
		System.out.println(a);	// 0.25
		
		// Math.ceil(double a), Math.floor(double a), Math.round(double a)
		System.out.println(Math.ceil(-3.5));	// -3	-> 올림, 숫자가 커진다.
		System.out.println(Math.floor(-3.5)); // -4.0	-> 내림, 숫자가 작아진다.
		System.out.println(Math.round(-3.5)); // -3	-> 반올림. 숫자가 커지거나 작아질 수 있다.

		// Math.sqrt(double a)
		System.out.println(Math.sqrt(2)); // 1.4142135623730951 -> 제곱근 구하기
		
		// Math.abs(숫자))
		System.out.println(Math.abs(-2)); // 2 -> 절대값. 부호 상관없이 절대값 구함
		
		// Math.max(숫자1, 숫자2), Math.min(숫자1, 숫자2) -> if문 없이 값 비교 가능
		System.out.println(Math.max(2, 3)); // 3 -> 큰 값
		System.out.println(Math.min(2, 3)); // 2 -> 작은 값
		
		System.out.println(Math.random()); //무작위 숫자를 내놓는다. 0 <= x < 1

		// 무작위 숫자 발생 -> import java.util.Random; 필요함
		Random r = new Random(); // Random 클래스는 객체를 만들어 써야 한다.
		int i = r.nextInt(100);
		System.out.println(i); // 0~100의 정수 중 하나를 보여줌

		// 날짜 관련 클래스(java.util 패키지) -> import java.util.Date; improt java.util.Calendar; 필요함
		Date d = new Date();					// 현재 시간정보 포함 -> 기본 생성자 활용
		Calendar c = Calendar.getInstance();	// 현재 시간정보 포함 -> static 메소드인 getInstance() 호출해서 정보 얻음 
		System.out.println(d);	// Thu Nov 07 11:44:56 KST 2019
		System.out.println(c);	
		/* Calendar에서 받아온 것(c 출력한 것)
		 java.util.GregorianCalendar[time=1573094696150,areFieldsSet=true,areAllFieldsSet=true,
		 lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Seoul",
		 offset=32400000,dstSavings=0,useDaylight=false,transitions=22,lastRule=null],
		 firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,
		 YEAR=2019,MONTH=10,WEEK_OF_YEAR=45,WEEK_OF_MONTH=2,DAY_OF_MONTH=7,
		 DAY_OF_YEAR=311,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=11,HOUR_OF_DAY=11,
		 MINUTE=44,SECOND=56,MILLISECOND=150,ZONE_OFFSET=32400000,DST_OFFSET=0]
		 */

	}//main()	
}//class
