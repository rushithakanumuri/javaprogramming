

public class StackOverFlow {
    public static int factorial(int n){
        return n*factorial(n-1);
    }
    public static void main(String[] args){
        int x = 3;
        int fact = factorial(x);

    }

}
