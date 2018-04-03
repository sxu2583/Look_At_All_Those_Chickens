/*
@Author:Shihab Uddin
 */

import java.util.Scanner;

public class Simulation extends World {
    public static void main(String[] args){
        //Check error cases for arguments
        argumentsChecker(args);

        //Check the correct argument data gets read in
        int size = Integer.parseInt(args[0]);
        int hawk_percent = -1;
        if (args.length >= 2){ hawk_percent = Integer.parseInt(args[1]); }
        int resource = resource_default;
        if (args.length >= 3){ resource = Integer.parseInt(args[2]); }
        int loss = loss_default;
        if (args.length == 4){ loss = Integer.parseInt(args[3]); }

        System.out.println("-------------------------------");
        System.out.println("Resource Amount " + resource);
        System.out.println("Hawk v Hawk Loss " + loss);
        System.out.println("-------------------------------");

        //Generate all the birds
        Bird[] simulation_pop = generate_population(size, hawk_percent);
        for (int i =0; i < size; i++){
            System.out.println(simulation_pop[i].strategy + " " + simulation_pop[i].id_number);
        }

        //Choosing the birds has been set
        Bird[] interaction;
        interaction = random_Pick(simulation_pop, size);
        if (interaction[0].alive == 0 || interaction[1].alive == 0){
            interaction = random_Pick(simulation_pop, size);
        }
        System.out.println("--------------------------------------------------------");
        System.out.println("The Two Birds Chosen");
        System.out.println(interaction[0].strategy + " " + interaction[0].id_number);
        System.out.println(interaction[1].strategy + " " + interaction[1].id_number);

        //Conduct the strategies

        //Menu
        Scanner scanner = new Scanner(System.in);
        menu(args);
        boolean play_game  = true;
        while (play_game) {
            System.out.print(">");
            String input = scanner.next();
            switch (input) {
                case "1":
                    System.out.println("Hello World");
                    break;
                case "2":
                    System.out.println("Hello World");
                    break;
                case "3":
                    System.out.println("Hello World");
                    break;
                case "4":
                    System.out.println("Hello World");
                    break;
                case "5":
                    System.out.println("Hello World");
                    break;
                case "6":
                    System.out.println("Hello World");
                    break;
                case "7":
                    System.out.println("Hello World");
                    break;
                case "8":
                    play_game = false;
                    System.out.println("Simulation Over");
                    break;
            }
        }


    }
}