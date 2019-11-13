package test.service;

import java.util.ArrayList;

import test.vo.Board;

public class BoardManagerImpl implements BoardManager 
{
	ArrayList<Board> boardlist;		//�� ������ ������ ����Ʈ
	
	public BoardManagerImpl() 
	{
		//���� ����� �� ����Ʈ ����
		boardlist = new ArrayList<Board>();
	}//BoardManagerImpl()
	
	@Override
	public boolean add(Board board) 
	{
		//���� ��ȣ�� ���� �ִ��� Ȯ��
		if (getBoard(board.getNum()) != null) 
		{
			return false;
		}
		//������ ����
		boardlist.add(board);
		return true;
	}//add()

	@Override
	public ArrayList<Board> listAll() 
	{
		return boardlist;
	}//listAll()

	@Override
	public Board getBoard(int num) 
	{
		Board b = null;
		for (int i = 0; i < boardlist.size(); i++) 
		{
			b = boardlist.get(i);
			if (num == b.getNum()) 
			{
				return b;
			}
		}
		return null;
	}//getBoard()

	@Override
	public boolean remove(int num) 
	{
		Board b = null;
		for (int i = 0; i < boardlist.size(); i++) 
		{
			b = boardlist.get(i);
			if (num == b.getNum()) 
			{
				boardlist.remove(i);
				return true;
			}
		}
		return false;
	}//remove()

}//class BoardManagerImpl
