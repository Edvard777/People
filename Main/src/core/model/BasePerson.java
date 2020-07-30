package core.model;

import core.service.BasePersonAction;

public class BasePerson implements BasePersonAction{
    String name;
    String designation;
    BasePerson(String name,String designation)
    {
        this.name=name;
        this.designation=designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public void learn() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void walk() {

    }
}
