/* Assignment 2 - Control Tower */
/* Class name - must be "Assignment2" in order to run */
import java.util.Scanner;
import edhesive.assignment2.Airplane;

public class Assignment2
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter the details of the second airplane (call-sign, distance, bearing and altitude):");
    String cs = scan.nextLine();
    cs = cs.toUpperCase();
    double dist = scan.nextDouble();
    int bear = scan.nextInt();
    int alt = scan.nextInt();
    Airplane a = new Airplane();
    Airplane b = new Airplane(cs, dist, bear, alt);
    System.out.println();
    System.out.println("Initial Positions:");
    System.out.println("\"Airplane 1\": " + a.toString());
    System.out.println("\"Airplane 2\": " + b.toString());
    System.out.println("The distance between the planes is " + Math.abs(a.distTo(b)) + " miles.");
    System.out.println("The difference in height between the planes is " + Math.abs(a.getAlt()-b.getAlt()) + " feet.");
    
    a.gainAlt();
    a.gainAlt();
    a.gainAlt();
    a.gainAlt();
    
    b.loseAlt();
    b.loseAlt();
    
    a.move(10.5,50);
    b.move(8.0,125);
    
    System.out.println();
    System.out.println("New Positions:");
    System.out.println("\"Airplane 1\": " + a.toString());
    System.out.println("\"Airplane 2\": " + b.toString());
    System.out.println("The distance between the planes is " + Math.abs(a.distTo(b)) + " miles.");
    System.out.println("The difference in height between the planes is " + Math.abs(a.getAlt()-b.getAlt()) + " feet.");
  }
}
