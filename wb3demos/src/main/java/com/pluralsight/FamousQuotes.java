package com.pluralsight;
import java.util.*;

public class FamousQuotes {
    public static void main (String[] args){
     Scanner scanner = new Scanner(System.in);

          String[] quotes = {

                  "'To be, or not to be.' – Shakespeare",
                  "'I think, therefore I am.' – Descartes",
                  "'Less is more.' – Mies van der Rohe",
                  "Time is money.' – Benjamin Franklin",
                  "'Knowledge is power.' – Francis Bacon",
                  "'The only thing we have to fear is fear itself.' – FDR",
                  "'That which does not kill us makes us stronger.' – Nietzsche",
                  "'Hope is the thing with feathers.' – Emily Dickinson",
                  "'The journey of a thousand miles begins with a single step.' – Lao Tzu",
                  "'Injustice anywhere is a threat to justice everywhere.' – Martin Luther King Jr.",
          };

          Random random = new Random();
          boolean continueLoop = true;

          while (continueLoop){
              try {
                  System.out.print("Enter a value (#1-#10) to get a quote, enter (#0) to get a random quote: ");
                  int index = scanner.nextInt();

                  if(index == 0){
                      int randomIndex = random.nextInt(quotes.length);
                      System.out.println(quotes[randomIndex]);
                  } else if (index >= 0 && index <= 10) {System.out.println(quotes[index - 1]);
                      } else {System.out.println("Invalid input range, please select from #1 - #10 ");
                      }


              } catch (Exception e) {
                  System.out.println("This is invalid prompt, please try again.");
                  System.out.println(e.getMessage());
              }

              System.out.print("Do you want to see another quote? (yes/no) ");
              String response = scanner.next().toLowerCase();
              continueLoop = response.equals("yes");

          }

                System.out.println("Thank you for using my program :)");



    }
}
