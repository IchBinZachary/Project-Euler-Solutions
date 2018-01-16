
public class P7 {

	public static boolean isPrime(int n){
		for (int i=2;i<n;i++){
			if ((n%i)==0){ return false;}
		}
		return true;
	}
	
	
	public static void main(String[] args){
		int count=0; 
		for (int i=2;true; i++) {
			if (isPrime(i)){
				count++; 
				if (count ==10001) {
					System.out.println(i); 
					break; 
				} 
			}
		}
	}
	
	
	
}
