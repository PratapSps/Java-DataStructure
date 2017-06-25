package sps;

public class LinkedListStack {
	
	LinkedListStack Head=null;
	int number;
	LinkedListStack next;
	
	
	
	
	public boolean isempty(){
		return Head == null;
		
	}
	
	public void push(int number){
		LinkedListStack newLink = new LinkedListStack();
		newLink.number=number;
		newLink.next=Head;
		Head=newLink;
	}
	
	public void peek(){
		System.out.println(Head.number);
	}
	
	public void display(){
		LinkedListStack temp=Head;
		
		while(temp!=null){
			System.out.print(temp.number+ " ");
			temp=temp.next;
		}
		System.out.println("");
	}
	
	public void pop(){
		if(!isempty()){
			Head=Head.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListStack stack=new LinkedListStack();
		for(int i =0;i<10;i++){
			stack.push(i);
			
		}

		System.out.println(stack.isempty());
		stack.peek();
		stack.display();
		stack.pop();
		stack.display();
	}
	

}
