package question3;


/**
 *
 * @author WahabEhsan
 */
public class Question3 {

    public static void main(String[] args) {
        System.out.print(positivePairs(1000));
    }

    public static String positivePairs(int n) {
        String answer = "";
        double equation;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                equation = ((i * i) + (j * j) + 1) % (i * j);
                if (i < j && j < n && equation == 0) {
                    answer += "(" + i + "," + j + ")\n";
                }
            }
        }
        return answer;
    }
}
