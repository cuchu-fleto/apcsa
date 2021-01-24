import java.util.Scanner;

public class Assignment3 {

  public static void main (String args[]) {
    Scanner scan = new Scanner(System.in);
    boolean cont = true;
    System.out.println("Welcome. What is your name?");
    String name = scan.nextLine();
    System.out.println("Hello " + name + ". Are you ready to crack the code?");
    
    String yn = scan.nextLine();
    yn = yn.toLowerCase();
    if(!(yn.equals("yes"))){
      cont=false;
    }
    if(cont){
    System.out.println("\nPHASE 1\nEnter a number:");
    String n1 = scan.nextLine();
    if(n1.indexOf('3') != 0){
      end();
      cont=false;
    }
    }
      if(cont){
    System.out.println("Correct!\n\nPHASE 2\nEnter a number:");    
    int n2 = scan.nextInt();
    if(!(n2 == 1 || (n2 >= 33 && n2 <= 100))){
      end();
      cont=false;
    }
      }
      if(cont){
    System.out.println("Correct!\n\nPHASE 3\nEnter a number:");
    int n3 = scan.nextInt();
    if(!(n3 > 0 && ((n3 % 3 == 0) || (n3 % 7 == 0)))){
      end();
      cont=false;
    }
      }
      if(cont){
    System.out.println("Correct!\nYou have cracked the code!");
      }
  }
  public static void end(){
    System.out.println("Sorry, that was incorrect! Better luck next time!");
  }

}
