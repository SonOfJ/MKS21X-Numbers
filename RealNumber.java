public class RealNumber {
	private double number;
	public double getNumber() {
		return number;
	}
	public String compareTo(double otherNumber) {
		if (number > otherNumber) {
			return number + " is bigger than " + otherNumber;
		}
		if (number < otherNumber) {
			return otherNumber + " is bigger than " + number;
		}
		return "Values are equal.";
	}
	public String toString() {
		return "Value: " + number;
	}
}