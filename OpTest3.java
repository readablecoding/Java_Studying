/*
 �ݾ� : 65250
 50000�� 1��
 10000�� 1��
 5000�� 1��
 1000�� 0��
 500�� 0��
 100�� 2��
 50�� 1��
 10�� 0��

*/

import java.util.Scanner; 

class OpTest3 
{
	public static void main(String[] args) 
	{   Scanner in = new Scanner(System.in);  
	    int m, n50000, n10000, n5000, n1000, n500, n100, n50, n10;

		System.out.print("�ݾ�: " );
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

		System.out.println("50000�� " + n50000 + "��");
		System.out.println("10000�� " + n10000 + "��");
		System.out.println("5000�� " + n5000 + "��");
		System.out.println("1000�� " + n100 + "��");
		System.out.println("500�� " + n500 + "��");
		System.out.println("100�� " + n100 + "��");
		System.out.println("50�� " + n50 + "��");
		System.out.println("10�� " + n10 + "��");
	}
}