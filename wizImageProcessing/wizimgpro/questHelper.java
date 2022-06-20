import java.util.*;
import java.lang.*;
import java.io.*;
import java.awt.*;
import javax.imageio.*;

public class questHelper{
  public static void main(String args[]){
    boolean active = true;
    Rectangle displayInfo;
    BufferedImage image;
    try{
      displayInfo = new Rectangle(600, 400, 600, 580);
      image = robot.createScreenCapture(displayInfo);
      while (true){
        System.out.println("Working");
        if (active){
          System.out.println(movement(displayInfo));
          //displayInfo.delay(1000);
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
    for (int i = 0; i < image.getWidth(); i++){
      for (int x = 0; x < iamge.getHeight(); x++){
        if (matchesYellow(image.getRGB(i,x))){
          if (x < minY){
            minY = x;
            pointX = i;
          }
        }
      }
    }
    System.out.println("PointX : " + pointX);
    if (pointX < 540)return 0;
    if (pointX > 540)return 1;
    return 2;
  }
}
