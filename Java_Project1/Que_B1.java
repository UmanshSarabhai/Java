
import java.util.*;

public class Que_B1 {
    public static void main(String[] args) {
    	

        List<String> argList = Arrays.asList("a", "b", "c","d","e","f");
        Collections.shuffle(argList);
        for (String arg: argList) {
            System.out.format("%s ", arg);
        }
        System.out.println();
    }
}