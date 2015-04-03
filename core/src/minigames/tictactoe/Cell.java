package minigames.tictactoe;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class Cell extends Actor {
	private Piece piece = null;
	
	// TODO: remove this
	private ShapeRenderer sr;
	
	public Cell(float x, float y) {
		setBounds(x, y, 64, 64);
		sr = new ShapeRenderer();
	}
	
	@Override
	public void draw(Batch batch, float parentAlpha) {
		if (piece != null) {
			piece.draw(batch, getX(), getY(), getWidth(), getHeight());
		} else {
			// TODO: use textures
			batch.end();
			sr.setProjectionMatrix(batch.getProjectionMatrix());
			sr.setTransformMatrix(batch.getTransformMatrix());
			sr.begin(ShapeType.Filled);
			sr.rect(getX(), getY(), getWidth(), getHeight());
			sr.end();
			batch.begin();
		}
	}
	
	public boolean add(boolean blue) {
		if (piece == null) {
			piece = new Piece(blue);
			return true;
		}
		return false;
	}
	
	public Piece getPiece() {
		return piece;
	}
}
