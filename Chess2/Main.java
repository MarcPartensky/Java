package chess;

import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;

import chess.Chess;

public class Main extends Canvas {

    public static void main(String[] args) {
			Chess chess = new Chess();
			chess.main();

			// System.out.println(Piece.blackKing);
			// JFrame frame = new JFrame("Chess Game");
			// Canvas canvas = new Drawing();
			// canvas.setSize(400, 400);
			// frame.add(canvas);
			// fram[Java 536871240]e.pack();
			// frame.setVisible(true);
    }


    public void paint(Graphics g) {
        // g.fillOval(100, 100, 200, 200);
    }
}
