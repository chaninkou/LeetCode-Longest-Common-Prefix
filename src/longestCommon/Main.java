package longestCommon;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		String[] strs = {"flower","flow","flight"};
		
		System.out.println("Input: " + Arrays.toString(strs));
		
		FindLongestCommonPrefixFunction solution = new FindLongestCommonPrefixFunction();
		
		System.out.println("Solution: " + solution.longestCommonPrefix(strs));
	}
}
