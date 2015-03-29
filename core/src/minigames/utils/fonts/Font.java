package minigames.utils.fonts;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator.FreeTypeFontParameter;

public class Font {
	public enum Arial {
		_24(24), _36(36);
		
		private final BitmapFont ARIAL;
		
		Arial(int size) {
			FreeTypeFontParameter par = new FreeTypeFontParameter();
			par.size = size;
			ARIAL = loadFont("Fonts/Arial.ttf", par);
		}
		
		public BitmapFont getFont() {
			return ARIAL;
		}
	}
	
	private static BitmapFont font;
	
	public static BitmapFont loadFont(String path, FreeTypeFontParameter parameter) {
		FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal(path));
		font = generator.generateFont(parameter);
		generator.dispose();
		return font;
	}
}
