package core.model;
import core.enumeration.DancerType;
import core.enumeration.ProgrammerType;
import core.enumeration.SingerType;
import core.exceptions.*;

import java.util.Scanner;
public class Factory{
    private static final String regex = "^(.+)@(.+)$";


    /**
     * personChoose method wright input from console
     * checks them for exceptions
     * via switch call chosen from terminal right person
     * @param input
     */
    protected void personChoose(int input)
    {
        Scanner inp = new Scanner(System.in);
        System.out.println("Please write Name");
        String name = inp.nextLine();
        if (name.length()<=0 || name.length()>=255)
        {
            throw new WrongAllName();
        }
        System.out.println("Please write Surname");
        String surname = inp.nextLine();
        if (surname.length()<=0 || surname.length()>=255)
        {
            throw new WrongAllName();
        }
        System.out.println("Please write Last Name");
        String lastname = inp.nextLine();
        if (lastname.length()<=0 || lastname.length()>=255)
        {
            throw new WrongAllName();
        }
        System.out.println("Please write Nickname");
        String nickname = inp.nextLine();
        if (nickname.length()<=0 || nickname.length()>=255)
        {
            throw new WrongAllName();
        }
        System.out.println("Please write Gender");
        String gender = inp.nextLine();
        if(gender.equals("male") || gender.equals("female"))
            gender = gender;
        else
        {
            throw new WrongGenderInput();
        }
        System.out.println("Please write Designation");
        String designation = inp.nextLine();
        if (designation.length()<0 || designation.length()>255)
        {
            throw new WrongAllName();
        }
        if (designation.equalsIgnoreCase(String.valueOf(DancerType.CONTEMPORARY)) || designation.equalsIgnoreCase(String.valueOf(DancerType.LATINO)) || designation.equalsIgnoreCase(String.valueOf(DancerType.TRADITIONAL_ARMENIAN)))
            designation = designation;
        else if (designation.equalsIgnoreCase(String.valueOf(ProgrammerType.DATA_ENGINEER)) || designation.equalsIgnoreCase(String.valueOf(ProgrammerType.HARDWARE_ENGINEER)) || designation.equalsIgnoreCase(String.valueOf(ProgrammerType.SOFTWARE_ENGINEER)))
            designation = designation;
        else if (designation.equalsIgnoreCase(String.valueOf(SingerType.JAZZ)) || designation.equalsIgnoreCase(String.valueOf(SingerType.POP)) || designation.equalsIgnoreCase(String.valueOf(SingerType.ROCK)))
            designation=designation;
        else
        {
            throw new WrongDesignation();
        }

        System.out.println("Please write Email");
        String email = inp.nextLine();
         boolean rightEmail = email.matches(regex);
        if (rightEmail!=true)
        {
            throw new WrongEmailInput();
        }
        System.out.println("Please write Age");
        int age = inp.nextInt();
        if (age<0 || age>100)
        {
            throw new WrongAgeInput();
        }

        switch (input)
        {
            case 1: Dancer dancer = new Dancer(name,surname, lastname, nickname, designation, email, gender, age);
            dancer.actionType(name,surname,lastname);


            case 2: Singer singer = new Singer(name,surname, lastname, nickname, designation, email, gender, age);
            singer.actionType(name,surname,lastname);


            case 3: Programmer programmer = new Programmer(name,surname, lastname, nickname, designation, email, gender, age);
            programmer.actionType(name,surname,lastname);
        }
    }

}
