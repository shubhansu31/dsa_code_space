package bit_manipulation;
import java.io.*;
import java.util.*;

// Check to see if ith bit of a number 

public class Check {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int i = scan.nextInt();

    // mask is the number with all the bits as 0 except ith bit
    int mask = 1 << i;

    // AND of number and mask will result in 
    // mask if the bit ith was on already
    // zero if the ith bit was off

    String result = (n & mask) == mask ? "true" : "false";

    System.out.println(result);
    }
    
}
