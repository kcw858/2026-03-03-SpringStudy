package com.sist.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sist.mapper.DeptMapper;
import com.sist.vo.DeptVO;
/*
 *  @Autowired
 *  
 *  CONSTRUCTOR, METHOD, PARAMETER, FIELD, ANNOTATION_TYPE
 *  
 *  public class A
 *  {
 *  	@Autowired ==> FEILD
 *  	private B b;
 *  
 *  	@Autowired ==> CONSTRUCTOR
 *  	public void A(){}
 *  
 *  	@Autowired ==> METHOD
 *  	public void display(@Autowired B b){}
 *  							|PARAMETER
 *  
 *  	@Autowired
 *  	@Qualifier ==> ANNOTATION_TYPE
 *  }		
 * 
 */
@Repository //@Component를 써도 가능하지만 명확히 DAO라는걸 알려주기 위해 @Repository
public class DeptDAO {
	//Mapper를 읽기
	@Autowired //사용은 객체 주소
	private DeptMapper mapper;
	
	public List<DeptVO> deptListData()
	{
		return mapper.deptListData();
	}
}
