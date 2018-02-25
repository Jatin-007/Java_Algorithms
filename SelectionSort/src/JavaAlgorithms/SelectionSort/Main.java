package JavaAlgorithms.SelectionSort;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;

            // intArray[largest] = 20 , starting the for loop from position 1 and ending up at the last position which is lastUnsortedIndex
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[largest]) {
                    largest = i;
                }
            }

            swap(intArray, largest, lastUnsortedIndex);
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void swap(int arr[], int i, int j) {
        // over here we are swapping up the positions in array, intArray[] with i and j

        if (i == j) {
            return;
        } else {

            // swapping up the values of arr[i] with arr[j]
            int temp = arr[i];
             arr[i] = arr[j];
            arr[j] = temp;

        }
    }
}
