package board.ui;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import board.service.BoardManagerImpl;
import board.vo.Board;

public class BoardUI 
{
	//멤버변수에 자주 쓸 것을 만들어 놓기
	Scanner keyin = new Scanner(System.in);
	BoardManagerImpl manager = new BoardManagerImpl(); //BoardManagerImpl() 생성자 실행
	
	//생성자
	public BoardUI()
	{
		//BoardMain 클래스에서 생성하면 반복문이 실행
		//아래 반복문이 종료되면 main()메소드로 리턴되며 프로그램 종료
		while(true)
		{
			int m = mainMenu();
			switch(m)
			{
			case 1:
				write(); //현재 클래스의 메소드인 write()로 전달되는 값은 없다. 자기 할 일 하고 돌아온다.
				break;		
			case 2:
				list();
				break;
			case 3:
				read();
				break;		
			case 4:
				delete();
				break;		
			case 0:
				end();
				return; //프로그램을 끝내기 위함
			}
		}
	}
	
	//메인 메뉴 출력하고 번호 입력받아 리턴
	public int mainMenu()
	{
		System.out.println("[게시판]");
		System.out.println("1. 글쓰기");
		System.out.println("2. 전체 글보기");
		System.out.println("3. 글번호로 읽기");
		System.out.println("4. 삭제");
		System.out.println("0. 종료");
		
		int n = 0;
		while(true)
		{	
			try
			{	System.out.print("번호선택 > ");		
				n = keyin.nextInt();
				if(n < 0 || n > 4) 
				{
					continue;
				}
			}
			catch(InputMismatchException e)
			{
				keyin.nextLine();
				continue;
			}
			break;	
		}
		return n;	
	}
	

	//글쓰기
	public void write()
	{
		System.out.println("[글쓰기]");
		int num;
		String name, title, contents;
		
		//4가지를 입력받아 add 메소드로 Board 객체를 전달
		try
		{
			System.out.print("번호: ");
			num = keyin.nextInt();
			keyin.nextLine();
			System.out.print("이름: ");
			name = keyin.nextLine();
			System.out.print("제목: ");
			title = keyin.nextLine();
			System.out.print("내용: ");
			contents = keyin.nextLine();
		}
		catch(Exception e)
		{
			System.out.println("입력이 잘못되었습니다.");
			keyin.nextLine();
			return;
		}
		
		Board b = new Board(num, name, title, contents);
		boolean check = manager.add(b);
		if(check)
		{
			System.out.println("저장되었습니다.");
		}
		else
		{
			System.out.println("저장 실패하였습니다.");
		}
	
	}
	
	//글 전체보기
	public void list()
	{
		System.out.println("[전체 글 보기]");
		ArrayList<Board> list = manager.listAll();
		for(Board b : list)
		{
			System.out.print("[" + b.getNum() + "] ");
			System.out.print("작성자: " + b.getName() +", ");
			System.out.print("제목: " + b.getTitle() + ", ");
			System.out.println("내용: " + b.getContents());
		}
		System.out.println("총 " + list.size() +"건의 글이 있습니다.");
	}
	
	//글 읽기
	public void read()
	{
		System.out.println("[글 번호로 읽기]");
		int n;
		Board b;
		while(true)
		{
			try
			{
				System.out.print("찾을 번호: ");
				n = keyin.nextInt();
			}
			catch(Exception e)
			{
				keyin.nextLine();
				continue;				
			}
			break;
		}
		b = manager.getBoard(n);
		if(b == null)
		{
			System.out.println("글이 존재하지 않습니다.");	
		}
		else
		{
			System.out.println(b);
		}	
	}
	
	//글 삭제
	public void delete()
	{
		System.out.println("[삭제]");
		int n;
		while(true)
		{
			try
			{
				System.out.print("삭제할 번호: ");
				n = keyin.nextInt();
			}	
			catch(Exception e)
			{	
				keyin.nextLine();
				continue;
			}
			break;
		}
		if(manager.remove(n))
		{
			System.out.println("삭제 되었습니다.");
		}
		else
		{
			System.out.println("글이 존재하지 않습니다.");
		}
	}
	
	//파일 저장 후 종료
	public void end()
	{
		manager.saveFile();
		System.out.println("프로그램을 종료합니다.");
	}
	
	
}//class BoardUI
