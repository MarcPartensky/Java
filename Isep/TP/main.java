
// import java.util.LinkedList;
// import java.util.Queue;
import java.util.List;
import java.util.Arrays;

// import java.util.regex.Matcher;
// import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		// String chaine1 = new String("Bonjour");
		// String chaine2 = new String("Bonjour");
		// System.out.println(chaine1 == chaine2);
		// String line = "abcabc";
		// String pattern = "abc){2}";
		// Pattern r = Pattern.compile(pattern);
		// Matcher m = r.matcher(line);
		// if (m.find()) {
		// System.out.println("Found value 0: " + m.group(0));
		// System.out.println("Found value 1: " + m.group(1));
		// // System.out.println("Found value: " + m.group(2));
		// } else {
		// System.out.println("NO MATCH");
		// }

		// Queue<String> queue = new LinkedList<String>();

		// queue.offer("first element");
		// queue.offer("second element");
		// queue.offer("third element");
		// queue.offer("fourth. element");
		// queue.offer("fifth. element");

		// while (!queue.isEmpty()) {
		// System.out.println(queue.poll());
		// }
		// int[] notes = { 10, 20, 30, 40 };
		// fonction(notes);

		// String billet = "FBFBBFFRLR";
		// calculerPlace(billet);

		// List<Integer> nombres = Arrays.asList(1721, 979, 366, 299, 675, 1456);
		// calculProduit(nombres);
		//
		countingSheeps(0);

	}

	public static void countingSheeps(int N) {
		String Founds = "";
		String Number = "";
		for (int i = 1; i < 999; i++) {
			Number = "" + (i * N);
			for (int j = 0; j < Number.length(); j++) {
				if (Founds.indexOf(Number.charAt(j)) == -1) {
					Founds += Number.charAt(j);

				}

			}
			// System.out.println("Founds : "+Founds);
			if (Founds.length() >= 10) {
				break;
			}
		}
		if (Founds.length() >= 10) {
			System.out.println(Number);
		} else {
			System.out.println("INSOMNIE");
		}
	}

	// public static void fonction(int[] notes) {
	// int moyenne = 0;
	// int n = notes.length;
	// for (int i = 0; i < n; i++) {
	// moyenne += notes[i];
	// }
	// moyenne /= n;
	// System.out.println(moyenne);

	// public static void calculerPlace(String billet) {

	// int range;
	// int place;
	// int siege;
	// int a = 0;
	// int b = 127;
	// int c = 128;
	// char x;
	// for (int i = 0; i < 7; i++) {
	// x = billet.charAt(i);
	// c /= 2;
	// if (x == 'F') {
	// b -= c;
	// } else {
	// a += c;
	// }
	// }
	// range = a;

	// a = 0;
	// b = 7;
	// c = 8;
	// for (int i = 7; i < 10; i++) {
	// x = billet.charAt(i);
	// c /= 2;
	// if (x == 'R') {
	// a += c;
	// } else {
	// b -= c;
	// }
	// }
	// place = a;
	// System.out.println(range * 8 + place);
	// }

}
