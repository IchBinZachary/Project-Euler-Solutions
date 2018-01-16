
public class P5 {
	public static boolean allDiv(long e){
		for(long i=11L;i<21L;i++){
			if (e%i!=0){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args){
		long returnMe=0L;
		for (long i=2520L;i<2147483647L;i+=2520L){
			System.out.println(i);
			if (allDiv(i)&&i>0){
				returnMe=i;
				i=Integer.MAX_VALUE;
			}
		}
		System.out.println(returnMe);
	}
	
	
	
	
}
