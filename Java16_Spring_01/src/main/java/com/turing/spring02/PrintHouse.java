package com.turing.spring02;
/**
 * 图文店
 * @author fred
 *
 */
public class PrintHouse {
	
	//接口的引用
	private Printer printer;
	
	public PrintHouse() {
		printer = new PinPrinter();
	}


	/**
	 * 提供服务
	 */
	public void service() {
		printer.print();
	}
	
	
	public static void main(String[] args) {
		//创建图文店对象
		PrintHouse printHouse = new PrintHouse();
		//提供服务
		printHouse.service();
	}
}
