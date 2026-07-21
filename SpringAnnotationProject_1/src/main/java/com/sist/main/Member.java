package com.sist.main;

import org.springframework.stereotype.Component;

import lombok.Data;
//VO는 개발자 처리 => 데이터형이다
@Data
@Component
public class Member {
	private int mno;
	private String name,address,phone;
}
