package com.itwillbs.persistence;

import java.util.List;

import com.itwillbs.domain.BoardVO;

public interface BoardDAO {

	//글쓰기 (create)
	public void create(BoardVO vo) throws Exception;
	
	//글 전체 목록 보기 (listAll-select)
	public List<BoardVO> listAll() throws Exception;
	
	//글번호에 해당하는 글정보 가져가기 동작
	public BoardVO read(Integer bno) throws Exception;

	public BoardVO  modify(Integer bno) throws Exception;

	//글 번호 해당하는 글정보 수정하기 동작
	public void update(BoardVO vo) throws Exception;

	//글 번호에 해당하는 글정보 삭제
	public void remove(int bno) throws Exception;
}
