package sps;

import java.util.Arrays;

public class BubbleSort {
	
	int [] data={5,4,6,7,3,2,1};
	
	public int [] sortBubble(int [] data){
		int temp;
		for(int i =0;i <data.length-1;i++){ //for loop for interarint til the length of array
			for(int j=0;j<data.length-1-i;j++){ // loop for chekcing the eleement of array
				if(data[j]> data[j+1]){
				temp=data[j+1];
				data[j+1]=data[j];
				data[j]=temp;
				}
			}
		}
		
		return data;
		
	}

	public static void main(String[] args) {
		BubbleSort bb=new BubbleSort();
		System.out.println(Arrays.toString(bb.sortBubble(bb.data)));

	}

}
