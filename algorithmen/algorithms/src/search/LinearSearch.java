package search;

public class LinearSearch {

    static int linearSearchFunc(int arr[], int element) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (element == arr[i]) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int arr[] = { 30, 23, 1, 34, 232, 10, -34, 45 };
        int elemToSearch = 10;
        int position = linearSearchFunc(arr, elemToSearch);

        if (position == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at position: " + (position + 1));
        }
    }
}
