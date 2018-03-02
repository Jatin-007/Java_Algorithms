                  {20, 35, -15, 7, 55, 1, -22} to {-22, -15, 1, 7, 20, 35, 55}
Approach
Using Shell sort, it was easier and efficient to sort the values to their right position by putting them in ascending order.

Using an integer value, 'gap' which was defined to be the half the size of array and will keep on getting divided until the value turns out to be 1. 
Role played by gap is that it helps to sort arrays at a specific distance of gap. 
It takes fewer steps to iterate but still is a quadratic time-complexity function. 
