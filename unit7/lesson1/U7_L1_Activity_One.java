import java.util.Scanner;
import java.util.ArrayList;

public class U7_L1_Activity_One{

  public static void main(String[] args){
    ArrayList<String> words = new ArrayList<String>();
    Scanner scanner = new Scanner(System.in);
    String input;
    
    while(true){
      input = scanner.nextLine();
      if(input.equals("STOP")) break;
      words.add(input);
    }

    System.out.println("\n" + words.size() + "\n" + words);
    
    if(words.size() > 2){
      words.remove(0);
      words.remove(words.size() - 1);
    }
    
    System.out.println(words);
  }

}
