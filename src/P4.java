
public class P4 {

	public static boolean isPalindrome(String s){
		if (s.length()<=1){
			return true;
		}
		else if (s.charAt(0)==s.charAt((s.length()-1))){
			return isPalindrome(s.substring(1,s.length()-1));
		}
		else{
			return false;
		}
	}
	
	public static void main(String[] args){
		int returnMe=0;
		for (int i=100; i<1000;i++){
			for (int j=100;j<1000;j++){
				int prod = i*j;
				String prodStr = Integer.toString(prod);
				if (isPalindrome(prodStr)&&prod>returnMe){
					returnMe=prod;
					System.out.println("i:"+i);
					System.out.println("j:"+j);
				}

			}
			System.out.println("-------");
		}
		
		System.out.println(returnMe);
	}
	
	
	
	
}
