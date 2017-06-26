package sps;

public class QueneLinkedList {
	int number;
	QueneLinkedList next;
	QueneLinkedList First=null;
	QueneLinkedList Rear=null;
	
	public boolean isEmpty(){
		return First == null;
	}
	
	public void eenquene(int number){
		
		QueneLinkedList newLink= new QueneLinkedList();
		newLink.number=number;
		
		if(isEmpty()){
			First=newLink;
			Rear=First;
		}
		else{
			Rear.next=newLink;
			Rear=newLink;
		}
	}
	
	public int dequene(){
		if(!isEmpty()){
			int data=First.number;
			First=First.next;
			return data;
		}
		return 0;
		
	}
	
	public void display(){
		QueneLinkedList temp=First;
		while(temp!=null){
			System.out.print(temp.number+" ");
			temp=temp.next;
		}
		System.out.println();
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueneLinkedList list=new QueneLinkedList();
		for (int i=0;i<10;i++){
			list.eenquene(i);
		}
		list.display();
		System.out.println(list.dequene());
		System.out.println(list.dequene());
		System.out.println(list.dequene());
		list.display();

	}

}
