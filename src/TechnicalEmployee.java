public class TechnicalEmployee extends Employee {
public   int  codeCheckIns;

    public TechnicalEmployee(String name){
        super(name, 75000);
    }

    public String employeeStatus() {
        return this.getEmployeeID() + " " + this.getName() + " has " + this.codeCheckIns + " successful checks";
    }
}