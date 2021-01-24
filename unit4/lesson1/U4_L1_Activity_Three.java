/* Lesson 1 Coding Activity Question 3 */

import java.util.Scanner;

public class U4_L1_Activity_Three{
  public static void main(String[] args){
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Input a word:");
    String word = scan.nextLine();
    for(int i=0; i < word.length(); i++){
      if(i % 2 == 0){
        System.out.print(word.substring(i, i+1));
      }
    }
    
  }
}