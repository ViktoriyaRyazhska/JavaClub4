package Classes;

public class Fraction {
    private final long top;
    private final long bottom;

    public Fraction(long numerator, long denominator) {
        top = numerator;
        bottom = denominator;
    }

    static Fraction lowest(long den3, long num3)
    {

        long common_factor = gcd(num3,den3);


        den3 = den3/common_factor;
        num3 = num3/common_factor;
        System.out.println(num3+"/"+den3);
        return new Fraction(num3, den3);
    }

    static long gcd(long a, long b)
    {
        if (a == 0)
            return b;
        return gcd(b%a, a);
    }

    public Fraction add(Fraction f2) {
        long den3 = gcd(bottom, f2.bottom);



        den3 = (bottom * f2.bottom) / den3;


        long num3 = (top) * (den3 / bottom) + (f2.top) * (den3 / f2.bottom);


        return lowest(den3,num3);

    }

    @Override
    public String toString() {
        return top + "/" +bottom;
    }

}