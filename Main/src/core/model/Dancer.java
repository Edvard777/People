package core.model;


import core.service.BasePersonAction;
import core.service.DancerAction;

import java.util.Scanner;


import java.util.Properties;

public class Dancer extends BasePerson implements DancerAction {
    String groupName;


    public Dancer(String name,String surname, String lastname, String nickname, String designation, String email, String gender, int age) {
        super(name,surname, lastname, nickname, designation, email, gender, age);
        this.groupName = groupName;
    }


    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    private boolean alreadyEaten = false;


    /**
     *
     * actionType method checks input and do right methods e.t.c. eat, walk , dance or learn
     * @param name
     * @param surname
     * @param lastname
     */
    public void actionType(String name,String surname, String lastname) {

        System.out.println("please choose what will do" + " " + name+" " + surname + " " + lastname + " " + "eat, dance, walk, or learn");
        Scanner in = new Scanner(System.in);

        for (int i = 0; i <= 3; i++) {


            do {

                String input = in.nextLine();
                if (input.equals("eat") && alreadyEaten == false) {
                    eat(name,surname,lastname);
                    alreadyEaten = true;
                    i++;
                } else if (input.equals("dance") && alreadyEaten == true) {
                    dancing(name,surname,lastname);
                    alreadyEaten = false;
                } else if (input.equals("dance") && alreadyEaten == false) {
                    System.out.println(name+" " + surname + " " + lastname + " " + "must eat for dancing");

                } else if (input.equals("walk")) {
                    walk(name,surname,lastname);
                } else if (input.equals("learn")) {
                    learn(name,surname,lastname);
                }
            } while (i <= 3);
            System.out.println(name +" "+ surname + " " + lastname + " " + "Can eat 3 time for a day");


        }
    }


    public void dancing(String name,String surname, String lastname) {
        System.out.println(name+" " + surname + " " + lastname + " " + "is dancing"+ " " + designation );
    }

    @Override
    public void learn(String name,String surname, String lastname) {
        System.out.println(name+" " + surname + " " + lastname + " " + "is learning");
    }

    @Override
    public void eat(String name,String surname, String lastname) {
        System.out.println(name+" " + surname + " " + lastname + " " + "is eating");
    }

    @Override
    public void walk(String name,String surname, String lastname) {
        System.out.println(name+" " + surname + " " + lastname + " " + "is walking");
    }


}
