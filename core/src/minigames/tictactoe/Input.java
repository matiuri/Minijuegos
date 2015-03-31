package minigames.tictactoe;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

public class Input extends InputListener {
	private static boolean blue = true;
	
	private Cell cell;
	
	public Input(Cell cell) {
		this.cell = cell;
	}
	
	@Override
	public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
		cell.add(blue);
		blue = !blue;
		return true;
	}
}
