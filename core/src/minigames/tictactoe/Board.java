package minigames.tictactoe;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class Board extends Actor {
	private Cell[][] cells;
	private int size = 3;
	
	public Board(Stage stage) {
		cells = new Cell[size][size];
		for (int i = 0; i < cells.length; i++) {
			for (int j = 0; j < cells[i].length; j++) {
				cells[i][j] = new Cell();
				stage.addActor(cells[i][j]);
			}
		}
	}
	
	@Override
	public void draw(Batch batch, float parentAlpha) {
		// FIXME
		// for (Cell[] p1 : cells) {
		// for (Cell p : p1) {
		// p.draw();
		// }
		// }
	}
}
