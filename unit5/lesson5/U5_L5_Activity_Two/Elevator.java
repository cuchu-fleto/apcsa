public class Elevator{
  
  private int maxFloor;
  private int currentFloor;
  private boolean inService;

  public Elevator(int max, int start){
    inService = true;
    
    if(max > 1)
    maxFloor = max;
    else
    maxFloor = 2;
    
    if (start > 1 && start <= maxFloor)
    currentFloor = start;
    else
    currentFloor = 1;
  }

  public int getMaxFloor(){
    return maxFloor;
  }
  
  public int getCurrentFloor(){
    return currentFloor;
  }

  public boolean isInService(){
    if(inService == true)
    return true;
    else
    return false;
  }

  public void toggleInService(){
    if(inService == true)
    inService = false;
    else
    inService = true;
  }

  public void goToFloor(int floor){
    if((inService == true) && (floor >= 1 && floor <= maxFloor))
    currentFloor = floor;
    
  }  
}