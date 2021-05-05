public abstract class Piece {
	protected Position position;
	protected into color;

	public abstract boolean isValidMove(Position position, Cell[][] board);
	public abstract String toString();

}

