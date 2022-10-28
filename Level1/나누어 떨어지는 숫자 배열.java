import java.util.ArrayList;

class Solution {
	public ArrayList<Integer> solution(int[] arr, int divisor) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				a1.add(arr[i]);

			}
			if (a1.isEmpty())
				a1.add(-1);

		}
		return a1;
	}
}