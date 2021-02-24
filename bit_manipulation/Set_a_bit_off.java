package bit_manipulation;
import java.io.*;
import java.util.*;



// Print the number produced on setting its i-th bit off.
// count starting with zero


public class Set_a_bit_off {

  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int i = scan.nextInt();
    int mask = 1 << i; // leftShit 1 i times to make the mask
    // required mask is compliment of the above produced mask
    mask = ~mask;


    //AND of the original number and the new created mask will set the ith bit on
    int result = n & mask ;
    System.out.println(result);

  }

}