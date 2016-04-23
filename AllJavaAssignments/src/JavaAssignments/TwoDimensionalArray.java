package JavaAssignments;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		int[][] details = { { 30, 5 }, { 20, 4 }, { 50, 2 } };
		for (int[] a : details) {

			System.out.println(a[0] + " == " + a[1]);
		}
	}

}
