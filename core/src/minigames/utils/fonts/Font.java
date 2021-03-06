package minigames.utils.fonts;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator.FreeTypeFontParameter;

public class Font {
	public static BitmapFont arial(int size) {
		FreeTypeFontParameter par = new FreeTypeFontParameter();
		par.size = size;
		return loadFont("Fonts/Arial.ttf", par);
	}
	
	public static BitmapFont loadFont(String path, FreeTypeFontParameter parameter) {
		FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal(path));
		BitmapFont font = generator.generateFont(parameter);
		generator.dispose();
		return font;
	}
}
