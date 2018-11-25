public class Accountant extends BusinessEmployee {

    private TechnicalLead supportTeamLead;

    public Accountant(String name) {
        super(name);
    }

    public TechnicalLead getTeamSupported() {
        if (this.supportTeamLead == null) {
            return null;
        } else {
            return this.supportTeamLead;
        }
    }

    public void supportTeam(TechnicalLead lead) {
        this.supportTeamLead = lead;
        this.bonusBudget = lead.reports.size() * 1.1;

    }
    public boolean approveBonus(double bonus) {
        if (this.supportTeamLead == null || this.bonusBudget < bonus) {
            return false;
        } else {
            return true;
        }
    }

    public String employeeStatus() {
        return getEmployeeID() + " " + getName() + "with a budget of " + this.bonusBudget + " is supporting" + this.supportTeamLead.getName();
    }
}
