package com.turing.spring01;
/**
 * 图文店
 * @author fred
 *
 */
public class PrintHouse {
	
	//依赖打印机
	//private PinPrinter pinPrinter;
	private LaserPrinter laserPrinter;


	/**
	 * 提供服务
	 */
	public void service() {
//		pinPrinter = new PinPrinter();
		laserPrinter = new LaserPrinter();
//		pinPrinter.print();
		laserPrinter.print();
	}
}
