package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        String brackets = "[({})] () {} [()]";

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < brackets.length(); i++){
            char incomingCharacter = brackets.charAt(i);

            if (incomingCharacter == '{' || incomingCharacter == '[' || incomingCharacter == '('){
                stack.push(incomingCharacter);
            } else if (incomingCharacter == '}' || incomingCharacter == ']' || incomingCharacter == ')') {
                char charcterInStack = stack.pop();

                if ((incomingCharacter == '}' && charcterInStack == '{') ||
                        (incomingCharacter == ']' && charcterInStack == '[') ||
                (incomingCharacter == ')' && charcterInStack == '(')) {
                    continue;
                } else {
                    break;
                }
            }
        }

        if (stack.size() != 0) {
            System.out.println("The entered String DO NOT contain Balanced Brackets");
        } else {
            System.out.println("The entered String HAS Balanced Brackets");
        }
    }
}
