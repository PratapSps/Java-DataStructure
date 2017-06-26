package sps;

import java.util.Arrays;

public class StackArray {
	int Top=-1;
	int [] Stack;
	StackArray(int number){
	Stack=new int [number];
	}
	
	// checks for stack empty
	public boolean isEmpty(){
		return Top == -1;
		
	}
	//checks if stack is full
	public boolean isFull(){
		return Stack.length - 1==Top;
	}
	// display last pushed data in stack
	public void peek(){
		System.out.println(Stack[Top]);
	}
	// push data in the stack
	public void push(int number){
		if (isFull()){
			System.out.println("Cannot push stack is full");
		}
		else{
			Top=Top+1;
			Stack[Top]=number;
			System.out.println("Data pushed to satck");
		}
	}
	// pop data from the stack
	public void pop(){
		if(isEmpty()){
			System.out.println("Stack is Empty");
		}
		
		else{
			Stack[Top]=0;
			Top-=1;
			System.out.println("number pop out");
			
		}
	}
//main method
	public static void main(String[] args) {
		StackArray stack=new StackArray(10);
		System.out.println(stack.isEmpty());
		System.out.println(stack.isFull());
		for(int i=0;i<11;i++){
			stack.push(i+1);
		}
		System.out.println(stack.isEmpty());
		stack.pop();
		stack.peek();
		stack.pop();
		;
		System.out.println(Arrays.toString(stack.Stack));
		System.out.println(Arrays.toString(stack.Stack));
	}

}
