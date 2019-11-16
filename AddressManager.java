package service;

import vo.Address;
import java.util.ArrayList;

/**
 * 하위 클래스에서 구현할 추상 메소드들을 정의한 인터페이스
 */
public interface AddressManager
{
	/**
	 * 리스트에 새 글 정보를 추가
	 * @param Address 추가할 글 정보
	 * @return 저장 성공 여부
	 */
	public boolean add(Address address);
	
	/**
	 * 리스트의 모든 내용 리턴
	 * @return 리스트 객체
	 */
	public ArrayList<Address> listAll();
	
	/**
	 * 전달된 번호의 글 정보 리턴
	 * @param num 글 번호
	 * @return 해당 정보의 글 정보
	 */
	public Address getAddress(int num);
	
	/**
	 * 전달된 번호의 글 정보 리턴
	 * @param name 이름
	 * @return 해당 정보의 글 정보
	 */
	public Address getAddress(String name);
		
}//interface AddressManager
