package com.turing.spring03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 图文店
 * @author fred
 *
 */
public class PrintHouse {
	
	//属性
	private Printer printer;
	
	//构造器
	public PrintHouse(Printer printer) {
		this.printer = printer;
	}
	
	
	//set属性
//	public void setPrinter(Printer printer) {
//		this.printer = printer;
//	}


	/**
	 * 提供服务
	 */
	public void service() {
		printer.print();
	}
	
	
	public static void main(String[] args) {	
		//获取Spring容器对象
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/turing/spring03/config.xml");
		//从容器中获取Bean
		
		//---------------------找打印机-------------------------------------------
		
		//1、通过类型查找-必须类型唯一
		//Printer printer = ctx.getBean(Printer.class);
		
		//2、通过名称查找
		//Printer printer = (Printer)ctx.getBean("laserPrinter");
		
		//3、通过名称和类型查找
		//Printer printer = ctx.getBean("laserPrinter", Printer.class);
		
		//调用对象的方法
		//printer.print();
		
		/**
		 * Spring做了什么
		 * 分析：1、解析xml配置文件
		 * 	   2、Class clazz = Class.forName("com.turing.spring03.PinPrinter");
		 *     3、PinPrinter pinPrinter = (PinPrinter)clazz.newInstance();
		 *     
		 */
		
		
		//---------------------找图文店--------------------------------------------
//		PrintHouse printHouse = ctx.getBean(PrintHouse.class);
//		//调用方法
//		printHouse.service();
		
		//---------------------找图文店--------------------------------------------
		PrintHouse printHouse = ctx.getBean("printHouse2", PrintHouse.class);
		//调用方法
		printHouse.service();
	}
}
