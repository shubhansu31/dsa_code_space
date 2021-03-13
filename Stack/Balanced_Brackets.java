package Stack;

import java.util.*;



public class Balanced_Brackets {
    private static boolean isOpenBracket (char c ){
        if(c == '{' || c == '(' || c == '[' )
            return true;
        return false;
    }

    private static boolean areSameBracket (char c , char o ){
        if(o == '{' && c == '}')
            return true; 

        else if(o == '(' && c == ')')
            return true;

        else if(o == '[' && c == ']')
            return true;
        else
            return false;
    }

    private static boolean solution (String s){
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(isOpenBracket(c) == true ){
                st.push(c); 
            }
            else if(isClosing(c) == true){
                if( !st.empty() && areSameBracket(c,st.peek())){
                    char p = st.pop();
                }
                else 
                    return false;
            }
        }
        if(st.empty())
            return true;
        return false;
    }

    private static boolean isClosing(char c) {
        if(c == '}' || c == ')' || c == ']' )
            return true;
        return false;
    }

    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        if(solution(s) == true)
            System.out.println("True");
        else
            System.out.println("False");
    }

}
