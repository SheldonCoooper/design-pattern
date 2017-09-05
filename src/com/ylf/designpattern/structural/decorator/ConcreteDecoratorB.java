package com.ylf.designpattern.structural.decorator;

/**
 * 添加B功能的装饰器
 * 
 * @author Jerry
 *
 */
public class ConcreteDecoratorB extends Decorator {

	public ConcreteDecoratorB(Component component) {
		super(component);
	}

	@Override
	public void method() {
		component.method();
		System.out.println("添加额外B功能");
	}

}
