package com.sist.mapper;
import java.util.*;

import org.apache.ibatis.annotations.Select;
/*
 *  @Select() : 단순한 SQL문장
 *  <select> : 복잡한 SQL
 *  ----------------------- 실무에서는 병행
 */
import com.sist.vo.DeptVO;
public interface DeptMapper {
	@Select("SELECT deptno,dname,loc "
			+ "FROM dept")
	public List<DeptVO> deptListData();
	// 	   	resultType		id		parameterType => #{},${}이 있으면 parameterType이 있다
	/*
	 *  SELECT ~
	 *  FROM ~ 
	 *  WHERE cno=#{id} AND no=#{no} ==> VO에 값이 있으면 VO, 없으면 hashmap, @Param
	 *  
	 *  display(int cno,int no) -> 오류
	 *  display(@Param("cno") int cno,@Param("no") int no) -> 이렇게 써야한다
	 */
}
