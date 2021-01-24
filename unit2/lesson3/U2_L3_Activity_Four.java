/* Lesson 3 Coding Activity Question 4 */

import java.util.Scanner;

public class U2_L3_Activity_Four{
  public static void main(String[] args){
  
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter a sentence:");
    String sent = scanner.nextLine();
    System.out.println(((sent.split(" "))[0]).length());
  }
}