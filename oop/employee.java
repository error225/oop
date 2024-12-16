import java.util.Scanner;

class Employee {
    String Emp_name;
    int Emp_id;
    String Address;
    String Mail_id;
    String mobile_nos;
    
    // Constructor for Employee class
    public Employee(String Emp_name, int Emp_id, String Address, String Mail_id, String mobile_nos) {
        this.Emp_name = Emp_name;
        this.Emp_id = Emp_id;
        this.Address = Address;
        this.Mail_id = Mail_id;
        this.mobile_nos = mobile_nos;
    }
    
    // Method to print employee details
    public void printEmployeeDetails() {
        System.out.println("Employee Name: " + Emp_name);
        System.out.println("Employee ID: " + Emp_id);
        System.out.println("Address: " + Address);
        System.out.println("Mail ID: " + Mail_id);
        System.out.println("Mobile No: " + mobile_nos);
    }
}

// Derived class Programmer
class Programmer extends Employee {
    double BasicPay;
    
    public Programmer(String Emp_name, int Emp_id, String Address, String Mail_id, String mobile_nos, double BasicPay) {
        super(Emp_name, Emp_id, Address, Mail_id, mobile_nos);
        this.BasicPay = BasicPay;
    }
    
    public void generatePaySlip() {
        double DA = BasicPay * 0.97;
        double HRA = BasicPay * 0.10;
        double PF = BasicPay * 0.12;
        double staffClubFund = BasicPay * 0.001;
        
        double grossSalary = BasicPay + DA + HRA;
        double netSalary = grossSalary - PF - staffClubFund;
        
        printEmployeeDetails();
        System.out.println("Basic Pay: " + BasicPay);
        System.out.println("DA (97%): " + DA);
        System.out.println("HRA (10%): " + HRA);
        System.out.println("PF (12%): " + PF);
        System.out.println("Staff Club Fund (0.1%): " + staffClubFund);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary: " + netSalary);
    }
}

// Derived class TeamLead
class TeamLead extends Employee {
    double BasicPay;
    
    public TeamLead(String Emp_name, int Emp_id, String Address, String Mail_id, String mobile_nos, double BasicPay) {
        super(Emp_name, Emp_id, Address, Mail_id, mobile_nos);
        this.BasicPay = BasicPay;
    }
    
    public void generatePaySlip() {
        double DA = BasicPay * 0.97;
        double HRA = BasicPay * 0.10;
        double PF = BasicPay * 0.12;
        double staffClubFund = BasicPay * 0.001;
        
        double grossSalary = BasicPay + DA + HRA;
        double netSalary = grossSalary - PF - staffClubFund;
        
        printEmployeeDetails();
        System.out.println("Basic Pay: " + BasicPay);
        System.out.println("DA (97%): " + DA);
        System.out.println("HRA (10%): " + HRA);
        System.out.println("PF (12%): " + PF);
        System.out.println("Staff Club Fund (0.1%): " + staffClubFund);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary: " + netSalary);
    }
}

// Derived class AssistantProjectManager
class AssistantProjectManager extends Employee {
    double BasicPay;
    
    public AssistantProjectManager(String Emp_name, int Emp_id, String Address, String Mail_id, String mobile_nos, double BasicPay) {
        super(Emp_name, Emp_id, Address, Mail_id, mobile_nos);
        this.BasicPay = BasicPay;
    }
    
    public void generatePaySlip() {
        double DA = BasicPay * 0.97;
        double HRA = BasicPay * 0.10;
        double PF = BasicPay * 0.12;
        double staffClubFund = BasicPay * 0.001;
        
        double grossSalary = BasicPay + DA + HRA;
        double netSalary = grossSalary - PF - staffClubFund;
        
        printEmployeeDetails();
        System.out.println("Basic Pay: " + BasicPay);
        System.out.println("DA (97%): " + DA);
        System.out.println("HRA (10%): " + HRA);
        System.out.println("PF (12%): " + PF);
        System.out.println("Staff Club Fund (0.1%): " + staffClubFund);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary: " + netSalary);
    }
}

// Derived class ProjectManager
class ProjectManager extends Employee {
    double BasicPay;
    
    public ProjectManager(String Emp_name, int Emp_id, String Address, String Mail_id, String mobile_nos, double BasicPay) {
        super(Emp_name, Emp_id, Address, Mail_id, mobile_nos);
        this.BasicPay = BasicPay;
    }
    
    public void generatePaySlip() {
        double DA = BasicPay * 0.97;
        double HRA = BasicPay * 0.10;
        double PF = BasicPay * 0.12;
        double staffClubFund = BasicPay * 0.001;
        
        double grossSalary = BasicPay + DA + HRA;
        double netSalary = grossSalary - PF - staffClubFund;
        
        printEmployeeDetails();
        System.out.println("Basic Pay: " + BasicPay);
        System.out.println("DA (97%): " + DA);
        System.out.println("HRA (10%): " + HRA);
        System.out.println("PF (12%): " + PF);
        System.out.println("Staff Club Fund (0.1%): " + staffClubFund);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary: " + netSalary);
    }
}

// Main Class to test the Employee PaySlip
public class EmployeePaySlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input employee details
        System.out.println("Enter employee name: ");
        String name = sc.nextLine();
        
        System.out.println("Enter employee ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // Consume newline
        
        System.out.println("Enter employee address: ");
        String address = sc.nextLine();
        
        System.out.println("Enter employee mail ID: ");
        String mail_id = sc.nextLine();
        
        System.out.println("Enter employee mobile number: ");
        String mobile_no = sc.nextLine();
        
        System.out.println("Enter Basic Pay: ");
        double basicPay = sc.nextDouble();
        
        // Create employee objects based on roles
        System.out.println("Select Employee Role: ");
        System.out.println("1. Programmer");
        System.out.println("2. Team Lead");
        System.out.println("3. Assistant Project Manager");
        System.out.println("4. Project Manager");
        
        int roleChoice = sc.nextInt();
        
        Employee employee = null;
        
        // Assign role based on user choice
        switch (roleChoice) {
            case 1:
                employee = new Programmer(name, id, address, mail_id, mobile_no, basicPay);
                break;
            case 2:
                employee = new TeamLead(name, id, address, mail_id, mobile_no, basicPay);
                break;
            case 3:
                employee = new AssistantProjectManager(name, id, address, mail_id, mobile_no, basicPay);
                break;
            case 4:
                employee = new ProjectManager(name, id, address, mail_id, mobile_no, basicPay);
                break;
            default:
                System.out.println("Invalid role choice!");
                System.exit(0);
        }
        
        // Generate pay slip for the selected employee
        System.out.println("\nGenerating Pay Slip...");
        ((Programmer)employee).generatePaySlip();  // Type casting to Programmer to call generatePaySlip
    }
}
