import java.util.Scanner;

public class Email {

    // Create variables for the required names and departments.
    String firstName;
    String lastName;
    String department;
    String password;
    int mailboxCapacity;
    String alternateEmail;

    //Create constructor to get first and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.print("Email Generated " + this.firstName + " " + this.lastName);

        //Assign department to setDepartment below
        this.department = setDepartment();
    }
    //Ask for the department the employee is assigned to
    String setDepartment() {
        System.out.print("\nEnter the department:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none");

        Scanner scanner = new Scanner(System.in);
        int departmentAssigned = scanner.nextInt();
        if (departmentAssigned == 1) {
            return "Sales";
        }else if (departmentAssigned == 2){
            return "Development";
        }else if (departmentAssigned == 3) {
            return "Accounting";
        }else return "";
    }



}
