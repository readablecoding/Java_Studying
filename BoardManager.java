package board.service;

import java.util.ArrayList;

import board.vo.Board;

/**
 * ���� Ŭ�������� ������ �߻� �޼ҵ���� ������ �������̽�
 */
public interface BoardManager 
{
	/**
	 * ����Ʈ�� �� �������� �߰� 
	 * @param board �߰��� �� ����
	 * @return ���� ���� ����
	 */
	public boolean add(Board board);
	
	/**
	 * ����Ʈ�� ��� ���� ����
	 * @return ����Ʈ ��ü
	 */
	public ArrayList<Board> listAll();
	
	/**
	 * ���޵� ��ȣ�� �� ���� ����
	 * @param num �۹�ȣ
	 * @return �ش� ��ȣ�� �� ����
	 */
	public Board getBoard(int num);
	
	/**
	 * ���޵� ��ȣ�� �� ����
	 * @param num ������ �۹�ȣ
	 * @return ���� ���� ����
	 */
	public boolean remove(int num);
}
