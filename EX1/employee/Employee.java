package EX1.employee;

public class Employee {
    private int empNo;
    private double basicPay;


    // Constructor
    public Employee(int empNo) {
        this.empNo = empNo;
    }


    // Overloaded method to set basic pay
    public void setBasicPay(double pay) {
        this.basicPay = pay;
    }


    // Overloaded method to set basic pay with bonus
    public void setBasicPay(double pay, double bonus) {
        this.basicPay = pay + bonus;
    }


    // Display employee info
    public void displayInfo() {
        System.out.println("Employee Number: " + empNo);
        System.out.println("Basic Pay: $" + basicPay);
    }
}
