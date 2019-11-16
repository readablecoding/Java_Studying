package ui;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

import service.AddressManager;
import service.AddressManagerImpl;
import vo.Address;


/**
 * 사용자 화면
 */
public class AddressUI 
{
	Scanner keyin = new Scanner(System.in);
	AddressManager manager = new AddressManagerImpl();
	/**
	 * 생성자
	 */
	public AddressUI() 
	{
		int m;
		//AddressUI가 생성될 때 무한반복
		while(true)
		{
			try
			{
				m = menuPrint();
			}
			catch(InputMismatchException e)
			{
				System.out.println("정수 입력하지 않아 오류 발생. 정수 입력 부탁");
				keyin.nextLine();
				continue;
			}
			switch(m)
			{	case 1:
					this.write();
					break;
				case 2:
					this.list();
					break;
				case 3:
					this.read();
					break;
				case 0:
					System.out.println("* 프로그램을 종료합니다.");
					return;
			}
			
		}//while
		
	}//AddressUI()
	/**
	 * 메뉴 출력, 번호 입력 받기
	 * @return 입력받은 번호
	 */
	public int menuPrint()
	{
		System.out.println("[회원 주소록]");
		System.out.println("1.회원 정보 등록");
		System.out.println("2.전체 회원 보기");
		System.out.println("3.회원 검색");
		System.out.println("0.프로그램 종료");
		System.out.print("* 선택 > ");
		int num = 0;
		while(true)
		{
			num = keyin.nextInt();
			if(num < 0 || num > 3)
			{
				System.out.print("* 다시 입력하세요 > ");
				continue;
			}
			break;
		}	
		return num;
	}//menuprint()
	
	/**
	 * 글 쓰기
	 */
	public void write()
	{
		System.out.println("[회원 정보 등록]");
		int num;
		String name, telenum, adrs;
		
		while(true)
		{
			try
			{
				System.out.print("회원번호 : ");
				num = keyin.nextInt();
				keyin.nextLine();
				System.out.print("이름 : ");
				name = keyin.nextLine();
				System.out.print("전화번호 : ");
				telenum= keyin.nextLine();
				System.out.print("주소 : ");
				adrs = keyin.nextLine();
			}
			catch(InputMismatchException e)
			{
				System.out.println("정확하게 형식을 지켜주세요.");
				keyin.nextLine();
				continue;
			}
			break;
		}
		
		Address a = new Address(num, name, telenum, adrs);
		boolean check = manager.add(a);
		if(check)
		{
			System.out.println("저장되었습니다.");
		}
		else
		{
			System.out.println("저장 실패했습니다.");
		}
			
		
	}//write()
	
	/**
	 * 전체 글 보기
	 */
	public void list()
	{
		System.out.println("[전체 회원 보기]");
		ArrayList<Address> list = manager.listAll();
		
		for(Address a : list)
		{
			System.out.println(a);
		}
		System.out.println("총" + list.size() + "건의 글이 있습니다.");	
	}//list()
	
	
	/**
	 * 글 읽기
	 */
	public void read()
	{
		System.out.println("[회원 검색]");
		System.out.println("1.번호로 검색");
		System.out.println("2.이름으로 검색");
		
		int num, numSearch;
		String nameSearch;
		Address a;
		
		while(true)
		{	
			try
			{
				System.out.print("* 선택 > ");
				num = keyin.nextInt();
				if(num < 1 || num > 2) 
				{
					throw new InputMismatchException();
				}
			}
			catch(InputMismatchException e)
			{
				System.out.println("제대로 입력하지 않았습니다. 다시 입력하세요.");
				keyin.nextLine();
				continue;
			}
			break;
		}//while	
		
		if(num == 1)
		{
			while(true)
			{
				System.out.print("검색할 번호: ");	
				try
				{
					numSearch = keyin.nextInt();
					
				}
				catch(InputMismatchException e)
				{
					System.out.println("숫자를 입력하지 않았습니다. 숫자를 다시 입력하세요.");
					keyin.nextLine();
					continue;
				}
				a = manager.getAddress(numSearch);
				if(a != null)
				{
					System.out.println("결과 " + a.getNum() + " " 
					+ a.getName() + " " + a.getTeleNum() + " " + a.getAdrs());
				}
				else
				{
					System.out.println("해당 번호의 글이 없습니다.");
				}
				break;
			}//while
		}//if
		
		if(num == 2)
		{	
			while(true)
			{	
				keyin.nextLine();
				System.out.print("검색할 이름: ");
				try
				{
					nameSearch = keyin.nextLine();
				}
				catch(InputMismatchException e)
				{
					System.out.println("문자를 입력하지 않았습니다. 문자를 입력하세요.");
					keyin.nextLine();
					continue;
				}
				a = manager.getAddress(nameSearch);
				if(a != null)
				{
					System.out.println("결과 " + a.getNum() + " " 
					+ a.getName() + " " + a.getTeleNum() + " " + a.getAdrs());
				}
				else
				{
					System.out.println("해당 이름의 글이 없습니다.");
				}
				break;
			}//while	
		}//if		
	}//read()		
}//class AddressUI
