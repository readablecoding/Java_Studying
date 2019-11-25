package workbook.address3.ui;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import workbook.address3.service.AddressManager;
import workbook.address3.service.AddressManagerImpl;
import workbook.address3.vo.AddressVO;

/**
 * 사용자 화면 
 */
public class AddressUI 
{	//AddressUI 객체 생성시 만들어지는 부분
	Scanner keyin = new Scanner(System.in);
	AddressManagerImpl manager = new AddressManagerImpl(); //manager객체 생성, 여기를 하고 public AddressUI()로 이동
	
	/**
	 * 생성자
	 */
	public AddressUI() 
	{
		//AddressUI객체가 생성될 때 무한반복.
		while (true) 
		{
			int m = menuPrint();
			switch (m) 
			{
				case 1: 
					write(); 
					break;
				case 2: 
					list(); 
					break;
				case 3: 
					search(); 
					break;
				case 4: 
					delete(); 
					break;
				case 0: 
					end(); //현재클래스의 end()로 이동
					return; //마무리
			}
		}
	}
	
	/**
	 * 메뉴 출력, 번호 입력받기
	 * @return 입력받은 번호
	 */
	public int menuPrint() 
	{
		System.out.println("[ 회원 주소록 ]");
		System.out.println("1. 회원 정보 등록");
		System.out.println("2. 전체 회원 보기");
		System.out.println("3. 회원 검색");
		System.out.println("4. 회원 정보 삭제");
		System.out.println("0. 종료");
		System.out.print("* 선택 > ");
		
		int num = 0;
		
		while (true) 
		{
			try 
			{
				num = keyin.nextInt();
			}
			catch (InputMismatchException e) //숫자가 아닌 경우 오류 메시지와 함께 continue로 반복문 조건으로 이동
			{
				System.out.print("* 다시 입력하세요 > ");
				continue;
			}
			if (num < 0 || num > 4) //메뉴순서에 맞지 않는 숫자라면 오류 메시지와 함께 continue로 반복문 조건으로 이동
			{
				System.out.print("* 다시 입력하세요 > ");
				continue;
			}
			break;
		}
		return num;
	}
	
	/**
	 * 회원 정보 등록
	 */
	public void write() 
	{
		System.out.println("[ 회원 정보 등록 ]");
		int num;
		String name, phone, address;
		
		try 
		{
			System.out.print("회원번호: ");
			num = keyin.nextInt();	//숫자 입력하고 엔터 입력됨, 문자라면 예외 발생		
			keyin.nextLine();		//Enter 제거
			System.out.print("이름: ");
			name = keyin.nextLine();
			System.out.print("전화번호: ");
			phone = keyin.nextLine();
			System.out.print("주소: ");
			address = keyin.nextLine();
		}
		catch (Exception e) 
		{
			System.out.println("입력이 잘못되었습니다.");
			keyin.nextLine(); //버퍼 비우기.
			return;
		}
		
		AddressVO vo = new AddressVO(num, name, phone, address); //AddressVO 객체 안에 정보 담김.
		//UI에서는 실제 데이터 처리 관여하면 안됨. 데이터를 처리하는 쪽으로 전달하기.
		boolean check = manager.addAddress(vo);
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
	 * 전체 회원 보기
	 */
	public void list() 
	{
		System.out.println("[ 전체 회원 목록 ]");
		ArrayList<AddressVO> list = manager.getList();
		
		for (AddressVO vo : list) // 향상된 for문 ->list 길이만큼을 AddressVO 클래스의 vo 변수에 list를 대입해 일 처리
		{
			System.out.println(vo);
		}
		System.out.println("총 " + list.size() + "명의 회원이 있습니다.");
	}
	
	/**
	 * 회원 검색
	 */
	public void search() 
	{
		System.out.println("[ 회원검색 ]");
		int n;
		ArrayList<AddressVO> list;
		AddressVO b;
		String name;
		
		System.out.println("1. 번호 검색");
		System.out.println("2. 이름 검색");
		while (true) 
		{
			try 
			{
				System.out.print("선택 > ");
				n = keyin.nextInt(); //예외 발생 위치
				if (n < 1 || n > 2) 
				{
					continue;
				}
			}
			catch (Exception e) //숫자가 아닌 형태가 입력되면 예외가 발생해서 여기로 온다.
			{
				keyin.nextLine();	//버퍼를 비운다.
				continue;			//다시 입력을 위해 continue로 while문 조건으로 돌아감
			}
			break;				//제대로 입력되면 break로 while문 탈출
		}
	
		if (n == 1) 
		{
			while (true) 
			{
				try 
				{
					System.out.print("검색할 번호 : ");
					n = keyin.nextInt();
				}
				catch (Exception e) 
				{
					keyin.nextLine();
					continue;
				}
				break;
			}
			b = manager.getAddress(n);	//
			if (b == null) 
			{
				System.out.println("해당 번호가 없습니다.");
			}
			else 
			{
				System.out.println(b);
			}
		}
		else if (n == 2) 
		{
			System.out.print("검색할 이름 : ");
			name = keyin.next();
			list = manager.getAddress(name);
			if (list == null || list.size() == 0) 
			{
				System.out.println("해당 이름이 없습니다.");
			}
			else 
			{
				for (AddressVO vo : list) 
				{
					System.out.println(vo);
				}
			}
		}
	}

	/**
	 * 회원삭제
	 */
	public void delete() 
	{
		System.out.println("[ 회원 삭제 ]");
		int n;
		
		while (true) 
		{
			try 
			{
				System.out.print("삭제할 회원번호 입력: ");
				n = keyin.nextInt();
			}
			catch (Exception e) 
			{
				keyin.nextLine(); 
				continue;
			}
			break;
		}
		
		if (manager.deleteAddress(n)) 
		{
			System.out.println("삭제되었습니다.");
		}
		else 
		{
			System.out.println("해당 번호의 회원이 없습니다.");
		}
	}
	
	/**
	 * 파일 저장하고 종료
	 */
	public void end() 
	{
		manager.saveFile(); //manager의 saveFile() 호출
		System.out.println("* 프로그램을 종료합니다.");
		return;
	}
}
