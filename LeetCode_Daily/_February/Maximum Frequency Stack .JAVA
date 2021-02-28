class FreqStack {
    
    private HashMap<Integer , Integer > freq ;
    private HashMap<Integer , Stack<Integer> > group;
    private int maxFreq;

    public FreqStack() {
        freq = new HashMap<>();
        group = new HashMap<>();
        maxFreq = 0;
        
    }
    
    public void push(int x) {
        int f = freq.getOrDefault(x , 0) + 1;
        freq.put(x , f);
        if(f > maxFreq )
            maxFreq = f;
        Stack<Integer> st = group.getOrDefault(f , new Stack<Integer>());
        st.push(x);
        group.put(f,st);
    }
    
    public int pop() {
        int x = group.get(maxFreq).pop();
        freq.put(x , freq.get(x) - 1);
        if(group.get(maxFreq).size() == 0){
            group.remove(maxFreq);
            maxFreq--;
        }
        return x;
    }
}

/**
 5 7 5 7 4 5 
 5 1 
 1 st1 -> 5
 7 1 
 1 st1 -> 5 7  
 5 2 
 2 st2 -> 5
 7 2 
 2 st2 -> 5 7 
 4 1 
 1 st1 -> 5 7 4 
 5 3 
 3 st3 -> 5
 
 max = 3
 
 3 st3 -> 5(popped);
 return 5 
 
 st3 == 0 
 remove st3 
 max--
 
 pop()
 
 max = 2 
 
 2 st2 -> 5 7
 st2 -> 5 
 
 7 
 
 pop()
 
 max = 2 
 
 2 st2 -> 5 
 
 5 
 
 st2 ==  0
 
 max--
 
 remove st2;
 
 pop()
 
 
 
 */