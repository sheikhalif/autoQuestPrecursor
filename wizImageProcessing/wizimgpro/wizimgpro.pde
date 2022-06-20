import java.util.*;

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
  image(example3, 0, 0);
  /**
  for (int i = 0; i < 1920; i++){
    for (int x = 0; x < 1080; x++){
      if (!(matchesYellow(get(i, x)))){
        set(i, x, black);
      }
    }
  }
  
  ArrayList<Integer> xPosNonEdge = new ArrayList<Integer>();
  ArrayList<Integer> yPosNonEdge = new ArrayList<Integer>();
  for (int i = 1; i < 1919; i++){
    for (int x = 1; x < 1079; x++){
      if (!(get(i-1, x-1) == black || get(i+1, x-1) == black || get(i-1, x+1) == black || get(i+1, x+1) == black)){
        xPosNonEdge.add(i);
        yPosNonEdge.add(x);
      }
    }
  }
  for (int i = 0; i < xPosNonEdge.size(); i++){
    set(xPosNonEdge.get(i), yPosNonEdge.get(i), black);
  }
  **/
  ArrayList<Integer> xPosEdge = new ArrayList<Integer>();
  ArrayList<Integer> yPosEdge = new ArrayList<Integer>();
  for (int i = 600; i < 1320; i++){
    int numInRow = 0;
    for (int x = 400; x < 980; x++){
      if (matchesYellow(get(i, x))){
        numInRow++;
        xPosEdge.add(i);
        yPosEdge.add(x);
      }
    }
    if (numInRow == 1){
      fill(255, 0, 0);
      circle(xPosEdge.get(0), yPosEdge.get(0), 10);
    }
    xPosEdge.clear();
    yPosEdge.clear();
  }
  
  for (int i = 400; i < 980; i++){
  int numInRow = 0;
  for (int x = 600; x < 1320; x++){
    if (matchesYellow(get(x, i))){
      numInRow++;
      xPosEdge.add(x);
      yPosEdge.add(i);
    }
  }
  if (numInRow == 3){
    fill(0, 255, 0);
    circle(xPosEdge.get(0), yPosEdge.get(0), 10);
  }
    xPosEdge.clear();
    yPosEdge.clear();
  }
  
        
       
}

boolean matchesYellow(color c){
  if(red(c) >= 240 && red(c) <= 255 && green(c) >= 230 && green(c)<=245 && blue(c) >= 35 && blue(c) <= 55){
    return true;
  }
  return false;
}
