package clineinc.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Lemon Drop on 10/28/2014.
 */
public class ColorWheel {

    // Member varibale (properties anpout the object
    public String mColors[] = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };
    //Method (abilites: thing the objext can do)
    public int getColor() {
        String color = "";

        //randomly select color
        Random randomGenerator = new Random(); //consturcts a new random num gen
        int randomNumber = randomGenerator.nextInt(mColors.length);

        color = mColors[randomNumber];
        int colorAsInt = Color.parseColor(color);

        return colorAsInt;
    }
}
