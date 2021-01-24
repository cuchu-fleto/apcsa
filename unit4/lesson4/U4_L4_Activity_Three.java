/* Lesson 4 Coding Activity Question 3 */

import java.util.Scanner;

public class U4_L4_Activity_Three{
  public static void main(String[] args){
    
    /* Write your code here */
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter Strings:");
    String s1 = scanner.nextLine();
    String s2 = scanner.nextLine();
    
    if(s1.length() == s2.length()){
      for(int i = 0; i < s1.length(); i++){
        System.out.print(s1.substring(i,i+1) + s2.substring(i,i+1));
      }
    }
    else{
      System.out.println("error");
    }
  }
}