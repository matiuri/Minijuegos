package minigames.tictactoe;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

public class Input extends InputListener {
	private static boolean blue = true, locked = false;
	
	private Cell cell;
	
	public Input(Cell cell) {
		this.cell = cell;
	}
	
	@Override
	public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
		if (!locked) {
			if (cell.add(blue))
				blue = !blue;
			return true;
		}
		return false;
	}
	
	public static boolean isBlue() {
		return blue;
	}
	
	public static void setBlue(boolean blue) {
		Input.blue = blue;
	}
	
	public static void lock() {
		locked = true;
	}
	
	public static void unlock() {
		locked = false;
	}
}
