import processing.core.PApplet;

public class Sketch extends PApplet {
	
  // create height and width variables
  int height;
  int width;

  public void settings() {
    // set value of height and width variables
    height = 400;
    width = 100;
    size(width, height);
  }

  public void setup() {
    background(127, 204, 240);
  }

  public void draw() {
    // hill
    fill(133, 214, 133);
    ellipse(width / 4, height, (float)(width * 1.75), (float)(height * 0.875));
	  
    // house
    fill(97, 81, 57);
    rect(width / 4, height / 2, width / 4, (float)(height * 0.1875));

    // windows
    fill(165, 227, 242);
    rect((float)(width * 0.275), (float)(height * 0.5625), (float)(width * 0.0625), (float)(height * 0.0625));
    rect((float)(width * 0.4125), (float)(height * 0.5625), (float)(width * 0.0625), (float)(height * 0.0625));

    // window lines
    fill(0, 0, 0);
    line((float)(width * 0.275), (float)(height * 0.5625), (float)(width * 0.3375), (float)(height * 0.625));
    line((float)(width * 0.275), (float)(height * 0.625), (float)(width * 0.3375), (float)(height * 0.5625));
    line((float)(width * 0.4125), (float)(height * 0.5625), (float)(width * 0.475), (float)(height * 0.625));
    line((float)(width * 0.4125), (float)(height * 0.625), (float)(width * 0.475), (float)(height * 0.5625));

    // door
    fill(128, 114, 84);
    rect((float)(width * 0.35), (float)(height * 0.5625), (float)(width * 0.05), (float)(height * 0.125));

    // roof
    fill(69, 64, 53);
    triangle(width / 4, height / 2, (float)(width * 0.375), (float)(height * 0.375), width / 2, height / 2);

    // sun
    fill(247, 246, 168);
    ellipse((float)(width * 0.8125), (float)(height * 0.1875), width / 4, height / 4);
  
  } 

}