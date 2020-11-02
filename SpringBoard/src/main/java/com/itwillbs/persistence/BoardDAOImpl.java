package com.itwillbs.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.itwillbs.domain.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO {

	// DB 접근을 위한 객체 SqlSession 
	@Inject
	private SqlSession session;
	
	// mapper의 위치 
	private static final String namespace 
	   ="com.itwillbs.mapper.BoardMapper";
	
	//글쓰기 (create)
	@Override
	public void create(BoardVO vo) throws Exception {
		System.out.println("DAO : create(vo) 호출 ");
		System.out.println("DAO : mapper 이동 SQL실행");
		
		session.insert(namespace+".create", vo);
		
		System.out.println("DAO : 글쓰기 완료 ! ");
		System.out.println("DAO : 다음동작 이동");
		
	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		System.out.println("DAO : listAll() 호출 ");
		
		// SqlSession 객체 사용 mapper 호출
		List<BoardVO> boardList = 
		   session.selectList(namespace+".listAll");
		
		System.out.println("DAO : 글 정보 저장 완료 ");
		return boardList;
	}

	@Override
	public BoardVO read(Integer bno) throws Exception {
		System.out.println("DAO:read(bno) 호출");
		System.out.println("DAO: mapper 사용해서 sql 호출");
		
		BoardVO vo = session.selectOne(namespace+".read",bno);
		
		System.out.println("DAO : SQL 구문 처리 완료");
		System.out.println("DAO : 서비스 객체 이동");
		
		return vo;
	}

	@Override
	public BoardVO modify(Integer bno) throws Exception {
		
		BoardVO vo = session.selectOne(namespace+".modify", bno);
		
		return vo;
	}

	@Override
	public void update(BoardVO vo) throws Exception {
		System.out.println("DAO : update(vo) 호출");
		System.out.println("DAO : mapper - SQL구문 호출");
		
		session.update(namespace+".update",vo);
		
		System.out.println("DAO : SQL 실행완료");
		
	}

	@Override
	public void remove(int bno) throws Exception {
		System.out.println("DAO : remove(bno)");
		System.out.println("DAO : mapper 이동 sql 구문 실행");
		
		session.delete(namespace+".delete", bno);
		
		
		
	}
	
	
	
	
	

}
