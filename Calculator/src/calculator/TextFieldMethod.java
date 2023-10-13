package calculator;

public class TextFieldMethod {

	public String clr() {

		return "";
	}

	public String del(String number) {

		String newNum = number;
		int index = number.length();
		newNum = newNum.replace(number.charAt(index - 1), ' ').trim();

		return newNum;
	}

	public String dec(String number) {

		if (!number.contains(".")) {
			number = number.concat(".");
			return number;
		}
		return number;
	}

	public String neg(String number) {

		if (!number.contains("-")) {
			number = "-".concat(number);
			return number;
		}
		return number;
	}

}
