package core.service.impl;

import core.model.Dancer;
import core.model.Programmer;
import core.service.ProgrammerAction;

import java.util.Scanner;

public class ProgrammerActionImpl implements ProgrammerAction {

    @Override
    public void coding(String name,String surname, String lastname) {
        System.out.println("Programmer is coding now");
    }

    @Override
    public void learn(String name,String surname, String lastname) {
        System.out.println("Programmer is learning now");

    }

    @Override
    public void eat(String name,String surname, String lastname) {
        System.out.println("Programmer is eating now");

    }

    @Override
    public void walk(String name,String surname, String lastname) {
        System.out.println("Programmer is walking now");

    }

    @Override
    public void actionType(String name, String surname, String lastname) {

    }


}
