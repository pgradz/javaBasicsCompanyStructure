public class BusinessEmployee extends Employee {
    public double bonusBudget = 0;

    public BusinessEmployee(String name) {
        super(name, 50000);
    }

   public double getBonusBudget() {
        return  this.bonusBudget;
    }

    public String employeeStatus(){
        return this.getEmployeeID() + " " + this.getName() + " with a budget of " + this.getBonusBudget();
    }
}
