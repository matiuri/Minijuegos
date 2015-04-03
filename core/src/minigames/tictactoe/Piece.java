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
	
	public void draw(Batch batch, float x, float y, float width, float height) {
		batch.draw(region, x, y, width, height);
	}
	
	public boolean isBlue() {
		return blue;
	}
	
	public boolean isRed() {
		return !blue;
	}
}
