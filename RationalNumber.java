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
		return (numerator + 0.0) / denominator;
	}
	public int getNumerator() {
		return numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	public RationalNumber reciprocal() {
		return new RationalNumber(denominator, numerator);
	}
	public boolean equals(RationalNumber other) {
		RationalNumber alpha = this.reduce();
		RationalNumber beta = other.reduce();
		return (alpha.numerator == beta.numerator && alpha.denominator == beta.denominator);
	}
	public String toString() {
		return numerator + "/" + denominator;
	}
	private static int gcd(int a, int b) {
		while (b != 0) {
			int div = b;
			b = a % b;
			a = div;
		}
		return a;
	}
	private RationalNumber reduce() {
		int gcd = gcd(numerator, denominator);
		numerator = numerator / gcd;
		denominator = denominator / gcd;
		return this;
	}
	public RationalNumber multiply(RationalNumber other) {
		return new RationalNumber(numerator * other.numerator, denominator * other.denominator);
	}
	public RationalNumber divide(RationalNumber other) {
		return new RationalNumber(numerator / other.numerator, denominator / other.denominator);
	}
	public RationalNumber add(RationalNumber other) {
		return new RationalNumber(numerator * other.denominator + other.numerator * denominator, denominator * other.denominator);
	}
	public RationalNumber subtract(RationalNumber other) {
		return new RationalNumber(numerator * other.denominator - other.numerator * denominator, denominator * other.denominator);
	}
}
