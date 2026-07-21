package com.sist.vo;

import lombok.Data;

/*
 *  1. Container
 *  	=>  클래스 관리(클래스 등록)
 *  		객체 생성 === 주입 === 활용 === 소멸
 *  
 *  	 	BeanFactory : DI / Core
 *  			|
 *  		ApplicationContext : DI / Core / AOP
 *  			| -> AnnotationConfigApplicationContext : 순수하게 자바 코딩
 *  					|====> 기반 : Spring-Boot
 *  		WebApplicationContext : DI / Core / AOP / MVC
 *  
 *  	=> DL / DI
 *  	=> DL : 클래스 찾기 => getBean()
 *  	=> DI : 값을 주입
 *  
 *  2. DI : 객체 생성에 필요한 값을 주입
 *  		= setter DI : setXxx에 값을 채우는 경우 => 일반 변수값
 *  		= constructor DI : 객체 단위 값을 채우는 경우
 *  		= Method DI : 객체 생성- init-method (driver 등록), 객체 소멸- destory-method (오라클 종료)
 *  		= XML 방법 / 어노테이션 사용
 *  3. AOP : 공통 모듈 => 모든 메소드에서 반복 호출이 되는 내용을 모아서 자동화
 *  		CallBack함수 만들기
 *  
 *  		Advice : 규칙
 *  			|- JoinPoint : 시점
 *  				public String display()
 *  				{
 *  					--------- BEFORE
 *  					try
 *  					{
 *  						---------위	Arround
 *  
 *  						---------아래
 *  					}
 *  					catch(Exception e)
 *  					{
 *  						------ After-Throwable
 *  					}
 *  					finally
 *  					{
 *  						------ After
 *  					}
 *  					return 값 ----- After-Returning
 *  				}
 *  			|- PointCut : 어떤 메소드
 *  				pointcut("* com.sist.main.MainClass.*(..)")
 *  					모든 return					모든 메소드명
 *  												..은 매개변수 관계없이
 *  		-------------------Weaving : 묶어주는 역할 수행
 *  							=> 따로 제작된 메소드를 한곳에 묶어서 수행
 *  4. MVC : Model + View + Controller
 *  		==> 이미 제작이 되어 있다
 *  5. ORM : MyBatis / JPA
 *  6. Transaction : AOP로 제작됨
 *  7. Security / WebSocket / Stormp
 *  				| 알림, 상담, 그룹채팅
 *  	| 보안(인증 / 인가) => 권한 
 *  
 *  
 */
@Data
public class SeoulVO {
	private int no;
	private String title,msg,address;
}
