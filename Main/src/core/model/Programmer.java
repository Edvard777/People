package core.model;

import core.service.ProgrammerAction;

import java.util.Scanner;

public class Programmer extends BasePerson implements ProgrammerAction {
    String companyName;

    public Programmer(String name,String surname, String lastname, String nickname, String designation, String email, String gender, int age) {
        super(name,surname, lastname, nickname, designation, email,gender,age);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public void coding(String name,String surname, String lastname) {
        System.out.println(name +" " +lastname + " " + surname + " " + " is coding");
    }

    @Override
    public void learn(String name,String surname, String lastname) {
        System.out.println(name +" " +lastname + " " + surname + " " + " is learning"+" "+ designation+"ing");
    }

    @Override
    public void eat(String name,String surname, String lastname) {
        System.out.println(name +" " +lastname + " " + surname + " " + " is eating");
    }

    @Override
    public void walk(String name,String surname, String lastname) {
        System.out.println(name +" " +lastname + " " + surname + " " + " is walking");
    }

    /**
     * actionType method checks input and do right methods e.t.c. eat, learn, or code
     * @param name
     * @param surname
     * @param lastname
     */
    @Override
    public void actionType(String name, String surname, String lastname) {
        System.out.println("please choose what will do" + " " + name + " " + surname + " " + lastname + " " + "code, learn, eat");
        Scanner in = new Scanner(System.in);

        do {
            String input = in.nextLine();
            if (input.equals("eat")) {
                hasEaten = true;
                eat(name, surname, lastname);
            }
            if (input.equals("learn") && hasEaten==true)
            {
                hasLearned=true;
                learn(name, surname, lastname);
            }
            else if (input.equals("learn") && hasEaten==false)
            {
                System.out.println(name+" " + surname + " " + lastname + " " + "must eat for coding");
            }
            if(input.equals("code") && hasLearned==true)
            {
                hasLearned=false;
                hasEaten=false;
                coding(name, surname, lastname);
            }
            else if (input.equals("code") && hasLearned==false)
            {
                System.out.println(name+" " + surname + " " + lastname + " " + "must learn for coding");
            }
            else if (input.equals("code") && hasLearned==false && hasEaten==false)
            {
                System.out.println(name+" " + surname + " " + lastname + " " + "must eat & learn for coding");
            }
        }while(true);

    }

    private boolean hasLearned = false;
    private boolean hasEaten = false;

}
