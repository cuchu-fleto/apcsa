/* Lesson 6 Coding Activity Question 1 */

import java.util.Scanner;
import edhesive.shapes.*;

public class U2_L6_Activity_One{
  public static void main(String[] args){
  
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter a number of sides:");
    int sides = scanner.nextInt();
    System.out.println("Enter side length:");
    double len = scanner.nextDouble();
    RegularPolygon shape = new RegularPolygon(sides, len);
    System.out.println("A " + shape + " has perimeter " + shape.getPerimeter() + " and area " + shape.getArea());
  }
}