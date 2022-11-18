import java.util.Arrays;
import java.util.Random;

public class q1{
    int[][] array = new int[5][5];
    Random random = new Random();
    int maximum = 0, minimum = 0;

    public q1() {
        int i, k, rand;
        


        for (i = 0; i < 5; i++) {
            for (k = 0; k < 5; k++) {
                array[i][k] = random.nextInt(100);
                System.out.println(Arrays.toString(array));
            }
        }

    }

    public void showArr() {

        int i, k;

        for (i = 0; i < 5; i++) {
            for (k = 0; k < 5; k++) {
                System.out.print(" " + array[i][k] + " ");
            }
            System.out.println();
        }

    }

    public double calculate() {
        int i, k, x;
        int[] store = {array[0][0], array[0][0]};
        double avg;
        int total = 0;


        for (i = 0; i < 5; i++) {
            for (k = 0; k < 5; k++) {

                x = array[i][k];

                //check the maximum value
                if (store[0] <= x) {
                    maximum = x;
                    store[0] = x;

                }

                //check the minimum value
                if (store[1] >= x) {
                    minimum = x;
                    store[1] = x;

                }

                //store the sum of all values in the array
                total += x;
            }
        }

        avg = total / 25.0;
        return avg;

    }

    public void showCal() {
        System.out.println("Maximum is " + maximum);
        System.out.println("Minimum is " + minimum);
        System.out.println("Average is " + calculate());
    }
}

