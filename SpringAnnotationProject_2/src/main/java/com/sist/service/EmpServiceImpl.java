package com.sist.service;
// 비지니스 로직 처리
// 로그인, 보안(암호화,복호화), 문자열 결합, 외부에서 데이터 읽기
// => 채팅, 실시간 전송 등

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sist.dao.DeptDAO;
import com.sist.dao.EmpDAO;
import com.sist.vo.DeptVO;
import com.sist.vo.EmpVO;
/*
 *  스테레오 타입
 *  ---------> 클래스 메모리 할당 요청
 *   			1) @Component: 일반 클래스 (ChatManager, NewsManager ..)
 *   			2) @Repository: DAO (데이터베이스 연동)
 *   			3) @Service: DAO+DAO (기타 기능)
 *   			4) => web @Controller / @RestController
 *   					  @ControllerAdvice
 *   
 *   					  Service <===> Repository <===> 오라클
 *   						 |
 *   					  Controller
 *   						 |
 *   					  JSP / HTML
 */
@Service("eService")
public class EmpServiceImpl implements EmpService{
	
	@Autowired
	private EmpDAO eDao;
	@Autowired
	private DeptDAO dDao;
	
	
	@Override
	public List<EmpVO> empListData() {

		return eDao.empListData();
	}

	@Override
	public List<DeptVO> deptListData() {

		return dDao.deptListData();
	}

}
