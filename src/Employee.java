public class Employee {

private String name;
private double baseSalary;
private int employeeId;
public Employee manager;

public static int employeeCnt = 1;


    public Employee(String name, double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
        this.employeeId = employeeCnt;
        employeeCnt++;
    }
    public double getBaseSalary() {
        return this.baseSalary;
    }
    public String getName() {
        return this.name;
    }

    public int getEmployeeID() {
        return this.employeeId;
    }

    public Employee getManager() {
        return this.manager;
    }

    public boolean equals(Employee other) {
        if (this.employeeId == other.employeeId){
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return this.employeeId +" "+ this.name;
    }


    public String employeeStatus() {
       return this.toString();
    }

}
