import java.util.Calendar;	// 날짜, 시간을 쓰겠다는 것
class APItest2 
{
	public static void main(String[] args) 
	{
		// 문자열을 숫자로
		String a = "1234";
		System.out.println(a + 1);						// 12341이 나옴. 숫자 1이 뒤에 붙어서 나옴
		System.out.println(Integer.parseInt(a) + 1);	// String a의 문자열 1234를 숫자로 바꾸고 거기에 1을 더하니 1235	


		// 숫자를 문자열로
		int b = 1000;
		System.out.println(b + 1 + 2);		// 1003
		System.out.println("" + b + 1 + 2);	// 100012 -> ""을 쓰는 것은 좀 꼼수다.
		System.out.println(Integer.toString(b) + 1 + 2); // 숫자를 문자열로 바꾸고 그 뒤에 1과 2를 이어 붙임.


		// 날자, 시간 관련 정보
		Calendar c = Calendar.getInstance();	// 이 순간의 시간정보 -> getInstance 호출해 시간을 가져오는 것
		System.out.println(c);	// 정보가 다 있다. 필요한 것을 꺼내야 하는데 이름을 알아야 한다. 괄호 안에 알고 싶은 것을 적어야 한다. 다큐먼트 활용해서
		int year = c.get(Calendar.YEAR);	// 연도 
		int month = c.get(Calendar.MONTH) + 1;	// 월 -> 0부터 시작하니 1을 더해주면 된다.
		int date = c.get(Calendar.DAY_OF_MONTH);	// 날짜
		int dayNumber = c.get(Calendar.DAY_OF_WEEK) ;	// 요일 -> 0은 토요일고 6은 금요일이다.
		String day [] = {"토요일", "일요일", "월요일", "화요일", "수요일", "목요일", "금요일"}; //day[dayNumber] -> 날짜를 배열 활용
		String amPm = "";	// String 객체 초기화
		int timeLine = c.get(Calendar.AM_PM);	// 오전/ 오후 -> 오전은 0이고 오후는 1이다.
		if(timeLine == 0)	// Calendar.AM_PM에서 얻은 값이 0이면 오전, 1이면 오후가 나타나도록 설정
		{
			 amPm= "오전";
		}
		else
		{
			amPm = "오후";
		}
		int hour = c.get(Calendar.HOUR_OF_DAY);	// 시간
		int minute = c.get(Calendar.MINUTE);	// 분

		System.out.println();
		System.out.println("작성 시간은 2019년 10월 29일 화요일 오전 11시 30분입니다.");	// 그냥 입력한 것으로 내년이 되면 다시 바꿔야 한다.
		System.out.println(year + "년 " + month + "월 " + date + "일 " + day[dayNumber] + " " + amPm + " " + hour + "시 " + minute + "분입니다.");
		
		



		
	}
}
