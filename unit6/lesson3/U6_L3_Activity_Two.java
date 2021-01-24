public class U6_L3_Activity_Two{

    public static void reverse(String[] words)
    {
      for(String i : words){
        for(int k = i.length()-1; k >= 0; k--){
          System.out.print(i.charAt(k));
        }
        System.out.println("");
      }
    }
  
  }
  