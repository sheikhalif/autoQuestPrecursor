import java.util.*;
import java.lang.*;
import java.io.*;
import java.awt.*;

public class questHelper{
  public static void main(String args[]){
    boolean active = true;
    Robot displayInfo;
    try{
      displayInfo = new Robot();
      while (true){
        if (active){
          System.out.println(movement(displayInfo));
          displayInfo.delay(1000);
        }
      }
    }
    catch(Exception x){
      System.out.println("exception");
    }


  }

  public static boolean matchesYellow(Color c){
    if(c.getRed() >= 240 && c.getRed() <= 255 && c.getGreen() >= 230 && c.getGreen()<=245 && c.getBlue() >= 35 && c.getBlue() <= 55){
      return true;
    }
    return false;
  }

  public static int movement(Robot theRobot){
    int minY = 1080;
    int pointX = 0;
    for (int i = 600; i < 1200; i++){
      for (int x = 400; x < 980; x++){
        if (matchesYellow(theRobot.getPixelColor(i,x))){
          if (x < minY){
            minY = x;
            pointX = i;
          }
        }
      }
    }
    if (pointX < 540)return 0;
    if (pointX > 540)return 1;
    return 2;
  }
}
