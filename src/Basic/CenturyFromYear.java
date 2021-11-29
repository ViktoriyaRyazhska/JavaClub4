package Basic;

public class CenturyFromYear {
	public static int Century(int year) {

		if (year % 10 != 0) {
			return  (year / 100) + 1;
		} else {
			return year / 100;
		}
	}
}