import java.util.Scanner;

public class BeerApplication {

    public BeerAppCLI CLI = new BeerAppCLI();


        public static void main (String[]args){

            BeerApplication program = new BeerApplication();

            program.run();
            //grab the variables

            //make the beer

        }
        private void run () {

            //intro
            Ingredients.populateLists();
            System.out.println("---------Welcome to SMASH MAKER!!!!!---------");
            drawBeer();
            System.out.println("Lets make a beer!!");
            makeBeer();
            CLI.furtherInstructionsQuestion();
            CLI.runAgainQuestion();

        }

        private void drawBeer () {
            //fun art to add
            System.out.println("  .   *   ..  . *  *\n" +
                    "*  * @()Ooc()*   o  .\n" +
                    "    (Q@*0CG*O()  ___\n" +
                    "   |\\_________/|/ _ \\\n" +
                    "   |  |  |  |  | / | |\n" +
                    "   |  |  |  |  | | | |\n" +
                    "   |  |  |  |  | | | |\n" +
                    "   |  |  |  |  | | | |\n" +
                    "   |  |  |  |  | | | |\n" +
                    "   |  |  |  |  | \\_| |\n" +
                    "   |  |  |  |  |\\___/\n" +
                    "   |\\_|__|__|_/|\n" +
                    "    \\_________/");


        }
        public void makeBeer () {

            Beer currentBeer = CLI.gatherInformationForBeer();
            //finisher statement
            System.out.format("For your SMASH recipe you will use %.2f", currentBeer.getGrainWeightToHitABV());
            System.out.println(" lbs. of " + Ingredients.pullAMalt() + " to make 6 gallons of " + currentBeer.getBeerName() +
                    ". You will use 1oz of " + Ingredients.pullAHop() + ", as your hop." +
                    "I recommend adding two packets of US-05 yeast to the fermentor to hit the requested % of " + currentBeer.getABV() + ".");
        }



}
