package longestCommon;

public class FindLongestCommonPrefixFunction {
	public String longestCommonPrefix(String[] strs) {
		// Edge case
		if (strs == null || strs.length == 0) {
			return "";
		}

		// Getting the first element, since we start from left to right
		String current = strs[0];

		for (int i = 1; i < strs.length; i++) {
			// startswith means if current is exactly in the strs[i]
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
}
