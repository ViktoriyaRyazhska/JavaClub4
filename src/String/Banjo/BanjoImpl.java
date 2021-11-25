package String.Banjo;

public class BanjoImpl implements Banjo {
    private String name;

    public BanjoImpl(final String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        if(!name.contains(" ") && name.matches("[a-zA-Z][a-z]{2,14}")){
            this.name = name;
        }else{
            this.name = "Maksym";
        }
    }

    @Override
    public String playingBanjo(){
        String answer = "";
        if(getName().charAt(0) == 'R' || getName().charAt(0) == 'r'){
            return answer = name + " plays banjo";
        }else{
            return answer = name + " does not play banjo";
        }
    }
}
