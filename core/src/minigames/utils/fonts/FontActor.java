package minigames.utils.fonts;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator.FreeTypeFontParameter;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.utils.Disposable;

public class FontActor extends Actor implements Disposable {
	private BitmapFont font;
	private String message;
	
	public FontActor(String path, FreeTypeFontParameter par, String message) {
		font = Font.loadFont(path, par);
		this.message = message;
	}
	
	public FontActor(String path, int size, String message) {
		FreeTypeFontParameter par = new FreeTypeFontParameter();
		par.size = size;
		font = Font.loadFont(path, par);
		this.message = message;
	}
	
	public FontActor(BitmapFont font, String message) {
		this.font = font;
		this.message = message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public void draw(Batch batch, float parentAlpha) {
		font.draw(batch, message, getX(), getY());
	}
	
	public BitmapFont getFont() {
		return font;
	}
	
	@Override
	public void dispose() {
		font.dispose();
	}
}
