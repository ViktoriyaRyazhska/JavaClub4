import java.util.Arrays;

public class CatDogYears {

	public static void main(String[] args) {
	}

	public static int[] humanYearsCatYearsDogYears(final int humanYears) {
		int catYears = 0, dogYears = 0;
		switch (humanYears) {
		default:
			catYears = 4 * (humanYears - 2);
			dogYears = 5 * (humanYears - 2);
		case 2:
			catYears += 9;
			dogYears += 9;
		case 1:
			catYears += 15;
			dogYears += 15;
		}
		return new int[] { humanYears, catYears, dogYears };
	}

	public void execute(int humanYears) {
		System.out.println(Arrays.toString(humanYearsCatYearsDogYears(humanYears)));
	}

}