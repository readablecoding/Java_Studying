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
		} //inputScore()�� ȣ���� ���� ���ϰ��� n�� ����, ���� �߻� ��ġ
		
		System.out.println("������ " + n + "���Դϴ�.");
	}//main()
	
	public static int inputScore() throws ScoreException // ����2)���� �߻��� ScoreException�� ���� ����
	{
		int score = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է�: ");	
		score = scan.nextInt(); //���� �߻� ��ġ
		if(score < 0 || score > 100) throw new ScoreException(); // ����1)ScoreException()��ü�� ����� �ڽ��� ȣ���� ������ ���� ���� 
		// ���: throw new ScoreException() �� throws ScoreException�� �ϳ��� ��Ʈ�� ���� ���� ���̴�.
		return score; // ������ ������.
	}//inputScore()
	
}//classExTest6 
