package Classes.FractionClass;

public interface FractionClass {
    FractionClassImpl add(FractionClassImpl value);
    FractionClassImpl differ(FractionClassImpl value);
    FractionClassImpl multi(FractionClassImpl value);
    FractionClassImpl divide(FractionClassImpl value);
    double toDouble();
}
