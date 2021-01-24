/* Lesson 1 1/2 Coding Activity Question 2 */

import java.util.Scanner;

public class U4_L1_5_Activity_Two{
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    int prod = 1;
    int i = 1;
    while(i <= num){
        prod *= i;
        i++;
    }
    
    System.out.println(prod);

  }
}
