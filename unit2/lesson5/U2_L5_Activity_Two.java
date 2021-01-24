/* Lesson 5 Coding Activity Question 2 */

import java.util.Scanner;
import edhesive.shapes.*;

public class U2_L5_Activity_Two{
  public static void main(String[] args){
  
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Type a radius:"); 
    double rad = scan.nextDouble();
    System.out.println("Type a length:");
    double len = scan.nextDouble();
    System.out.println("Type a width:");
    double wid = scan.nextDouble();
    Circle circle = new Circle(rad);
    Rectangle rectangle = new Rectangle(len, wid);
    System.out.println(circle);
    System.out.println(rectangle);
  }
}