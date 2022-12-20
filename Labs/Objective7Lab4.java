public class Objective7Lab4 {
	public static void main(String[] args) {
		int counter = 1;
		int currentSum = 0;

		while(counter <= 20) {
			currentSum += counter;
			counter++;
		}
		System.out.println(currentSum);

	}
}