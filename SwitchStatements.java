public class SwitchStatements {
    public static void main(String[] args){
        String qualification = "Employee";

        switch (qualification){
            case "Student":
            System.out.println("You are a student");
            break;

            case "Employee":
            System.out.println("You are an Employee");
            break;

            default:
            System.out.println("You are a Business man");
        }

        
    }
    
}
