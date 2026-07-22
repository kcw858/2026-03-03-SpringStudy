package com.sist.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sist.mapper.EmpMapper;
import com.sist.vo.EmpVO;

@Repository //클래스 위에서만 사용이 가능
public class EmpDAO {
	//Mapper를 읽기
		@Autowired //스프링에서 자동화 => 구현된 클래스를 주소를 넘겨준다
				   //딘점 => OOP가 깨진다 (리플렉션에서도 많이 깨진다)
		private EmpMapper mapper;
		
		public List<EmpVO> empListData()
		{
			return mapper.empListData();
		}
}
