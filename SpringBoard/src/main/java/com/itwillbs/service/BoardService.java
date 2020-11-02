package com.itwillbs.service;

import java.util.List;

import com.itwillbs.domain.BoardVO;

public interface BoardService {

	// 글쓰기
	public void regist(BoardVO vo) throws Exception;
	
	// 글 목록 전체 가져오기 
	public List<BoardVO> listAll() throws Exception;
	
	// 글번호에 해당하는 글정보 가져오기
	public BoardVO read(Integer bno) throws Exception;
	
	public BoardVO modify(Integer bno) throws Exception;
	
	// 글번호에 해당하는 글 정보 수정
	public void update(BoardVO vo) throws Exception;
	
	// 글 번호에 해당하는 글 삭제
	public void remove(int bno) throws Exception;
}
