import java.io.IOException;
import java.nio.file.Path;
import java.util.Locale;
import java.util.Scanner;

import static jdk.javadoc.internal.tool.Main.main;

public class BeerAppCLI{
    Scanner userInput = new Scanner(System.in);



    public Beer gatherInformationForBeer(){
        System.out.println("What do you want to name your beer?");
        String beerName = userInput.nextLine();
        System.out.println("What do you want the alcohol % to be?");
        Double aBV = userInput.nextDouble();
        userInput.nextLine();
        return new Beer(beerName,aBV);
    }
    public void furtherInstructionsQuestion(){
        System.out.println("Would you like the full instructions for making the beer?(Y/N)");
        String input= userInput.nextLine();
        if (input.equalsIgnoreCase("y")){
            printInstructions();
        }if (input.equalsIgnoreCase("n")){
            runAgainQuestion();
        }
    }
    public void runAgainQuestion(){
        System.out.println("Would you like to make another?(Y/N)");
        String input= userInput.nextLine();
        if (input.toLowerCase() =="y"){
            BeerApplication restart = new BeerApplication();
            restart.makeBeer();
        }else {
            System.out.println("Thanks for using Beer builder!");
            System.exit(0);
        }
    }
    public void printInstructions(){
        Path input = Path.of("Instructions.txt");
        try(Scanner instScanner = new Scanner(input)) {
            while (instScanner.hasNextLine()) {
                System.out.println(instScanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println("instructions not found");
        }
    }
    }


