import java.util.*;
import java.lang.*;
import java.awt.Color;
import java.awt.Robot;
import java.awt.AWTException;

public class questHelper{
  public static void main(String args[]){
    boolean active = true;
    try{
      Robot robot = new Robot();
      while (active){
        System.out.println("Running");
        for (int i = 850; i < 1050; i++){
          for (int x = 850; x < 1000; x++){
            if (matchesYellow(robot.getPixelColor(i,x))){
              System.out.println("Yellow found at: " + i + ", " + x);
            }
          }
        }
      }
    }
    catch (AWTException e){
      e.printStackTrace();
    }

  }

  public static boolean matchesYellow(Color c){
    if(c.getRed() >= 240 && c.getRed() <= 255 && c.getGreen() >= 230 && c.getGreen()<=245 && c.getBlue() >= 35 && c.getBlue() <= 55){
      return true;
    }
    return false;
  }

}
