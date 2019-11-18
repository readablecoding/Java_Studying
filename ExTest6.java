package global.sesoc.java1.exception;

import java.util.Scanner;
import java.util.InputMismatchException;
public class ExTest6 
{

	public static void main(String[] args) 
	{
		int n = 0;
		
		try 
		{
			n = inputScore();
		} 
		catch (ScoreException e) 
		{
			e.printStackTrace();
		} //inputScore()를 호출해 받은 리턴값을 n에 대입, 예외 발생 위치
		
		System.out.println("점수는 " + n + "점입니다.");
	}//main()
	
	public static int inputScore() throws ScoreException // 순서2)예외 발생시 ScoreException로 문제 보냄
	{
		int score = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("점수 입력: ");	
		score = scan.nextInt(); //예외 발생 위치
		if(score < 0 || score > 100) throw new ScoreException(); // 순서1)ScoreException()객체를 만들어 자신을 호출한 곳으로 문제 보냄 
		// 결론: throw new ScoreException() 과 throws ScoreException는 하나의 세트로 같이 쓰는 것이다.
		return score; // 점수를 리턴함.
	}//inputScore()
	
}//classExTest6 
