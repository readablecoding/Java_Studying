package board.ui;

import java.util.ArrayList;
import java.util.Scanner;

import board.service.BoardManager;
import board.service.BoardManagerImpl;
import board.vo.Board;

/**
 * 사용자 화면 
 */
public class BoardUI 
{
	Scanner keyin = new Scanner(System.in);
	BoardManager manager = new BoardManagerImpl(); //BoardManager클래스의 BoardManagerImpl 객체를 만듦
	
	/**
	 * 생성자
	 */
	public BoardUI() 
	{
		//BoardUI객체가 생성될 때 무한반복.
		while (true) 
		{
			int m = menuPrint(); // menuPrint() 호출함
			switch (m) 
			{
				case 1: this.write(); break;
				case 2: this.list(); break;
				case 3: this.read(); break;
				case 4: this.delete(); break;
				case 0: 
					System.out.println("* 프로그램을 종료합니다.");
					return; //  BoardUI() 생성자를 끝내고 BoardMain()으로 리턴됨. 가보니 아무것도 없어 프로그램 종료
			}
		}
	}
	
	/**
	 * 메뉴 출력, 번호 입력받기
	 * @return 입력받은 번호
	 */
	public int menuPrint() 
	{
		System.out.println("[ 게시판 ]");
		System.out.println("1. 글쓰기");
		System.out.println("2. 전체 글보기");
		System.out.println("3. 글읽기");
		System.out.println("4. 글삭제");
		System.out.println("0. 종료");
		System.out.print("* 선택 > ");
		
		int num = 0;
		
		while (true) // 제대로 입력받는지 확인
		{
			num = keyin.nextInt();
			if (num < 0 || num > 4) 
			{
				System.out.print("* 다시 입력하세요 > ");
				continue; // while (true)로 이동시킴, 다시 입력하게끔
			}
			break;
		}
		return num; // int m = menuPrint()로  다시 돌아감
	}
	
	/**
	 * 글쓰기
	 */
	public void write() 
	{
		System.out.println("[ 글쓰기 ]");
		int num;
		String id, title, contents;
		
		System.out.print("번호: ");
		num = keyin.nextInt();
		keyin.nextLine();		//Enter 제거 -> Scanner.nextInt 메소드는 사용자 입력의 가장 마지막 개행문자(엔터, newline)를 제거하지 않음
		System.out.print("ID: ");
		id = keyin.nextLine();
		System.out.print("제목: ");
		title = keyin.nextLine();
		System.out.print("내용: ");
		contents = keyin.nextLine();
		
		Board b = new Board(num, id, title, contents); // Board 객체에 정보 담음
		boolean check = manager.add(b);				// manager 객체에 저장할 객체 전달, 저장되면 true
		if (check) 
		{
			System.out.println("저장되었습니다.");
		}
		else 
		{
			System.out.println("저장 실패했습니다.");
		}
	}
	
	/**
	 * 전체 글보기
	 */
	public void list() 
	{
		System.out.println("[ 전체 글목록 ]");
		ArrayList<Board> list = manager.listAll();
		
		for (Board b : list) 
		{
			System.out.println(b);
		}
		System.out.println("총 " + list.size() + "건의 글이 있습니다.");
	}
	
	/**
	 * 글읽기
	 */
	public void read() 
	{
		System.out.println("[ 글읽기 ]");
		int n;
		Board b;
		
		System.out.print("글번호 입력: ");
		n = keyin.nextInt();
		
		b = manager.getBoard(n);
		if (b != null) 
		{
			System.out.println("번호 : " + b.getNum());
			System.out.println("작성자 : " + b.getId());
			System.out.println("제목 : " + b.getTitle());
			System.out.println("내용 : " + b.getContents());
		}
		else {
			System.out.println("해당 번호의 글이 없습니다.");
		}
	}
	
	/**
	 * 글삭제
	 */
	public void delete() 
	{
		System.out.println("[ 글삭제 ]");
		int n;
		
		System.out.print("글번호 입력: ");
		n = keyin.nextInt(); // 숫자 받기
		
		if (manager.remove(n)) // manager에게 지워달라고 번호를 넘겨줌
		{
			System.out.println("삭제되었습니다.");
		}
		else 
		{
			System.out.println("해당 번호의 글이 없습니다.");
		}
	}
}
