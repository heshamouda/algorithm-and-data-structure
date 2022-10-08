public class X {
    static int x;

    public static void main(String[] args) {
        x = 0;
        System.out.println(!m() | m() || m() | !m());
        System.out.println(x);

        int[] test = { 3, 2, 5, 5, -2, 100 };
        System.out.println("x= " + findLargest(test));
        System.out.println("x= " + closestToZero(test));

    }

    private static boolean m() {
        x++;
        return false;
    }

    static int closestToZero(int[] ints) {
        /*
         * int current = 0;
         * int near = ints[0];
         * 
         * if (ints == null || ints.length == 0) {
         * return 0;
         * } else {
         * 
         * for (int i = 0; i < ints.length; i++) {
         * current = Math.abs(ints[i]);
         * if (current <= near) {
         * near = ints[i];
         * }
         * }
         * return near;
         * }
         */
        int closestIndex = 0;
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < ints.length; ++i) {
            int abs = Math.abs(ints[i]);
            if (abs < diff) {
                closestIndex = i;
                diff = abs;
            } else if (abs == diff && ints[i] > 0 && ints[closestIndex] < 0) {
                // same distance to zero but positive
                closestIndex = i;
            }
        }
        return ints[closestIndex];
    }

    static int findLargest(int[] numbers) {
        int largest = numbers[0];
        if (numbers.length == 1 && numbers[0] == Integer.MIN_VALUE) {
            largest = numbers[0];
        } else {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > largest) {
                    largest = numbers[i];
                }
            }
        }
        return largest;
    }

}