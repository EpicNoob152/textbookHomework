/** Class: Circle
 * @author: Jaylan Igbinoba
 * @version: 1.0
 * @Course: ITEC 2140 Spring 2023
 * @Written: January 28, 2023
 * @Description: This code tries to display the area and perimeter of a circle that has a radius of 9.5
 */
public class Circle {
    public static void main(String[] args){
        double radius = 9.5;
        //The next two lines of code show the formulas im using
        double area = radius * radius * Math.PI;
        double perimeter = 2 * radius * Math.PI;

        System.out.println("Area: " + area);
        System.out.println("perimeter: " + perimeter);

    }
}
