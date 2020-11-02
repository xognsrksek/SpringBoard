package com.itwillbs.controller;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itwillbs.domain.BoardVO;
import com.itwillbs.persistence.BoardDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml" }
		)
public class BoardDAOTest {
    // 서비스 <- 컨트롤러 역활의 테스트 객체
	
	// DB처리객체 생성
	@Inject
	private BoardDAO bdao;
	
	//@Test
	public void testDAO() throws Exception{
		System.out.println("Test : BoardDAO ->"+bdao);
	}
	
	@Test
	public void testInsertBoard() throws Exception{
		System.out.println("TEST: 글쓰기 동작!");
		
		BoardVO vo = new BoardVO();
		vo.setTitle("공지사항");
		vo.setContent("공지 안내 ㅇㅇㅇㅇㅇㅇ");
	    vo.setWriter("관리자");
	    
	    bdao.create(vo);
	    
	    System.out.println("Test: 글쓰기 완료!");
	}
	
}
