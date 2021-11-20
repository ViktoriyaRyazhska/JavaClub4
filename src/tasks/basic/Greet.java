package tasks.basic;

public class Greet {
    public void execute (String name ){

        System.out.println(greet(name));
    }
    public static String greet(String name) {
        if(name.equals("Johnny")){
            return "Hello, my love!";
        }else{
            return String.format("Hello, %s!", name);}
    }
}