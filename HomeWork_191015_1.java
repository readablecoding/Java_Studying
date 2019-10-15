import java.util.Scanner; 
class HomeWork_191015_1 
{
	public static void main(String[] args) 
	{   
		Scanner in = new Scanner(System.in);  
	    int money, exchange;
		double result;
		double usd = 1 / 1184.10;	//  1달러 / 원
		double jpy = 100 / 1092.70; //	100엔 / 원
		double eur = 1 / 1306.06;	//  1유로 / 원

		System.out.print("원 단위 금액 입력 : " ); 
		money = in.nextInt(); 
		if(money <= 0)
		{	System.out.println("금액은 1 이상 입력하세요");
			return;
		}

		System.out.print("환전할 화폐 (1: 달러, 2: 엔화, 3: 유로) : " );
		exchange = in.nextInt();
		if(exchange < 1 || exchange > 3)
		{
			System.out.println("1부터 3사이의 숫자를 입력하세요");
			return;
		}

		switch(exchange)
		{
			case 1 : 
				result = money * usd;
				//System.out.println(money + "원은" + result + " 달러입니다.");
				System.out.printf("%d원은 %.2f달러입니다.\n", money, result);
				break;
			case 2 :
				result = money * jpy;
				//System.out.println(money + "원은" + result + " 엔입니다.");
				System.out.printf("%d원은 %.2f엔입니다.\n", money, result);
				break;
			default :
				result = money * eur;
				//System.out.println(money + "원은" + result + " 유로입니다.");
				System.out.printf("%d원은 %.2f유로입니다.\n", money, result);
				break;
	
		}
	}
}