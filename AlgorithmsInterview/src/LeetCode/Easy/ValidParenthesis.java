package LeetCode.Easy;

import java.util.Stack;

public class ValidParenthesis {

//	Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//	The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
	
	public static void main(String[] args) {
		

	}

	public boolean isValid(String s) {
	        Stack<Character> c = new Stack<Character>();
	        for(int i=0; i<s.length(); i++){
	            if(s.charAt(i)=='{'){
	                c.push('{');
	            }
	            if(s.charAt(i)=='('){
	                c.push('(');
	            }
	            if(s.charAt(i)=='['){
	                c.push('[');
	            }
	            if(s.charAt(i)=='}'){
	                if(c.isEmpty()){
	                    return false;
	                }
	                if(c.pop()!='{'){
	                    return false;
	                }
	            }
	            if(s.charAt(i)==')'){
	                if(c.isEmpty()){
	                    return false;
	                }
	                if(c.pop()!='('){
	                    return false;
	                }
	            }
	            if(s.charAt(i)==']'){
	                if(c.isEmpty()){
	                    return false;
	                }
	                if(c.pop()!='['){
	                    return false;
	                }
	            }
	        }
	        if(!c.isEmpty()){
	            return false;
	        }
	        return true;
	    }

}
