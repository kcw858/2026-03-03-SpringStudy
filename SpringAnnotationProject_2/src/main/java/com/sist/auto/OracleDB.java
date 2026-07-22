package com.sist.auto;

import org.springframework.stereotype.Repository;

@Repository
public class OracleDB implements Oracle{

	@Override
	public void connection() {
		
		System.out.println("오라클 연결");
	}

	@Override
	public void disconnection() {
		
		System.out.println("오라클 연결 해제");

	}

}
