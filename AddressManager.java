package service;

import vo.Address;
import java.util.ArrayList;

/**
 * ���� Ŭ�������� ������ �߻� �޼ҵ���� ������ �������̽�
 */
public interface AddressManager
{
	/**
	 * ����Ʈ�� �� �� ������ �߰�
	 * @param Address �߰��� �� ����
	 * @return ���� ���� ����
	 */
	public boolean add(Address address);
	
	/**
	 * ����Ʈ�� ��� ���� ����
	 * @return ����Ʈ ��ü
	 */
	public ArrayList<Address> listAll();
	
	/**
	 * ���޵� ��ȣ�� �� ���� ����
	 * @param num �� ��ȣ
	 * @return �ش� ������ �� ����
	 */
	public Address getAddress(int num);
	
	/**
	 * ���޵� ��ȣ�� �� ���� ����
	 * @param name �̸�
	 * @return �ش� ������ �� ����
	 */
	public Address getAddress(String name);
		
}//interface AddressManager
