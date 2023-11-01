import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        float i = 0;
        String champion = "";

        while (!StdIn.isEmpty()) {
            String input = StdIn.readString();
            i++;
            if (StdRandom.bernoulli(1 / i)) {
                champion = input;
            }
        }
        StdOut.println(champion);
    }
}
