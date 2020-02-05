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
	boolean playerLazer;

    void drawPlayer(float x, float y, float w){
        float h = w/2;
        stroke(255);
		fill(255);
		triangle(playerx, playery-h, playerx-w/3, playery-h/2, playerx+w/3, playery-h/2); 
		rect(playerx-w/2, playery-h/2, playerwidth, h);

		if (playerLazer == true) {
			line(playerx, playery-w/2, playerx, 1000-playery);
			playerLazer = false;
		}
		
		
	}

	public void draw() {
		background(0);
		drawPlayer(playerx, playery, playerwidth);
	}	
    
    public void keyPressed()
	{
		if (keyCode == LEFT || key == 'a')
		{
            if ( playerx -25 >= 0) {
                playerx = playerx - 25;
            }
			System.out.println("Left arrow pressed");
		}
		if (keyCode == RIGHT || key == 'd')
		{
            if (playerx +25 <= 1000 ) {
                playerx = playerx + 25;
            }
			System.out.println("Right arrow pressed");
		}
		if (key == ' ')
		{
			playerLazer = true;
			
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
