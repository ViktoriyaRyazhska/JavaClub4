package Tasks.Loops.ReversedSequence;

import java.util.Scanner;

public class ReversedSequenceImpl implements ReversedSequence{
    private int n;

    public ReversedSequenceImpl(final Scanner scanner) {
        setN(scanner.nextInt());
    }

    public int getN() {
        return n;
    }

    public void setN(final int n) {
        this.n = Math.max(n, 1);
    }

    @Override
    public int[] reversedSequence() {
        int[] sequence = new int[getN()];
        for (int i = getN(); i > 0; i--) {
            sequence[getN() - i] = i;
        }
        return sequence;
    }
}
