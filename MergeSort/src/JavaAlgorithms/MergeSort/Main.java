// MergeSort is a way of sorting an array in a more efficient way by splitting up the array into its sub arrays until
// each array has only one element contained in it... eg-
// An array of 7 will split up to 3 and 4 and later on to 1,1,1,1,1,1,1 each by calculating the midpoint !
package JavaAlgorithms.MergeSort;

public class Main {

    public static void main(String[] args) {
    	int[] intArray = {20, 35, -15, 7, 55, 1, -22 };

    	// Calling mergeSort array with array values, starting position and length
    	mergeSort(intArray, 0, intArray.length);

    	// Printing the Sorted array after all the process
        for(int i = 0; i< intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }

    public static void mergeSort(int [] input, int start, int end){

            if(end - start < 2){
                return; // return if the value is less than 2
            }

            int mid = (start + end)/2;
            mergeSort(input, start, mid); // Sorting the left side of array with this command
            mergeSort(input, mid, end); // Sorting the right side of the array with this command
            merge(input, start, mid, end); // Calling merge method to do its thing....
    }

    public static void merge(int[] input, int start, int mid, int end){

        // if the array at index mid-1 and mid are already sorted?
        if(input[mid - 1] <= input[mid]){
            return ;
        }

        int i= start;
        int j = mid;
        int tempIndex = 0;

        // temp Array with length of (end-start)
        int[] temp = new int[end-start];
        while(i < mid && j < end){
            // if we reach the end of any specific array length, quit the while loop otherwise, keep on adding in array temp where at index tempIndex++,
            // if input i < input j, add i++ otherwise j++
            temp[tempIndex ++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        // Copy the array with leftover element
        System.arraycopy(input, i, input, start+ tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }
}

// arraycopy(object src, int srcPosition, objectDestination, intDestination, intLength);  THIS IS THE FORMAT for above 2 syntax !!