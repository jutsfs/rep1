package com.turing.spring02;
/**
 * 激光打印机
 * @author fred
 *
 */
public class LaserPrinter implements Printer{

	@Override
	public void print() {
		System.out.println("激光打印机开始打印。。。");
	}
}
