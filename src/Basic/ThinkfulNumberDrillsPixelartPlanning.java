package Basic;

public class ThinkfulNumberDrillsPixelartPlanning {

	public static boolean isDivisible(int wallLength, int pixelSize) {

		int result = wallLength % pixelSize;

		if (result == 0)
			return true;
		else
			return false;
	}
}
