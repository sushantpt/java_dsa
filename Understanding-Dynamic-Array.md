# Dynamic Array
--------------------------------------
* Array --> Container of objects that hold values of a single type. There are two types of array basically. They are static and dynamic. 
* Static has a fixed size of array. 
* In dynamic array, we can increase/decrease size of array dynamically meaning it can be generated according to the needs.
--------------------------------------
# Working mechanism of dynamic array:
* 1st we allocate an array of a fixed size.
* Then elements are appended or added.
* If elements' lenght is greater than size of array, then increase that array. (Doubling the size of array.)
# Another way to add element is:
* Create an array of double size first, then copy all the elements from the old array and return the new array. Simarly, we can shrink unused array.
--------------------------------------
* What is size and capacity?
 A = [1, 3, 5, 7, 8, 34, 2, 23, 53]
* A is an static array. Lets assume we want to append [22, 54, 1]. As described above, we do it using dynamic array. After doubling the size of array, we append [22, 54, 1] at the end of A[i]. Most important thing, we append all those element in new array (temp). Then temp = [1, 3, 5, 7, 8, 34, 2, 23, 53, 22, 54, 1, 0. 0. 0. 0. 0. 0]. Here, size of temp is 12 and capacity of temp is 18 ( 9 * 2 = 18). 
* Then, we trim temp. Why? Because it is using occupying memory. We can use shrinkSize() method which eleminate unused element. 
* After all, we pass the value of temp to array ( temp = this.array ).
