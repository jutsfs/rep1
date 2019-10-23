package com.turing.spring02;
/**
 * 针式打印机
 * @author fred
 *
 */
public class PinPrinter implements Printer{

	@Override
	public void print() {
		System.out.println("针式打印机开始打印。。。");
	}
}
