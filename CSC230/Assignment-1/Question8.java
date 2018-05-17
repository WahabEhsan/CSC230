package question8;

/**
 * This program estimates the area underneath a sin curve.
 * @author WahabEhsan
 */
public class Question8 {

    /**
     * This method calls and prints the sine method
     * @param args not used
     */
    public static void main(String args[]) {
        System.out.print(sine());
    }

    /**
     * This method finds the areas of the rectangles and adds them to
     * approximate the area.
     * @return the value of all the rectangles added together
     */
    public static double sine() {
        double rectangleArea = 0;
        for (double i = 0; i < Math.PI; i += (Math.PI / 6)) {
            rectangleArea += ((Math.PI / 6) * Math.sin(i));
        }
        return rectangleArea;

    }
}
