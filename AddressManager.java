package workbook.address3.service;

import java.util.ArrayList;

import workbook.address3.vo.AddressVO;

/**
 * ���� Ŭ�������� ������ �߻� �޼ҵ���� ������ �������̽�
 */
public interface AddressManager 
{
	/**
	 * ����Ʈ�� �� ȸ�������� �߰�
	 * @param address �߰��� ȸ�� ����
	 * @return ���� ���� ����
	 */
	public boolean addAddress(AddressVO board);
	
	/**
	 * ����Ʈ�� ��� ���� ����
	 * @return ����Ʈ ��ü
	 */
	public ArrayList<AddressVO> getList();
	
	/**
	 * ���޵� ��ȣ�� ȸ�� ���� ����
	 * @param num ȸ�� ��ȣ
	 * @return �ش� ��ȣ�� ȸ�� ����
	 */
	public AddressVO getAddress(int num);
	
	/**
	 * ���޵� �̸��� ȸ������ ���� ����
	 * @param name ȸ���̸�
	 * @return �̸��� ���� ȸ�� ���� ����Ʈ
	 */
	public ArrayList<AddressVO> getAddress(String name);
	
	/**
	 * ���޵� ��ȣ�� ȸ�� ���� ����
	 * @param num ������ ȸ����ȣ
	 * @return ���� ���� ����
	 */
	public boolean deleteAddress(int num);
	
	/**
	 * ���� ����
	 */
	public void saveFile();
}
