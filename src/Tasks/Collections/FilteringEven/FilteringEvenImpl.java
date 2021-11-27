package Tasks.Collections.FilteringEven;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilteringEvenImpl implements FilteringEven {
    private List<Integer> listOfNumbers = new ArrayList<>();
    private int n;

    public FilteringEvenImpl(final Scanner scanner) {
        setN(scanner.nextInt());
        for (int i = 0; i < getN(); i++) {
            this.listOfNumbers.add(scanner.nextInt());
        }
    }

    public List<Integer> getListOfNumbers() {
        return listOfNumbers;
    }

    public void setListOfNumbers(final List<Integer> listOfNumbers) {
        this.listOfNumbers = listOfNumbers;
    }

    public int getN() {
        return n;
    }

    public void setN(final int n) {
        this.n = Math.max(n, 1);
    }

    @Override
    public List<Integer> removeEvenNumbers() {
        for (int i = 0; i < getListOfNumbers().size(); i++) {
            if (getListOfNumbers().get(i) % 2 == 0) {
                getListOfNumbers().remove(i);
                i--;
            }
        }
        return getListOfNumbers();
    }
}
