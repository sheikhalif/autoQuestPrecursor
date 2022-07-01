import java.util.*;
import java.lang.*;
import java.awt.Color;
import java.awt.Robot;
import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class questHelper{
  public static void main(String args[]){
    boolean active = true;
    ArrayList<Integer> cornerX = new ArrayList<Integer>();
    ArrayList<Integer> cornerY = new ArrayList<Integer>();
    try{
      Robot robot = new Robot();

      while (active){
        System.out.println("Running");
        Rectangle window = new Rectangle(850, 850, 250, 120);
        BufferedImage yellowBox = robot.createScreenCapture(window);
        for (int i = 0; i < 250; i++){
          for (int x = 0; x < 120; x++){
            Color currentColor = new Color(yellowBox.getRGB(i,x));
            if (matchesYellow(currentColor)){
              if (i > 0 && i < 249 && x > 0 && x < 119){
                Color leftColor = new Color(yellowBox.getRGB(i-1, x));
                Color rightColor = new Color(yellowBox.getRGB(i+1, x));
                Color upColor = new Color(yellowBox.getRGB(i, x+1));
                Color downColor = new Color(yellowBox.getRGB(i, x-1));
                if (!(matchesYellow(leftColor)) || !(matchesYellow(rightColor)) || !(matchesYellow(upColor)) || !(matchesYellow(downColor))){
                  cornerX.add(i);
                  cornerY.add(x);
                  System.out.println("Corner found at: " + (i+850) + ", " + (x+850));
                }
              }
            }
          }
        }
        active = false;
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
