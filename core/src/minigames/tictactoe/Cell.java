package minigames.tictactoe;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class Cell extends Actor {
	private float x, y;
	private Piece piece = null;
	
	public Cell() {
		// TODO
	}
	
	@Override
	public void draw(Batch batch, float parentAlpha) {
		if (piece != null) {
			piece.draw(batch, x, y);
		}
	}
	
	public void add() {
		// FIXME
		piece = new Piece(true);
	}
}
