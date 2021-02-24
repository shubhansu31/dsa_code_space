package bit_manipulation;
import java.io.*;
import java.util.*;



// Print the number produced on toggling its i-th bit.
// count starting with zero


public class Toggle {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = scan.nextInt();
        int mask = 1 << i; // leftShit 1 i times to make the mask

        //XOR ^ of the original number and the new created mask will toggle its ith bit
        int result = n ^ mask ;
        System.out.println(result);
    
      }
}
