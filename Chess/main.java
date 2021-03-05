public class Main {
	public static void main(String[] args) {
		// Exmple de polymorphisme par hértiage
		// On instancie sur la super classe
		Animal dog = new Dog();
		Animal cat = new Cat();

		feed(dog);
		feed(cat);
	}

	// On donne comme paramètre Animal pour généraliser la méthode
	private static void feed(Animal animal) {
		// Do something
		System.out.println("test");
	}
}


public abstract class Piece {
	protected Position position;
	protected into color;

	public abstract boolean isValidMove(Position position, Cell[][] board);
	public abstract String toString();
}
