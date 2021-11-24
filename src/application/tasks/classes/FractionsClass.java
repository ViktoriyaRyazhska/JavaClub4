package application.tasks.classes;

public class FractionsClass implements Comparable<FractionsClass> {
    private final long top;
    private final long bottom;

    public FractionsClass(long numerator, long denominator) {
        top = numerator;
        bottom = denominator;
    }

    @Override
    public int hashCode() {
        return 17 * Long.hashCode(top) + Long.hashCode(bottom);
    }

    @Override
    public boolean equals(Object o) {
        return compareTo((FractionsClass) o) == 0;
    }

    @Override
    public int compareTo(FractionsClass f2) {
        return Long.compare(top * f2.bottom, f2.top * bottom);
    }

    // Your work here!

    //Add two fractions
    public FractionsClass add(FractionsClass f2) {
        return null;
    }
    //...and make this class string representable

    public static void task() {
        System.out.println("Done");
    }
}
