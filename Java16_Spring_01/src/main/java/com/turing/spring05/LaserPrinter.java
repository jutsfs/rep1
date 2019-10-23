package com.turing.spring05;

import org.springframework.stereotype.Component;

/**
 * 激光打印机
 * @author fred
 *
 */

/**
 * @Component注解就等于<bean id="laserPrinter" class="com.turing.spring04.LaserPrinter"></bean>
 * @author fred
 *
 */
@Component
public class LaserPrinter implements Printer{

	@Override
	public void print() {
		System.out.println("激光打印机开始打印。。。");
	}
}
