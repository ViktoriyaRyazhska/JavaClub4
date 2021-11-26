package JavaClub4.src.String;

import java.util.Arrays;

public class StringUtils {

    public static String toAlternativeString(String string) {
        char[] ch = string.toCharArray();
        char[] result = new char[ch.length];
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'A' && ch[i] <= 'Z')
                result[i] = Character.toLowerCase(ch[i]);

            else if (ch[i] >= 'a' && ch[i] <= 'z')
                result[i] = Character.toUpperCase(ch[i]);


            else
                result[i] = ch[i];

        }
        return new String(result);
    }

}