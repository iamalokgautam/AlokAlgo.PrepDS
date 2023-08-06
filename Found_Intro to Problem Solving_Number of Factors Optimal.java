import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int N=scn.nextInt();
        int count = 0;
        
        for(int i=1;i*i<=N;i++){
          
            if(N%i==0){
        if(i != N/i){count = count+2;}
        else{count++;}

            
        }
        }
        System.out.println(count);
        
        
        
    }
}
