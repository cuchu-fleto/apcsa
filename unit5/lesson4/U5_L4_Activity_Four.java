import java.util.Scanner;

public class U5_L4_Activity_Four{

  /* Add the method hasRepeat here */
  public static boolean hasRepeat(String s){
    for(int i = 0; i < s.length(); i++){
      if(i < s.length()-1 && s.charAt(i) == s.charAt(i + 1)) return true;
    }
    return false;
  }
}