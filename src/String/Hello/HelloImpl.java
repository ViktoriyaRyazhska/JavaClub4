package String.Hello;

public class HelloImpl implements Hello {
    private String name;
    private String city;
    private String state;

    public HelloImpl(final String name, final String city, final String state) {
        setName(name);
        setCity(city);
        setState(state);
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(final String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(final String state) {
        this.state = state;
    }

    @Override
    public String sayHello(){
        String hello = "";
        hello = hello.concat("Hello, " + getName() + "!" + " Welcome to " + getCity() + ", " + getState() + "!");;
        return hello;
    }
}