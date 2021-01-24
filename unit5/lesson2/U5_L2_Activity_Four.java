/* Lesson 2 Coding Activity Question 4 */

import java.util.Scanner;

public class U5_L2_Activity_Four{

  /* Add the method realTime here */
  public static void realTime(int s){
    int p1 = s % 60;
    int p2 = s / 60;
    int p3 = p2 % 60;
    p2 = p2 / 60;
    System.out.println("Hours: " + p2 + "\nMinutes: " + p3 + "\nSeconds: " + p1);
  }
}