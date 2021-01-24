/* Lesson 8 Coding Activity Question 2 */

import java.util.Scanner;

public class U2_L8_Activity_Two{
  public static void main(String[] args){
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter distance east:");
    double de = scan.nextDouble();
    System.out.println("Enter distance north:");
    double dn = scan.nextDouble();
    
    System.out.println("Distance between two points: " + Math.sqrt(Math.pow(de,2)+Math.pow(dn,2)));
  }
}