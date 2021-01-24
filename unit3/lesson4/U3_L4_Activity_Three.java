/* Lesson 4 Coding Activity Question 3 */

import java.util.Scanner;

public class U3_L4_Activity_Three{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    boolean wasInv = false;
    System.out.println("Please enter the first octet:");
    int oct1 = scan.nextInt();
    System.out.println("Please enter the second octet:");
    int oct2 = scan.nextInt();
    System.out.println("Please enter the third octet:");
    int oct3 = scan.nextInt();
    System.out.println("Please enter the fourth octet:");
    int oct4 = scan.nextInt();
    if(!isValid(oct1)){
      System.out.println("Octet 1 is incorrect");
      wasInv = true;
    }
    if(!isValid(oct2)){
      System.out.println("Octet 2 is incorrect");
      wasInv = true;
    }
    if(!isValid(oct3)){
      System.out.println("Octet 3 is incorrect");
      wasInv = true;
    }
    if(!isValid(oct4)){
      System.out.println("Octet 4 is incorrect");
      wasInv = true;
    }
    if(!wasInv){
      System.out.println("IP Address: " + oct1 + "."+ oct2 + "."+ oct3 + "." + oct4);
    }
    
  }
  public static boolean isValid(int val){
    if(val >= 0 && val <= 255){
      return true;
    }
    return false;
  }
}