import java.util.ArrayList;

public class BusinessLead extends BusinessEmployee{
   private int headCount;
   private ArrayList<Accountant> reports = new ArrayList<Accountant>();

    public BusinessLead(String name) {
        super(name);
        this.headCount = 10;
    }

    public boolean hasHeadCount() {
        if(this.reports.size() < this.headCount) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean addReport(Accountant e, TechnicalLead supportTeam) {
        if (this.hasHeadCount()) {
            reports.add(e);
            this.bonusBudget += e.getBaseSalary()*1.1;
            supportTeam.businessLeadAssigned = this;
            e.manager = this;
            return true;
        } else {
            return  false;
        }

    }

    public boolean requestBonus(Employee e, double bonus) {
        if (this.bonusBudget> bonus) {
            this.bonusBudget -= bonus;
            return true;
        } else {
            return false;
        }
    }

    public boolean approveBonus(Employee e, double bonus) {
        for (int i = 0; i < this.reports.size(); i++) {
            //reports.get(i).getTeamSupported() gives technical team lead
            if (reports.get(i).getTeamSupported().reports.contains(e)) {
                reports.get(i).approveBonus(bonus);
            }
        }  return false;
    }
}
