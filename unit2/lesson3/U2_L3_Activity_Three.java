/* Lesson 3 Coding Activity Question 3 */

import java.util.Scanner;

public class U2_L3_Activity_Three{
  public static void main(String[] args){
    
    Scanner s = new Scanner(System.in);
    System.out.println("Enter first word:");
    String idc = s.nextLine();
    System.out.println("Enter second word:");
    String idc1 = s.nextLine();
    System.out.println("Result:" + (idc.toLowerCase()).compareTo(idc1.toLowerCase()));
    
  }
}