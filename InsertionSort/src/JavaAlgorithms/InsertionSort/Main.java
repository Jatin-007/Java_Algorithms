package JavaAlgorithms.InsertionSort;

public class Main {

    public static void main(String[] args) {

        int intArray[] = {20, 35, -15, 7, 55, 1, -22};

        // assuming that the position of intArray[0] is sorted, we start the for loop with index position 1

        for(int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length ; firstUnsortedIndex ++){

            // initializing the variable newElement to store the first value of Unsorted Array in it which starts from position 1
            int newElement = intArray[firstUnsortedIndex];
            int i;

            for(i= firstUnsortedIndex; i > 0 && intArray[i-1]> newElement; i--){
                intArray[i] = intArray[i -1];
            }

            intArray[i] = newElement;


        }

        for(int i = 0; i< intArray.length; i ++ ){
            System.out.println(intArray[i]);
        }
    }
}
