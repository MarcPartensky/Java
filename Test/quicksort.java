import java.util.Arrays;

public class Test {
	static private void quicksort(int[] ar, int a, int b) {
		if (a < b) {
			int i = partition(ar, a, b);
			quicksort(ar, a, i);
			quicksort(ar, i+1, b);
		}
	}

	static private int partition(int[] ar, int a, int b) {
		int p = ar[a+(b-a)/2];
		int c = a;
		int d = b;
		while (true) {
			do { c++; } while (ar[c]<p);
			do { d--; } while (ar[d]>p);
			System.out.println(Arrays.toString(ar));
			System.out.println(String.valueOf(c)+":"+String.valueOf(d));
			if (c>=d) return d;
			int t = ar[c];
			ar[c] = ar[d];
			ar[d] = t;
		}
	}

	public static void main(String[] args) {
		int[] array = {1, 0, 1, 2};
		quicksort(array, 0, array.length-1);
		System.out.println(Arrays.toString(array));
	}
}
