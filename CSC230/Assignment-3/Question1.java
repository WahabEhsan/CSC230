package question1;

/**
 * This class is question 1 where it finds the circle in an array using binary
 * search.
 *
 * @author WahabEhsan
 */
public class Question1 {

    /**
     * Test the binary array by entering circle array and the x circle.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle[] arr = {new Circle(new Point(1, 1), 1),
            new Circle(new Point(2, 2), 2),
            new Circle(new Point(3, 3), 3),
            new Circle(new Point(4, 4), 4),
            new Circle(new Point(5, 5), 5),
            new Circle(new Point(6, 6), 6)};
        Circle x = new Circle(new Point(1, 3), 1);

        System.out.println("element " + binarySearch(arr, 0, arr.length - 1, x));
    }

    /**
     * Runs the search by checking the middle, if not it, checks greater or
     * lower, and on.
     *
     * @param <T> The type parameter extending comparable
     * @param arr the array that is passed in to search
     * @param l the left bound of the array
     * @param r the right bound of the array
     * @param x the object that is being searched
     * @return the integer value of index in where object is.
     */
    public static <T extends Comparable<T>> int binarySearch(T[] arr, int l, int r, T x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid].compareTo(x) == 0) {
                return mid;
            } else if (arr[mid].compareTo(x) > 0) {
                return binarySearch(arr, r, mid - 1, x);
            } else {
                return binarySearch(arr, mid + 1, l, x);
            }
        } else {
            return -1;
        }
    }
}

/*
 *circle class for the binary search algorithm.
 */
class Circle implements Comparable<Circle> {

    Point p;
    int radii;

    public Circle(Point p, int radii) {
        this.p = p;
        this.radii = radii;
    }

    public Point getPoint() {
        return this.p;
    }

    public int getRadii() {
        return this.radii;
    }

    @Override
    public int compareTo(Circle o) {
        return this.radii - o.radii;
    }
}

/*
 *Point class for circle
 */
class Point {

    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
