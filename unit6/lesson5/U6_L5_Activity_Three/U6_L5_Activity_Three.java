public class U6_L5_Activity_Three{

    public static double avg(double[] arr){
      int s = 0;
      for(double n : arr){
        s += n;
      }
      return s / (double) arr.length;
    }
  
  }
  