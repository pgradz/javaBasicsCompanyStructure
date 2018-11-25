public class SoftwareEngineer extends  TechnicalEmployee {
boolean accessToCode;
public TechnicalLead manager;

    public SoftwareEngineer(String name) {
        super(name);
        this.codeCheckIns = 0;
        this.accessToCode = false;
    }

    public boolean getCodeAccess() {
        return accessToCode;
    }

    public void setCodeAccess(boolean access) {
        this.accessToCode = access;
    }

    public int getSuccessfulCheckIns() {
        return this.codeCheckIns;
    }

    public TechnicalLead getManager() {
        return this.manager;
    }
   public boolean checkInCode() {
        return  this.getManager().approveCheckIn(this);
    }
}
