package global.sesoc.java1.exception;

public class ScoreException extends Exception 
{
	public ScoreException() 
	{
		super("점수는 0~100점이어야 합니다."); // 메시지를 상위 클래스 기본 생성자로 넘긴다.
	
	}
}//class ScoreException
