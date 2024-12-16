package Exception;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExceptionExemple {
    public static void main(String[] args){
        Double n = Double.valueOf("1d.34");
        try {
            Number n1 = NumberFormat.getInstance().parse("12.2");
        } catch (ParseException e) {
            System.out.println(e);
        }
        System.out.println(n);
    }
}