/* Lesson 3 Coding Activity Question 2 */

import java.util.Scanner;

public class U2_L3_Activity_Two{
  public static void main(String[] args){
  
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a string:");
    String idc = s.nextLine();
    System.out.println(idc.substring(1,idc.length()-1));
  
  }
}