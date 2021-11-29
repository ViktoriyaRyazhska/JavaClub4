package Basic;

public class ConvertToBinary {

	public static int toBinary(int n) {
		int multiplier = 1;
		int value = 0;

		do {
			value += (n % 2) * multiplier;
			n /= 2;
			multiplier *= 10;
		} while (n > 0);

		return value;
	}
}
