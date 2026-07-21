package com.sist.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
 *  어노테이션
 *  ------- 80%
 *  1) 메모리 할당용 클래스 선정 (클래스 구분) 찾기/구분
 *     @Controller
 *     	 => MVC에서 View(JSP)를 변환하는 컨트롤러
 *     	 => JSP / ThymeLeaf --> 화면 변경
 *     
 *     @RestController
 *     	 => JSON / XML 데이터를 반환하는 경우 => REST API 컨트롤러
 *       => 내부적으로 변환이 된다 (자동으로 JSON으로 변환)
 *     
 *     @Component
 *     	 => 메모리 할당 -> 일반 클래스
 *       => 모든 클래스의 상속 (상위 클래스)
 *       
 *     @Service
 *     	 => 비지니스 로직 계층
 *         -------------- DAO / Manager
 *       User == DispatcherServlet == service == DAO == Oracle
 *       				|
 *       			JSP / HTML
 *     
 *     @Reposetory
 *     	 => DAO : 데이터베이스 연동
 *     
 *     @Configuration
 *     	 => XML을 대체 -> 순수하게 자바 셋팅
 *     
 *     @ControllerAdvice / @RestControllerAdvice
 *     	 => 공통예외처리
 */
public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext app = new ClassPathXmlApplicationContext("app.xml");
		
		Member m = (Member)app.getBean("member"); //@Component("mem")이 있으면 mem을 넣고 없으면 클래스명(첫자는 소문자)을 넣는다
		System.out.println(m);
		
		Student s = (Student)app.getBean("student");
		System.out.println(s);
		
		Sawon sa = (Sawon)app.getBean("sawon");
		System.out.println(sa);
		
		Food f = new Food();

	}

}
