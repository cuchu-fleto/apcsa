public class U6_L3_Activity_Three{

    public static void printIngs(String[] args){
      for(String s : args){
        if(s.length() >= 3){
          if(s.substring(s.length()-3).equals("ing")){
            System.out.println(s);
          }
        }
      }
    }
  }
  