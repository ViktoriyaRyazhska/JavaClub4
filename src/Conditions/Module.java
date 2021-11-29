
public class Module {
	public static int sequence(int n) {
		int x1 = 0;
		int x2 = 1;
		for (int i = 0; i < (n - 2) % 8; i++) {
			int sum = (x1 + x2) % 3;
			x1 = x2;
			x2 = sum;
		}
		return n == 0 ? 0 : (n == 1 ? 1 : x2);
	}
}
