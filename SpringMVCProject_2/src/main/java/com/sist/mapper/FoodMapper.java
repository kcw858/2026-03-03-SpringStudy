package com.sist.mapper;
import java.util.*;

import org.apache.ibatis.annotations.Select;

import com.sist.vo.*;

public interface FoodMapper {
	@Select("SELECT no,name,poster,address "
			+ "FROM foods "
			+ "ORDER BY no ASC "
			+ "OFFSET #{start} ROWS FETCH NEXT 12 ROWS ONLY")
	public List<FoodVO> foodListData(int start);
	
	@Select("SELECT CEIL(COUNT(*)/12.0) "
			+ "FROM foods")
	public int foodTotalPage();
}
