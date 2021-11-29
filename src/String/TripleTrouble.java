
public class TripleTrouble {
	  public static String tripleTrouble(String one, String two, String three) {
		    String s = "";
		    for (int i = 0; i < one.length(); i++){
		      s += "" + one.charAt(i) + two.charAt(i) + three.charAt(i);
		    }
		    return s;
		  }
		}