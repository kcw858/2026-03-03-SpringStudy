package com.sist.vo;
// VO는 사용자 정의 데이터형 => 스프링에서 관리하지 않는다

import lombok.Data;

@Data
public class DeptVO {
	private int deptno;
	private String dname,loc;
}
