import java.util.Arrays;
import java.util.List;

public class ttee {

    public static void main(String[] args) {

        System.out.println(calc("15+2"));
    }

    public static String calc(String input) {
        List<String> list;

        if(input.contains("+")){
            list = Arrays.asList(input.split("\\+"));
            return String.valueOf(Integer.parseInt(list.get(0))
                    + Integer.parseInt(list.get(1)));
        }else if(input.contains("-")){
            list = Arrays.asList(input.split("-"));
            return String.valueOf(Integer.parseInt(list.get(0))
                    - Integer.parseInt(list.get(1)));
        }else{
            return "not ok";
        }
    }
}
