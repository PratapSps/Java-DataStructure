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

//displaying data in linked list
	
	public void display(){
		LinkedList temp=Head;
		while(temp !=null){
			System.out.print(temp.number + " ");
			temp=temp.next;
		}
		System.out.println("\n");
	}

//deleting first data from linked list
	
	public void delete(){
		if (!isEmpty()){
			Head=Head.next;
		}
		else{
			System.out.println("Linked list is empty");
		}
	}
	
//Search linked list
	
	public void search(int number){
		LinkedList temp=Head;
		while(temp!=null){
			if(temp.number==number){
				System.out.println("found number" + number);
				break;
			}
			else{
				temp=temp.next;
			}
		}
	}

//deleting any number from linked list
	
	public void deleteany(int number){
		LinkedList current=Head;
		LinkedList previous=null;
		
		while(current!=null){
			if(current.number==number){
				previous.next=current.next;
				current.next=null;
				break;
			}
			else{
				previous=current;
				current=current.next;
			}
		}	
	}
	
//reverse linkedlist
	
	public void reverse(){
		
		LinkedList current=Head;
		LinkedList prev=null;
		LinkedList next;
		
		while(current !=null){
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
			
		}
		Head=prev;
		
	}
	
	public void sortList(){
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList linkedlist=new LinkedList();
		System.out.println(linkedlist.isEmpty());
		for(int i=10;i>0;i--){
			linkedlist.insert(i);
		}
		linkedlist.display();
		linkedlist.delete();
		linkedlist.display();
		
		linkedlist.search(48);
		
		linkedlist.deleteany(4);
		
		linkedlist.display();
		//linkedlist.reverse();
		linkedlist.display();
				
		
	}

}


