
public class P2 {

	public static void main(String[] args){
		int N=1;
		int N_1=1;
		int N_2=1;
		int sum=0;
		while (N<4000000){
			if (N%2==0){
				sum = sum+N;
			}
			N=N_1+N_2;
			N_2 = N_1;
			N_1 = N;
		}
		System.out.println("\n"+sum);
		
		
	}
	
	
}
	

