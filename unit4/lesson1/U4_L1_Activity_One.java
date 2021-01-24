/* Lesson 1 Coding Activity Question 1 */

import java.util.Scanner;

public class U4_L1_Activity_One{
  public static void main(String[] args){
    
    System.out.println("Enter positive numbers (-1 to stop)");
    Scanner scan = new Scanner(System.in);
    int n = 1;
    int x = 0;
    while(x != -1){
      x = scan.nextInt();
      n += x;
    }
    
    System.out.println("Sum is " + n);
  }
}