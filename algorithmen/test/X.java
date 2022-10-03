public class X {
    static int x;

    public static void main(String[] args) {
        x = 0;
        System.out.println(!m() | m() || m() | !m());
        System.out.println(x);

        int[] test = { 0, 5, 5, -2, 100 };
        System.out.println("x= " + findLargest(test));

    }

    private static boolean m() {
        x++;
        return false;
    }

    static int findLargest(int[] numbers) {
        int largest = numbers[0];
        if (numbers.length == 1 && numbers[0] == Integer.MIN_VALUE){
            largest = numbers [0];}
        else {
            for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
               }
            }
        }
        return largest;
    }
}