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
		return numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	public RationalNumber reciprocal() {
		numerator = denominator;
		denominator = numerator;
		return this;
	}
	public boolean equals(RationalNumber other) {
		return (this == other);
	}
	public String compareTo() {
		return "4/5 is bigger than 5/7.";
	}
	public String toString() {
		return numerator + "/" + denominator;
	}
	private static int 
}
