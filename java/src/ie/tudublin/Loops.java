package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet
{	
	public void settings()
	{
		size(500, 500);
	}

	public void setup() 
	{
		colorMode(HSB);
	}

	
	public void keyPressed()
	{

	}	


	public void draw()
	{	
		//first();
		//seconddraw();
		//third();
		//fourth();
		fifth();
	}

	public void first(){
		background(255);	
		int x =0;
		int y = 0;
		while ( y < 500) {
			stroke(0);
			line(x,y ,500-x, 500-y);
			
			if (x == 500) {
				y= y+20;
			}
			if (x != 500) {
				x=x+20;
			}
		}
	}

	public void seconddraw(){
		background(150);	
		int x =25;
		int y = 250;
		while ( x<500) {
			stroke(0);
			ellipse(x, y, 50, 50); // cx, cy, w, h
			
			x= x +50;
		}
	}

	public void third() {
		background(150);	
		int x =0;
		int y =0;
		while ( x<500) {
			stroke(0);
			fill(y,10000 ,1000);
			rect(x, 0, 50, 500); // tlx, tly, w, h
			y +=20;
			x += 50;
		}
	}

	public void fourth() {
		background(150);	
		int x =25;
		int y = 250;
		int h = 0;
		while ( x<500) {
			stroke(0);
			fill(h,10000 ,1000);
			ellipse(x, y, 50, 50); // cx, cy, w, h
			h +=20;
			x += 50;
		}
	}

	public void fifth() {
		int x =25;
		int y = 25;
		int i = -5;
		background(0);
		stroke(124,10000,1000);
		while ( y<500) {
			line(25,y,475,y);
			line(x,25,x,475);
			

			textSize(10);
			text(i, x, 15); 
			text(i, 10, y); 
			fill(124, 10000, 1000);
			i++;
			x += 45;
			y += 45;
		}
}
}
