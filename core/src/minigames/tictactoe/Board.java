package minigames.tictactoe;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class Board {
	private Cell[][] cells;
	private int size = 3;
	private float x = 500, y = Gdx.graphics.getHeight() - 250;
	
	public Board(Stage stage) {
		cells = new Cell[size][size];
		for (int i = 0; i < cells.length; i++) {
			for (int j = 0; j < cells[i].length; j++) {
				Cell temp = new Cell(x, y);
				temp.addListener(new Input(temp));
				stage.addActor(temp);
				cells[i][j] = temp;
				x += 70;
			}
			x = 500;
			y -= 70;
		}
	}
}
