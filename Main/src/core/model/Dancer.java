package core.model;

import core.service.BasePersonAction;
import core.service.DancerAction;

public class Dancer extends BasePerson implements DancerAction {
    String groupName;

   public Dancer(String name, String groupName) {
        super(name, groupName);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public void dancing() {
        System.out.println("Dancer is dancing");

    }
}
