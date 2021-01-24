import java.util.Arrays;

public class NumStatsArray{

  private final double[] holder;

  public NumStatsArray(double[] a){
    holder = a;
  }

  public String toString(){
    String str0 = "" + Arrays.toString(holder);
    str0 = str0.replace('[', '{');
    str0 = str0.replace(']', '}');
    return str0;
  }

  public double average(){
    double indicesAmt = 0;
    double elementAmt = 0;
    
  for(int i = 0; i < holder.length; i++) {
    elementAmt += holder[i];
    indicesAmt++;
  }
    return elementAmt / indicesAmt;
}

  public double range(){
  double max = holder[0]; 
    for(int i = 1; i < holder.length; i++) {  
      if(holder[i] > max){ 
         max = holder[i]; 
      } 
    } 
 
  double min = holder[0]; 
    for(int i = 1; i < holder.length; i++) { 
      if(holder[i] < min){ 
        min = holder[i]; 
      } 
    } 
    return max - min;
  }

  public int sortStatus() {
    boolean ascending = true;
    boolean descending = true;
    
    for (int i = 0; i < holder.length - 1; i++) {
    if (holder[i] > holder[i + 1]) {
        ascending = false;
        break;
    }
  }
        
    for (int i = 0; i < holder.length - 1; i++) {
    if (holder[i] < holder[i + 1]) {
        descending = false;
        break;
    }
  }
    
    if(ascending == true)
    return 1;
    
    else if(descending == true)
    return -1;
    
    else
    return 0;
  } 
}