public class largestNumber {

    public static void main(String[] args) {
        int[] test = { 3, 2, 5, 5, -2, 100 };
        System.out.println("x= " + findLargest(test));

    }

    // largestNumber();
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
