import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
    

         
            int n = scn.nextInt(); // Size of the array
            int[] arr = new int[n]; // Array to store elements

            for (int i = 0; i < arr.length; i++) {
                arr[i] = scn.nextInt(); // Input elements of the array
            }

            int result = findLargestElementIndex(arr);

            System.out.println(result);
        
    }

    public static int findLargestElementIndex(int[] arr) {
        int largestIndex = 0;
        int largest = arr[0];
        int count =0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
                largestIndex = i;
                count++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (i != largestIndex && arr[i] * 2 > largest) {
            return -1; // The condition does not hold true
        }
        }

        return largestIndex;
        
}
}
