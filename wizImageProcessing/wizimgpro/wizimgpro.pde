import java.util.*;
import java.lang.*;

PImage example1;
PImage example2;
PImage example3;

void setup(){
  example1 = loadImage("imgpro1.png");
  example2 = loadImage("imgpro2.png");
  example3 = loadImage("imgpro3.png");
  size(1920, 1080);
}

void draw(){
  color black = color(0);
  image(example1, 0, 0);
  println(movement());
  

  
  
        
       
}

boolean matchesYellow(color c){
  if(red(c) >= 240 && red(c) <= 255 && green(c) >= 230 && green(c)<=245 && blue(c) >= 35 && blue(c) <= 55){
    return true;
  }
  return false;
}

//0 : move right
//1 : move left
//2 : stay still
int movement(){
  int minY = 1080;
  int pointX = 0;
  for (int i = 600; i < 1200; i++){
    for (int x = 400; x < 980; x++){
      //(get(i-1, x-1) == black || get(i+1, x-1) == black || get(i-1, x+1) == black || get(i+1, x+1) == black)
      if (matchesYellow(get(i,x))){
        if (x < minY){
          minY = x;
          pointX = i;
      }
    }
  }
  }
  fill(255, 0, 0);
  circle(pointX, minY, 10);
  if (pointX < 540)return 0;
  if (pointX > 540)return 1;
  return 2;
}
