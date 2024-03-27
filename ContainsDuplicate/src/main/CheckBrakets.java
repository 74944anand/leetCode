package main;

import java.util.Stack;

public class CheckBrakets {

	public static boolean checkString(String str) {
		
		Stack<Character> stack= new Stack<>();
		
		for(char c :str.toCharArray()) {
			if(c == '{' || c== '(' || c== '[') {
				stack.push(c);
			}else if(c == '}' && stack.peek()=='{' ) {
				stack.pop();
			}
			else if(c == ')' && stack.peek()=='(' ) {
				stack.pop();
			}
			else if(c == ']' && stack.peek()=='[' ) {
				stack.pop();
			}
			else {
				return false;
			}		
		}
		
		return stack.isEmpty();
	}
	
	
	public static void main(String[] args) {
		
		boolean check= checkString("{[[()]]}");
		System.out.println(check);
	}
}
