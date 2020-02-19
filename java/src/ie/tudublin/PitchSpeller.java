package ie.tudublin;

import processing.core.PApplet;

public class PitchSpeller extends PApplet
{	
    public String spell(float fequency) {
        String[] spellings = {"D,", "E,", "F,", "G,", "A,", "B,", "C", "D", "E", "F", "G", "A", "B","c", "d", "e", "f", "g", "a", "b", "c'", "d'", "e'", "f'", "g'", "a'", "b'", "c''", "d''"};
        float[] frequencies = {293.66f, 329.63f, 369.99f, 392.00f, 440.00f, 493.88f, 554.37f, 587.33f
            , 659.25f, 739.99f, 783.99f, 880.00f, 987.77f, 1108.73f, 1174.66f};

            String letter = spellings[0];
            float  diff = Math.abs(frequencies[0]- fequency);
            for (int i = 0; i < frequencies.length; i++) {
                if (diff > Math.abs(frequencies[i]- fequency)) {
                    diff = Math.abs(frequencies[i]- fequency);
                    letter = spellings[i];
                }
            }
        return letter;
    }
}