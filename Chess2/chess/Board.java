package chess;

public class Board {
	protected String[][] cells = {
			{"wr", "wh", "wb", "wq", "wk", "wb", "wh", "wr"},
			{"wp", "wp", "wp", "wp", "wp", "wp", "wp", "wp"},
			{"  ", "  ", "  ", "  ", "  ", "  ", "  ", "  "},
			{"  ", "  ", "  ", "  ", "  ", "  ", "  ", "  "},
			{"  ", "  ", "  ", "  ", "  ", "  ", "  ", "  "},
			{"  ", "  ", "  ", "  ", "  ", "  ", "  ", "  "},
			{"br", "bh", "bb", "bq", "bk", "bb", "bh", "br"},
			{"bp", "bp", "bp", "bp", "bp", "bp", "bp", "bp"}
		};

	public Board() {
	}

	public void print() {
		for (String[] rows : cells) {
			for (String piece : rows) {
				System.out.print(piece);
			}
				System.out.print("\n");
		}
	}
}
