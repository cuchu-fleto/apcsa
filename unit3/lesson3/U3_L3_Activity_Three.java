/* Lesson 3 Coding Activity Question 3 */

import java.util.Scanner;
import edhesive.testing.Math;

public class U3_L3_Activity_Three{
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    int one = (int)(Math.random()*(13));
    int two = (int)(Math.random()*(13));
    if(one < 1){
      one = 1;
    }
    if(two < 1){
      two = 1;
    }
    System.out.println(one + " * " + two + " = ?");
    int in = scan.nextInt();
    if(in == (one*two)){
      System.out.println("Correct!");
    }
    else{
      System.out.println("Wrong");
    }

  }
}
