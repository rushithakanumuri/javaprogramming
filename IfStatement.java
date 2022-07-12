public class IfStatement {
    public static void main(String[] args){
        int score = 65;
        if (score>= 75){
        System.out.println("VeryGood");
        }
        else if(score >= 60 && score < 75){
        System.out.println("Good");
        }
        else if(score >= 40 && score < 60)
        System.out.println("Average");
        else 
        System.out.println("Fail");
    }
}
