/* Lesson 3 Coding Activity Question 1 */

import java.util.Scanner;

public class U2_L3_Activity_One{
  public static void main(String[] args){
  
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a string:");
    String idc = s.nextLine();
    System.out.println(idc.substring(0, 1) + idc.substring(idc.length()-1, idc.length()));
  
  }
}