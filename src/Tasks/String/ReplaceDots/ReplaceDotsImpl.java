package Tasks.String.ReplaceDots;

public class ReplaceDotsImpl implements ReplaceDots {
    private String str;

    public ReplaceDotsImpl(final String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(final String str) {
        this.str = str;
    }

    @Override
    public String replaceDotsWithDashes() {
        return str.replaceAll("\\.", "-");
    }
}
