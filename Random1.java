/*
Rhytham Shiroya
03/04/2022
Bally's Interactive

Aim: 1) Generating a million random numbers and output those numbers to a file.
2) Create a program which sorts the output of your random number generator and sends the
results to another file.
*/
import java.util.*;
import java.io.*;
import static java.lang.Math.*;
public class Random1{
    // Private method to generate the random numbers
    private static void RandomNumberGenerator(int[] r)
    {
        // create random object
        Random random = new Random();
        // a simple for loop which will iterate as long as the array's length is.
        for(int i = 0; i< r.length; i++)
        {
            // Generates random int values
            r[i] = Math.abs(random.nextInt());   // Assigning the random number to the ith element.
        }
    }
    // private method to print the array of random numbers to a file
    private static void Printer(String file, int[] r)
    {
        // try catch block to catch the IOexceptions
        try{
            //create file object
            File f = new File(file); // It will update the file named file 
            // or if it does not exist create a new file.
            // create Printwriter object
            PrintWriter out = new PrintWriter(f); // out object will print directly to file named F
            for(int e : r) // for loop to extract all the integers stored in array r.
            {
                out.print(e); // printing each integer to file
                out.println();
            }
            out.close(); // closing the printwriter object
        }
        catch (IOException e) // if it catches exception, it will print it
        {
            e.printStackTrace();
        }
    }
    // main method
    public static void main(String args[]) {
        int[] rand = new int[1000000]; // defining the an array
        // calling all the methods
        RandomNumberGenerator(rand);
        Printer("random.txt", rand);
        Arrays.sort(rand);
        Printer("sorted.txt", rand);

        //Duplicate(rand);
        //shuffleArray(rand);
        //Printer("shuffle.txt", rand);
    }
   
   /*private static void Duplicate(int[] r)
    {
        Arrays.sort(r);
        for(int i = 0; i< r.length-1; i++)
        {
            if(r[i] == r[i+1])
            {
                System.out.println("Duplicate found " + r[i] +" "+ r[i+1] + " " + (i+1));
                r[i+1] = (r[i+1]+1);
                i--;
                // Arrays.sort(r);
            }
        }
        
    }*/
    /*private static void shuffleArray(int[] r)
    {
        int x=0;
        int y = 0;
        Random ra = new Random();
        for (int i = r.length - 1; i > 0; i--)
        {
            x = ra.nextInt(i + 1);
            y = r[x];
            r[x] = r[i];
            r[i] = y;
        }
    }*/

}