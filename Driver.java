public class Driver{
  public static void main(String[] args){
    RealNumber s = new RealNumber(7.0);
    RealNumber e = new RealNumber(8.0);
    System.out.println("Should print 7.0");
    System.out.println(s);
    System.out.println("Should print 15.0");
    System.out.println(s.add(e));
    System.out.println("Should print -1.0");
    System.out.println(s.subtract(e));
    System.out.println("Should print 56.0");
    System.out.println(s.multiply(e));
    System.out.println("Should print 0.875");
    System.out.println(s.divide(e));
    RationalNumber a = new RationalNumber(4, 5);
    RationalNumber b = new RationalNumber(8, 10);
    RationalNumber c = new RationalNumber(6, 5);
    RationalNumber y = new RationalNumber(3, -10);
    RationalNumber z = new RationalNumber(7, 0);
    System.out.println("Should print 4/5");
    System.out.println(a);
    System.out.println("Should print 0/1");
    System.out.println(z);
    System.out.println("Should print -3/10");
    System.out.println(y);
    System.out.println("Should print 0.8");
    System.out.println(a.getValue());
    System.out.println("Should print 0.0");
    System.out.println(z.getValue());
    System.out.println("Should print 5/4");
    System.out.println(a.reciprocal());
    System.out.println("Should print true");
    System.out.println(a.equals(a));
    System.out.println("Should print true");
    System.out.println(a.equals(b));
    System.out.println("Should print 4");
    System.out.println(a.getNumerator());
    System.out.println("Should print 10");
    System.out.println(b.getDenominator());
    System.out.println("Should print 2/1");
    System.out.println(a.add(c));
    System.out.println("Should print -2/5");
    System.out.println(a.subtract(c));
    System.out.println("Should print 24/25");
    System.out.println(a.multiply(c));
    System.out.println("Should print 2/3");
    System.out.println(a.divide(c));
    System.out.println("Should print -8/3");
    System.out.println(b.divide(y));
  }
}
