import java.io.*;
import java.util.*;

public class Largest_Area_Histogram{
  

public static void main(String[] args) throws Exception {
   Scanner scan = new Scanner(System.in);


    int n = scan.nextInt();
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = scan.nextInt();
    }

    Stack<Integer> st = new Stack<>();

    int lse[] = new int[a.length];
    lse[0] = -1;
    for(int i = 1 ; i < a.length ; i++){
        while(!st.isEmpty() && a[st.peek()] > a[i] ){
            st.pop();
        }
        if(st.isEmpty()){
            lse[i] = -1;
        }
        else{
            lse[i] = st.peek();
        }
        st.push(i);
    }

    st.clear();

    int rse[] = new int[a.length];
    rse[a.length - 1] = a.length;
    for(int i = a.length - 1 ; i >= 0 ; i--){
        while(!st.isEmpty() && a[st.peek()] > a[i] ){
            st.pop();
        }
        if(st.isEmpty())
            rse[i] = a.length;
        else
            rse[i] = st.peek();
        st.push(i);
    }



    int maxArea = 0 ;

    for(int i = 0 ; i < a.length ; i++ ){
        int width = rse[i] - lse[i] - 1;
        int area = a[i] * width;
        if(area > maxArea)
            maxArea = area;
    }

    System.out.println(maxArea);
 }
}