package Tasks.String.TwoWordName;

public class TwoWordNameImpl implements TwoWordName {
    private String name;
    private String surname;

    public TwoWordNameImpl(final String name, final String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(final String surname) {
        this.surname = surname;
    }

    @Override
    public String convertNameToInitials() {
        String initials = "";
        initials = String.valueOf(getName().charAt(0)).toUpperCase() + "." +  String.valueOf(getSurname().charAt(0)).toUpperCase();
        return initials;
    }
}
