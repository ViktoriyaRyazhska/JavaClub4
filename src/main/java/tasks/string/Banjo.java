package tasks.string;
public class Banjo {
    private static String areYouPlayingBanjo(String name) {
        return name.startsWith("R")||name.startsWith("r")? name + " plays banjo" : name + " does not play banjo";
    }
    public void execute(String name){
        System.out.println(areYouPlayingBanjo(name));
    }
}