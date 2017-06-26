package sps;

public class Recursion {
	int i=0;
	int k=1;
	public int squareroot(int n){
		i++;
		if(i == n)
			return k;
		else
			k=n * squareroot(n);
		return k;
	}

	public static void main(String[] args) {
		Recursion r=new Recursion();
		System.out.println(r.squareroot(2));

	}

}
