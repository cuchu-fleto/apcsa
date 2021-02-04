import java.util.ArrayList;

public class U7_L2_Activity_Two {
  public static double average(ArrayList < Double > numbers) {
    double sum = 0;
    for (Double i: numbers) {
      sum += i;
    }
    return sum / numbers.size();
  }
}