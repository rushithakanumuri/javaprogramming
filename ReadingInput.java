import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("age : ");
        byte age = scanner.nextByte();
        System.out.println("you are " + age);

    }
    
}
