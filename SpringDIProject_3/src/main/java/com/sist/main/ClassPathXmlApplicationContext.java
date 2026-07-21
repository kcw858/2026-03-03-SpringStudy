package com.sist.main;
import java.util.*;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import java.io.*;
//DI => 积己(按眉 积己 => 蔼 林涝 => 按眉 家戈)
//AOP
public class ClassPathXmlApplicationContext implements ApplicationContext{
	private Map clsMap = new HashMap();
	public ClassPathXmlApplicationContext(String path)
	{
		try
		{
			SAXParserFactory spf = SAXParserFactory.newInstance();
			SAXParser sp = spf.newSAXParser();
			XMLParse xp = new XMLParse();
			sp.parse(new File(path), xp);
			clsMap = xp.getMap();
		}catch(Exception ex)
		{
			
		}
	}
	@Override
	public Object getBean(String key) {

		return clsMap.get(key);
	}

}
