import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class FizzBuzz {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number : ");
        int number = scanner.nextInt();

        if (number % 3 == 0 && number % 5 == 0){
            System.out.println("FizzBuzz");
        }
        else if(number % 3 == 0){
            System.out.println("Buzz");  
        }
        else if(number % 5 == 0)
            System.out.println("Fizz");
        else 
             System.out.println(number);   

        
        
    }
    
}
