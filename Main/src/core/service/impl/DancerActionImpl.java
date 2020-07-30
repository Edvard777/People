package core.service.impl;


import core.service.DancerAction;

public class DancerActionImpl implements DancerAction {
    @Override
    public void dancing() {
        System.out.println("Dancer is dancing now");

    }

    @Override
    public void learn() {
        System.out.println("Dancer is learning now");
    }

    @Override
    public void eat() {
        System.out.println("Dancer is eating now");

    }

    @Override
    public void walk() {
        System.out.println("Dancer is walking now");
    }


}
