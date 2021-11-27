package Tasks.String.RemoveSpaces;

import java.util.Scanner;

public class RemoveSpacesImpl implements RemoveSpaces {
    private String str;

    public RemoveSpacesImpl(final Scanner scanner) {
        setStr(scanner.nextLine());
    }

    public String getStr() {
        return str;
    }

    public void setStr(final String str) {
        if (!str.isEmpty() && str.matches("\s*")){
            this.str = str;
        }else{
            this.str = "Re mo vi ng";
        }
    }

    @Override
    public String removingSpaces() {
        return getStr().replaceAll(" ", "");
    }
}
