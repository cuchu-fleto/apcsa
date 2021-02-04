import java.util.ArrayList;

public class U7_L2_Activity_Three{
  public static ArrayList<Integer> getOdds(ArrayList<Integer> vals){
    ArrayList<Integer> results = new ArrayList<>();
    
    for(Integer i : vals){
      if(i % 2 == 1)
        results.add(i);
    }
    return results;
  }
}
