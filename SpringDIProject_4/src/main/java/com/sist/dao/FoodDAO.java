package com.sist.dao;
import java.util.*;
import com.sist.mapper.*;
import com.sist.vo.*;
public class FoodDAO {
	private FoodMapper mapper;

	public void setMapper(FoodMapper mapper) {
		this.mapper = mapper;
	}
	
	public List<FoodVO> foodlListData(int start)
	{
		return mapper.foodlListData(start);
	}
}
