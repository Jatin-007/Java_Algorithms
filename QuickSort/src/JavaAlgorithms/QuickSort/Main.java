package JavaAlgorithms.QuickSort;

public class Main {

    public static void main(String[] args) {
        int[] intArray =  {20, 35, -15, 7, 55, 1, -22};
        quickSort(intArray, 0, intArray.length);

        for(int i=0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }

    public static void quickSort(int[] input, int start, int end){
        if(end - start < 2){
            return;
        }

        // pivotIndex will provide the element used to pivot the partition along with
        // the relative position.
        // {20, 35, -15, 7, 55, 1, -22} in this case- 20 will be the pivoted element with index 4
        int pivotIndex = partition(input, start, end);

        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);
    }

    public static int partition(int[] input, int start, int end){
        // This is using the first element as the pivot
        int pivot = input[start];
        int i = start; // when elements are less than pivot, j = pivotIndex
        int j = end; // otherwise, i = pivotIndex + 1 and j = end

        while(i < j){
            // NOTE: this is an empty loop body
            while(i < j && input[--j] >= pivot);
            if(i < j){
                input[i] = input[j];
            }

            while(i<j && input[++i] <= pivot);
            if(i<j){
                input[j] = input[i];
            }
        }

        input[j] = pivot;
        return j;
    }
}