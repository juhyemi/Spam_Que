package programmers;

public class PG_Average {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		
		System.out.println(solution(arr));
	}

	public static double solution(int[] arr) {

		int sum = 0;
		for (int a : arr) {
			sum += a;
		}

		return (double) sum / arr.length;
	}
}
