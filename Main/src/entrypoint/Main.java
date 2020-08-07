package entrypoint;
import java.util.Scanner;

import core.exceptions.WrongAgeInput;
import core.exceptions.WrongAllName;
import core.exceptions.WrongGenderInput;
import core.exceptions.WrongInputException;
import core.model.*;
import core.service.impl.DancerActionImpl;
import core.service.impl.ProgrammerActionImpl;
import core.service.impl.SingerActionImpl;

/**
 * main method asks which to input right user choice number to create selected person:
 * if more than 3 times user enters wrong choice number program terminates:
 */
public class Main {


    public static void main(String[] args) {
        int wrongInput = 0;
        while (wrongInput != 3) {
            System.out.println("Please ask what type of person you want to create: \n 1-dancer \n 2-singer \n 3-programmer \n or select 4 for EXIT");
            Scanner inp = new Scanner(System.in);
            int input = inp.nextInt();
            try {
                while (wrongInput != 4) {
                    if (input == 1 || input == 2 || input == 3) {
                        Factory factory = new Factory();
                        factory.personChoose(input);
                    } else {
                        throw new WrongInputException();
                    }
                    {
                        System.exit(0);
                    }
                }
            } catch (WrongInputException wrongInputException) {
                System.out.println(wrongInputException.getMessage());
                wrongInput++;

            }

        }

    }
}