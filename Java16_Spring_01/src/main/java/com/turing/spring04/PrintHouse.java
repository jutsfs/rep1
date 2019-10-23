package com.turing.spring04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * 图文店
 * @author fred
 *
 */

@Component
public class PrintHouse {
	
	//属性
	private Printer printer;
	
	public void service() {
		printer.print();
	}
	
	
	public static void main(String[] args) {	
		//获取Spring容器对象
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/turing/spring04/config.xml");
		
		//从容器中获取打印机
		Printer printer = ctx.getBean("laserPrinter",Printer.class);
		
		//调用方法
		printer.print();
	}
}
