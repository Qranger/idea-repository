import java.util.regex.Pattern;

public class RegexText {
    public static final String regex="a +c";

    public static void main(String[] args) {
        System.out.println("正则表达式:"+regex);
        check("ac");
        check("a  c");
    }

    public static void check(String input) {
        boolean result = Pattern.matches(regex,input);
        System.out.println(input+":"+result);
    }
}
