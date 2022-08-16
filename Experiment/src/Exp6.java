
public class Exp6 {

	public static void main(String[] args) {

		nextSmaller(20719);
		//nextSmaller(21);

	}
	
	public static long nextSmaller(long n) {
		
		String s = "" + n;
		System.out.println(s);
		
		int division = 0;
		String toChange = "";
		for(int i = s.length() - 2; i >= 0; i--) {
			if(s.charAt(i) > s.charAt(i + 1)) {
				toChange += s.charAt(i);
				System.out.println("!" + i+ ":" + toChange);
				division = i;
				break;
			}
			System.out.println(s.charAt(i));
		}
		
		String s1 = s.substring(0, division);
		String s2 = s.substring(division);
		System.out.println(s1);
		System.out.println(s2);
		
		return n;
	}
}
