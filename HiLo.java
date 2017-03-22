/* Eugene Vasquez
random number game
create a code for guessing number game*/


    import java.util.Random;
    import java.util.Scanner;

    public class HiLo
        {
        public static void main (String[] strArgs) {

         Random random= new Random();

         Scanner scanner= new Scanner(System.in);

         int number = random.nextInt(20);
         int numGuess = -1;

         while(numGuess!=number) {

         System.out.println("Guess a number between 1-20!");
         
         numGuess = scanner.nextInt();
        

         if(numGuess<number) {

             System.out.println("Too bad, so sad. too low for my tastes.");

         }

         else if (numGuess>number) {
           
           System.out.println("Smell ya later, alligator! Too high.");

         }
         else{

             System.out.println("You have chosen........right. You guessed correctly!");
             
         }

       }

    }

}
