import java.util.Scanner;
public class Main{
    public staic void main(String[] args){
        Scanner sc = new Scanner(System.in);
        EmployeeDetails emp = new EmployeeDetails();

        System.out.println("Enter Name:"+emp.setName(sc.nextInt()));
        System.out.println("Enter Position:"+emp.setPosition(sc.next()));

        System.out.println("Enter salary:"+emp.setSalary(sc.nextDouble()));
        System.out.println("Enter Experience:"+emp.setExperience(sc.next()));
        System.out.println("Enter Eductional level:"+emp.setEducational_level(sc.nextDouble()));
        System.out.println("Enter if you are full or part emplyee:"+emp.setType(sc.next()));

 //
            System.out.println("Enter Salary:");
            double salary = sc.nextDouble();
            String type = sc.next();

            emp.calculateNetSalary(salary);
            System.out.println("Your Calculated Salay is: " + emp.getNetSalary());
            System.out.println("Your Bonus is: " + emp.calculateBounse_emp());

            
        }
     

     
}
