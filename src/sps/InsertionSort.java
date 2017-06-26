package sps;

import java.util.Arrays;

public class InsertionSort {

	int data[]={5,4,6,7,9};
	
	public int [] sortInsert(int [] unsorted){
		
		for(int i=1;i<unsorted.length;i++){
			int current =unsorted[i];
			int j=i;
			while(j>0 && unsorted[j-1]> current){
				unsorted[j]=unsorted[j-i];
				j--;
			}
			
			unsorted[j]=current;
		}
		return unsorted;
	}
	
	
	public static void main(String[] args) {
	 InsertionSort ss= new InsertionSort();
	 System.out.println(Arrays.toString(ss.sortInsert(ss.data)));
	}

}
