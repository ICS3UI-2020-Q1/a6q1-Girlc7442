import java.util.Scanner;

/**
 * Determines the average height and outputs heights that are above average
 * @author Cole Girling
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //scanner for user input
    Scanner input = new Scanner(System.in);
    
    //asks the user how many heights they want to enter
    System.out.println("How many heights would you like to enter");
    int userHeights = input.nextInt();

    //create an array with the amount of spots the user entered
    int[] heights = new int[userHeights];

    //asks the user to enter the heights on seperate lines
    System.out.println("Please enter the heights on separate lines");

    //takes the users heights and puts them into the array
    for(int i = 0; i < userHeights; i++){
      heights[i] = input.nextInt();
    }
    
    //create an accumulator
    int sum = 0;

    //adds the heights toghteher to be averaged
    for(int i = 0; i < userHeights; i++){
      sum = sum + heights[i];
    }

    //averages the heights
    int average = sum / userHeights;

    //tells the user the average height
    System.out.println("The average height is " + average + " cm");
    //tells the user the heights that are above average
    System.out.println("The heights above average are");

    //calculates the heights that are above average
    for(int i = 0; i < userHeights; i++){
      if(heights[i] > average){
        System.out.println(heights[i]);
      }
    }

  }
}
