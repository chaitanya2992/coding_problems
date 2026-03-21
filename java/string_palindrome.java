public class string_palindrome {

	public static void main(String[] args) {
		String string = "a11211a";
		/* 	bruteforce method;
		String ansString="";
		for(int i=string.length()-1;i>=0;i--) {
			ansString=ansString+ string.charAt(i);
		}
		System.out.println(ansString.equals(string)? true:false);
		*/
		int len = string.length()-1;
		int mid = len/2;
		boolean ans = true;
		
		for(int i=0;i<=mid;i++) {
			if(string.charAt(i)!=string.charAt(len-i)) {
				ans = false;
				break;
			}
		}

		System.out.println(ans? "palindrome":"not palindrome");
	}

}
