How BubbleSort works ?

Lets say, we have an array i.e-
intArray = {20, 40, 10, 5, -7, 11}

Question -> What we are planning to achieve ?

Answer   -> To Sort up the array which displays them in an ascending order. 
            i.e- intArray = {-7, 5, 10 ,11, 20, 40}
            
THE APPROACH !

looping up to the array in a way that the largest number shifts from left to the top right. 
After doing this, the max number in the array is at right, so we are left with one less than the size of array to arrange them in 
a sorted array. 


In a more specific way,
In order to acheive it, We have to use for loop inside another for loop (nested for loop)
intArray {20, 40, 10, 5, -7, 11} -> After looping up the array to shift the max number to the extreme right, the result from first loop will look somehow like 
{20, 10, 5, -7, 11, 40 } <- you will notice that 40 is shifted to the extreme right, in next loop it the array will look like-
{10 5, -7, 11, 20, 40} and so on..... The final result will be
{-7 ,5, 10, 11, 20, 40} <- Please refer to the source code for exact steps
