package chess;

public class Chess {
	public Board board;
	public boolean done = false;

	public Chess() {
	}

	public void main() {
		while (!done) {
			loop();
		}
	}

	protected void loop() {
		done = true;
	}
}
