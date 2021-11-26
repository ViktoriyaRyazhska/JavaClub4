package JavaClub4.src.OOP;

public class Leetspeak extends Encoder{

    public String encode(String source){
        // TODO - Encode the source string into a 133tSp34k string
        StringBuilder eSource = new StringBuilder();
        if(source == null){
            return "";
        } else {
            for(char c: source.toCharArray()){
                switch (c){
                    case 'a':
                    case 'A':
                        eSource.append('4');
                    break;
                    case 'e':
                    case 'E':
                        eSource.append('3');
                        break;
                    case 'l':
                    case 'L':
                        eSource.append('1');
                        break;
                    case 'm':
                    case 'M':
                        eSource.append("/^^\\");
                        break;
                    case 'o':
                    case 'O':
                        eSource.append('0');
                        break;
                    case 'u':
                    case 'U':
                        eSource.append("(_)");
                        break;
                    default:eSource.append(c);
                }
            }
        }
        return eSource.toString();
    }

//    public static void main(String[] args) {
//        Leetspeak myEncoder = new Leetspeak();
//        System.out.println(myEncoder.encode("aelmou"));
//    }

}

abstract class Encoder{
    public abstract String encode(String source);
}