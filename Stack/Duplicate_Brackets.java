/*

Duplicate Brackets

1. You are given a string exp representing an expression.
2. Assume that the expression is balanced  i.e. the opening and closing brackets match with each other.
3. But, some of the pair of brackets maybe extra/needless. 
4. You are required to print true if you detect extra brackets and false otherwise.

e.g.
((a + b) + (c + d)) -> false
(a + b) + ((c + d)) -> true

Input Format
A string str

Output Format
true or false

*/

package Stack;

import java.util.*;

public class Duplicate_Brackets{

    private static boolean solution(String s){
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == ')'){
                if(!st.empty() && st.peek() == '('){
                    return false;
                }
                else{
                    char p = '(';
                    while(!st.empty() && p != '('){
                        p = st.pop();
                    }
                    st.pop();
                }
            }
            else{
                st.push(c);
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        if(solution(s) == true)
            System.out.println("True");
        else
            System.out.println("False");

    }
}
