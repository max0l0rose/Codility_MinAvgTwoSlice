
public class Solution {
	public int solution(int[] A) {

		double min = Integer.MAX_VALUE;
		int idx = 0;
		for (int i = 0; i < A.length-1; i++) {
			double av = (double)(A[i] + A[i+1]) / 2;
			if (av < min) {
				min = av;
				idx = i;
			}
			if (i<A.length-2) {
				double av3 = (double)(A[i] + A[i + 1] + A[i + 2]) / 3;
				if (av3 < min) {
					min = av3;
					idx = i;
				}
			}
		}

		return idx;
	}
}
