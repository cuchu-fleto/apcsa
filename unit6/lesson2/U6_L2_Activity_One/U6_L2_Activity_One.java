public class U6_L2_Activity_One{

    public static boolean allNegative(double[] numbers){
      for (int i = 0; i < numbers.length; i++){
        if(numbers[i] >= 0)
          return false;
      }
      return true;
    }
  }
  