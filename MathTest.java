import java.util.Random;
import java.util.Date;
import java.util.Calendar;
class MathTest // �ʿ��� �޼ҵ� ���� �ּ� �ޱ� -> java.lang.Math
{
	public static void main(String[] args) 
	{
		//Math m = new Math(); // Math() has private access in Math -> �����ڰ� �ִµ� private�� �� �θ�
		//Integer i = new Integer(); // no suitable constructor found for Integer(no arguments) -> Integer()��� �����ڰ� ����.

		// Math.pow(double a, double b)
		double a = Math.pow(2, 10);	// 2�� 10���� �����Ѵ�.��Ȯ���� 2.0 �� 10.0�� ����.
		System.out.println(a);	// 1024.0 
		a = Math.pow(0.5, 2);		// 0.25�� 2���� �����Ѵ�.
		System.out.println(a);	// 0.25
		
		// Math.ceil(double a), Math.floor(double a), Math.round(double a)
		System.out.println(Math.ceil(-3.5));	// -3	-> �ø�, ���ڰ� Ŀ����.
		System.out.println(Math.floor(-3.5)); // -4.0	-> ����, ���ڰ� �۾�����.
		System.out.println(Math.round(-3.5)); // -3	-> �ݿø�. ���ڰ� Ŀ���ų� �۾��� �� �ִ�.

		// Math.sqrt(double a)
		System.out.println(Math.sqrt(2)); // 1.4142135623730951 -> ������ ���ϱ�
		
		// Math.abs(����))
		System.out.println(Math.abs(-2)); // 2 -> ���밪. ��ȣ ������� ���밪 ����
		
		// Math.max(����1, ����2), Math.min(����1, ����2) -> if�� ���� �� �� ����
		System.out.println(Math.max(2, 3)); // 3 -> ū ��
		System.out.println(Math.min(2, 3)); // 2 -> ���� ��
		
		System.out.println(Math.random()); //������ ���ڸ� �����´�. 0 <= x < 1

		// ������ ���� �߻� -> import java.util.Random; �ʿ���
		Random r = new Random(); // Random Ŭ������ ��ü�� ����� ��� �Ѵ�.
		int i = r.nextInt(100);
		System.out.println(i); // 0~100�� ���� �� �ϳ��� ������

		// ��¥ ���� Ŭ����(java.util ��Ű��) -> import java.util.Date; improt java.util.Calendar; �ʿ���
		Date d = new Date();					// ���� �ð����� ���� -> �⺻ ������ Ȱ��
		Calendar c = Calendar.getInstance();	// ���� �ð����� ���� -> static �޼ҵ��� getInstance() ȣ���ؼ� ���� ���� 
		System.out.println(d);	// Thu Nov 07 11:44:56 KST 2019
		System.out.println(c);	
		/* Calendar���� �޾ƿ� ��(c ����� ��)
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
