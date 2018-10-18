public class RealNumber {
	private double value;
	public RealNumber(double v) {
		value = v;
	}
	public double add(RealNumber other){
    return value + other.getValue();
  }
	public double multiply(RealNumber other){
    return value * other.getValue();
  }
	public double divide(RealNumber other){
    return value / other.getValue();
  }
	public double subtract(RealNumber other){
    return value - other.getValue();
  }
	public double getValue() {
		return value;
	}
	public String compareTo(double otherValue) {
		if (value > otherValue) {
			return value + " is bigger than " + otherValue;
		}
		if (value < otherValue) {
			return otherValue + " is bigger than " + value;
		}
		return "Values are equal.";
	}
	public String toString() {
		return "" + value;
	}
}
