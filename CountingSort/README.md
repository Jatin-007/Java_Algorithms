# Counting Sort
Counting Sort is a Sorting algorithm with almost linear equation based on time complexity

CountingSort is an unstabled algorithm which only sortes NUMBERS and not any strings or objects.
Since it requires to be initialized with specific range, it is really efficient.

## How does it works?
1. Provide a range of a numbers let say, from 1-10
eg- [2, 3, 5, 3, 8, 7, 6, 9, 6, 10] 
### count the number of elements with similar value.
In the eg provided above, the couting array becomes-

[0, 1, 2, 0, 1, 2, 1, 1, 1, 10] in the case of [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] (since the range is from 1 to 10)

### arrange the counting sort back again to the range
since there is no 1 in the array it starts with 0.
similarly, 1x2 , 2x3, 0x4, 1x5, 2x6, 1x7, 1x8, 1x9, 1x10 ->
[2, 3, 3, 5, 6, 6, 7, 8, 9, 10] 
and thus, the array is Sorted
