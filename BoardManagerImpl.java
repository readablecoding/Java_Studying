package test.service;

import java.util.ArrayList;

import test.vo.Board;

public class BoardManagerImpl implements BoardManager 
{
	ArrayList<Board> boardlist;		//글 정보를 저장할 리스트
	
	public BoardManagerImpl() 
	{
		//최초 실행될 때 리스트 생성
		boardlist = new ArrayList<Board>();
	}//BoardManagerImpl()
	
	@Override
	public boolean add(Board board) 
	{
		//같은 번호의 글이 있는지 확인
		if (getBoard(board.getNum()) != null) 
		{
			return false;
		}
		//없으면 저장
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
