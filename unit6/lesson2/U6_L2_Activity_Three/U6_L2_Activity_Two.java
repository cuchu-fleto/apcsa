public class U6_L2_Activity_Two{

    public static int numEven(int[] numbers){
      int count = 0;
      
      for(int i = 0; i < numbers.length; i++){
        if(numbers[i] % 2 == 0)
          count++;
      }
      
      return count;
    }
  }
  