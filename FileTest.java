package global.sesoc.java1.io;

import java.io.File;
import java.io.IOException;
import java.util.Date;
public class FileTest 
{

	public static void main(String[] args) 
	{
		File a = new File("\\Windows"); // 절대경로, 문자열 안에서는 \\라고 해야 특수문자라고 오해 안함
		File b = new File(".");			// 상대경로 
		File c = new File("./sub");		// sub폴더 -> .은 현재 폴더
		File d = new File("a.txt");		// 현재경로의  a.txt를 가리키는 객체 d를 만듦 
		File e = new File("\\Java\\source\\Sort1.java"); //절대경로
		
		//메소드 사용법
		System.out.println(a.getAbsolutePath()); 	// C:\Windows ->현재 위치가 어딘지 절대경로 기준으로 제공  
		System.out.println(b.getAbsolutePath()); 	// C:\Java\workspace\java1\.
		System.out.println(b.getParent()); 			// null -> 현재 위치 바로 상위
		System.out.println(c.getAbsolutePath()); 	// C:\Java\workspace\java1\sub
		System.out.println(d.getAbsolutePath()); 	// C:\Java\workspace\java1\a.txt
		System.out.println(e.getAbsolutePath()); 	// C:\Java\source\Sort1.java -> 절대 경로 기준
		System.out.println(e.getName());			// Sort1.java -> 파일 이름 
		System.out.println(e.getParent()); 			// \Java\source -> 상위 폴더 이름
		System.out.println();
		
		//파일, 폴더 있는지 여부 확인
		System.out.println(a.exists()); //true -> 실제 있는지 없는지 알 수 있다.
		System.out.println(a.isFile());	//false -> 파일이 있는지 확인
		System.out.println(a.isDirectory()); //true -> 폴더가 있는지 확인
		System.out.println(a.canRead()); //true
		System.out.println();
		
		//디렉토리 생성
		if(c.mkdir()) // 실제 폴더를 만들어준다. boolean타입으로 리턴해줌
		{
			System.out.println(c.getName() + "이 생성됨"); //sub이 생성됨
		}
		else
		{
			System.out.println("폴더 생성 실패");
		}
		System.out.println();
		
		/*
		//파일 생성
		try
		{
			if(d.createNewFile())   // 문제 생기면 IOException이 나온다.
			{
				System.out.println(d.getName() + "이 생성됨");  //a.txt이 생성됨
			}
			else
			{
				System.out.println("파일 생성 실패");
			}
		}
		catch(IOException e1)
		{
			System.out.println("파일 생성 실패");
		}
		System.out.println();
		*/
		
		//파일 삭제
		/*
		if(d.isFile())
		{
			d.delete();
		} 
		*/
		
		//파일 이름 변경 -> 먼저 파일 생성 부분을 주석처리 해야 한다.	
		File n = new File("b.txt"); //객체 n에 b.txt라는 것을 가리키도록 한 것
		d.renameTo(n); 				// d가 가리키는 것이 "b.txt"가 되게끔 한다.
		System.out.println(d.getName()); // a.txt
		System.out.println(d.isFile());	// false
		System.out.println(n.getName()); // b.txt
		System.out.println(n.isFile());	// true -> b.txt로 바뀜
		System.out.println();
		
		
		//폴더 안의 서브폴더 & 파일의 이름을 읽어온다.
		String names[] = a.list();
		for(int i = 0; i < names.length; i++)
		{
			System.out.println(names[i]);
		}
		System.out.println();
		
		//폴더 안의 서브폴더 & 파일의 정보를 담은 File객체들을 읽어온다.
		File files[] = a.listFiles();
		for(int i = 0; i < files.length; i++)
		{
			System.out.print(files[i].getName() + "\t");
			System.out.print(new Date(files[i].lastModified()) + "\t");
			System.out.print(files[i].length() + "bytes");							
		}
		System.out.println();		
		
	}//main()
}//clsss FileTest
