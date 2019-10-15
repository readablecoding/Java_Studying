import java.util.Scanner;
class Studying_191015_3 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int kor, number;
		double result;

		double usdNum = 1186.40;
		double jpyNum = 1096.23;
		double eurNum = 1306.52;

		double usd = 1 / usdNum;
		double jpy = 100 / jpyNum;
		double eur = 1 / eurNum;

		System.out.print("원 단위 금액 입력 : ");
		kor = in.nextInt();
		if(kor <0)
		{
			System.out.println("음수를 입력했습니다. 프로그램을 종료합니다.");
			return;
		}
		System.out.print("환전할 화폐(1: 달러, 2: 엔화, 3:유로): ");
		number = in.nextInt();
		if(number < 1 || number > 3)
		{
			System.out.println("1~3이 아닌 값을 입력했습니다. 프로그램을 종료합니다.");
			return;
		}
		switch(number)
		{
			case 1 :
				result = kor * usd;
				System.out.printf("%d원은 %.2f달러입니다.\n", kor, result);
				break;
			case 2 :
				result = kor * jpy;
				System.out.printf("%d원은 %.2f엔입니다.\n", kor, result);
				break;
			case 3 :
				result = kor * eur;
				System.out.printf("%d원은 %.2f유로입니다.\n", kor, result);
				break;
		}
	}
}
