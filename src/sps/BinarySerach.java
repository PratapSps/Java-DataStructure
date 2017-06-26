package sps;

public class BinarySerach {
	
	int [] data=new int[10];
	int lowerbound=0;
	int upperbound;
	
	BinarySerach(){
		for(int i=0;i<10;i++){
			data[i]=i;
		}
		upperbound=data.length - 1;
	}
	
	public int Search(int number){
		
		
		while(true){
			if(upperbound < lowerbound){
				System.out.printf("%d does not exits",number );
				break;
			}
			int mid=lowerbound + (upperbound -lowerbound)/2;
			
			if(data[mid]<number){
				lowerbound=mid+1;
			}
			
			if(data[mid]>number){
				upperbound=mid -1;
			}
			
			if(data[mid]==number){
				return mid;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		BinarySerach bb =new BinarySerach();
		System.out.println(bb.Search(10));

	}

}
