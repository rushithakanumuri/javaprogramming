import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = "";
                
         while(!input.equals("quit")) {
        System.out.print("Input : ");
        input = scanner.next().toLowerCase();
        System.out.println(input);
        }
    }
    
}

//do..while loops//

   /*      do{
            System.out.print("Input : ");
            input = scanner.next().toLowerCase();
            System.out.println(input);  
           } while(!input.equals("quit"));
    */
   