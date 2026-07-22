package com.sist.auto;

import org.springframework.stereotype.Repository;

@Repository
public class MySQLDB implements Oracle{

	@Override
	public void connection() {
		System.out.println("MySQL 연결");
		
	}

	@Override
	public void disconnection() {
		System.out.println("MySQL 연결 해제");
		
	}

}
