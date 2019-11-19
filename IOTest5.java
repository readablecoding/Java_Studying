package global.sesoc.java1.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.File;

public class IOTest5 {

	public static void main(String[] args) 
	{	
		//많은 문자를 한 번에 가져올 때 쓰는 방법으로  BufferedWriter 클래스 사용
		BufferedWriter outFile = null;
		String filename = "c.txt"; 
	
		try 
		{
			outFile = new BufferedWriter(new FileWriter(filename));  //실제 출력은 FileWriter가 하는데 BufferedWriter가 도와줌 
			outFile.write("abcdefghijklmnopqrstuvwxyz");
			outFile.write("\r\n");	//이렇게 코딩하면 안된다. 플랫폼에 영향을 덜 받는다는 이식성이 좋지 못함. 줄바꿈은 시스템마다 다르기 때문
			outFile.write("가나다라 일이삼사");
			outFile.newLine(); 	// 현재 시스템에 맞게 줄을 바꾸는 문자를 내보낸다. 시스템에 맞게 알아서 작동
			outFile.close();	// Stream 닫기
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
			
	}//main()

}//class IOTest4