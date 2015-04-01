package minigames.utils.fonts;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator.FreeTypeFontParameter;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class FontActor extends Actor {
	private BitmapFont font;
	private String message;
	
	public FontActor(String path, FreeTypeFontParameter par, String message) {
		font = Font.loadFont(path, par);
		this.message = message;
		// TODO: set bounds
	}
	
	public FontActor(String path, int size, String message) {
		FreeTypeFontParameter par = new FreeTypeFontParameter();
		par.size = size;
		font = Font.loadFont(path, par);
		this.message = message;
		// TODO: set bounds
	}
	
	public FontActor(BitmapFont font, String message) {
		this.font = font;
		this.message = message;
		// TODO: check this
		setBounds(100, 100, 72 * message.length(), 72);
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public void draw(Batch batch, float parentAlpha) {
		font.draw(batch, message, getX(), getY());
	}
}
