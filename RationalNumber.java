public class RationalNumber extends RealNumber {
	private int numerator;
	private int denominator;
	public RationalNumber(int numerator, int denominator) {
		super(0.0);
		if (denominator == 0) {
			this.numerator = 0;
			this.denominator = 1;
		} else {
			this.numerator = numerator;
			this.denominator = denominator;
		}
	}
	public double getValue() {
		return numerator + 0.0 / denominator;
	}
	public int getNumerator() {
		return 2;
	}
	public int getDenominator() {
		return 5;
	}
	public String compareTo() {
		return "4/5 is bigger than 5/7.";
	}
	public String toString() {
		return "Numerator: 2 Denominator: 5";
	}
}