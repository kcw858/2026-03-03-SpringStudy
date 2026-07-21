package com.sist.main;

import org.apache.commons.collections.map.HashedMap;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.lang.reflect.Method;
import java.util.*;
/*
 *  XML 파싱
 *  
 *   DOM / SAX
 *   		| 스프링, 마이바티스
 *   		| XML 코드를 한줄씩 읽어서 필요한 데이터를 추출
 *   
 *   <?xml version="1.0" encoding="UTF-8"?>			=> startDocument()
	<beans>											=> startElement()
		<bean id="sa" class="com.sist.main.Sawon" 	=> startElement()
			p:sabun="1"
			p:name="홍길동"
			p:dept="개발부"
			p:job="사원"
		/>											=> endElement()
	</beans>										=> endDocument()
 */
//new ClassPathXmlApplicationContext("app.xml")
public class XMLParse extends DefaultHandler{
	private Map map = new HashMap();

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		try
		{
			if(qName.equals("bean"))
			{
				System.out.println("sss");
				String id = attributes.getValue("id");
				String cls = attributes.getValue("class");
				String sabun = attributes.getValue("p:sabun");
				String name = attributes.getValue("p:name");
				String dept = attributes.getValue("p:dept");
				String job = attributes.getValue("p:job");
				/*
				System.out.println(id+" "
						+ cls +" "
						+ sabun + " "
						+ name + " "
						+ dept + " "
						+ job
						);
						*/
				String[] aName = {sabun,name,dept,job};
				String[] ss	= {
						attributes.getQName(2),
						attributes.getQName(3),
						attributes.getQName(4),
						attributes.getQName(5),
				};
				System.out.println(Arrays.toString(ss));
				
				Class clsName = Class.forName(cls);
				Object obj = clsName.getDeclaredConstructor().newInstance(); 
				//리플렉션 => 클래스 이름으로 메모리 할당
				
				Method[] methods = clsName.getDeclaredMethods();
				for(Method m : methods)
				{
					String  mName = m.getName();
					for(int i=0;i<ss.length;i++)
					{
						if(mName.equalsIgnoreCase("set"+ss[i].substring(ss[i].indexOf(":"+1))))
						{
							if(i==0)
							{
								m.invoke(obj, Integer.parseInt(aName[i]));
								// setSabun(int sabun);
							}
							else
							{
								m.invoke(obj, aName[i]);
							}
						}
					}
				}
				map.put(id, obj);
			 }
		}catch(Exception ex)
		{
			
		}
	}

	public Map getMap() {
		
		return map;
	}
	
}
