import java.util.ArrayList;

public class Q6 {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        ArrayList<int[]> list = new ArrayList<>();
        long start = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            list.add(new int[10000]);
            if (i % 1000 == 0) {
                System.out.println("Time: " + System.currentTimeMillis());
                System.out.println("Total memory: " + runtime.totalMemory());
                System.out.println("Free memory: " + runtime.freeMemory());
            }
        }
    }
}
