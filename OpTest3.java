/*
 금액 : 65250
 50000원 1장
 10000원 1장
 5000원 1장
 1000원 0장
 500원 0개
 100원 2개
 50원 1개
 10원 0개

*/

import java.util.Scanner; 

class OpTest3 
{
	public static void main(String[] args) 
	{   Scanner in = new Scanner(System.in);  
	    int m, n50000, n10000, n5000, n1000, n500, n100, n50, n10;

		System.out.print("금액: " );
		m = in.nextInt();
		
		n50000 = m / 50000; 
		m = m % 50000;      
		n10000 = m / 10000;
		m = m % 10000;
		n5000 = m / 5000;
		m = m % 5000;
		n1000 = m / 1000;
		m = m % 1000;
		n500 = m / 500;
		m = m % 500;
		n100 = m / 100;
		m = m % 100;
		n50 = m / 50;
		m = m % 50;
		n10 = m / 10;
		m = m % 10;

		System.out.println("50000원 " + n50000 + "장");
		System.out.println("10000원 " + n10000 + "장");
		System.out.println("5000원 " + n5000 + "장");
		System.out.println("1000원 " + n100 + "장");
		System.out.println("500원 " + n500 + "개");
		System.out.println("100원 " + n100 + "개");
		System.out.println("50원 " + n50 + "개");
		System.out.println("10원 " + n10 + "개");
	}
}
