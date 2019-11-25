package workbook.address3.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import workbook.address3.vo.AddressVO;

/**
 * 회원정보를 저장, 삭제, 검색해주는 기능 담당 클래스
 */
public class AddressManagerImpl implements AddressManager // AddressUI생길 때 같이 만들어진다.
{
	//멤버변수: 초기값은 전부 null이다. 객체를 생성하지 않았으니 nullpointerException
	ArrayList<AddressVO> list;				//회원 정보를 저장할 리스트
	ObjectInputStream inFile;				//파일로부터 객체를 읽을 스트림
	ObjectOutputStream outFile;				//파일에 객체를 저장할 스트림
	final String filename = "address.dat";	//파일명 -> 변수의 값을 수정 못하게 final을 붙임
	
	public AddressManagerImpl() 
	{
		//최초 실행될 때 파일을 읽어들이고, 없으면 리스트 생성 -> 정해진 경로로 확인
		try 
		{
			inFile = new ObjectInputStream(new FileInputStream(filename)); 
			//파일이 업으면 new FileInputStream(filename))에서 예외,  new ObjectInputStream에서 예외 발생시 IOException
			list = (ArrayList<AddressVO>) inFile.readObject(); 
			//주소정보를 ArrayList에서 대입. readObject()로 파일로부터 객체 읽기하며 강제 형변환안에 내용이 없다면 readObject()에서 EOFException
			inFile.close();
		}
		catch (Exception e) 
		{
			list = new ArrayList<AddressVO>(); //비어있는 ArrayList 생성
		}
	}
	
	@Override
	public boolean addAddress(AddressVO vo) //매개변수로 AddressVO클래스의 vo를 받는다.
	{
		//같은 번호의 회원이 있는지 확인
		if (getAddress(vo.getNum()) != null)  //vo.getNum() 지금 새로 , getAddress는 기존 
		{
			return false; //주소가 있다는 것은 이미 회원이 있다는 것이니 add 못하고 false
		}
		//없으면 저장
		list.add(vo);
		return true; //저장 성공
	}

	@Override
	public ArrayList<AddressVO> getList() 
	{
		return list; //AddressVO 타입의 ArrayList의 toString()를 호출해 그 형식으로 list에 담긴 것 출력
	}

	@Override
	public AddressVO getAddress(int num) 
	{
		AddressVO vo = null;
		for (int i = 0; i < list.size(); i++) 
		{
			vo = list.get(i); 		//ArrayList에서 i번째 값을 가져와서  	
			if (num == vo.getNum())	// 검색할 번호 n과 ArrayList의 i번째의 회원번호가 같은지 비교
			{
				return vo; //vo에 담긴 객체의 주소를 리턴
			}
		}
		return null; //검색할 번호 n과 같은 ArrayList의 i번째의 회원번호가 없다면 null을 리턴
	}
	
	@Override
	public ArrayList<AddressVO> getAddress(String name) 
	{
		//검색결과를 저장할 리스트 생성
		ArrayList<AddressVO> searchList = new ArrayList<>();
		AddressVO vo = null;
		
		for (int i = 0; i < list.size(); i++) 
		{
			vo = list.get(i);
			//이름이 같은 회원의 정보를 새 리스트에 추가
			if (name.equals(vo.getName())) //입력받은 이름과 AddressVO클래스의 회원번호 이름과 같은가?
			{
				searchList.add(vo); 
			}
		}
		return searchList;
	}

	@Override
	public boolean deleteAddress(int num) 
	{
		AddressVO vo = null;
		
		for (int i = 0; i < list.size(); i++) 
		{
			vo = list.get(i);
			//전달받은 번호의 회원정보가 있으면 삭제
			if (num == vo.getNum()) 
			{
				list.remove(i);
				return true;
			}
		}
		//없으면 false리턴
		return false;
	}

	@Override
	public void saveFile() 
	{
		try 
		{
			//현재 ArrayList를 파일에 저장
			outFile = new ObjectOutputStream(new FileOutputStream(filename)); //new ObjectOutputStream 하면 파일이 만들어짐
			outFile.writeObject(list);	//현재 상태를 가진 ArrayList를 파일에 저장. ArrayList는 직렬화가 돼 통째로 한방에 저장됨.
			outFile.close();			//주소 정보를 가진 ArrayList가 저장된 상태로 스트림 종료
			System.out.println("파일이 저장되었습니다.");
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
