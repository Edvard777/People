package core.service.impl;

import core.service.ProgrammerAction;

public class ProgrammerActionImpl implements ProgrammerAction {

    @Override
    public void coding() {
        System.out.println("Programmer is coding now");
    }

    @Override
    public void learn() {
        System.out.println("Programmer is learning now");

    }

    @Override
    public void eat() {
        System.out.println("Programmer is eating now");

    }

    @Override
    public void walk() {
        System.out.println("Programmer is walking now");

    }
}
