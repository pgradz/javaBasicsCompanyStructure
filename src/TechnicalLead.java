import java.util.ArrayList;

public class TechnicalLead extends TechnicalEmployee {
    public ArrayList<SoftwareEngineer> reports = new ArrayList<SoftwareEngineer>();
    private int headCount;
    public BusinessLead businessLeadAssigned;

    public TechnicalLead(String name) {
        super(name);
        this.headCount = 4;
    }
@Override
    public double getBaseSalary() {
        return super.getBaseSalary() * 1.3;
    }

    public boolean hasHeadCount() {
        if (reports.size() < this.headCount) {
            return  true;
        } else {
            return false;
        }
    }
    public boolean addReport(SoftwareEngineer e) {
        if (this.hasHeadCount()) {
            reports.add(e);
            e.manager = this;
            return true;
        } else {
            return  false;
        }
    }

    public boolean approveCheckIn(SoftwareEngineer e) {
       if(reports.contains(e) && e.accessToCode == true) {
           this.codeCheckIns++;
           return  true;
       } else {
           return false;
       }
    }

    public boolean requestBonus(Employee e, double bonus) {
        return businessLeadAssigned.approveBonus(e, bonus);
    }

    public String getTeamStatus() {
        String status;
        status = this.getEmployeeID() + " " + this.getName()+" has "+ this.codeCheckIns + " successful checks " ;
        int employees = this.reports.size();
        if(employees>0) {
            status = status + "and manages" + System.lineSeparator() ;
            for (int i=0; i<employees; i++) {
                status = status + this.reports.get(i).getName() + " has " + this.reports.get(i).getSuccessfulCheckIns() + " successful checks";
            }
        } else {
            status = status + "and no direct reports yet";
        }
        return  status;
    }

}
