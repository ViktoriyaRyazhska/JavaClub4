package Classes;

public class Fraction implements Comparable<Fraction>
{
    private final long top;
    private final long bottom;

    public Fraction(long numerator, long denominator) {
        top = numerator;
        bottom = denominator;
    }

    @Override
    public int hashCode() { return 17 * Long.hashCode(top) + Long.hashCode(bottom); }
    @Override
    public boolean equals(Object o) { return compareTo((Fraction)o) == 0; }
    @Override
    public int compareTo(Fraction f2){ return Long.compare(top * f2.bottom, f2.top * bottom); }

    static Fraction lowest(long den3, long num3)
    {
        // Finding gcd of both terms
        long common_factor = gcd(num3,den3);

        // Converting both terms into simpler
        // terms by dividing them by common factor
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

        // Denominator of final fraction obtained
        // finding LCM of den1 and den2
        // LCM * GCD = a * b
        den3 = (bottom * f2.bottom) / den3;

        // Changing the fractions to have same denominator
        // Numerator of the final fraction obtained
        long num3 = (top) * (den3 / bottom) + (f2.top) * (den3 / f2.bottom);

        // Calling function to convert final fraction
        // into it's simplest form
        return lowest(den3,num3);

    }

    @Override
    public String toString() {
        return top + "/" +bottom;
    }

    public static void main(String[] args) {
        new Fraction(1, 8).add(new Fraction(4, 5));
    }
}