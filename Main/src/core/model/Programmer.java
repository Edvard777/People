package core.model;

import core.service.ProgrammerAction;

public class Programmer extends BasePerson implements ProgrammerAction {
    String companyName;

    Programmer(String companyName, String designation) {
        super(companyName, designation);
        this.companyName=companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public void coding() {
        System.out.println("Programmer is coding");

    }
}
