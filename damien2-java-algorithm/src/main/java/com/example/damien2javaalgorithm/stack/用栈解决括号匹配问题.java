package com.example.damien2javaalgorithm.stack;

import java.util.Stack;

public class 用栈解决括号匹配问题 {

    public static void main(String[] args) {
        System.out.println((new 用栈解决括号匹配问题()).is("[]{}()[["));
    }
    public boolean is(String s){

        //Stack<Character> stack = new Stack<>();
        ArrayStack<Character> stack = new ArrayStack<>();


        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }else{
                if (stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if (c == ')' && top != '('){
                    return false;
                }
                if (c == ']' && top != '['){
                    return false;
                }
                if (c == '}' && top != '{'){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}


