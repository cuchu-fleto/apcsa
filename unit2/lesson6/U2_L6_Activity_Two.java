/* Lesson 6 Coding Activity Question 2 */

import java.util.Scanner;
import edhesive.shapes.*;

public class U2_L6_Activity_Two{
  public static void main(String[] args){

    System.out.println("Enter radius:");
    Circle circle = new Circle((new Scanner(System.in)).nextDouble());
    System.out.println("Area: " + circle.getArea());
    circle.setRadius(circle.getRadius()*2);
    System.out.println("Area: " + circle.getArea());
  
  }
}