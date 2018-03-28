package JavaAlgorithms.RadixSort;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {4725, 4586, 1330, 8792, 1594, 5729};

        // Call the method over here
        radixSort(intArray, 10, 4);

        for(int i=0; i< intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
    }

    // radix = 10, width =4
    // i is defining the specific postion (ones place, 10s, 100s or 1000s in this case)
    public static void radixSort(int[] input, int radix, int width){
        for(int i=0; i < width; i++){
            radixSingleSort(input, i, radix);
        }
    }

    // position is the position of value inside the integer
    public static void radixSingleSort(int[] input, int position, int radix){

        // number of items in the array passed
        int numItems = input.length;
        // countarray of length 10 which is same as radix
        int[] countArray = new int[radix];


        for(int value: input){
            // in this loop we are counting how many values does each digit has... like how many 2 in specific position inside all the integers
            countArray[getDigit(position, value, radix)]++;
        }

        // creating a temp array to add all the numbers at the end to make it stable array
        for(int j = 1; j < radix; j++){
            countArray[j] += countArray[j-1];
        }

        int[] temp = new int[numItems];
        for(int tempIndex = numItems -1 ; tempIndex >=0; tempIndex --){
            temp[--countArray[getDigit(position, input[tempIndex], radix)]] = input[tempIndex];
        }

        for(int tempIndex = 0; tempIndex < numItems; tempIndex++){
            input[tempIndex] = temp[tempIndex];
        }
    }

    public static int getDigit(int position, int value, int radix){
        return value / (int)Math.pow(10, position) % radix;
    }
}


// radix = 10
// width = 4