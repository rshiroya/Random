Rhytham Shiroya
03/04/2022
Bally's Interactive

For this challenge, I have tried to keep the code simple. There is only one class which consists
of one public main method with 2 private methods one to generate random numbers and second to print it to the 
file. 
I have made an assumption that the random number generated should be positive since Bally interactive makes
sports betting games, and for such games, negative numbers would be irrelevant. I have not set any parameters 
random number generator to generate a specific range of numbers.

My first task was to create a random million numbers and print it to the file, which i was able to accomplish 
by the help of some predefined classes such as Random, File, PrintWriter, Arrays, Math, int, and String.
The main logic I used was to first define an int array and passed it to RandomNumberGenerator method to create
random numbers. The method accepts one parameter which is array name and 
will create random number the size of an arrray which is 1 Million; so 1 million 
random numbers. The next step is to print that array to the file, which was done by using Printer method.
This method accepts two parameter filename and array name. It extracts each integer from the array and print 
it to the file.
The second part of the challenge is to sort the array and print it to other file.
For sorting, I called the method of Arrays.sort() from the array class and passed the parameter of the 
generated array in it. After sorting, the array needs to be print therefore I used the Printer method again
and passed the sorted array as parameter and new file name to create a new file with sorted array.

--> Optional
Now you might be wondering what is the commented code about. So I had little time and thought that the 
random numbers has many repeating numbers. Now to make it more interesting, lets get rid of the duplicate numbers.
The first idea I got was to add 1 to the repeating number to avoid duplication. But then there was one more factor
which was there can be other random numbers too which can be n+1 as well. So to solve it, after each addition,
I would have to sort the numbers again and do the same iteration again to make sure there does not exist
a number which is n+1. 
For this logic I created one method which compares a number with the next number. Since the array is sorted, the
same numbers would be next to each other. If there are two same number, it adds 1 to the next number.
Further, I thought that how would a distinct random number sorted array be helpful? So i created another method
to shuffle the array again. For this method, I used a loop which would run as long as the length of array.
Then it would create a random number and the index of that random number in the array would be exchanged with 
index of number of time loop has run.


