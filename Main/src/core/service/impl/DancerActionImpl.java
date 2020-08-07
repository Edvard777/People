package core.service.impl;


import core.model.Dancer;
import core.service.DancerAction;

import java.util.Scanner;

public class DancerActionImpl implements DancerAction {
    @Override
    public void dancing(String name,String surname, String lastname) {
        System.out.println("Dancer is dancing now");

    }



    @Override
    public void learn(String name,String surname, String lastname)
    {
        System.out.println("Dancer is learning now");
    }

    @Override
    public void eat(String name,String surname, String lastname) {
        System.out.println("Dancer is eating now");

    }

    @Override
    public void walk(String name,String surname, String lastname) {
        System.out.println("Dancer is walking now");
    }

    @Override
    public void actionType(String name, String surname, String lastname) {

    }

}
