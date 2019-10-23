package com.turing.spring05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * 图文店
 * @author fred
 *
 */

/**
 * @Configuration就等于空的config.xml
 * @ComponentScan就等同于<context:component-scan>,扫描的默认值就是当前类所在的包及其子包
 * @author fred
 *
 */
@Configuration
@ComponentScan
public class PrintHouse {
	
	//属性
	private Printer printer;
	
	public void service() {
		printer.print();
	}
	
	
	public static void main(String[] args) {	
		//获取Spring容器对象
		ApplicationContext ctx = new AnnotationConfigApplicationContext(PrintHouse.class);
		
		//从容器中获取打印机
		Printer printer = ctx.getBean("laserPrinter",Printer.class);
		
		//调用方法
		printer.print();
	}
}
