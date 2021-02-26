class Solution{
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        for(int num : pushed){
            stack.push(num);
            while(!stack.isEmpty() && index < popped.length && popped[index] == stack.peek()){
                stack.pop();
                index++;
            }
        }
        
        if(index == pushed.length)
            return true;
        else
            return false;
    }
}