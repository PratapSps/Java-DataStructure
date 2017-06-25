package sps;

import java.util.Arrays;

public class QueneImpl {
	
	int front=0;
	int rear=-1;
	int [] quene=new int[10];
	
	public boolean isEmpty(){
		return rear == -1;
	}
	
	public boolean isFull(){
		return rear == quene.length -1;
	}
	
	public void enquene(int number){
		rear+=1;
		quene[rear]=number;
		
	}
	
	public void dequene(){
		quene[front]=0;
		front+=1;
	}
	
	public void peek(){
		System.out.println(quene[front]);
	}
	

	public static void main(String[] args) {
		
		QueneImpl q=new QueneImpl();
		for(int i=0;i<10;i++){
			q.enquene(i);
		}
		
		System.out.println(q.isEmpty());
		System.out.println(q.isFull());
		System.out.println(Arrays.toString(q.quene));
		q.dequene();
		q.peek();
		

	}

}
