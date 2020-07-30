package core.model;

import core.service.SingerAction;

public class Singer extends BasePerson implements SingerAction {
    String bandName;

    Singer(String bandName, String designation) {
        super(bandName, designation);
        this.bandName=bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    @Override
    public void singing() {
        System.out.println("Singer is singing");

    }

    @Override
    public void playingGuitar() {
        System.out.println("Singer playing guitar");

    }
}
