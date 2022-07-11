import java.text.NumberFormat;

public class FormattingNumbers{
    public static void main(String[] args){
        
       /*  NumberFormat percent = NumberFormat.getPercentInstance();
        String result = percent.format(0.9);
        System.out.println(result); */

           
           String result = NumberFormat.getPercentInstance().format(0.9);
           System.out.println(result);
    }       
}           