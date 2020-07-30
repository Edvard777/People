package core.service.impl;

import core.service.SingerAction;

public class SingerActionImpl implements SingerAction {
    @Override
    public void singing() {
        System.out.println("Singer is singing now");

    }

    @Override
    public void playingGuitar() {
        System.out.println("Singer is playing guitar now");

    }

    @Override
    public void learn() {
        System.out.println("Singer is learning now");

    }

    @Override
    public void eat() {
        System.out.println("Singer is eating now");

    }

    @Override
    public void walk() {
        System.out.println("Singer is walking now");

    }
}
