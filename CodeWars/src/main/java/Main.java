import Application.ListOfPackages;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello!\nThis is a CodeWars solution pack program!\nWe can help you to find solution for your task quickly!\nChoose which category you need to :");
        System.out.println(ListOfPackages.listOfPackages());
        ListOfPackages.choice();
    }
}
