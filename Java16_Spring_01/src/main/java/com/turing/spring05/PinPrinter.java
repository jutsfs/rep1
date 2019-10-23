package com.turing.spring05;

import org.springframework.stereotype.Component;

/**
 * 针式打印机
 * @author fred
 *
 */

@Component
public class PinPrinter implements Printer{

	@Override
	public void print() {
		System.out.println("针式打印机开始打印。。。");
	}
}
