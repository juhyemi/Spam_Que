package programmers;

public class PG_EvenOdd {
	public static void main(String[] args) {
		int num = 3;
		System.out.println(solution(num));
	}
	
	public static String solution(int num) {
        return (num % 2 == 0 ? "Even" : "Odd");
    }
}
