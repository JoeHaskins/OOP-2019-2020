package ie.tudublin;

import java.util.Arrays; 
import java.util.Collections; 

import processing.core.PApplet;

public class ArraysExample extends PApplet
{	

	//float[] rainFall = new float[12]; 
	float[] rainFall = {45, 37, 55, 27, 38, 50, 79, 48, 104, 31, 100, 58};
	String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

	public void settings()
	{
		size(500, 500);
	}

	public void setup() 
	{
		for(int i = 0 ; i < rainFall.length; i ++)
		{
			println(months[i] + "\t" + rainFall[i]);
		}

		for(float f:rainFall)
		{
			println(f);
		}

		for(String s:months)
		{
			println(s);
		}

		int minIndex = 0;
		for(int i = 1 ; i < rainFall.length ; i ++)
		{
			if (rainFall[i] < rainFall[minIndex])
			{
				minIndex = i;
			}
		}
		println(months[minIndex] + " had the minimum rainfall of " + rainFall[minIndex]);
		
		int maxIndex = 0;
		for(int i = 1 ; i < rainFall.length ; i ++)
		{
			if (rainFall[i] > rainFall[maxIndex])
			{
				maxIndex = i;
			}
		}
		println(months[maxIndex] + " had the maximum rainfall of " + rainFall[maxIndex]);

		// You can also calculate the minimum and max of an arry this way:
		// Note the array is of type Float not float
		// Float are objects float is a primitive type
		Float[] floatArray = {10.0f, 5.0f, 20.0f};
		float min = Collections.min(Arrays.asList(floatArray)); 
        float max = Collections.max(Arrays.asList(floatArray));
	}

	void drawBarChart()
	{
		float w = width / (float) rainFall.length;
		float cGap = 255 / (float) rainFall.length;
		noStroke();
		colorMode(HSB);
		for(int i = 0 ; i < rainFall.length ; i ++)
		{
			float x = i * w;
			fill(i * cGap, 255, 255);
			rect(x, height, w, -rainFall[i]);
		}
	}

	void drawLineGraph(){
		
		float gradiant = 17; // value -2 == size of gradiant in 10 mm
		float w = width / (float) (rainFall.length +1);
		float x = w;
		float y = height / (float) gradiant;
		float ymarker = y;

		stroke(0, 0, 100);
		line(x, height - y, x, y);
		line(width - x, height - y, x, height - y);
		for (int j = 0; j < gradiant; j++) {
			line(x, ymarker, x-(w/4), ymarker);
			text(j*10, x-(w/1.25f), height -ymarker);
			ymarker += y;
		}
		ymarker = height- y;
		for(int i = 0 ; i < rainFall.length ; i ++)
		{
			stroke(0, 0, 100);
			line(x, ymarker, x, ymarker+(y/4));
			text(months[i], x-(w/4), ymarker+(y/1.25f));
			
			
			if (i < 11) {
				float ypos1 = height -(y + (y* ((float) rainFall[i])/10));
				float ypos2 = height -(y + (y* ((float) rainFall[i+1])/10));
			
				stroke(184, 200, 200);
				line(x, ypos1, (x+w), ypos2);
			}
			x = x + w;
		}
		/*

		float border = width *0.1f;
		fill(255);
		line(border, border, border, border);
		for (int ya = 0; ya < 150; ya+= 10) {
			float  y = map(ya, 0, 150, height - border, border);
			line(border, y, border-5, y);
			text(ya, border / 2, y);

		}

		line(border, height - border, width - border, height - border);
		for (int i = 0; i < months.length; i++) {
			float x = map(i, 0, months.length -1, border, width- border);
			line(x, height - border, x, height - (border + 5));
			text(months[i], x, height - (border/2));
			
		}

		for (int i = 0; i < rainFall.length; i++) {
			float x1 = map(i, 0, months.length - 1, border, width)
		}
		*/
	}

	void drawPieChart(){
		
	}

	public void keyPressed()
	{
		if (key == ' ')
		{
			
		}
	}	

	public void draw()
	{	
		background(1);		
		colorMode(HSB);	

		//drawBarChart();
		//drawLineGraph();
		drawPieChart();
	}
}
