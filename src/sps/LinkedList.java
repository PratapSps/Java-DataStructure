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
	
<<<<<<< HEAD
	public void sortList(){
		
	}
=======
//insert at any point in linked list	
public void insertAny(int number,int data){
	LinkedList current=Head;
	int num=1;
	while (current !=null){
		if(num==number){
			LinkedList newLink=new LinkedList(data);
			newLink.next=current.next;
			current.next=newLink;
		break;	
		}
		else{
			current=current.next;
			num+=1;
		}
		
	}
}
>>>>>>> 0bb4c4c3890d7c75a57c16af65a437b807aa16c8
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList linkedlist=new LinkedList();
		System.out.println(linkedlist.isEmpty());
<<<<<<< HEAD
		for(int i=10;i>0;i--){
=======
		for(int i=0;i<10;i++){
>>>>>>> 0bb4c4c3890d7c75a57c16af65a437b807aa16c8
			linkedlist.insert(i);
		}
		linkedlist.display();
		linkedlist.delete();
		linkedlist.display();
		
		linkedlist.search(48);
		
		linkedlist.deleteany(4);
		
		linkedlist.display();
<<<<<<< HEAD
		//linkedlist.reverse();
		linkedlist.display();
				
=======
		linkedlist.reverse();
		linkedlist.display();
		linkedlist.insertAny(1, 10);
		linkedlist.display();
		
>>>>>>> 0bb4c4c3890d7c75a57c16af65a437b807aa16c8
		
	}

}


