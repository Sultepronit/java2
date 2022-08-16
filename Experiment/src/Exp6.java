import java.util.Arrays;

public class Exp6 {

	public static void main(String[] args) {

		//nextSmaller(20719);
		//nextSmaller(21);
		//nextSmaller(907);
		//nextSmaller(12);
		nextSmaller(1023);

	}
	
	public static long nextSmaller(long n) {
		
		String s = "" + n;
		System.out.println(s);
		
		int division = -1;
		char toTheRight = ' ';
		for(int i = s.length() - 2; i >= 0; i--) {
			if(s.charAt(i) > s.charAt(i + 1)) {
				toTheRight = s.charAt(i);
				System.out.println("!" + i+ ":" + toTheRight);
				division = i;
				break;
			}
		}	
		if(division < 0) return -1;
		String s1 = s.substring(0, division);
		String s2 = s.substring(division);
		System.out.println(s1);
		System.out.println(s2);
		
		char[] toSort = s2.toCharArray();
		//System.out.println(toSort);
		Arrays.sort(toSort);
		System.out.println(toSort);
		
		char toTheLeft = ' ';
		for(int i = toSort.length - 1; i >= 0; i--) {
			if(toSort[i] < toTheRight) {
				toTheLeft = toSort[i];
				toSort[i] = '_';
				break;
			}
		}
		//System.out.println(toTheLeft);
		System.out.println(toSort);
		if(toTheLeft == '0') return -1;
		
		StringBuilder result = new StringBuilder(s1);
		result.append(toTheLeft);
		
		for(int i = toSort.length - 1; i >= 0; i--) {
			if(toSort[i] == '_') continue;
			result.append(toSort[i]);
		}
		System.out.println(result);
		
		return Long.parseLong(result.toString());
	}
}
