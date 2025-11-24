package stack;

import java.util.Stack;

public class Stack_1 {
public static void main(String[]args) {
	Stack<String> stack=new Stack<String>();
	stack.push("AD");
	stack.push("HAPPY");
	stack.push("AD");
	stack.push(null);
	System.out.println(stack.size());
	
	
	String str = stack.peek();
	System.out.println(str);
	System.out.println(stack);
}
}
