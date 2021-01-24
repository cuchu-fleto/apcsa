public class U6_L2_Activity_Three{

    public static boolean hasDuplicates(int[] numbers){
      for(int i = 0; i < numbers.length; i++){
        for(int k = 0; k < numbers.length; k++){
          if(numbers[i] == numbers[k] && i != k)
            return true;
        }
      }
      return false;
    }
  
  }
  