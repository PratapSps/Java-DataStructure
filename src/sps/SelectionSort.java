package sps;

import java.util.Arrays;

public class SelectionSort {
	
	int [] data={5,1,26,7,9};
	
	public int [] sortSelection(int [] unsorted){
		for( int i=0; i<unsorted.length-1;i++){
			for(int j=i+1;j<unsorted.length;j++){
				if(unsorted[i]>unsorted[j]){
					int temp=unsorted[i];
					unsorted[i]=unsorted[j];
					unsorted[j]=temp;
					break;
				}
			}
			
		}
		return unsorted;
	}

	public static void main(String[] args) {
		SelectionSort ss=new SelectionSort();
		System.out.println(Arrays.toString(ss.sortSelection(ss.data)));

	}

}
