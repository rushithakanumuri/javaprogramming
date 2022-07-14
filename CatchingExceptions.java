package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CatchingExceptions {
    public static void main(String[] args){
        try{
            var reader = new FileReader("file.txt");
            System.out.println("File Opened");
        }catch(FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
        
    }
    
}
