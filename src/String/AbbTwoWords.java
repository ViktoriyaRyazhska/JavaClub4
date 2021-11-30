package String;

import java.util.Arrays;
import java.util.stream.Collectors;

public class AbbTwoWords {
	public static String abbrevName(String name) {
		return Arrays.stream(name.split(" ")).map(String::toUpperCase).map(word -> word.substring(0, 1))
				.collect(Collectors.joining("."));

	}

}