import java.util.Calendar;	// ��¥, �ð��� ���ڴٴ� ��
class APItest2 
{
	public static void main(String[] args) 
	{
		// ���ڿ��� ���ڷ�
		String a = "1234";
		System.out.println(a + 1);						// 12341�� ����. ���� 1�� �ڿ� �پ ����
		System.out.println(Integer.parseInt(a) + 1);	// String a�� ���ڿ� 1234�� ���ڷ� �ٲٰ� �ű⿡ 1�� ���ϴ� 1235	


		// ���ڸ� ���ڿ���
		int b = 1000;
		System.out.println(b + 1 + 2);		// 1003
		System.out.println("" + b + 1 + 2);	// 100012 -> ""�� ���� ���� �� �ļ���.
		System.out.println(Integer.toString(b) + 1 + 2); // ���ڸ� ���ڿ��� �ٲٰ� �� �ڿ� 1�� 2�� �̾� ����.


		// ����, �ð� ���� ����
		Calendar c = Calendar.getInstance();	// �� ������ �ð����� -> getInstance ȣ���� �ð��� �������� ��
		System.out.println(c);	// ������ �� �ִ�. �ʿ��� ���� ������ �ϴµ� �̸��� �˾ƾ� �Ѵ�. ��ȣ �ȿ� �˰� ���� ���� ����� �Ѵ�. ��ť��Ʈ Ȱ���ؼ�
		int year = c.get(Calendar.YEAR);	// ���� 
		int month = c.get(Calendar.MONTH) + 1;	// �� -> 0���� �����ϴ� 1�� �����ָ� �ȴ�.
		int date = c.get(Calendar.DAY_OF_MONTH);	// ��¥
		int dayNumber = c.get(Calendar.DAY_OF_WEEK) ;	// ���� -> 0�� ����ϰ� 6�� �ݿ����̴�.
		String day [] = {"�����", "�Ͽ���", "������", "ȭ����", "������", "�����", "�ݿ���"}; //day[dayNumber] -> ��¥�� �迭 Ȱ��
		String amPm = "";	// String ��ü �ʱ�ȭ
		int timeLine = c.get(Calendar.AM_PM);	// ����/ ���� -> ������ 0�̰� ���Ĵ� 1�̴�.
		if(timeLine == 0)	// Calendar.AM_PM���� ���� ���� 0�̸� ����, 1�̸� ���İ� ��Ÿ������ ����
		{
			 amPm= "����";
		}
		else
		{
			amPm = "����";
		}
		int hour = c.get(Calendar.HOUR_OF_DAY);	// �ð�
		int minute = c.get(Calendar.MINUTE);	// ��

		System.out.println();
		System.out.println("�ۼ� �ð��� 2019�� 10�� 29�� ȭ���� ���� 11�� 30���Դϴ�.");	// �׳� �Է��� ������ ������ �Ǹ� �ٽ� �ٲ�� �Ѵ�.
		System.out.println(year + "�� " + month + "�� " + date + "�� " + day[dayNumber] + " " + amPm + " " + hour + "�� " + minute + "���Դϴ�.");
		
		



		
	}
}
