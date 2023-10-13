package calculator;

import myFrame.MyFrame;

public class Calculator {

	public static void main(String[] args) {

		new MyFrame();
		CalculatorOperation calc = new CalculatorOperation();
		TextFieldMethod num = new TextFieldMethod();
		System.out.println(num.del("12345"));
		System.out.println(num.dec("123.45"));
		System.out.println(num.dec("12345"));
		System.out.println(num.neg("12345"));
		System.out.println(num.neg("-12345"));
		System.out.println(calc.add("100", "-100"));

	}

}
