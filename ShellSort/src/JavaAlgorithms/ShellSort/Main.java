package JavaAlgorithms.ShellSort;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        // The value of gap defined in this scenario is based on the length of array/2
        // gap will be used in for loop until the value reaches out to 1
        // for this case it will only be equal to either 3.5 -> 3 or 1.5-> 1      [3 and 1]
        for (int gap = intArray.length / 2; gap > 0; gap /= 2) {

            for(int i = gap; i < intArray.length; i ++){
                int newElement = intArray[i];
                int j = i;

                while(j >= gap && intArray[j -gap] > newElement){
                    intArray[j] = intArray[j -gap];
                    j -= gap; // this statement will be useful in shifting up the last element in the array provided above where
                    // j = 6, gap = 3
                }
                intArray[j] = newElement;
            }
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}