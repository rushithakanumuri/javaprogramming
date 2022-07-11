import java.util.Arrays;
public class Array {
    public static void main(String[] args){
        int[] numbers = new int[5];
        //System.out.println(numbers.length);//

        numbers[0] = 1;
        numbers[1] = 2;

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));    
    }
}