package String.RemoveSpaces;

public class RemoveSpacesImpl implements RemoveSpaces{
    private String str;

    public RemoveSpacesImpl(final String str) {
       this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(final String str) {
        this.str = str;
    }

    @Override
    public String removingSpaces() {
        return getStr().replaceAll(" ", "");
    }
}
