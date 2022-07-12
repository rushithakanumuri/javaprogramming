
/*public class LogicalOperators {
    public static void main(String[] args){
        int temperature = 25;
        boolean isHigh = true;
        System.out.println(temperature<30 && temperature >20 );
    }
}
*/

public class LogicalOperators {
    public static void main(String[] args){
        boolean hadGoodPercentage = false;
        boolean hadDoneProjects = true;
        boolean hadBadPercentage = false;
        boolean isQualified = (hadGoodPercentage || hadDoneProjects) && !hadBadPercentage;
        System.out.println( isQualified );
    }
}
