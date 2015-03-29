package minigames.tictactoe.players;

import minigames.Games;
import minigames.tictactoe.TicTacToe;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class Player extends Actor {
	private boolean blue;
	private TextureRegion region;
	
	public Player(boolean blue) {
		this.blue = blue;
		if (this.blue) {
			region = new TextureRegion(Games.tex_loader.get(TicTacToe.BLUE_KEY));
		} else {
			region = new TextureRegion(Games.tex_loader.get(TicTacToe.RED_KEY));
		}
		setSize(region.getRegionWidth(), region.getRegionHeight());
	}
	
	@Override
	public void draw(Batch batch, float parentAlpha) {
		batch.draw(region, getX(), getY(), getOriginX(), getOriginY(), getWidth(), getHeight(), getScaleX(), getScaleY(), getRotation());
	}
}
