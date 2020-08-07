package core.service.impl;

import core.model.Dancer;
import core.model.Singer;
import core.service.SingerAction;

import java.util.Scanner;

public class SingerActionImpl implements SingerAction {
    @Override
    public void singing(String name,String surname, String lastname) {
        System.out.println("Singer is singing now");

    }

    @Override
    public void playingGuitar(String name,String surname, String lastname) {
        System.out.println("Singer is playing guitar now");

    }

    @Override
    public void learn(String name,String surname, String lastname) {
        System.out.println("Singer is learning now");

    }

    @Override
    public void eat(String name,String surname, String lastname) {
        System.out.println("Singer is eating now");

    }

    @Override
    public void walk(String name,String surname, String lastname) {
        System.out.println("Singer is walking now");

    }

    @Override
    public void actionType(String name, String surname, String lastname) {

    }


}
