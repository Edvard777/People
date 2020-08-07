package core.model;

import core.exceptions.WrongInputException;
import core.service.SingerAction;

import java.util.Scanner;

public class Singer extends BasePerson implements SingerAction {
    String bandName;

    public Singer(String name,String surname, String lastname, String nickname, String designation, String email, String gender, int age) {
        super(name, surname, lastname, nickname, designation, email, gender, age);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    @Override
    public void singing(String name,String surname, String lastname) {
        System.out.println(name +" " +lastname + " " + surname + " " + " is singing"+" " + designation);

    }

    @Override
    public void playingGuitar(String name,String surname, String lastname) {
        System.out.println(name +" " +surname + " " + lastname + " " + " playing guitar");
    }

    @Override
    public void learn(String name,String surname, String lastname) {
        System.out.println(name +" " +surname + " " + lastname + " " + " is learning");
    }

    @Override
    public void eat(String name,String surname, String lastname) {
        System.out.println(name +" " +surname + " " + lastname + " " + " is eating");
    }

    @Override
    public void walk(String name,String surname, String lastname) {
        System.out.println(name +" " +surname + " " + lastname + " " + " is walking");
    }

    /**
     * actionType method checks input and do right methods e.t.c. eat, walk , play or sing
     * @param name
     * @param surname
     * @param lastname
     */
    @Override
    public void actionType(String name, String surname, String lastname) {

        System.out.println("please choose what will do" + " " + name + " " + surname + " " + lastname + " " + "eat, walk, play, or sing");
        Scanner in = new Scanner(System.in);

        do {
            String input = in.nextLine();
            if (input.equals("eat")) {
                hasEaten = true;
                eat(name, surname, lastname);
            } if (input.equals("walk")) {
                walked = true;
                walk(name, surname, lastname);
            } if (input.equals("sing") && hasEaten == true) {
                hasEaten =false;
                singing(name, surname, lastname);
            }
                else if(input.equals("sing") && hasEaten!=true){
                System.out.println(name+" " + surname + " " + lastname + " " + "must eat for singing");
            }
             if (input.equals("play") && walked == true && hasEaten == true) {
                playingGuitar(name, surname, lastname);
                walked=false;
                hasEaten=false;
            }
             else if(input.equals("play") && walked !=true && hasEaten ==true)
             {
                 System.out.println(name+" " + surname + " " + lastname + " " + "must walk for playing");
             }
             else if (input.equals("play") && walked ==true && hasEaten !=true)
             {
                 System.out.println(name+" " + surname + " " + lastname + " " + "must eat for playing");
             }
             else if (input.equals("play") && walked !=true && hasEaten !=true)
             {
                 System.out.println(name+" " + surname + " " + lastname + " " + "must eat and walk for playing");
             }
        } while(true);
    }


    private boolean walked = false;
    private boolean hasEaten = false;
}
