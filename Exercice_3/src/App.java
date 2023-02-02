import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The Basic Salary :");
         float Basic_Salary = scanner.nextFloat();
         double Salary;
         double HRA =0,DA=0;
        if (Basic_Salary <= 10000) {
            HRA = Basic_Salary * 0.2;
            DA = Basic_Salary * 0.8;

        } else if(Basic_Salary <= 20000 ){
            HRA = Basic_Salary * 0.25;
            DA = Basic_Salary * 0.9;

        } else if(Basic_Salary > 20000  ){
            HRA =Basic_Salary *  0.3;
            DA = Basic_Salary * 0.95;

        }
        Salary = Basic_Salary +HRA+DA;
        System.out.print("Gross Salary :" +Salary);
       
        
    }
}
