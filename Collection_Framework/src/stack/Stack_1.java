package stack;

import java.util.Stack;

public class Stack_1 {
public static void main(String[]args) {
	Stack<String> stack=new Stack<String>();
	stack.push("AD");
	stack.push("HAPPY");
	stack.push("Ah");
	stack.push(null);
    stack.pop();
	System.out.println(stack.size());
	stack.add("sdt");
	stack.remove(1);
    System.out.println(stack.peek());
	
	System.out.println(stack);
}
}
