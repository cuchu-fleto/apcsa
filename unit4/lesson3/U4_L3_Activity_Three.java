/* Lesson 3 Coding Activity Question 3 */

import java.util.Scanner;

public class U4_L3_Activity_Three{
  public static void main(String[] args){
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number between 0 and 100:");
    int num = scanner.nextInt();
    
    if(num>0 && num<100){
      for(int i = num; i <= 100; i++){
        if((i-num) % 20 == 0){
            System.out.print("\n" + i + " ");
        }
        else{
          System.out.print(i + " ");
        }
      }
    }
    else{
      System.out.println("error");
    }
    
  }
}