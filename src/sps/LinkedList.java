package sps;

public class LinkedList {
	
	int number;
	LinkedList next;
	LinkedList Head;
	
	LinkedList(int number){
		this.number=number;
	}
	
	LinkedList(){
		Head=null;
	}

//linked list check for empty
	public boolean isEmpty(){
		return Head==null;
	}

//Linked list insert method
	public void insert(int number){
		LinkedList linked=new LinkedList(number);
		linked.next=Head;
		Head=linked;
	}

//dispalying data in linked list
	
	public void display(){
		LinkedList temp=Head;
		while(temp !=null){
			System.out.println(temp.number + " ");
			temp=temp.next;
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList linkedlist=new LinkedList();
		System.out.println(linkedlist.isEmpty());
		linkedlist.insert(45);
		linkedlist.insert(46);
		linkedlist.insert(47);
		linkedlist.display();
		

	}

}


