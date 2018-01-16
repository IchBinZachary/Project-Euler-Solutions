
public class P6 {
	public static void main(String[] args){
		long sumOfSquares =0;
		long squareOfSums =0;
		for (long i=0L; i<101L;i++){
			sumOfSquares+=(i*i);
			squareOfSums+=i;
		}
		squareOfSums = squareOfSums*squareOfSums;
		System.out.println(squareOfSums-sumOfSquares);	
	}	
}
