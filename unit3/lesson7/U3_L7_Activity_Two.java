/* Lesson 7 Coding Activity Question 2 */

import java.util.Scanner;

public class U3_L7_Activity_Two{
  public static void main(String[] args){
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter 2 Strings:");
    String str1 = scan.nextLine();
    String str2 = scan.nextLine();
    if(str1.equals(str2)){
      System.out.println("Great!");
    }
      
    else if(str1.length() == str2.length() && !(str1.substring(str1.length() - 1).equals(str2.substring(str2.length()-1)))){
      System.out.println("Close enough");
    }
    
    else{
      System.out.println("Try again");
    }
    
  }
}