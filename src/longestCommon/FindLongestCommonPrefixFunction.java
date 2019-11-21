package longestCommon;

public class FindLongestCommonPrefixFunction {
	public String longestCommonPrefix(String[] strs) {
		// Edge case, no common prefix
		if (strs == null || strs.length == 0) {
			return "";
		}

		// Getting the first element, since we start from left to right
		// Since longest common prefix is also in first element too
		String current = strs[0];

		// Starting from 1 since
		for (int i = 1; i < strs.length; i++) {
			// startswith means if current is exactly in the strs[i] without any other letters
			// While loop will make sure we get a value that starts with current
			while (!strs[i].startsWith(current)) {
				current = current.substring(0, current.length() - 1);
			}
			
			
			// IndexOf is much slower than startsWith
			// strs[i].indexOf(current) check if current element is in the
			// second element without any extra letters which will return -1 if
			// it does not
			// while(strs[i].indexOf(current) != 0){
			// current = current.substring(0, current.length() - 1);
			// }
		}

		return current;
	}
	
	// Another way to find it
//	public String longestCommonPrefix(String[] strs){
//		// The final result
//		String longestPrefix = "";
//		
//		// If length is zero or strs is null
//		if(strs.length == 0 || strs == null){
//			return longestPrefix;
//		}
//		
//		int index = 0;
//		
//		// Use first element to compare with others
//		char[] firstWord = strs[0].toCharArray();
//		
//		for(char letter : firstWord){
//			
//			// Starting 1 because we are 0 index element to compare
//			for(int i = 1; i < strs.length; i++){
//				
//				// If index >= strs[i] cause all element have the same prefix
//				// Once we will an element letter does not match, return longestprefix right away
//				if(index >= strs[i].length() || strs[i].charAt(index) != letter){
//					return longestPrefix;
//				}
//			}
//			
//			// Update the index of first word, add the letter to the result
//			index++;
//			longestPrefix += letter;
//		}
//		
//		// If there is not prefix, return nothing
//		return longestPrefix;
//	}
	
	
}
