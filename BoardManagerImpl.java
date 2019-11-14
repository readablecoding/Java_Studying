package board.service;

import java.util.ArrayList;

import board.vo.Board;

public class BoardManagerImpl implements BoardManager 
{
	ArrayList<Board> boardlist;		//�� ������ ������ ����Ʈ -> ����
	
	public BoardManagerImpl() 
	{
		//���� ����� �� ����Ʈ ����
		boardlist = new ArrayList<Board>(); // ����
	}
	
	@Override
	public boolean add(Board board) 
	{
		//���� ��ȣ�� ���� �ִ��� Ȯ��
		if (getBoard(board.getNum()) != null) 
		{
			return false; // ui�� ���ư�
		}
		//������ ����
		boardlist.add(board);
		return true;
	}

	@Override
	public ArrayList<Board> listAll() 
	{
		return boardlist;
	}	

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
	}

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
	}

}
