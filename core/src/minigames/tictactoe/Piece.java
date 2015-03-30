package minigames.tictactoe;

import minigames.Games;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Piece {
	private boolean blue;
	private TextureRegion region;
	
	public Piece(boolean blue) {
		this.blue = blue;
		if (this.blue) {
			region = new TextureRegion(Games.tex_loader.get(TicTacToe.BLUE_KEY));
		} else {
			region = new TextureRegion(Games.tex_loader.get(TicTacToe.RED_KEY));
		}
	}
	
	public void draw(Batch batch, float x, float y) {
		batch.draw(region, x, y, 64, 64);
	}
	
	public boolean isBlue() {
		return blue;
	}
}
