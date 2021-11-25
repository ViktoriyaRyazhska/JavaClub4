package String.FakeBinary;

public class FakeBinaryImpl implements FakeBinary{
    private String digits;

    public FakeBinaryImpl(final String digits) {
        setDigits(digits);
    }

    public String getDigits() {
        return digits;
    }

    public void setDigits(final String digits) {
        if(!digits.contains(" ") && digits.matches("-*[1-9]\\d*|0")){
            this.digits = digits;
        }else{
            this.digits = "0123456789";
        }
    }

    @Override
    public String replaceDigits() {
        String str = getDigits();
        str = str.replaceAll("[1-5]", "0");
        str = str.replaceAll("[6-9]", "1");
        return str;
    }
}
