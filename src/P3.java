
public class P3 {

	public static boolean isPrime(long n){
			for (long i=2L;i<n;i++){
				if ((n%i)==0){ return false;}
			}
			return true;
	}
	
	 public static void main(String[] args){
		long x = 600851475143L;
		long start = 2;
		long end = x;
		while (!isPrime(end)){
			for (long l=start;l<end;l++){
				if (end%l==0&&isPrime(l)){
					start = l;
					System.out.println(start);
					l=end;
				}
			}
			end = end/start;
		}
		System.out.println(end);
	 }	
}
