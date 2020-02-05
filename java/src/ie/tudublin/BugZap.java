package ie.tudublin;

import processing.core.PApplet;

public class BugZap extends PApplet
{	
	public void settings()
	{
		size(1000, 1000);
	}

	public void setup() {
	}

    float playerx = 500;
    float playery = 950;
    float playerwidth = 60;

    void drawPlayer(float x, float y, float w){
        float h = w/2;
        stroke(255);
		fill(0);
        rect(playerx, playery, playerwidth, h);
    }

	public void draw() {
		background(0);
        drawPlayer(playerx, playery, playerwidth);
	}	
    
    public void keyPressed()
	{
		if (keyCode == LEFT)
		{
            if ( playerx -25 >= 0) {
                playerx = playerx - 25;
            }
			System.out.println("Left arrow pressed");
		}
		if (keyCode == RIGHT)
		{
            if (playerx +25 <= 1000 ) {
                playerx = playerx + 25;
            }
			System.out.println("Right arrow pressed");
		}
		if (key == ' ')
		{
			System.out.println("SPACE key pressed");
		}
	}	
    /*
        stroke(255, 0, 0);
		fill(255, 255, 0);
		line(10, 10, 100, 100);		// x1, y1, x2, y2
		point(50, 50); // x, y
		ellipse(100, 200, 50, 150); // cx, cy, w, h
		fill(0, 255, 0);
		rect(50, 10, 100, 200); // tlx, tly, w, h
        triangle(10, 10, 100, 90, 200, 200); // vertices	
        
          fill(25, 40, 0);
        triangle(x, y - h/2, x-w, y+h/2, x+w, y+h/2); // vertices
		fill(255, 255, 0);
        line(x-w/4, y, x+w/4,y );
        ellipse(x-w/4, y-h/4, w/8, h/8); // cx, cy, w, h
        ellipse(x+w/4, y-h/4, w/8, h/8); // cx, cy, w, h
    */
}
