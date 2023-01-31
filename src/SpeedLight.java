/**
 * Class: SpeedLight
 * @Author: Jaylan Igbinoba
 * @Version: 1.0
 * @Course: ITEC 2140 Spring 2023
 * @Written: January 28, 2023
 * @Description: This piece of code will try and calculate the distance between thunder and lighting
 */

public class SpeedLight{
    public static void main(String[] args){
        int sound;
        int flash;
        int distance;
        sound = 340;
        flash =  5;
        //This code above is the values for the thunder and lighting.
        distance = sound * flash; //This is the how-to calculate the distance between the sound and the lighting strike.

        System.out.println(distance + " meters");
    }
}
