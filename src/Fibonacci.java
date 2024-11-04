public class Fibonacci{
	public static void main(String args[]){
		int i=0,j=1,k,count=30,l;
		System.out.print(i+" "+j);
		for(l=2;l<count;l++){
			k=i+j;
			System.out.print(" "+k);
			i=j;
			j=k;
		}
	}
}