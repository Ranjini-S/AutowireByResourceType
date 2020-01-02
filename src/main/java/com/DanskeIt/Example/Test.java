package com.DanskeIt.Example;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");

	Student student = (Student) context.getBean("student");
	System.out.println(student);
	context.close();
}
}
