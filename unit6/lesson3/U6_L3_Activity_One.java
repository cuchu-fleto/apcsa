import java.util.HashMap;

public class U6_L3_Activity_One{
  public static String findLongest(String[] words){
    
    String longest = words[0];
    for(int i = 1; i < words.length; i++){
      if(words[i].length() > longest.length())
        longest = words[i];
    }
    return longest;
  }
}
