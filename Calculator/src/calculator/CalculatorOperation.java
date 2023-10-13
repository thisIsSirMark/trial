package calculator;

public class CalculatorOperation {

	private Double numOne, numTwo;

	public Double add(String numOne, String numTwo) {

		this.numOne = Double.parseDouble(numOne);
		this.numTwo = Double.parseDouble(numTwo);

		this.numOne += this.numTwo;

		return this.numOne;
	}

	public Double sub(String numOne, String numTwo) {

		this.numOne = Double.parseDouble(numOne);
		this.numTwo = Double.parseDouble(numTwo);

		this.numOne -= this.numTwo;

		return this.numOne;
	}

	public Double mul(String numOne, String numTwo) {

		this.numOne = Double.parseDouble(numOne);
		this.numTwo = Double.parseDouble(numTwo);

		this.numOne *= this.numTwo;

		return this.numOne;
	}

	public Double div(String numOne, String numTwo) {

		this.numOne = Double.parseDouble(numOne);
		this.numTwo = Double.parseDouble(numTwo);

		this.numOne /= this.numTwo;

		return this.numOne;
	}

}
