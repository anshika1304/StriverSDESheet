// https://bit.ly/3nptF7k

import java.util.*;
public class Solution {

    public static void sortStack(Stack<Integer> stack) {
        if(!stack.isEmpty()){
            int x=stack.pop();
            sortStack(stack);
            insert(stack,x);
        }
    }
    
    static void insert(Stack<Integer> stack, int x){
        if(stack.isEmpty() || x>stack.peek()){
            stack.push(x);
            return;
        }
        int temp=stack.pop();
        insert(stack, x);
        stack.push(temp);
    }
}
